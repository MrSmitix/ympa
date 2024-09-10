const utils = require('../utils/utils');
const OrderItemSubsidyType = require('../models/OrderItemSubsidyType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                ...OrderItemSubsidyType.fields(`${keyPrefix}type`, isInput),
            },
            {
                key: `${keyPrefix}amount`,
                label: `Сумма субсидии. - [${labelPrefix}amount]`,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'amount': bundle.inputData?.[`${keyPrefix}amount`],
        }
    },
}
