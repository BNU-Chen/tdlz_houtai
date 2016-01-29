/*
 * File: app/view/pmzbfb.js
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

Ext.define('MyApp.view.pmzbfb', {
    extend: 'Ext.form.Panel',
    alias: 'widget.pmzbfb',

    height: 591,
    id: 'pmzbfb',
    width: 822,
    autoScroll: true,
    layout: {
        type: 'absolute'
    },
    anchorSize: 500,
    bodyPadding: 10,
    title: '拍卖指标发布',
    jsonSubmit: true,
    url: 'getoverage',

    initComponent: function() {
        var me = this;

        me.initialConfig = Ext.apply({
            jsonSubmit: true,
            url: 'getoverage'
        }, me.initialConfig);

        Ext.applyIf(me, {
            items: [
                {
                    xtype: 'form',
                    x: 70,
                    y: 80,
                    height: 270,
                    id: 'bh',
                    width: 290,
                    layout: {
                        type: 'absolute'
                    },
                    bodyPadding: 10,
                    title: 'bh',
                    titleAlign: 'center',
                    items: [
                        {
                            xtype: 'combobox',
                            x: 100,
                            y: 10,
                            id: 'dwed',
                            width: 170,
                            fieldLabel: '单位额度',
                            labelWidth: 60,
                            value: '100亩',
                            emptyText: '100亩',
                            displayField: 'value',
                            queryMode: 'local',
                            store: 'ticketfbcount',
                            valueField: 'value',
                            listeners: {
                                change: {
                                    fn: me.onAmountChange,
                                    scope: me
                                }
                            }
                        },
                        {
                            xtype: 'combobox',
                            x: 100,
                            y: 50,
                            id: 'unt',
                            width: 170,
                            fieldLabel: '本组数量',
                            labelWidth: 60,
                            name: 'count',
                            value: 1,
                            emptyText: '1',
                            queryMode: 'local',
                            store: 'ticketfbcount',
                            valueField: 'text',
                            listeners: {
                                change: {
                                    fn: me.onUntChange,
                                    scope: me
                                }
                            }
                        },
                        {
                            xtype: 'textfield',
                            x: 100,
                            y: 90,
                            id: 'total',
                            width: 170,
                            fieldLabel: '本组总额',
                            labelWidth: 60,
                            name: 'total'
                        },
                        {
                            xtype: 'textfield',
                            x: 100,
                            y: 130,
                            width: 170,
                            fieldLabel: '设置基价',
                            labelWidth: 60
                        },
                        {
                            xtype: 'datefield',
                            x: 100,
                            y: 170,
                            width: 170,
                            fieldLabel: '开拍日期',
                            labelWidth: 60
                        },
                        {
                            xtype: 'button',
                            handler: function(button, event) {
                                Ext.MessageBox.alert('提示','发布成功');
                            },
                            x: 120,
                            y: 200,
                            text: '招标发布'
                        },
                        {
                            xtype: 'barbar',
                            x: 20,
                            y: 180,
                            height: 20,
                            id: 'bar',
                            width: 70,
                            title: 'barbar'
                        }
                    ],
                    listeners: {
                        afterrender: {
                            fn: me.onFormAfterRender,
                            scope: me
                        }
                    }
                },
                {
                    xtype: 'form',
                    x: 450,
                    y: 80,
                    height: 270,
                    width: 290,
                    layout: {
                        type: 'absolute'
                    },
                    bodyPadding: 10,
                    title: 'bh2',
                    titleAlign: 'center',
                    items: [
                        {
                            xtype: 'combobox',
                            x: 100,
                            y: 10,
                            id: 'dwed2',
                            width: 170,
                            fieldLabel: '单位额度',
                            labelWidth: 60,
                            value: '100亩',
                            emptyText: '100亩',
                            displayField: 'value',
                            queryMode: 'local',
                            store: 'ticketfbcount',
                            valueField: 'value',
                            listeners: {
                                change: {
                                    fn: me.onDwed2Change,
                                    scope: me
                                }
                            }
                        },
                        {
                            xtype: 'combobox',
                            x: 100,
                            y: 50,
                            id: 'unt2',
                            width: 170,
                            fieldLabel: '本组数量',
                            labelWidth: 60,
                            value: 1,
                            emptyText: '1',
                            queryMode: 'local',
                            store: 'ticketfbcount',
                            valueField: 'text',
                            listeners: {
                                change: {
                                    fn: me.onUnt2Change,
                                    scope: me
                                }
                            }
                        },
                        {
                            xtype: 'textfield',
                            x: 100,
                            y: 90,
                            id: 'total2',
                            width: 170,
                            fieldLabel: '本组总额',
                            labelWidth: 60
                        },
                        {
                            xtype: 'textfield',
                            x: 100,
                            y: 130,
                            width: 170,
                            fieldLabel: '设置基价',
                            labelWidth: 60
                        },
                        {
                            xtype: 'datefield',
                            x: 100,
                            y: 170,
                            width: 170,
                            fieldLabel: '开拍日期',
                            labelWidth: 60
                        },
                        {
                            xtype: 'button',
                            handler: function(button, event) {
                                Ext.MessageBox.alert('提示','发布成功');
                            },
                            x: 120,
                            y: 200,
                            text: '招标发布'
                        },
                        {
                            xtype: 'chart',
                            x: -32,
                            y: -6,
                            height: 250,
                            width: 140,
                            animate: true,
                            insetPadding: 20,
                            store: 'charfb',
                            series: [
                                {
                                    type: 'column',
                                    label: {
                                        display: 'insideEnd',
                                        field: 'y',
                                        color: '#333',
                                        'text-anchor': 'middle'
                                    },
                                    yField: 'y2'
                                }
                            ]
                        }
                    ],
                    listeners: {
                        beforerender: {
                            fn: me.onFormBeforeRender,
                            scope: me
                        }
                    }
                },
                {
                    xtype: 'button',
                    handler: function(button, event) {
                        var tt=Ext.getCmp('pmzbfb');
                        //var tj=Ext.widget('jp');
                        //tj.x=70;
                        //tj.y=400;
                        //tt.add(tj);
                        //alert('ess');
                        var myDate=new Date();
                        var year=myDate.getFullYear();
                        var month=(myDate.getMonth()+1)<10?'0'+(myDate.getMonth()+1):(myDate.getMonth()+1);
                        var date=myDate.getDate()<10?'0'+myDate.getDate():myDate.getDate();
                        var n=Ext.getCmp('count').getValue();

                        alert('n'+n);
                        var y=80+Math.floor(n/2)*320;
                        //alert(y);
                        if(n%2===0)
                        {
                            var ticket1=Ext.widget('jp');
                            var title=year+'JP'+month+date+n;
                            ticket1.setTitle(title);
                            ticket1.setTitle('00000');
                            ticket1.x=70;
                            ticket1.y=y;
                            tt.add(ticket1);

                        }
                        else
                        {

                            var ticket2=Ext.widget('jp');
                            var title2=year+'JP'+month+date+n;
                            ticket2.setTitle(title2);
                            ticket2.x=450;
                            ticket2.y=y;
                            tt.add(ticket2);
                        }
                        n++;
                        Ext.getCmp('count').setValue(n);
                        //alert(n);

                    },
                    x: 500,
                    y: 10,
                    text: '添加指标'
                },
                {
                    xtype: 'button',
                    handler: function(button, event) {
                        var tt=Ext.getCmp('pmzbfb');
                        var tj=Ext.widget('jp');
                        tj.x=70;
                        tj.y=400;
                        tt.add(tj);
                        alert('ess');


                    },
                    x: 600,
                    y: 10,
                    text: '删除指标'
                },
                {
                    xtype: 'displayfield',
                    x: 20,
                    y: 10,
                    id: 'overage',
                    fieldLabel: '当前信息库地票总额:',
                    labelWidth: 150,
                    name: 'overage'
                },
                {
                    xtype: 'displayfield',
                    x: 260,
                    y: 10,
                    fieldLabel: '本次发布总额',
                    value: 0
                },
                {
                    xtype: 'textfield',
                    x: 30,
                    y: 50,
                    hidden: true,
                    hideMode: 'offsets',
                    id: 'count',
                    fieldLabel: 'count',
                    hideLabel: true,
                    name: 'count',
                    value: 2,
                    emptyText: '2'
                }
            ],
            listeners: {
                beforerender: {
                    fn: me.onPmzbfbBeforeRender,
                    scope: me
                }
            }
        });

        me.callParent(arguments);
    },

    onAmountChange: function(field, newValue, oldValue, eOpts) {
        var bar=Ext.widget('bar');
        var bh=Ext.getCmp('bh');
        bh.remove(bh.child("[xtype='barbar']"));



        var length=(newValue.substring(0,newValue.length-1)-100)/5;
        bar.x=10;
        bar.y=180-length;
        //alert(length);
        //bar.setY(bar.y+length);
        //bar.setHeight(50+length);
        //alert("hieght"+bar.height);
        //alert("y"+bar.y);
        //bar.y=180-length;
        bar.height=20+length;
        bar.id='bar';
        //bar.anchor='-180 20';
        //alert("y"+bar.y);
        //bar.render();
        //bar.layout();
        //bar.remove();
        bh.add(bar);
        var m=Ext.getCmp('unt').getRawValue();
        //alert(m);
        var total=Ext.getCmp('total');
        if(m===null||m===undefined)
        {

        }
        else
        {
            // alert(newValue.substring(0,newValue.length-1));
            // alert(m);
            total.setValue(newValue.substring(0,newValue.length-1)*m+'亩');
        }

    },

    onUntChange: function(field, newValue, oldValue, eOpts) {

        var m=Ext.getCmp('dwed').getValue();
        //alert(m);
        var total=Ext.getCmp('total');
        if(m===null||m==='')
        {

        }
        else
        {

            total.setValue(newValue*m.substring(0,m.length-1)+'亩');
        }

    },

    onFormAfterRender: function(component, eOpts) {
        var myDate=new Date();
        var year=myDate.getFullYear();
        var month=(myDate.getMonth()+1)<10?'0'+(myDate.getMonth()+1):(myDate.getMonth()+1);
        var date=myDate.getDate()<10?'0'+myDate.getDate():myDate.getDate();
        var title1=year+'JP'+month+date+'1';

        //alert(Ext.getCmp('aaa').hide());
        this.child("[title='bh']").setTitle(title1);


    },

    onDwed2Change: function(field, newValue, oldValue, eOpts) {

        var m=Ext.getCmp('unt2').getValue();
        //alert(m);
        var total=Ext.getCmp('total2');
        if(m===null||m===undefined)
        {

        }
        else
        {
            // alert(newValue.substring(0,newValue.length-1));
            // alert(m);
            total.setValue(newValue.substring(0,newValue.length-1)*m+'亩');
        }

    },

    onUnt2Change: function(field, newValue, oldValue, eOpts) {

        var m=Ext.getCmp('dwed2').getValue();
        //alert(m);
        var total=Ext.getCmp('total2');
        if(m===null||m==='')
        {

        }
        else
        {

            total.setValue(newValue*m.substring(0,m.length-1)+'亩');
        }
    },

    onFormBeforeRender: function(component, eOpts) {
        var myDate=new Date();
        var year=myDate.getFullYear();
        var month=(myDate.getMonth()+1)<10?'0'+(myDate.getMonth()+1):(myDate.getMonth()+1);
        var date=myDate.getDate()<10?'0'+myDate.getDate():myDate.getDate();
        var title2=year+'JP'+month+date+'2';

        //alert(Ext.getCmp('aaa').hide());
        this.child("[title='bh2']").setTitle(title2);

    },

    onPmzbfbBeforeRender: function(component, eOpts) {
        this.load();
    }

});