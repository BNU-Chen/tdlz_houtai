/*
 * File: app/model/gxMyData.js
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

Ext.define('MyApp.model.gxMyData', {
    extend: 'Ext.data.Model',

    fields: [
        {
            mapping: 'id',
            name: 'id',
            sortType: 'asInt',
            type: 'int'
        },
        {
            name: 'ticketId',
            sortType: 'asUCString',
            type: 'string'
        },
        {
            name: 'isPush',
            sortType: 'asUCString',
            type: 'boolean'
        },
        {
            name: 'publishDate',
            sortType: 'asUCString',
            type: 'string'
        },
        {
            name: 'area',
            sortType: 'asFloat',
            type: 'float'
        },
        {
            name: 'deadline',
            sortType: 'asUCString',
            type: 'string'
        },
        {
            name: 'isMailPush',
            sortType: 'asUCString',
            type: 'boolean'
        }
    ]
});