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
                key: `${keyPrefix}marketSkuName`,
                label: `Название карточки товара.  Может отсутствовать в ответе, если товар еще не привязан к карточке.  - [${labelPrefix}marketSkuName]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}marketModelId`,
                label: `Идентификатор модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке.  - [${labelPrefix}marketModelId]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}marketModelName`,
                label: `Название модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке.  - [${labelPrefix}marketModelName]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}marketCategoryId`,
                label: `Идентификатор категории на Маркете, в которую попал товар.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара.  - [${labelPrefix}marketCategoryId]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}marketCategoryName`,
                label: `Название категории карточки на Маркете.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара.  - [${labelPrefix}marketCategoryName]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'marketSku': bundle.inputData?.[`${keyPrefix}marketSku`],
            'marketSkuName': bundle.inputData?.[`${keyPrefix}marketSkuName`],
            'marketModelId': bundle.inputData?.[`${keyPrefix}marketModelId`],
            'marketModelName': bundle.inputData?.[`${keyPrefix}marketModelName`],
            'marketCategoryId': bundle.inputData?.[`${keyPrefix}marketCategoryId`],
            'marketCategoryName': bundle.inputData?.[`${keyPrefix}marketCategoryName`],
        }
    },
}
