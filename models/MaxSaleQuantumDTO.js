const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `Идентификатор категории. - [${labelPrefix}id]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}name`,
                label: `Название категории. - [${labelPrefix}name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}maxSaleQuantum`,
                label: `Лимит на установку кванта и минимального количества товаров. - [${labelPrefix}maxSaleQuantum]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'maxSaleQuantum': bundle.inputData?.[`${keyPrefix}maxSaleQuantum`],
        }
    },
}
