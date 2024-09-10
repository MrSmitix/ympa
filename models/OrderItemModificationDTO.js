const utils = require('../utils/utils');
const BriefOrderItemInstanceDTO = require('../models/BriefOrderItemInstanceDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `Идентификатор товара в рамках заказа.  Получить идентификатор можно с помощью ресурсов [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).  Обязательный параметр.  - [${labelPrefix}id]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}count`,
                label: `Новое количество товара. - [${labelPrefix}count]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}instances`,
                label: `[${labelPrefix}instances]`,
                children: BriefOrderItemInstanceDTO.fields(`${keyPrefix}instances${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'count': bundle.inputData?.[`${keyPrefix}count`],
            'instances': utils.childMapping(bundle.inputData?.[`${keyPrefix}instances`], `${keyPrefix}instances`, BriefOrderItemInstanceDTO),
        }
    },
}
