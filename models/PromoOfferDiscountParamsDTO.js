const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}price`,
                label: `Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Возвращается, только если товар участвует в акции.  - [${labelPrefix}price]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}promoPrice`,
                label: `Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Возвращается, только если товар участвует в акции.  - [${labelPrefix}promoPrice]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}maxPromoPrice`,
                label: `Максимально возможная цена для участия в акции.  Указывается в рублях.  Возвращается для всех товаров.  - [${labelPrefix}maxPromoPrice]`,
                required: true,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'price': bundle.inputData?.[`${keyPrefix}price`],
            'promoPrice': bundle.inputData?.[`${keyPrefix}promoPrice`],
            'maxPromoPrice': bundle.inputData?.[`${keyPrefix}maxPromoPrice`],
        }
    },
}
