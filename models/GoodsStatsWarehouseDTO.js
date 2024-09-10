const utils = require('../utils/utils');
const WarehouseStockDTO = require('../models/WarehouseStockDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `Идентификатор склада. - [${labelPrefix}id]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}name`,
                label: `Название склада. - [${labelPrefix}name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}stocks`,
                label: `[${labelPrefix}stocks]`,
                children: WarehouseStockDTO.fields(`${keyPrefix}stocks${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'stocks': utils.childMapping(bundle.inputData?.[`${keyPrefix}stocks`], `${keyPrefix}stocks`, WarehouseStockDTO),
        }
    },
}
