/*
 * File: app/view/ShouyiAlarm.js
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

Ext.define('MyApp.view.ShouyiAlarm', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.ShouyiAlarm',

    height: 500,
    width: 694,
    layout: {
        type: 'border'
    },
    title: '收益分配异常分析',

    initComponent: function() {
        var me = this;

        Ext.applyIf(me, {
            dockedItems: [
                {
                    xtype: 'toolbar',
                    dock: 'top',
                    items: [
                        {
                            xtype: 'datefield',
                            id: 'ShouyiAlarmDateStart',
                            width: 165,
                            fieldLabel: '起始时间',
                            labelWidth: 60,
                            enforceMaxLength: false,
                            useStrict: false
                        },
                        {
                            xtype: 'datefield',
                            id: 'ShouyiAlarmDateEnd',
                            width: 165,
                            fieldLabel: '结束时间',
                            labelWidth: 60
                        },
                        {
                            xtype: 'combobox',
                            id: 'ShouyiAlarmTextField',
                            width: 165,
                            fieldLabel: '交易区域',
                            labelWidth: 60,
                            name: 'ShouyiAlarmTextField',
                            emptyText: '请选择区域',
                            displayField: 'name',
                            queryMode: 'local',
                            store: 'ShouyiAlarmCombox',
                            valueField: 'value'
                        },
                        {
                            xtype: 'button',
                            handler: function(button, event) {
                                var getDate1 = Ext.util.Format.date(Ext.getCmp('ShouyiAlarmDateStart').getValue(),'Y-m-d');
                                var getDate2 = Ext.util.Format.date(Ext.getCmp('ShouyiAlarmDateEnd').getValue(),'Y-m-d');
                                var getKeyword = Ext.getCmp('ShouyiAlarmTextField').getRawValue();
                                var mystore=Ext.StoreMgr.get('ShouyiAlarmTable'); //获得store对象
                                //在load事件中添加参数
                                mystore.load(
                                {params:{
                                    start:"0",
                                    limit:"25",
                                    searchDate1:getDate1,
                                    searchDate2:getDate2,
                                    searchKeyword:getKeyword
                                } 
                            }
                            );
                            },
                            width: 40,
                            text: '查询'
                        },
                        {
                            xtype: 'button',
                            handler: function(button, event) {
                                var getDate1 = Ext.util.Format.date(Ext.getCmp('ShouyiAlarmDateStart').getValue(),'Y-m-d');
                                var getDate2 = Ext.util.Format.date(Ext.getCmp('ShouyiAlarmDateEnd').getValue(),'Y-m-d');
                                var getKeyword = Ext.getCmp('ShouyiAlarmTextField').getRawValue();
                                var mystore=Ext.StoreMgr.get('ShouyiAlarm_Pie'); //获得store对象
                                //在load事件中添加参数
                                mystore.load(
                                {params:{
                                    searchDate1:getDate1,
                                    searchDate2:getDate2,
                                    searchKeyword:getKeyword
                                } 
                            }
                            );
                            var tabs = this.up('tabpanel');
                            tabs.removeAll(true);
                            //用tabs.add()新增加一个tab页面,通过Ext.widget(xtype)得到收益分配异常图形分析的页面
                            var newtab = tabs.add(Ext.widget('ShouyiAlarm_Chart'));
                            },
                            width: 60,
                            text: '统计分析'
                        },
                        {
                            xtype: 'button',
                            handler: function(button, event) {
                                var tabs = this.up('tabpanel');
                                tabs.removeAll(true);
                                //用tabs.add()新增加一个tab页面,通过Ext.widget(xtype)得到文章回收站的页面
                                var newtab = tabs.add(Ext.widget('ShouyiAlarm_Canshu'));

                            },
                            width: 60,
                            text: '参数设置'
                        },
                        {
                            xtype: 'button',
                            width: 60,
                            text: '导出报告'
                        }
                    ]
                }
            ],
            items: [
                {
                    xtype: 'gridpanel',
                    region: 'north',
                    height: 447,
                    title: '收益分配异常分析列表',
                    store: 'ShouyiAlarmTable',
                    columns: [
                        {
                            xtype: 'rownumberer',
                            text: '序号'
                        },
                        {
                            xtype: 'gridcolumn',
                            width: 131,
                            dataIndex: 'yclx',
                            text: '异常类型'
                        },
                        {
                            xtype: 'gridcolumn',
                            width: 188,
                            dataIndex: 'ycxq',
                            text: '异常详情'
                        },
                        {
                            xtype: 'gridcolumn',
                            width: 126,
                            dataIndex: 'jyqy',
                            text: '交易区域'
                        },
                        {
                            xtype: 'gridcolumn',
                            width: 69,
                            dataIndex: 'ycbh',
                            text: '合同编号'
                        },
                        {
                            xtype: 'gridcolumn',
                            width: 78,
                            dataIndex: 'htmc',
                            text: '合同名称'
                        },
                        {
                            xtype: 'gridcolumn',
                            width: 69,
                            dataIndex: 'xmbh',
                            text: '项目编号'
                        },
                        {
                            xtype: 'gridcolumn',
                            width: 76,
                            dataIndex: 'xmmc',
                            text: '项目名称'
                        },
                        {
                            xtype: 'datecolumn',
                            width: 86,
                            dataIndex: 'cxsj',
                            text: '出现时间'
                        }
                    ],
                    dockedItems: [
                        {
                            xtype: 'pagingtoolbar',
                            dock: 'bottom',
                            width: 360,
                            displayInfo: true,
                            store: 'ShouyiAlarmTable'
                        }
                    ]
                }
            ]
        });

        me.callParent(arguments);
    }

});