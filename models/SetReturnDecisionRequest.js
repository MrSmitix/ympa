const utils = require('../utils/utils');
const ReturnRequestDecisionType = require('../models/ReturnRequestDecisionType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}returnItemId`,
                label: `Идентификатор товара в возврате. - [${labelPrefix}returnItemId]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}decisionType`,
                ...ReturnRequestDecisionType.fields(`${keyPrefix}decisionType`, isInput),
            },
            {
                key: `${keyPrefix}comment`,
                label: `Комментарий к решению. Укажите:  * для `REFUND_MONEY_INCLUDING_SHIPMENT`— стоимость обратной пересылки;  * для `REPAIR` — когда вы устраните недостатки товара;  * для `DECLINE_REFUND` — причину отказа;  * для `OTHER_DECISION` — какое решение вы предлагаете.  - [${labelPrefix}comment]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'returnItemId': bundle.inputData?.[`${keyPrefix}returnItemId`],
            'decisionType': bundle.inputData?.[`${keyPrefix}decisionType`],
            'comment': bundle.inputData?.[`${keyPrefix}comment`],
        }
    },
}
