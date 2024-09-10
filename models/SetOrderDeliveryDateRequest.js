const utils = require('../utils/utils');
const OrderDeliveryDateDTO = require('../models/OrderDeliveryDateDTO');
const OrderDeliveryDateReasonType = require('../models/OrderDeliveryDateReasonType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...OrderDeliveryDateDTO.fields(`${keyPrefix}dates`, isInput),
            {
                key: `${keyPrefix}reason`,
                ...OrderDeliveryDateReasonType.fields(`${keyPrefix}reason`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'dates': utils.removeIfEmpty(OrderDeliveryDateDTO.mapping(bundle, `${keyPrefix}dates`)),
            'reason': bundle.inputData?.[`${keyPrefix}reason`],
        }
    },
}
