const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}orderId`,
                label: `Идентификатор заказа на Маркете. - [${labelPrefix}orderId]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}modelId`,
                label: `Идентификатор модели товара. - [${labelPrefix}modelId]`,
                required: true,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'orderId': bundle.inputData?.[`${keyPrefix}orderId`],
            'modelId': bundle.inputData?.[`${keyPrefix}modelId`],
        }
    },
}
