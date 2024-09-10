const utils = require('../utils/utils');
const CurrencyType = require('../models/CurrencyType');
const OrderBuyerDTO = require('../models/OrderBuyerDTO');
const OrderDeliveryDTO = require('../models/OrderDeliveryDTO');
const OrderItemDTO = require('../models/OrderItemDTO');
const OrderPaymentMethodType = require('../models/OrderPaymentMethodType');
const OrderPaymentType = require('../models/OrderPaymentType');
const OrderStatusType = require('../models/OrderStatusType');
const OrderSubsidyDTO = require('../models/OrderSubsidyDTO');
const OrderSubstatusType = require('../models/OrderSubstatusType');
const OrderTaxSystemType = require('../models/OrderTaxSystemType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `Идентификатор заказа. - [${labelPrefix}id]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}status`,
                ...OrderStatusType.fields(`${keyPrefix}status`, isInput),
            },
            {
                key: `${keyPrefix}substatus`,
                ...OrderSubstatusType.fields(`${keyPrefix}substatus`, isInput),
            },
            {
                key: `${keyPrefix}creationDate`,
                label: `[${labelPrefix}creationDate]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}updatedAt`,
                label: `[${labelPrefix}updatedAt]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}currency`,
                ...CurrencyType.fields(`${keyPrefix}currency`, isInput),
            },
            {
                key: `${keyPrefix}itemsTotal`,
                label: `Платеж покупателя.  - [${labelPrefix}itemsTotal]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}deliveryTotal`,
                label: `Стоимость доставки.  - [${labelPrefix}deliveryTotal]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}buyerItemsTotal`,
                label: `{% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки.  - [${labelPrefix}buyerItemsTotal]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}buyerTotal`,
                label: `{% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки.  - [${labelPrefix}buyerTotal]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}buyerItemsTotalBeforeDiscount`,
                label: `Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам.  - [${labelPrefix}buyerItemsTotalBeforeDiscount]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}buyerTotalBeforeDiscount`,
                label: `{% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (`buyerItemsTotalBeforeDiscount` + стоимость доставки).  - [${labelPrefix}buyerTotalBeforeDiscount]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}paymentType`,
                ...OrderPaymentType.fields(`${keyPrefix}paymentType`, isInput),
            },
            {
                key: `${keyPrefix}paymentMethod`,
                ...OrderPaymentMethodType.fields(`${keyPrefix}paymentMethod`, isInput),
            },
            {
                key: `${keyPrefix}fake`,
                label: `Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  - [${labelPrefix}fake]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}items`,
                label: `[${labelPrefix}items]`,
                children: OrderItemDTO.fields(`${keyPrefix}items${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}subsidies`,
                label: `[${labelPrefix}subsidies]`,
                children: OrderSubsidyDTO.fields(`${keyPrefix}subsidies${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...OrderDeliveryDTO.fields(`${keyPrefix}delivery`, isInput),
            ...OrderBuyerDTO.fields(`${keyPrefix}buyer`, isInput),
            {
                key: `${keyPrefix}notes`,
                label: `Комментарий к заказу. - [${labelPrefix}notes]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}taxSystem`,
                ...OrderTaxSystemType.fields(`${keyPrefix}taxSystem`, isInput),
            },
            {
                key: `${keyPrefix}cancelRequested`,
                label: `**Только для модели DBS**  Запрошена ли отмена.  - [${labelPrefix}cancelRequested]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}expiryDate`,
                label: `[${labelPrefix}expiryDate]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'substatus': bundle.inputData?.[`${keyPrefix}substatus`],
            'creationDate': bundle.inputData?.[`${keyPrefix}creationDate`],
            'updatedAt': bundle.inputData?.[`${keyPrefix}updatedAt`],
            'currency': bundle.inputData?.[`${keyPrefix}currency`],
            'itemsTotal': bundle.inputData?.[`${keyPrefix}itemsTotal`],
            'deliveryTotal': bundle.inputData?.[`${keyPrefix}deliveryTotal`],
            'buyerItemsTotal': bundle.inputData?.[`${keyPrefix}buyerItemsTotal`],
            'buyerTotal': bundle.inputData?.[`${keyPrefix}buyerTotal`],
            'buyerItemsTotalBeforeDiscount': bundle.inputData?.[`${keyPrefix}buyerItemsTotalBeforeDiscount`],
            'buyerTotalBeforeDiscount': bundle.inputData?.[`${keyPrefix}buyerTotalBeforeDiscount`],
            'paymentType': bundle.inputData?.[`${keyPrefix}paymentType`],
            'paymentMethod': bundle.inputData?.[`${keyPrefix}paymentMethod`],
            'fake': bundle.inputData?.[`${keyPrefix}fake`],
            'items': utils.childMapping(bundle.inputData?.[`${keyPrefix}items`], `${keyPrefix}items`, OrderItemDTO),
            'subsidies': utils.childMapping(bundle.inputData?.[`${keyPrefix}subsidies`], `${keyPrefix}subsidies`, OrderSubsidyDTO),
            'delivery': utils.removeIfEmpty(OrderDeliveryDTO.mapping(bundle, `${keyPrefix}delivery`)),
            'buyer': utils.removeIfEmpty(OrderBuyerDTO.mapping(bundle, `${keyPrefix}buyer`)),
            'notes': bundle.inputData?.[`${keyPrefix}notes`],
            'taxSystem': bundle.inputData?.[`${keyPrefix}taxSystem`],
            'cancelRequested': bundle.inputData?.[`${keyPrefix}cancelRequested`],
            'expiryDate': bundle.inputData?.[`${keyPrefix}expiryDate`],
        }
    },
}
