/*
 * File: app/view/landSimpleSearch.js
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

Ext.define('MyApp.view.landSimpleSearch', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.landSimpleSearch',

    autoScroll: true,
    layout: {
        type: 'border'
    },
    title: '农业用地',

    initComponent: function() {
        var me = this;

        Ext.applyIf(me, {
            items: [
                {
                    xtype: 'form',
                    region: 'north',
                    height: 56,
                    layout: {
                        align: 'stretch',
                        type: 'hbox'
                    },
                    bodyPadding: 10,
                    title: '',
                    items: [
                        {
                            xtype: 'textfield',
                            margin: '',
                            width: 420,
                            fieldLabel: '',
                            hideLabel: true
                        },
                        {
                            xtype: 'button',
                            cls: 'x-btn-text-icon',
                            margin: 5,
                            width: 70,
                            icon: '',
                            iconAlign: 'bottom',
                            iconCls: '',
                            scale: 'large',
                            text: '检索'
                        },
                        {
                            xtype: 'button',
                            margin: 5,
                            width: 69,
                            text: '高级检索'
                        }
                    ]
                },
                {
                    xtype: 'gridpanel',
                    region: 'center',
                    title: '',
                    forceFit: true,
                    columns: [
                        {
                            xtype: 'gridcolumn',
                            text: '检索结果：'
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