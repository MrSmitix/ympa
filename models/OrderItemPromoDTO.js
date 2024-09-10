const utils = require('../utils/utils');
const OrderPromoType = require('../models/OrderPromoType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                ...OrderPromoType.fields(`${keyPrefix}type`, isInput),
            },
            {
                key: `${keyPrefix}discount`,
                label: `Размер пользовательской скидки в валюте покупателя.  - [${labelPrefix}discount]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}subsidy`,
                label: `Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа.  - [${labelPrefix}subsidy]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}shopPromoId`,
                label: `Идентификатор акции поставщика.  - [${labelPrefix}shopPromoId]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}marketPromoId`,
                label: `Идентификатор акции в рамках соглашения на оказание услуг по продвижению сервиса между Маркетом и партнером.  Параметр передается, только если параметр `type=MARKET_DEAL`.  - [${labelPrefix}marketPromoId]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'discount': bundle.inputData?.[`${keyPrefix}discount`],
            'subsidy': bundle.inputData?.[`${keyPrefix}subsidy`],
            'shopPromoId': bundle.inputData?.[`${keyPrefix}shopPromoId`],
            'marketPromoId': bundle.inputData?.[`${keyPrefix}marketPromoId`],
        }
    },
}
