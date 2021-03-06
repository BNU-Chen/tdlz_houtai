/*
 * File: app/view/proToShow.js
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

Ext.define('MyApp.view.proToShow', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.schemeToShow',

    id: 'schemeToShow',
    layout: {
        type: 'absolute'
    },
    title: '方案公示',

    initComponent: function() {
        var me = this;

        Ext.applyIf(me, {
            items: [
                {
                    xtype: 'form',
                    autoShow: true,
                    height: 370,
                    layout: {
                        type: 'fit'
                    },
                    bodyPadding: 10,
                    title: '方案公示',
                    url: 'Select_Project',
                    items: [
                        {
                            xtype: 'gridpanel',
                            autoRender: true,
                            autoShow: true,
                            height: 870,
                            width: 667,
                            title: 'My Grid Panel',
                            forceFit: true,
                            store: 'ContrastProShow',
                            viewConfig: {
                                autoRender: false
                            },
                            selModel: Ext.create('Ext.selection.CheckboxModel', {

                            }),
                            columns: [
                                {
                                    xtype: 'rownumberer'
                                },
                                {
                                    xtype: 'gridcolumn',
                                    width: 106,
                                    dataIndex: 'projectName',
                                    text: '项目名称'
                                },
                                {
                                    xtype: 'gridcolumn',
                                    dataIndex: 'projectLocation',
                                    text: '项目位置'
                                },
                                {
                                    xtype: 'datecolumn',
                                    dataIndex: 'dbTime',
                                    text: '入库时间'
                                },
                                {
                                    xtype: 'numbercolumn',
                                    dataIndex: 'area',
                                    text: '建设规模'
                                },
                                {
                                    xtype: 'gridcolumn',
                                    dataIndex: 'designUnit',
                                    text: '设计单位'
                                },
                                {
                                    xtype: 'actioncolumn',
                                    handler: function(view, rowIndex, colIndex, item, e, record, row) {

                                    },
                                    emptyCellText: '操作',
                                    menuText: '操作',
                                    items: [
                                        {

                                        }
                                    ]
                                }
                            ],
                            dockedItems: [
                                {
                                    xtype: 'toolbar',
                                    dock: 'top',
                                    items: [
                                        {
                                            xtype: 'textareafield',
                                            height: 22,
                                            id: '',
                                            margin: 0,
                                            width: 170,
                                            fieldLabel: '设计单位',
                                            labelAlign: 'right',
                                            labelWidth: 60,
                                            preventMark: true,
                                            name: 'DesinUnit'
                                        },
                                        {
                                            xtype: 'textareafield',
                                            height: 22,
                                            id: 'searchField',
                                            margin: 0,
                                            width: 170,
                                            fieldLabel: '项目名称',
                                            labelAlign: 'right',
                                            labelWidth: 60,
                                            preventMark: true,
                                            name: 'projectName',
                                            value: '云台镇复垦项目'
                                        },
                                        {
                                            xtype: 'datefield',
                                            id: 'dbTime',
                                            fieldLabel: '入库时间',
                                            labelWidth: 50
                                        },
                                        {
                                            xtype: 'button',
                                            handler: function(button, event) {
                                                Ext.Msg.alert('you clicked me!');
                                                var mystore=Ext.StoreMgr.get('MyJsonStore');//获取store对象
                                                //在load时间中添加参数
                                                mystore.load(
                                                { params:{
                                                    //  start:"0",
                                                    //  limit:"10",
                                                searchField:Ext.getCmp('searchField').getValue()}//参数名称- 值
                                            }
                                            );
                                            },
                                            width: 50,
                                            text: '确定'
                                        }
                                    ]
                                }
                            ]
                        }
                    ],
                    dockedItems: [
                        {
                            xtype: 'pagingtoolbar',
                            dock: 'bottom',
                            width: 360,
                            displayInfo: true
                        }
                    ]
                }
            ]
        });

        me.callParent(arguments);
    }

});