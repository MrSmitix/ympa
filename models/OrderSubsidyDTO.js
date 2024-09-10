const utils = require('../utils/utils');
const OrderSubsidyType = require('../models/OrderSubsidyType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                ...OrderSubsidyType.fields(`${keyPrefix}type`, isInput),
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
