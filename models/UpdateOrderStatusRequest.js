const utils = require('../utils/utils');
const OrderStatusChangeDTO = require('../models/OrderStatusChangeDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...OrderStatusChangeDTO.fields(`${keyPrefix}order`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'order': utils.removeIfEmpty(OrderStatusChangeDTO.mapping(bundle, `${keyPrefix}order`)),
        }
    },
}
