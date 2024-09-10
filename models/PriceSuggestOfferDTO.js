const utils = require('../utils/utils');
const PriceSuggestDTO = require('../models/PriceSuggestDTO');

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
                key: `${keyPrefix}offerId`,
                label: `Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  - [${labelPrefix}offerId]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}priceSuggestion`,
                label: `[${labelPrefix}priceSuggestion]`,
                children: PriceSuggestDTO.fields(`${keyPrefix}priceSuggestion${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'marketSku': bundle.inputData?.[`${keyPrefix}marketSku`],
            'offerId': bundle.inputData?.[`${keyPrefix}offerId`],
            'priceSuggestion': utils.childMapping(bundle.inputData?.[`${keyPrefix}priceSuggestion`], `${keyPrefix}priceSuggestion`, PriceSuggestDTO),
        }
    },
}
