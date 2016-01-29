/*
 * File: app/view/ht_wqwb_fzba.js
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

Ext.define('MyApp.view.ht_wqwb_fzba', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.ht_wqwb_fzba1',

    height: 588,
    width: 875,
    autoScroll: true,
    layout: {
        type: 'fit'
    },
    title: '发放凭证',

    initComponent: function() {
        var me = this;

        Ext.applyIf(me, {
            items: [
                {
                    xtype: 'gridpanel',
                    height: 310,
                    width: 690,
                    title: '',
                    titleAlign: 'center',
                    store: 'qzff',
                    columns: [
                        {
                            xtype: 'gridcolumn',
                            width: 110,
                            dataIndex: 'ticketid',
                            text: '地票编号'
                        },
                        {
                            xtype: 'gridcolumn',
                            width: 98,
                            dataIndex: 'amount',
                            text: '额度'
                        },
                        {
                            xtype: 'gridcolumn',
                            width: 113,
                            dataIndex: 'winner',
                            text: '中标单位'
                        },
                        {
                            xtype: 'gridcolumn',
                            width: 91,
                            dataIndex: 'windate',
                            text: '中标日期'
                        },
                        {
                            xtype: 'gridcolumn',
                            width: 99,
                            dataIndex: 'price',
                            text: '中标价格'
                        },
                        {
                            xtype: 'gridcolumn',
                            width: 82,
                            dataIndex: 'jycheck',
                            text: '审核状态'
                        },
                        {
                            xtype: 'gridcolumn',
                            renderer: function(value, metaData, record, rowIndex, colIndex, store, view) {
                                return "<button><label>生成凭证</label></button>";
                            },
                            width: 86,
                            dataIndex: 'string',
                            text: '生成凭证'
                        },
                        {
                            xtype: 'gridcolumn',
                            renderer: function(value, metaData, record, rowIndex, colIndex, store, view) {
                                return "<button><label>凭证预览</label></button>";
                            },
                            width: 100,
                            dataIndex: 'certification',
                            text: '凭证预览'
                        },
                        {
                            xtype: 'gridcolumn',
                            renderer: function(value, metaData, record, rowIndex, colIndex, store, view) {
                                return "<button><label>备案</label></button>";
                            },
                            width: 100,
                            dataIndex: 'string',
                            text: '备案入库'
                        }
                    ],
                    dockedItems: [
                        {
                            xtype: 'pagingtoolbar',
                            dock: 'bottom',
                            width: 360,
                            displayInfo: true,
                            store: 'qzff'
                        }
                    ],
                    listeners: {
                        cellclick: {
                            fn: me.onGridpanelCellClick,
                            scope: me
                        }
                    }
                }
            ]
        });

        me.callParent(arguments);
    },

    onGridpanelCellClick: function(tableview, td, cellIndex, record, tr, rowIndex, e, eOpts) {
        if(cellIndex=='6')
        {

            var ff=Ext.StoreMgr.get('qzff');

            Ext.Ajax.request(
            {
                url:'updatepz',
                method:'post', 
                headers:{


                    'Content-Type':'application/json'
                },


                success:function(response){
                    var result=Ext.decode(response.responseText);
                    Ext.MessageBox.alert('信息',result.msg,function(btn){
                        //ff.load();
                    });
                },
                failure:function(){
                    Ext.MessageBox.alert('错误','操作失败！');
                },
                params: Ext.encode(record.getData())
                // record:record.getData()


            }

            );

        }
        if(cellIndex=='7')
        {
            //alert(record.get('contractcontent'));
            //window.open(record.get('contractcontent'));   
            window.open(decodeURI(record.get('certification'),'gbk'));
        }
    }

});