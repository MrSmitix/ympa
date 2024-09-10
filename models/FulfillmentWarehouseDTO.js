const utils = require('../utils/utils');
const WarehouseAddressDTO = require('../models/WarehouseAddressDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `Идентификатор склада. - [${labelPrefix}id]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}name`,
                label: `Название склада. - [${labelPrefix}name]`,
                required: true,
                type: 'string',
            },
            ...WarehouseAddressDTO.fields(`${keyPrefix}address`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'address': utils.removeIfEmpty(WarehouseAddressDTO.mapping(bundle, `${keyPrefix}address`)),
        }
    },
}
