const utils = require('../utils/utils');
const OrderItemInstanceDTO = require('../models/OrderItemInstanceDTO');
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
                key: `${keyPrefix}vat`,
                ...OrderVatType.fields(`${keyPrefix}vat`, isInput),
            },
            {
                key: `${keyPrefix}count`,
                label: `Количество единиц товара. - [${labelPrefix}count]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}price`,
                label: `Цена на товар. Указана в той валюте, которая была задана в каталоге. Разделитель целой и дробной части — точка.  - [${labelPrefix}price]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}offerName`,
                label: `Название товара. - [${labelPrefix}offerName]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}offerId`,
                label: `Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  - [${labelPrefix}offerId]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}instances`,
                label: `[${labelPrefix}instances]`,
                children: OrderItemInstanceDTO.fields(`${keyPrefix}instances${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'vat': bundle.inputData?.[`${keyPrefix}vat`],
            'count': bundle.inputData?.[`${keyPrefix}count`],
            'price': bundle.inputData?.[`${keyPrefix}price`],
            'offerName': bundle.inputData?.[`${keyPrefix}offerName`],
            'offerId': bundle.inputData?.[`${keyPrefix}offerId`],
            'instances': utils.childMapping(bundle.inputData?.[`${keyPrefix}instances`], `${keyPrefix}instances`, OrderItemInstanceDTO),
        }
    },
}
