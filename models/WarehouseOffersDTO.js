const utils = require('../utils/utils');
const WarehouseOfferDTO = require('../models/WarehouseOfferDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}warehouseId`,
                label: `Идентификатор склада. - [${labelPrefix}warehouseId]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}offers`,
                label: `[${labelPrefix}offers]`,
                children: WarehouseOfferDTO.fields(`${keyPrefix}offers${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'warehouseId': bundle.inputData?.[`${keyPrefix}warehouseId`],
            'offers': utils.childMapping(bundle.inputData?.[`${keyPrefix}offers`], `${keyPrefix}offers`, WarehouseOfferDTO),
        }
    },
}
