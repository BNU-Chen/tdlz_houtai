/*
 * File: app/view/quotaExtract.js
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

Ext.define('MyApp.view.quotaExtract', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.quotaExtract',

    height: 462,
    width: 762,
    autoScroll: true,
    layout: {
        type: 'border'
    },
    title: '信息抽取设置>>建设指标',

    initComponent: function() {
        var me = this;

        Ext.applyIf(me, {
            items: [
                {
                    xtype: 'form',
                    region: 'center',
                    layout: {
                        align: 'stretch',
                        type: 'vbox'
                    },
                    bodyPadding: 10,
                    title: '',
                    items: [
                        {
                            xtype: 'container',
                            layout: {
                                align: 'middle',
                                pack: 'center',
                                type: 'hbox'
                            },
                            items: [
                                {
                                    xtype: 'gridpanel',
                                    flex: 1,
                                    height: 205,
                                    title: '网站数据字段列表',
                                    columns: [
                                        {
                                            xtype: 'gridcolumn',
                                            width: 329,
                                            dataIndex: 'string',
                                            text: ''
                                        }
                                    ]
                                },
                                {
                                    xtype: 'container',
                                    height: 30,
                                    width: 77,
                                    layout: {
                                        align: 'middle',
                                        pack: 'center',
                                        type: 'hbox'
                                    },
                                    items: [
                                        {
                                            xtype: 'button',
                                            width: 63,
                                            text: '对应'
                                        }
                                    ]
                                },
                                {
                                    xtype: 'gridpanel',
                                    flex: 1,
                                    height: 205,
                                    title: '网站数据字段列表',
                                    columns: [
                                        {
                                            xtype: 'gridcolumn',
                                            width: 320,
                                            dataIndex: 'string',
                                            text: ''
                                        }
                                    ]
                                }
                            ]
                        },
                        {
                            xtype: 'container',
                            flex: 1,
                            height: 120,
                            layout: {
                                align: 'center',
                                pack: 'center',
                                type: 'vbox'
                            },
                            items: [
                                {
                                    xtype: 'gridpanel',
                                    height: 140,
                                    width: 711,
                                    title: '字段对应结果',
                                    columns: [
                                        {
                                            xtype: 'gridcolumn',
                                            width: 710,
                                            dataIndex: 'string',
                                            text: ''
                                        }
                                    ]
                                },
                                {
                                    xtype: 'button',
                                    width: 70,
                                    text: '保存设置'
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