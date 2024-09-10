const utils = require('../utils/utils');
const FulfillmentWarehouseDTO = require('../models/FulfillmentWarehouseDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}warehouses`,
                label: `[${labelPrefix}warehouses]`,
                children: FulfillmentWarehouseDTO.fields(`${keyPrefix}warehouses${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'warehouses': utils.childMapping(bundle.inputData?.[`${keyPrefix}warehouses`], `${keyPrefix}warehouses`, FulfillmentWarehouseDTO),
        }
    },
}
