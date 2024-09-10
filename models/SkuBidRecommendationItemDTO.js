const utils = require('../utils/utils');
const BidRecommendationItemDTO = require('../models/BidRecommendationItemDTO');
const PriceRecommendationItemDTO = require('../models/PriceRecommendationItemDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}sku`,
                label: `Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  - [${labelPrefix}sku]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}bid`,
                label: `Значение ставки. - [${labelPrefix}bid]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}bidRecommendations`,
                label: `[${labelPrefix}bidRecommendations]`,
                children: BidRecommendationItemDTO.fields(`${keyPrefix}bidRecommendations${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}priceRecommendations`,
                label: `[${labelPrefix}priceRecommendations]`,
                children: PriceRecommendationItemDTO.fields(`${keyPrefix}priceRecommendations${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'sku': bundle.inputData?.[`${keyPrefix}sku`],
            'bid': bundle.inputData?.[`${keyPrefix}bid`],
            'bidRecommendations': utils.childMapping(bundle.inputData?.[`${keyPrefix}bidRecommendations`], `${keyPrefix}bidRecommendations`, BidRecommendationItemDTO),
            'priceRecommendations': utils.childMapping(bundle.inputData?.[`${keyPrefix}priceRecommendations`], `${keyPrefix}priceRecommendations`, PriceRecommendationItemDTO),
        }
    },
}
