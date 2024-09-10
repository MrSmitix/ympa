const utils = require('../utils/utils');
const BriefOrderItemInstanceDTO = require('../models/BriefOrderItemInstanceDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`.  - [${labelPrefix}id]`,
                required: true,
                type: 'number',
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
            'instances': utils.childMapping(bundle.inputData?.[`${keyPrefix}instances`], `${keyPrefix}instances`, BriefOrderItemInstanceDTO),
        }
    },
}
