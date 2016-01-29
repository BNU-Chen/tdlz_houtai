/*
 * File: app/store/ArticlePubZJJYStore.js
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

Ext.define('MyApp.store.ArticlePubZJJYStore', {
    extend: 'Ext.data.Store',

    requires: [
        'MyApp.model.InfoArticleModel'
    ],

    constructor: function(cfg) {
        var me = this;
        cfg = cfg || {};
        me.callParent([Ext.apply({
            autoLoad: true,
            autoSync: true,
            model: 'MyApp.model.InfoArticleModel',
            storeId: 'ArticlePubZJJYStore',
            proxy: {
                type: 'ajax',
                extraParams: {
                    searchKeyword: '',
                    searchDate: ''
                },
                url: 'get_pubArticleList?channelId=5',
                reader: {
                    type: 'json',
                    root: 'root'
                }
            }
        }, cfg)]);
    }
});