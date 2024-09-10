const utils = require('../utils/utils');
const BriefOrderItemInstanceDTO = require('../models/BriefOrderItemInstanceDTO');
const OrderBoxLayoutPartialCountDTO = require('../models/OrderBoxLayoutPartialCountDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `Идентификатор товара в заказе.  {% cut \"Где его взять\" %}  Идентификатор приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`.  {% endcut %}    - [${labelPrefix}id]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}fullCount`,
                label: `Количество единиц товара в коробке.  Используйте это поле, если в коробке поедут целые товары, не разделенные на части. Не используйте это поле одновременно с `partialCount`.  - [${labelPrefix}fullCount]`,
                type: 'integer',
            },
            ...OrderBoxLayoutPartialCountDTO.fields(`${keyPrefix}partialCount`, isInput),
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
            'fullCount': bundle.inputData?.[`${keyPrefix}fullCount`],
            'partialCount': utils.removeIfEmpty(OrderBoxLayoutPartialCountDTO.mapping(bundle, `${keyPrefix}partialCount`)),
            'instances': utils.childMapping(bundle.inputData?.[`${keyPrefix}instances`], `${keyPrefix}instances`, BriefOrderItemInstanceDTO),
        }
    },
}
