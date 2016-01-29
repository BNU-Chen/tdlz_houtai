/*
 * File: app/view/infoCommentDetailTab.js
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

Ext.define('MyApp.view.infoCommentDetailTab', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.infoCommentDetailTab',

    layout: {
        type: 'fit'
    },
    title: '文章评论-详细',

    initComponent: function() {
        var me = this;

        Ext.applyIf(me, {
            items: [
                {
                    xtype: 'form',
                    bodyPadding: 10,
                    title: 'My Form',
                    items: [
                        {
                            xtype: 'gridpanel',
                            title: '文章评论',
                            columns: [
                                {
                                    xtype: 'rownumberer'
                                },
                                {
                                    xtype: 'gridcolumn',
                                    dataIndex: 'commentId',
                                    text: '评论人'
                                },
                                {
                                    xtype: 'gridcolumn',
                                    dataIndex: 'commentId',
                                    text: '评论内容'
                                },
                                {
                                    xtype: 'datecolumn',
                                    dataIndex: 'date',
                                    text: '评论时间'
                                }
                            ],
                            dockedItems: [
                                {
                                    xtype: 'toolbar',
                                    dock: 'top',
                                    enableOverflow: true,
                                    items: [
                                        {
                                            xtype: 'datefield',
                                            fieldLabel: '按时间查询'
                                        },
                                        {
                                            xtype: 'textfield',
                                            fieldLabel: '按关键词查询'
                                        },
                                        {
                                            xtype: 'button',
                                            text: '查询'
                                        },
                                        {
                                            xtype: 'button',
                                            text: '删除'
                                        }
                                    ]
                                },
                                {
                                    xtype: 'pagingtoolbar',
                                    dock: 'bottom',
                                    width: 360,
                                    displayInfo: true
                                }
                            ],
                            selModel: Ext.create('Ext.selection.CheckboxModel', {

                            })
                        }
                    ]
                }
            ]
        });

        me.callParent(arguments);
    }

});