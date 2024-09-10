const utils = require('../utils/utils');
const OrderStatusChangeDeliveryDTO = require('../models/OrderStatusChangeDeliveryDTO');
const OrderStatusType = require('../models/OrderStatusType');
const OrderSubstatusType = require('../models/OrderSubstatusType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}status`,
                ...OrderStatusType.fields(`${keyPrefix}status`, isInput),
            },
            {
                key: `${keyPrefix}substatus`,
                ...OrderSubstatusType.fields(`${keyPrefix}substatus`, isInput),
            },
            ...OrderStatusChangeDeliveryDTO.fields(`${keyPrefix}delivery`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'substatus': bundle.inputData?.[`${keyPrefix}substatus`],
            'delivery': utils.removeIfEmpty(OrderStatusChangeDeliveryDTO.mapping(bundle, `${keyPrefix}delivery`)),
        }
    },
}
