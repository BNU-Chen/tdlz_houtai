/*
 * File: app/view/jp.js
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

Ext.define('MyApp.view.jp', {
    extend: 'Ext.form.Panel',
    alias: 'widget.jp',

    height: 260,
    width: 290,
    layout: {
        type: 'absolute'
    },
    bodyPadding: 10,
    title: '编号',
    titleAlign: 'center',

    initComponent: function() {
        var me = this;

        Ext.applyIf(me, {
            items: [
                {
                    xtype: 'combobox',
                    x: 100,
                    y: 10,
                    width: 170,
                    fieldLabel: '单位额度',
                    labelWidth: 60,
                    displayField: 'value',
                    queryMode: 'local',
                    store: 'ticketfbcount',
                    valueField: 'value'
                },
                {
                    xtype: 'combobox',
                    x: 100,
                    y: 50,
                    width: 170,
                    fieldLabel: '本组数量',
                    labelWidth: 60,
                    queryMode: 'local',
                    store: 'ticketfbcount',
                    valueField: 'text'
                },
                {
                    xtype: 'textfield',
                    x: 100,
                    y: 90,
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
                            yField: 'y'
                        }
                    ]
                }
            ]
        });

        me.callParent(arguments);
    }

});