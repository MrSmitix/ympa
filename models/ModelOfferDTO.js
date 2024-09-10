const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}discount`,
                label: `Скидка на предложение в процентах. - [${labelPrefix}discount]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}name`,
                label: `Наименование предложения. - [${labelPrefix}name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}pos`,
                label: `Позиция предложения в выдаче Маркета на карточке модели. - [${labelPrefix}pos]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}preDiscountPrice`,
                label: `Цена предложения без скидки магазина. - [${labelPrefix}preDiscountPrice]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}price`,
                label: `Цена предложения без скидки, которую получает покупатель при оплате через Yandex Pay. - [${labelPrefix}price]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}regionId`,
                label: `Идентификатор региона предложения (регион, откуда доставляется товар).  Сначала показываются предложения, доставляемые из региона, указанного в запросе в параметре `regionId`. Предложения, доставляемые из других регионов, показываются после них.  - [${labelPrefix}regionId]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}shippingCost`,
                label: `Стоимость доставки товара в регион:  * `0` — доставка осуществляется бесплатно. * `-1` — магазин не осуществляет доставку этого товара (самовывоз).  Если стоимость доставки неизвестна, параметр не выводится.  - [${labelPrefix}shippingCost]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}shopName`,
                label: `Название магазина (в том виде, в котором отображается на Маркете). - [${labelPrefix}shopName]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}shopRating`,
                label: `Рейтинг магазина.  Возможные значения: * `-1` — у магазинов, недавно появившихся на Маркете, рейтинг появляется не сразу. До момента появления рейтинга для таких магазинов возвращается значение `-1`. * `1`. * `2`. * `3`. * `4`. * `5`.  - [${labelPrefix}shopRating]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}inStock`,
                label: `{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  - [${labelPrefix}inStock]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'discount': bundle.inputData?.[`${keyPrefix}discount`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'pos': bundle.inputData?.[`${keyPrefix}pos`],
            'preDiscountPrice': bundle.inputData?.[`${keyPrefix}preDiscountPrice`],
            'price': bundle.inputData?.[`${keyPrefix}price`],
            'regionId': bundle.inputData?.[`${keyPrefix}regionId`],
            'shippingCost': bundle.inputData?.[`${keyPrefix}shippingCost`],
            'shopName': bundle.inputData?.[`${keyPrefix}shopName`],
            'shopRating': bundle.inputData?.[`${keyPrefix}shopRating`],
            'inStock': bundle.inputData?.[`${keyPrefix}inStock`],
        }
    },
}
