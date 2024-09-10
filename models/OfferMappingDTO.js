const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}marketSku`,
                label: `SKU на Маркете. - [${labelPrefix}marketSku]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}modelId`,
                label: `Идентификатор модели для текущей карточки товара на Маркете.  Например, две лопатки разных цветов имеют разные SKU на Маркете (параметр `marketSku`), но одинаковый идентификатор модели товара.  - [${labelPrefix}modelId]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}categoryId`,
                label: `Идентификатор категории для текущей карточки товара на Маркете. - [${labelPrefix}categoryId]`,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'marketSku': bundle.inputData?.[`${keyPrefix}marketSku`],
            'modelId': bundle.inputData?.[`${keyPrefix}modelId`],
            'categoryId': bundle.inputData?.[`${keyPrefix}categoryId`],
        }
    },
}
