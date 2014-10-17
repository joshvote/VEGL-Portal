/**
 * A folder which contains Jobs and/or more folders
 */
Ext.define('vegl.models.Folder', {
    extend: 'Ext.data.Model',

    fields: [
        { name: 'id', type: 'int' }, //Unique ID for this folder
        { name: 'name', type: 'string' }, //short name of this folder
        { name: 'parent', type: 'int'}, //The iD of the parent folder (or null)
        { name: 'user', type: 'string'}, //Who owns this folder
    ],

    idProperty : 'id'
});