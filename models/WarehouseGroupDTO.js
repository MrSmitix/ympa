const utils = require('../utils/utils');
const WarehouseDTO = require('../models/WarehouseDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}name`,
                label: `Название группы складов. - [${labelPrefix}name]`,
                required: true,
                type: 'string',
            },
            ...WarehouseDTO.fields(`${keyPrefix}mainWarehouse`, isInput),
            {
                key: `${keyPrefix}warehouses`,
                label: `[${labelPrefix}warehouses]`,
                children: WarehouseDTO.fields(`${keyPrefix}warehouses${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'mainWarehouse': utils.removeIfEmpty(WarehouseDTO.mapping(bundle, `${keyPrefix}mainWarehouse`)),
            'warehouses': utils.childMapping(bundle.inputData?.[`${keyPrefix}warehouses`], `${keyPrefix}warehouses`, WarehouseDTO),
        }
    },
}
