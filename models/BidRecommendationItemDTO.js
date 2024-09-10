const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}bid`,
                label: `Значение ставки. - [${labelPrefix}bid]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}showPercent`,
                label: `Доля показов.  - [${labelPrefix}showPercent]`,
                required: true,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'bid': bundle.inputData?.[`${keyPrefix}bid`],
            'showPercent': bundle.inputData?.[`${keyPrefix}showPercent`],
        }
    },
}
