/*
 * File: app/view/ShouyiFind_Hetong.js
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

Ext.define('MyApp.view.ShouyiFind_Hetong', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.ShouyiFind_Hetong',

    height: 485,
    id: 'ShouyiFind_Hetong',
    width: 692,
    layout: {
        type: 'border'
    },
    title: '合同信息查询',

    initComponent: function() {
        var me = this;

        Ext.applyIf(me, {
            items: [
                {
                    xtype: 'form',
                    region: 'north',
                    height: 126,
                    layout: {
                        type: 'absolute'
                    },
                    bodyPadding: 10,
                    title: '选择查询条件',
                    items: [
                        {
                            xtype: 'textfield',
                            x: 450,
                            y: 20,
                            id: 'ShouyiFindHetongField',
                            width: 180,
                            fieldLabel: '关键词',
                            labelWidth: 60
                        },
                        {
                            xtype: 'datefield',
                            x: 20,
                            y: 20,
                            id: 'ShouyiFindHetongDateStart',
                            width: 180,
                            fieldLabel: '起始时间',
                            labelWidth: 60
                        },
                        {
                            xtype: 'datefield',
                            x: 240,
                            y: 20,
                            id: 'ShouyiFindHetongDateEnd',
                            width: 180,
                            fieldLabel: '结束时间',
                            labelWidth: 60
                        },
                        {
                            xtype: 'button',
                            handler: function(button, event) {
                                var getDate1 = Ext.util.Format.date(Ext.getCmp('ShouyiFindHetongDateStart').getValue(),'Y-m-d');
                                var getDate2 = Ext.util.Format.date(Ext.getCmp('ShouyiFindHetongDateEnd').getValue(),'Y-m-d');
                                var getKeyword1 = Ext.getCmp('ShouyiFindHetongField').getValue();
                                var mystore=Ext.StoreMgr.get('ShouyiFind'); //获得store对象
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
                            x: 90,
                            y: 60,
                            width: 60,
                            text: '查询'
                        },
                        {
                            xtype: 'button',
                            handler: function(button, event) {
                                var grid = Ext.getCmp('ShouyiHetongTable');
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
                                        url:'getBenefitList14',
                                        params:{tablexh:tablexh},

                                        success:function(response){
                                            Ext.Msg.alert('删除提示','该条信息已成功删除！');
                                            var mystore = Ext.StoreMgr.get('ShouyiFind');
                                            mystore.load();

                                        }

                                    });

                                }
                            },
                            x: 310,
                            y: 60,
                            width: 60,
                            text: '删除'
                        },
                        {
                            xtype: 'button',
                            handler: function(button, event) {
                                var getDate1 = Ext.util.Format.date(Ext.getCmp('ShouyiFindHetongDateStart').getValue(),'Y-m-d');
                                var getDate2 = Ext.util.Format.date(Ext.getCmp('ShouyiFindHetongDateEnd').getValue(),'Y-m-d');
                                var getKeyword1 = Ext.getCmp('ShouyiFindHetongField').getValue();
                                var mystore=Ext.StoreMgr.get('ShouyiFind'); //获得store对象
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
                            x: 520,
                            y: 60,
                            width: 60,
                            text: '修改'
                        }
                    ]
                },
                {
                    xtype: 'gridpanel',
                    region: 'center',
                    id: 'ShouyiHetongTable',
                    title: '合同信息列表',
                    store: 'ShouyiFind',
                    columns: [
                        {
                            xtype: 'rownumberer',
                            width: 39,
                            text: '序号'
                        },
                        {
                            xtype: 'gridcolumn',
                            width: 69,
                            dataIndex: 'htbh',
                            text: '合同编号'
                        },
                        {
                            xtype: 'datecolumn',
                            width: 76,
                            dataIndex: 'jysj',
                            text: '交易时间'
                        },
                        {
                            xtype: 'numbercolumn',
                            width: 76,
                            dataIndex: 'jyl',
                            text: '交易量（亩）'
                        },
                        {
                            xtype: 'gridcolumn',
                            width: 71,
                            dataIndex: 'jyqy',
                            text: '交易区域'
                        },
                        {
                            xtype: 'gridcolumn',
                            width: 83,
                            dataIndex: 'gmqymc',
                            text: '购买企业名称'
                        },
                        {
                            xtype: 'gridcolumn',
                            width: 83,
                            dataIndex: 'qyxz',
                            text: '企业性质'
                        },
                        {
                            xtype: 'numbercolumn',
                            width: 72,
                            dataIndex: 'qysy',
                            text: '企业收益'
                        },
                        {
                            xtype: 'numbercolumn',
                            dataIndex: 'nhsy',
                            text: '农户收益'
                        },
                        {
                            xtype: 'numbercolumn',
                            dataIndex: 'zfsy',
                            text: '政府收益'
                        }
                    ],
                    dockedItems: [
                        {
                            xtype: 'pagingtoolbar',
                            dock: 'bottom',
                            width: 360,
                            displayInfo: true,
                            store: 'ShouyiFind'
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