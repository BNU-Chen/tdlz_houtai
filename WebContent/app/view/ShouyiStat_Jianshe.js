/*
 * File: app/view/ShouyiStat_Jianshe.js
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

Ext.define('MyApp.view.ShouyiStat_Jianshe', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.ShouyiStat_Jianshe',

    height: 485,
    width: 691,
    layout: {
        type: 'border'
    },
    title: '建设单位收益分析',

    initComponent: function() {
        var me = this;

        Ext.applyIf(me, {
            items: [
                {
                    xtype: 'form',
                    region: 'north',
                    height: 123,
                    layout: {
                        type: 'absolute'
                    },
                    bodyPadding: 10,
                    title: '选择查询条件',
                    items: [
                        {
                            xtype: 'textfield',
                            x: 20,
                            y: 60,
                            id: 'ShouyiStatJiansheField',
                            fieldLabel: '关键词'
                        },
                        {
                            xtype: 'datefield',
                            x: 20,
                            y: 20,
                            id: 'ShouyiStatJiansheDateStart',
                            fieldLabel: '起始时间'
                        },
                        {
                            xtype: 'datefield',
                            x: 310,
                            y: 20,
                            id: 'ShouyiStatJiansheDateEnd',
                            fieldLabel: '结束时间'
                        },
                        {
                            xtype: 'button',
                            handler: function(button, event) {
                                var getDate1 = Ext.util.Format.date(Ext.getCmp('ShouyiStatJiansheDateStart').getValue(),'Y-m-d');
                                var getDate2 = Ext.util.Format.date(Ext.getCmp('ShouyiStatJiansheDateEnd').getValue(),'Y-m-d');
                                var getKeyword1 = Ext.getCmp('ShouyiStatJiansheField').getValue();
                                var mystore=Ext.StoreMgr.get('ShouyiStat_Jianshe'); //获得store对象
                                //在load事件中添加参数
                                mystore.load(
                                {params:{
                                    start:"0",
                                    limit:"25",
                                    searchDate1:getDate1,
                                    searchDate2:getDate2, 
                                    searchKeyword1:getKeyword1
                                } 
                            }
                            );
                            },
                            x: 420,
                            y: 60,
                            width: 90,
                            text: '统计分析'
                        }
                    ]
                },
                {
                    xtype: 'gridpanel',
                    region: 'center',
                    title: '建设单位收益分配统计表',
                    store: 'ShouyiStat_Jianshe',
                    columns: [
                        {
                            xtype: 'numbercolumn',
                            width: 58,
                            dataIndex: 'xh',
                            text: '序号',
                            format: '0,000'
                        },
                        {
                            xtype: 'gridcolumn',
                            dataIndex: 'dwmc',
                            text: '单位名称'
                        },
                        {
                            xtype: 'gridcolumn',
                            dataIndex: 'sjdkbh',
                            text: '所建地块编号'
                        },
                        {
                            xtype: 'gridcolumn',
                            dataIndex: 'cyrw',
                            text: '参与任务'
                        },
                        {
                            xtype: 'datecolumn',
                            dataIndex: 'cysj',
                            text: '参与时间'
                        },
                        {
                            xtype: 'numbercolumn',
                            dataIndex: 'sy',
                            text: '收益（万）'
                        },
                        {
                            xtype: 'numbercolumn',
                            width: 184,
                            dataIndex: 'sybl',
                            text: '所占总收益的百分比（%）'
                        }
                    ]
                }
            ]
        });

        me.callParent(arguments);
    }

});