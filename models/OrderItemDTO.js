const utils = require('../utils/utils');
const OrderItemDetailDTO = require('../models/OrderItemDetailDTO');
const OrderItemInstanceDTO = require('../models/OrderItemInstanceDTO');
const OrderItemInstanceType = require('../models/OrderItemInstanceType');
const OrderItemPromoDTO = require('../models/OrderItemPromoDTO');
const OrderItemSubsidyDTO = require('../models/OrderItemSubsidyDTO');
const OrderVatType = require('../models/OrderVatType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа.  - [${labelPrefix}id]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}offerId`,
                label: `Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  - [${labelPrefix}offerId]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}offerName`,
                label: `Название товара. - [${labelPrefix}offerName]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}price`,
                label: `Цена на товар в валюте заказа без учета вознаграждения партнеру за скидки по промокодам, купонам и акциям (параметр `subsidies`).  - [${labelPrefix}price]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}buyerPrice`,
                label: `Цена на товар в валюте покупателя. В цене уже учтены скидки по:  * акциям; * купонам; * промокодам.  - [${labelPrefix}buyerPrice]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}buyerPriceBeforeDiscount`,
                label: `Стоимость товара в валюте покупателя до применения скидок по:  * акциям; * купонам; * промокодам.  - [${labelPrefix}buyerPriceBeforeDiscount]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}priceBeforeDiscount`,
                label: `{% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость товара в валюте магазина до применения скидок.  - [${labelPrefix}priceBeforeDiscount]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}count`,
                label: `Количество единиц товара. - [${labelPrefix}count]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}vat`,
                ...OrderVatType.fields(`${keyPrefix}vat`, isInput),
            },
            {
                key: `${keyPrefix}shopSku`,
                label: `Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  - [${labelPrefix}shopSku]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}subsidy`,
                label: `{% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `subsidies`.  {% endnote %}  Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам; * по купонам; * по баллам Плюса; * по акциям.  Передается в валюте заказа.  - [${labelPrefix}subsidy]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}partnerWarehouseId`,
                label: `{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Идентификатор склада в системе партнера, на который сформирован заказ.  - [${labelPrefix}partnerWarehouseId]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}promos`,
                label: `[${labelPrefix}promos]`,
                children: OrderItemPromoDTO.fields(`${keyPrefix}promos${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}instances`,
                label: `[${labelPrefix}instances]`,
                children: OrderItemInstanceDTO.fields(`${keyPrefix}instances${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}details`,
                label: `[${labelPrefix}details]`,
                children: OrderItemDetailDTO.fields(`${keyPrefix}details${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}subsidies`,
                label: `[${labelPrefix}subsidies]`,
                children: OrderItemSubsidyDTO.fields(`${keyPrefix}subsidies${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}requiredInstanceTypes`,
                list: true,
                type: 'string',
                ...OrderItemInstanceType.fields(`${keyPrefix}requiredInstanceTypes`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'offerId': bundle.inputData?.[`${keyPrefix}offerId`],
            'offerName': bundle.inputData?.[`${keyPrefix}offerName`],
            'price': bundle.inputData?.[`${keyPrefix}price`],
            'buyerPrice': bundle.inputData?.[`${keyPrefix}buyerPrice`],
            'buyerPriceBeforeDiscount': bundle.inputData?.[`${keyPrefix}buyerPriceBeforeDiscount`],
            'priceBeforeDiscount': bundle.inputData?.[`${keyPrefix}priceBeforeDiscount`],
            'count': bundle.inputData?.[`${keyPrefix}count`],
            'vat': bundle.inputData?.[`${keyPrefix}vat`],
            'shopSku': bundle.inputData?.[`${keyPrefix}shopSku`],
            'subsidy': bundle.inputData?.[`${keyPrefix}subsidy`],
            'partnerWarehouseId': bundle.inputData?.[`${keyPrefix}partnerWarehouseId`],
            'promos': utils.childMapping(bundle.inputData?.[`${keyPrefix}promos`], `${keyPrefix}promos`, OrderItemPromoDTO),
            'instances': utils.childMapping(bundle.inputData?.[`${keyPrefix}instances`], `${keyPrefix}instances`, OrderItemInstanceDTO),
            'details': utils.childMapping(bundle.inputData?.[`${keyPrefix}details`], `${keyPrefix}details`, OrderItemDetailDTO),
            'subsidies': utils.childMapping(bundle.inputData?.[`${keyPrefix}subsidies`], `${keyPrefix}subsidies`, OrderItemSubsidyDTO),
            'requiredInstanceTypes': utils.childMapping(bundle.inputData?.[`${keyPrefix}requiredInstanceTypes`], `${keyPrefix}requiredInstanceTypes`, OrderItemInstanceType),
        }
    },
}
