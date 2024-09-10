const utils = require('../utils/utils');
const WarehouseDTO = require('../models/WarehouseDTO');
const WarehouseGroupDTO = require('../models/WarehouseGroupDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}warehouses`,
                label: `[${labelPrefix}warehouses]`,
                children: WarehouseDTO.fields(`${keyPrefix}warehouses${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}warehouseGroups`,
                label: `[${labelPrefix}warehouseGroups]`,
                children: WarehouseGroupDTO.fields(`${keyPrefix}warehouseGroups${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'warehouses': utils.childMapping(bundle.inputData?.[`${keyPrefix}warehouses`], `${keyPrefix}warehouses`, WarehouseDTO),
            'warehouseGroups': utils.childMapping(bundle.inputData?.[`${keyPrefix}warehouseGroups`], `${keyPrefix}warehouseGroups`, WarehouseGroupDTO),
        }
    },
}
