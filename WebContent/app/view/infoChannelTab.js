/*
 * File: app/view/infoChannelTab.js
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

Ext.define('MyApp.view.infoChannelTab', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.infoChannelTab',

    title: '频道栏目',

    initComponent: function() {
        var me = this;

        Ext.applyIf(me, {
            items: [
                {
                    xtype: 'form',
                    bodyPadding: 10,
                    title: 'My Form',
                    jsonSubmit: true,
                    items: [
                        {
                            xtype: 'gridpanel',
                            id: 'MyGridPanel1',
                            title: '频道栏目',
                            store: 'InfoChannelStore',
                            columns: [
                                {
                                    xtype: 'gridcolumn',
                                    dataIndex: 'channelId',
                                    text: '频道栏目ID'
                                },
                                {
                                    xtype: 'gridcolumn',
                                    dataIndex: 'channelName',
                                    text: '名称'
                                },
                                {
                                    xtype: 'gridcolumn',
                                    dataIndex: 'articleNum',
                                    text: '文章数'
                                },
                                {
                                    xtype: 'checkcolumn',
                                    dataIndex: 'channelIscomment',
                                    text: '是否允许评论'
                                },
                                {
                                    xtype: 'checkcolumn',
                                    dataIndex: 'channelIsarticle',
                                    text: '是否允许发表文章'
                                },
                                {
                                    xtype: 'checkcolumn',
                                    dataIndex: 'channelIshomepage',
                                    text: '是否设为首页'
                                },
                                {
                                    xtype: 'checkcolumn',
                                    dataIndex: 'channelIsshow',
                                    text: '是否在门户显示'
                                }
                            ],
                            selModel: Ext.create('Ext.selection.CheckboxModel', {

                            }),
                            plugins: [
                                Ext.create('Ext.grid.plugin.CellEditing', {
                                    clicksToEdit: 1
                                })
                            ],
                            dockedItems: [
                                {
                                    xtype: 'toolbar',
                                    dock: 'top',
                                    items: [
                                        {
                                            xtype: 'button',
                                            handler: function(button, event) {
                                                Ext.MessageBox.alert('提示','you clicked it');

                                                //var channelnew = new MyApp.model.ChannelModel({id:0,channelname:'new',channellevel:1});

                                                //ChannelStore.insert(0,channelnew);
                                                //MyGridPanel1.cellEditing.startEditByPosition({row:0,column:0});

                                                //var storenew = new MyApp.store.ChannelStore();
                                                //Ext.MessageBox.alert(storenew);
                                                //storenew.insert(0, channelnew);
                                                //storenew.add({id:2,channelname:'newnew',channellevel:1});
                                                //Ext.MessageBox.alert(storenew);

                                                //var girdpanelnew = new MyApp.view.MyViewport.MyGridPanel1();
                                                //girdpanelnew.cellEditing.startEditByPosition({
                                                //            row: 0, 
                                                //            column: 0
                                                //        });


                                            },
                                            text: '增加频道栏目'
                                        },
                                        {
                                            xtype: 'button',
                                            text: '删除频道栏目'
                                        },
                                        {
                                            xtype: 'button',
                                            text: '查看文章列表'
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
    }

});