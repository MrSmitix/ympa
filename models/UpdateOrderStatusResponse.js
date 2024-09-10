const utils = require('../utils/utils');
const OrderDTO = require('../models/OrderDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...OrderDTO.fields(`${keyPrefix}order`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'order': utils.removeIfEmpty(OrderDTO.mapping(bundle, `${keyPrefix}order`)),
        }
    },
}
