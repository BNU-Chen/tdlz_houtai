/*
 * File: app/view/TaishiFind.js
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

Ext.define('MyApp.view.TaishiFind', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.TaishiFind',

    height: 499,
    id: 'TaishiFind',
    width: 693,
    layout: {
        type: 'border'
    },
    title: '交易态势信息查询',

    initComponent: function() {
        var me = this;

        Ext.applyIf(me, {
            items: [
                {
                    xtype: 'form',
                    region: 'north',
                    height: 127,
                    layout: {
                        type: 'absolute'
                    },
                    bodyPadding: 10,
                    title: '查询条件',
                    items: [
                        {
                            xtype: 'datefield',
                            x: 10,
                            y: 20,
                            id: 'TaishiFindDateField1',
                            width: 180,
                            fieldLabel: '起始时间',
                            labelWidth: 60
                        },
                        {
                            xtype: 'datefield',
                            x: 220,
                            y: 20,
                            id: 'TaishiFindDateField2',
                            width: 180,
                            fieldLabel: '结束时间',
                            labelWidth: 60
                        },
                        {
                            xtype: 'textfield',
                            x: 440,
                            y: 20,
                            id: 'TaishiFindTextField1',
                            width: 180,
                            fieldLabel: '关键词',
                            labelWidth: 60
                        },
                        {
                            xtype: 'button',
                            handler: function(button, event) {
                                var getDate1 = Ext.util.Format.date(Ext.getCmp('TaishiFindDateField1').getValue(),'Y-m-d');
                                var getDate2 = Ext.util.Format.date(Ext.getCmp('TaishiFindDateField2').getValue(),'Y-m-d');
                                var getKeyword1 = Ext.getCmp('TaishiFindTextField1').getValue();
                                var mystore=Ext.StoreMgr.get('TaishiFind'); //获得store对象
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
                            x: 80,
                            y: 60,
                            width: 60,
                            text: '查询'
                        },
                        {
                            xtype: 'button',
                            handler: function(button, event) {
                                var grid = Ext.getCmp('TaishiFindTable');
                                var record = grid.getSelectionModel().getSelection();
                                if(record.length === 0){
                                    Ext.Msg.alert('提示','请先选择您要操作的行！');    
                                    return;

                                }else{

                                    var  tablexh =new Array(record.length);
                                    for(var i = 0;i<record.length;i++){
                                        tablexh[i] = record[i].get("xh");

                                    }

                                    Ext.Ajax.request({
                                        url:'getBenefitList26',
                                        params:{tablexh:tablexh},

                                        success:function(response){
                                            Ext.Msg.alert('删除提示','该条信息已成功删除！');
                                            var mystore = Ext.StoreMgr.get('TaishiFind');
                                            mystore.load();

                                        }

                                    });

                                }
                            },
                            x: 290,
                            y: 60,
                            width: 60,
                            text: '删除'
                        },
                        {
                            xtype: 'button',
                            handler: function(button, event) {
                                var getDate1 = Ext.util.Format.date(Ext.getCmp('TaishiFindDateField1').getValue(),'Y-m-d');
                                var getDate2 = Ext.util.Format.date(Ext.getCmp('TaishiFindDateField2').getValue(),'Y-m-d');
                                var getKeyword1 = Ext.getCmp('TaishiFindTextField1').getValue();
                                var mystore=Ext.StoreMgr.get('TaishiFind'); //获得store对象
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
                            x: 510,
                            y: 60,
                            width: 60,
                            text: '修改'
                        }
                    ]
                },
                {
                    xtype: 'gridpanel',
                    region: 'center',
                    autoRender: false,
                    id: 'TaishiFindTable',
                    title: '交易态势查询结果显示',
                    store: 'TaishiFind',
                    columns: [
                        {
                            xtype: 'rownumberer',
                            width: 38,
                            text: '序号'
                        },
                        {
                            xtype: 'gridcolumn',
                            width: 71,
                            dataIndex: 'htbh',
                            text: '合同编号'
                        },
                        {
                            xtype: 'datecolumn',
                            width: 72,
                            dataIndex: 'jysj',
                            text: '交易时间'
                        },
                        {
                            xtype: 'numbercolumn',
                            dataIndex: 'jyl',
                            text: '交易量（亩）'
                        },
                        {
                            xtype: 'numbercolumn',
                            dataIndex: 'je',
                            text: '交易价格（万元）'
                        },
                        {
                            xtype: 'gridcolumn',
                            dataIndex: 'jyqy',
                            text: '交易区域'
                        },
                        {
                            xtype: 'gridcolumn',
                            dataIndex: 'gmqymc',
                            text: '购买企业名称'
                        },
                        {
                            xtype: 'gridcolumn',
                            width: 81,
                            dataIndex: 'qyxz',
                            text: '购买企业性质'
                        },
                        {
                            xtype: 'numbercolumn',
                            dataIndex: 'qyzczj',
                            text: '购买企业注册资金'
                        }
                    ],
                    viewConfig: {
                        autoRender: false
                    },
                    dockedItems: [
                        {
                            xtype: 'pagingtoolbar',
                            dock: 'bottom',
                            width: 360,
                            displayInfo: true,
                            store: 'TaishiFind'
                        }
                    ],
                    selModel: Ext.create('Ext.selection.CheckboxModel', {

                    })
                }
            ]
        });

        me.callParent(arguments);
    }

});