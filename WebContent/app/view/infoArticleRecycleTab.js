/*
 * File: app/view/infoArticleRecycleTab.js
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

Ext.define('MyApp.view.infoArticleRecycleTab', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.infoArticleRecycleTab',

    id: 'infoArticleRecycleTab',
    title: '文章管理-回收站',

    initComponent: function() {
        var me = this;

        Ext.applyIf(me, {
            items: [
                {
                    xtype: 'form',
                    height: 421,
                    id: 'articleRecycleForm',
                    autoScroll: true,
                    layout: {
                        type: 'fit'
                    },
                    bodyPadding: 10,
                    title: 'My Form',
                    jsonSubmit: true,
                    items: [
                        {
                            xtype: 'gridpanel',
                            height: 241,
                            id: 'articlegrid1',
                            collapsible: false,
                            title: '回收站文章列表',
                            store: 'InfoArticleRecycleStore',
                            columns: [
                                {
                                    xtype: 'rownumberer'
                                },
                                {
                                    xtype: 'gridcolumn',
                                    dataIndex: 'articleId',
                                    text: '文章ID'
                                },
                                {
                                    xtype: 'gridcolumn',
                                    dataIndex: 'articleName',
                                    text: '文章标题'
                                },
                                {
                                    xtype: 'gridcolumn',
                                    dataIndex: 'channelId',
                                    text: '频道栏目'
                                },
                                {
                                    xtype: 'gridcolumn',
                                    dataIndex: 'articleAuthor',
                                    text: '作者'
                                },
                                {
                                    xtype: 'datecolumn',
                                    dataIndex: 'articlePublishtime',
                                    text: '发布时间'
                                }
                            ],
                            selModel: Ext.create('Ext.selection.CheckboxModel', {

                            }),
                            dockedItems: [
                                {
                                    xtype: 'toolbar',
                                    dock: 'top',
                                    frame: false,
                                    enableOverflow: true,
                                    items: [
                                        {
                                            xtype: 'textfield',
                                            width: 206,
                                            fieldLabel: '按频道栏目查询',
                                            selectOnFocus: true
                                        },
                                        {
                                            xtype: 'textfield',
                                            width: 192,
                                            fieldLabel: '按作者查询'
                                        },
                                        {
                                            xtype: 'textfield',
                                            width: 214,
                                            fieldLabel: '按文章标题查询'
                                        },
                                        {
                                            xtype: 'datefield',
                                            fieldLabel: '按时间查询'
                                        },
                                        {
                                            xtype: 'button',
                                            text: '查询文章'
                                        }
                                    ]
                                },
                                {
                                    xtype: 'toolbar',
                                    dock: 'top',
                                    items: [
                                        {
                                            xtype: 'button',
                                            text: '彻底删除'
                                        },
                                        {
                                            xtype: 'button',
                                            text: '文章恢复'
                                        }
                                    ]
                                },
                                {
                                    xtype: 'pagingtoolbar',
                                    dock: 'bottom',
                                    width: 360,
                                    displayInfo: true,
                                    store: 'InfoArticleRecycleStore'
                                }
                            ]
                        }
                    ]
                }
            ]
        });

        me.callParent(arguments);
    }

});