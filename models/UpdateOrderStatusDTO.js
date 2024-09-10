const utils = require('../utils/utils');
const OrderStatusType = require('../models/OrderStatusType');
const OrderSubstatusType = require('../models/OrderSubstatusType');
const OrderUpdateStatusType = require('../models/OrderUpdateStatusType');

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
                key: `${keyPrefix}updateStatus`,
                ...OrderUpdateStatusType.fields(`${keyPrefix}updateStatus`, isInput),
            },
            {
                key: `${keyPrefix}errorDetails`,
                label: `Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр `updateStatus` принимает значение `ERROR`.  - [${labelPrefix}errorDetails]`,
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
            'updateStatus': bundle.inputData?.[`${keyPrefix}updateStatus`],
            'errorDetails': bundle.inputData?.[`${keyPrefix}errorDetails`],
        }
    },
}
