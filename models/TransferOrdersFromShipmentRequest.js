const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}orderIds`,
                label: `Список заказов, которые вы не успеваете подготовить. - [${labelPrefix}orderIds]`,
                required: true,
                list: true,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'orderIds': bundle.inputData?.[`${keyPrefix}orderIds`],
        }
    },
}
