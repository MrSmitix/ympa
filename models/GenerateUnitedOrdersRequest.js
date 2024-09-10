const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}businessId`,
                label: `Идентификатор бизнеса. - [${labelPrefix}businessId]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}dateFrom`,
                label: `Начало периода, включительно. - [${labelPrefix}dateFrom]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}dateTo`,
                label: `Конец периода, включительно. Максимальный период — 1 год. - [${labelPrefix}dateTo]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}campaignIds`,
                label: `Список магазинов, которые нужны в отчете. - [${labelPrefix}campaignIds]`,
                list: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}promoId`,
                label: `Идентификатор акции, товары из которой нужны в отчете. - [${labelPrefix}promoId]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'businessId': bundle.inputData?.[`${keyPrefix}businessId`],
            'dateFrom': bundle.inputData?.[`${keyPrefix}dateFrom`],
            'dateTo': bundle.inputData?.[`${keyPrefix}dateTo`],
            'campaignIds': bundle.inputData?.[`${keyPrefix}campaignIds`],
            'promoId': bundle.inputData?.[`${keyPrefix}promoId`],
        }
    },
}
