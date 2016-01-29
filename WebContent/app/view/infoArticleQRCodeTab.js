/*
 * File: app/view/infoArticleQRCodeTab.js
 *
 * This file was generated by Sencha Architect version 2.2.2.
 * http://www.sencha.com/products/architect/
 *
 * This file requires use of the Ext JS 4.2.x library, under independent license.
 * License of Sencha Architect does not include license for Ext JS 4.2.x. For more
 * details see http://www.sencha.com/license or contact license@sencha.com.
 *
 * This file will be auto-generated each and everytime you save your project.
 *
 * Do NOT hand edit this file.
 */

Ext.define('MyApp.view.infoArticleQRCodeTab', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.infoArticleQRCodeTab',

    id: 'infoArticleQRCodeTab',
    layout: {
        type: 'fit'
    },
    title: '信息管理与发布>>二维码管理',

    initComponent: function() {
        var me = this;

        Ext.applyIf(me, {
            items: [
                {
                    xtype: 'tabpanel',
                    height: 421,
                    id: '',
                    bodyPadding: 10,
                    activeTab: 0,
                    items: [
                        {
                            xtype: 'panel',
                            title: '二维码',
                            items: [
                                {
                                    xtype: 'form',
                                    height: 383,
                                    id: 'infoQRForm',
                                    layout: {
                                        type: 'absolute'
                                    },
                                    bodyPadding: 10,
                                    title: '',
                                    url: 'getQRCodeContent',
                                    items: [
                                        {
                                            xtype: 'textfield',
                                            x: 120,
                                            y: 20,
                                            id: 'infoQRtextcurrent',
                                            width: 360,
                                            fieldLabel: '',
                                            labelWidth: 120,
                                            listeners: {
                                                beforeshow: {
                                                    fn: me.onInfoQRtextcurrentBeforeShow,
                                                    scope: me
                                                }
                                            }
                                        },
                                        {
                                            xtype: 'button',
                                            x: 480,
                                            y: 20,
                                            height: 20,
                                            hidden: true,
                                            id: 'infobtnmodify',
                                            width: 50,
                                            text: '修改',
                                            listeners: {
                                                click: {
                                                    fn: me.onInfobtnmodifyClick,
                                                    scope: me
                                                }
                                            }
                                        },
                                        {
                                            xtype: 'button',
                                            x: 220,
                                            y: 250,
                                            id: 'infobtnSave',
                                            width: 90,
                                            text: '保存',
                                            listeners: {
                                                click: {
                                                    fn: me.onInfobtnSaveClick,
                                                    scope: me
                                                }
                                            }
                                        },
                                        {
                                            xtype: 'button',
                                            x: 120,
                                            y: 250,
                                            id: 'infobtnShow',
                                            width: 90,
                                            text: '当前二维码',
                                            listeners: {
                                                click: {
                                                    fn: me.onButtonClick,
                                                    scope: me
                                                }
                                            }
                                        },
                                        {
                                            xtype: 'label',
                                            x: 10,
                                            y: 60,
                                            height: 20,
                                            text: '二维码预览：'
                                        },
                                        {
                                            xtype: 'image',
                                            x: 120,
                                            y: 60,
                                            height: 170,
                                            id: 'infoQRimg',
                                            width: 200,
                                            src: 'images/rss_QRCode.png'
                                        },
                                        {
                                            xtype: 'label',
                                            x: 10,
                                            y: 20,
                                            text: '二维码信息:'
                                        },
                                        {
                                            xtype: 'textfield',
                                            x: 130,
                                            y: 310,
                                            hidden: true,
                                            id: 'infoQRtexthidden',
                                            fieldLabel: 'Label'
                                        }
                                    ]
                                }
                            ]
                        }
                    ]
                }
            ]
        });

        me.callParent(arguments);
    },

    onInfoQRtextcurrentBeforeShow: function(component, eOpts) {
        Ext.Ajax.request({
            url:'getQRCodeContent',
            success:function(response){
                Ext.Msg.alert('success',response.content);
            }

        });
    },

    onInfobtnmodifyClick: function(button, e, eOpts) {
        var infoQRtextcurrent = Ext.getCmp('infoQRtextcurrent');
        infoQRtextcurrent.setDisabled(false);

    },

    onInfobtnSaveClick: function(button, e, eOpts) {

        var params='';
        var infoQRtextcurrent = Ext.getCmp('infoQRtextcurrent');
        var infoQRtexthidden = Ext.getCmp('infoQRtexthidden');
        //如果用户对二维码作了修改
        if (infoQRtextcurrent.getValue()!=infoQRtexthidden.getValue())
        {
            params=infoQRtextcurrent.getValue();
            Ext.Msg.confirm("提示","二维码信息已修改，是否确定保存？",function(btn){
                if(btn=='yes'){
                    Ext.Ajax.request({
                        url:'creatQRCode',
                        params:{url:params},
                        success:function(response){          
                            var myTabPanel = Ext.getCmp('htglTabPanelMain');
                            myTabPanel.removeAll(true);
                            myTabPanel.add(Ext.widget('infoArticleQRCodeTab'));
                            Ext.Msg.alert('提示','保存成功');

                            Ext.getCmp('infobtnShow').fireEvent('click');

                        }    
                    });



                }
                else{


                }
            });

        }






    },

    onButtonClick: function(button, e, eOpts) {

        var infoQRtextcurrent1 = Ext.getCmp('infoQRtextcurrent');
        var infoQRtexthidden1 = Ext.getCmp('infoQRtexthidden');
        Ext.Ajax.request({
            url:'getQRCodeContent',
            success:function(response){                          
                infoQRtextcurrent1.setValue(response.responseText);
                infoQRtexthidden1.setValue(response.responseText);
            }
        }); 
    }

});