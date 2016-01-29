/*
 * File: app/model/SchemeToShow.js
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

Ext.define('MyApp.model.SchemeToShow', {
    extend: 'Ext.data.Model',

    fields: [
        {
            mapping: 'projectName',
            name: 'projectName',
            type: 'string'
        },
        {
            name: 'projectLocation',
            type: 'string'
        },
        {
            name: 'startTime',
            type: 'date'
        },
        {
            name: 'isfinish',
            type: 'boolean'
        },
        {
            name: 'area',
            type: 'float'
        },
        {
            name: 'designUnit',
            type: 'string'
        },
        {
            name: 'dataSource',
            type: 'string'
        },
        {
            name: 'isshow',
            type: 'boolean'
        },
        {
            name: 'isFinish',
            type: 'boolean'
        },
        {
            name: 'dbTime',
            type: 'date'
        },
        {
            name: 'showTime',
            type: 'date'
        },
        {
            name: 'agree',
            type: 'int'
        },
        {
            name: 'against',
            type: 'int'
        },
        {
            name: 'oyerResult',
            type: 'string'
        },
        {
            name: 'oyerTime',
            type: 'date'
        },
        {
            name: 'monitorTime',
            type: 'date'
        },
        {
            name: 'FinishTime',
            type: 'date'
        }
    ]
});