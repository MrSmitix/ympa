const utils = require('../utils/utils');
const OrderItemModificationDTO = require('../models/OrderItemModificationDTO');
const OrderItemsModificationRequestReasonType = require('../models/OrderItemsModificationRequestReasonType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}items`,
                label: `[${labelPrefix}items]`,
                children: OrderItemModificationDTO.fields(`${keyPrefix}items${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}reason`,
                ...OrderItemsModificationRequestReasonType.fields(`${keyPrefix}reason`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'items': utils.childMapping(bundle.inputData?.[`${keyPrefix}items`], `${keyPrefix}items`, OrderItemModificationDTO),
            'reason': bundle.inputData?.[`${keyPrefix}reason`],
        }
    },
}
