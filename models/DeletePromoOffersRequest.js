const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}promoId`,
                label: `Идентификатор акции. - [${labelPrefix}promoId]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}deleteAllOffers`,
                label: `Чтобы убрать все товары из акции и больше не участвовать в ней, передайте значение `true` и не передавайте параметр `offerIds`. - [${labelPrefix}deleteAllOffers]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}offerIds`,
                label: `Товары, которые нужно убрать из акции. - [${labelPrefix}offerIds]`,
                list: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'promoId': bundle.inputData?.[`${keyPrefix}promoId`],
            'deleteAllOffers': bundle.inputData?.[`${keyPrefix}deleteAllOffers`],
            'offerIds': bundle.inputData?.[`${keyPrefix}offerIds`],
        }
    },
}
