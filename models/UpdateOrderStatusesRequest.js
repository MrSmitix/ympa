const utils = require('../utils/utils');
const OrderStateDTO = require('../models/OrderStateDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}orders`,
                label: `[${labelPrefix}orders]`,
                children: OrderStateDTO.fields(`${keyPrefix}orders${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'orders': utils.childMapping(bundle.inputData?.[`${keyPrefix}orders`], `${keyPrefix}orders`, OrderStateDTO),
        }
    },
}
