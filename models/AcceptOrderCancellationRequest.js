const utils = require('../utils/utils');
const OrderCancellationReasonType = require('../models/OrderCancellationReasonType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}accepted`,
                label: `Решение об отмене заказа:  * `true` — заказ отменяется, служба доставки узнала об отмене до передачи заказа покупателю. * `false` — заказ не отменяется, так как он уже доставлен покупателю курьером или передан в пункт выдачи заказов.  - [${labelPrefix}accepted]`,
                required: true,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}reason`,
                ...OrderCancellationReasonType.fields(`${keyPrefix}reason`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'accepted': bundle.inputData?.[`${keyPrefix}accepted`],
            'reason': bundle.inputData?.[`${keyPrefix}reason`],
        }
    },
}
