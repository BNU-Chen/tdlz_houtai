/*
 * File: app/view/quotaCrawl.js
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

Ext.define('MyApp.view.quotaCrawl', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.quotaCrawl',

    height: 441,
    width: 757,
    autoScroll: true,
    layout: {
        type: 'border'
    },
    title: '爬虫设置>>建设指标',

    initComponent: function() {
        var me = this;

        Ext.applyIf(me, {
            items: [
                {
                    xtype: 'gridpanel',
                    flex: 1,
                    region: 'center',
                    collapsed: false,
                    title: '现有网站爬取列表',
                    columnLines: false,
                    deferRowRender: false,
                    forceFit: true,
                    columns: [
                        {
                            xtype: 'numbercolumn',
                            width: 30,
                            text: '编号'
                        },
                        {
                            xtype: 'gridcolumn',
                            text: '网址名称'
                        },
                        {
                            xtype: 'gridcolumn',
                            width: 232,
                            dataIndex: 'string',
                            text: 'URL'
                        }
                    ],
                    selModel: Ext.create('Ext.selection.CheckboxModel', {

                    }),
                    dockedItems: [
                        {
                            xtype: 'toolbar',
                            dock: 'top',
                            items: [
                                {
                                    xtype: 'button',
                                    handler: function(button, event) {
                                        var win=new Ext.Window({
                                            title: '编辑',
                                            height: 300,
                                            width: 600,
                                            items:[
                                            {
                                                xtype: 'container',
                                                margin: 20,
                                                items: [
                                                {
                                                    xtype: 'textfield',
                                                    height: 30,
                                                    width: 353,
                                                    fieldLabel: '原网站名称',
                                                    labelAlign: 'right'
                                                },
                                                {
                                                    xtype: 'textfield',
                                                    height: 30,
                                                    width: 565,
                                                    fieldLabel: 'URL',
                                                    labelAlign: 'right'
                                                }
                                                ]
                                            },
                                            {
                                                xtype: 'container',
                                                height: 54,
                                                margin: 20,
                                                items: [
                                                {
                                                    xtype: 'textfield',
                                                    height: 30,
                                                    width: 351,
                                                    fieldLabel: '修改后网站名称',
                                                    labelAlign: 'right'
                                                },
                                                {
                                                    xtype: 'textfield',
                                                    height: 30,
                                                    width: 565,
                                                    fieldLabel: 'URL',
                                                    labelAlign: 'right'
                                                }
                                                ]
                                            },
                                            {
                                                xtype: 'container',
                                                height: 48,
                                                margin: 20,
                                                layout: {
                                                    align: 'middle',
                                                    pack: 'center',
                                                    type: 'hbox'
                                                },
                                                items: [
                                                {
                                                    xtype: 'button',
                                                    height: 30,
                                                    margin: 10,
                                                    width: 90,
                                                    text: '确定'
                                                },
                                                {
                                                    xtype: 'button',
                                                    height: 30,
                                                    width: 90,
                                                    text: '取消'
                                                }
                                                ]
                                            }



                                            ]

                                        });    
                                        win.show();  


                                    },
                                    text: '编辑'
                                },
                                {
                                    xtype: 'button',
                                    handler: function(button, event) {
                                        var win=new Ext.Window({
                                            title: '添加',
                                            height: 200,
                                            width: 600,
                                            items:[
                                            {
                                                xtype: 'container',
                                                margin: 20,
                                                items: [
                                                {
                                                    xtype: 'textfield',
                                                    height: 30,
                                                    width: 353,
                                                    fieldLabel: '网站名称',
                                                    labelAlign: 'right'
                                                },
                                                {
                                                    xtype: 'textfield',
                                                    height: 30,
                                                    width: 565,
                                                    fieldLabel: 'URL',
                                                    labelAlign: 'right'
                                                }
                                                ]
                                            },
                                            {
                                                xtype: 'container',
                                                height: 48,
                                                margin: 20,
                                                layout: {
                                                    align: 'middle',
                                                    pack: 'center',
                                                    type: 'hbox'
                                                },
                                                items: [
                                                {
                                                    xtype: 'button',
                                                    height: 30,
                                                    margin: 10,
                                                    width: 90,
                                                    text: '确定'
                                                },
                                                {
                                                    xtype: 'button',
                                                    height: 30,
                                                    width: 90,
                                                    text: '取消'
                                                }
                                                ]
                                            }



                                            ]

                                        });    
                                        win.show();  

                                    },
                                    text: '添加'
                                },
                                {
                                    xtype: 'button',
                                    handler: function(button, event) {

                                        259
                                        260
                                        261
                                        262
                                        263
                                        264
                                        265
                                        266
                                        267
                                        268
                                        269
                                        270
                                        271
                                        272
                                        273
                                        274
                                        275
                                        276
                                        277
                                        278
                                        279
                                        280
                                        281
                                        282
                                        283
                                        284
                                        285
                                        286
                                        287
                                        288
                                        289
                                        290
                                        291
                                        292
                                        293
                                        294
                                        295
                                        296
                                        297
                                        298
                                        299
                                        300
                                        301
                                        302
                                        303
                                        304
                                        var win=new Ext.Window({
                                            title: '删除',
                                            height: 150,
                                            width: 300,
                                            items:[
                                            {
                                                xtype: 'label',
                                                flex: 1,
                                                height: 50,
                                                width: 3008,
                                                margin:20,
                                                text: '是否删除此网站？'
                                            },
                                            {
                                                xtype: 'container',
                                                height: 48,
                                                margin: 20,
                                                layout: {
                                                    align: 'middle',
                                                    pack: 'center',
                                                    type: 'hbox'
                                                },
                                                items: [
                                                {
                                                    xtype: 'button',
                                                    height: 30,
                                                    margin: 10,
                                                    width: 90,
                                                    text: '确定'
                                                },
                                                {
                                                    xtype: 'button',
                                                    height: 30,
                                                    width: 90,
                                                    text: '取消'
                                                }
                                                ]
                                            }



                                            ]

                                        });    
                                        win.show();  

                                    },
                                    text: '删除'
                                },
                                {
                                    xtype: 'textfield',
                                    fieldLabel: ''
                                },
                                {
                                    xtype: 'button',
                                    text: '查找'
                                }
                            ]
                        },
                        {
                            xtype: 'pagingtoolbar',
                            dock: 'bottom',
                            width: 360,
                            displayInfo: true
                        }
                    ]
                },
                {
                    xtype: 'form',
                    region: 'south',
                    height: 120,
                    layout: {
                        align: 'stretch',
                        type: 'vbox'
                    },
                    bodyPadding: 10,
                    title: '设置爬取周期',
                    items: [
                        {
                            xtype: 'container',
                            height: 35,
                            layout: {
                                align: 'middle',
                                pack: 'center',
                                type: 'hbox'
                            },
                            items: [
                                {
                                    xtype: 'textfield',
                                    width: 270,
                                    fieldLabel: '现有爬取周期',
                                    labelAlign: 'right'
                                },
                                {
                                    xtype: 'textfield',
                                    width: 270,
                                    fieldLabel: '修改爬取周期',
                                    labelAlign: 'right'
                                }
                            ]
                        },
                        {
                            xtype: 'container',
                            height: 52,
                            layout: {
                                align: 'middle',
                                pack: 'center',
                                type: 'hbox'
                            },
                            items: [
                                {
                                    xtype: 'button',
                                    text: '保存设置'
                                },
                                {
                                    xtype: 'button',
                                    text: '重新运行'
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