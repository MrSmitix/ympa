const utils = require('../utils/utils');
const OrderStatusType = require('../models/OrderStatusType');
const OrderSubstatusType = require('../models/OrderSubstatusType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `Идентификатор заказа. - [${labelPrefix}id]`,
                required: true,
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
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'substatus': bundle.inputData?.[`${keyPrefix}substatus`],
        }
    },
}
