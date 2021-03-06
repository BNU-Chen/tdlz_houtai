/*
 * File: app/view/infoCommentTab.js
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

Ext.define('MyApp.view.infoCommentTab', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.infoCommentTab',

    title: '文章评论-列表',

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
                                    xtype: 'rownumberer',
                                    text: ''
                                },
                                {
                                    xtype: 'gridcolumn',
                                    dataIndex: 'commentId',
                                    text: '文章标题'
                                },
                                {
                                    xtype: 'gridcolumn',
                                    dataIndex: 'string',
                                    text: '频道栏目'
                                },
                                {
                                    xtype: 'numbercolumn',
                                    text: '评论数'
                                },
                                {
                                    xtype: 'booleancolumn',
                                    dataIndex: 'bool',
                                    text: '有新评论'
                                }
                            ],
                            dockedItems: [
                                {
                                    xtype: 'toolbar',
                                    dock: 'top',
                                    width: 672,
                                    enableOverflow: true,
                                    items: [
                                        {
                                            xtype: 'textfield',
                                            fieldLabel: '文章标题'
                                        },
                                        {
                                            xtype: 'textfield',
                                            fieldLabel: '频道栏目'
                                        },
                                        {
                                            xtype: 'textfield',
                                            fieldLabel: '关键词'
                                        },
                                        {
                                            xtype: 'button',
                                            text: '搜索'
                                        },
                                        {
                                            xtype: 'button',
                                            text: '查看评论'
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