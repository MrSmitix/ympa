const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}url`,
                label: `Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md).  - [${labelPrefix}url]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}supplierName`,
                label: `Юридическое название магазина. - [${labelPrefix}supplierName]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}deliveryServiceName`,
                label: `Юридическое название службы доставки. - [${labelPrefix}deliveryServiceName]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}orderId`,
                label: `Идентификатор заказа в системе Маркета. - [${labelPrefix}orderId]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}orderNum`,
                label: `Идентификатор заказа в информационной системе магазина.  Совпадает с `orderId`, если Маркету неизвестен номер заказа в системе магазина.  - [${labelPrefix}orderNum]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}recipientName`,
                label: `Фамилия и инициалы получателя заказа. - [${labelPrefix}recipientName]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}boxId`,
                label: `Идентификатор коробки. - [${labelPrefix}boxId]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}fulfilmentId`,
                label: `Идентификатор коробки в информационной системе магазина.  Возвращается в формате: `номер заказа на Маркете-номер коробки`. Например, `7206821‑1`, `7206821‑2` и т. д.  - [${labelPrefix}fulfilmentId]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}place`,
                label: `Номер коробки в заказе. Возвращается в формате: `номер места/общее количество мест`.  - [${labelPrefix}place]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}weight`,
                label: `{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Общая масса всех товаров в заказе. Возвращается в формате: `weight кг`.  - [${labelPrefix}weight]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}deliveryServiceId`,
                label: `Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md). - [${labelPrefix}deliveryServiceId]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}deliveryAddress`,
                label: `Адрес получателя. - [${labelPrefix}deliveryAddress]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}shipmentDate`,
                label: `Дата отгрузки в формате `dd.MM.yyyy`. - [${labelPrefix}shipmentDate]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'url': bundle.inputData?.[`${keyPrefix}url`],
            'supplierName': bundle.inputData?.[`${keyPrefix}supplierName`],
            'deliveryServiceName': bundle.inputData?.[`${keyPrefix}deliveryServiceName`],
            'orderId': bundle.inputData?.[`${keyPrefix}orderId`],
            'orderNum': bundle.inputData?.[`${keyPrefix}orderNum`],
            'recipientName': bundle.inputData?.[`${keyPrefix}recipientName`],
            'boxId': bundle.inputData?.[`${keyPrefix}boxId`],
            'fulfilmentId': bundle.inputData?.[`${keyPrefix}fulfilmentId`],
            'place': bundle.inputData?.[`${keyPrefix}place`],
            'weight': bundle.inputData?.[`${keyPrefix}weight`],
            'deliveryServiceId': bundle.inputData?.[`${keyPrefix}deliveryServiceId`],
            'deliveryAddress': bundle.inputData?.[`${keyPrefix}deliveryAddress`],
            'shipmentDate': bundle.inputData?.[`${keyPrefix}shipmentDate`],
        }
    },
}
