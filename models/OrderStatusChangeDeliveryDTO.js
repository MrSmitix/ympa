const utils = require('../utils/utils');
const OrderStatusChangeDeliveryDatesDTO = require('../models/OrderStatusChangeDeliveryDatesDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...OrderStatusChangeDeliveryDatesDTO.fields(`${keyPrefix}dates`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'dates': utils.removeIfEmpty(OrderStatusChangeDeliveryDatesDTO.mapping(bundle, `${keyPrefix}dates`)),
        }
    },
}
