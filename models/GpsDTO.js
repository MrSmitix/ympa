const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}latitude`,
                label: `Широта. - [${labelPrefix}latitude]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}longitude`,
                label: `Долгота. - [${labelPrefix}longitude]`,
                required: true,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'latitude': bundle.inputData?.[`${keyPrefix}latitude`],
            'longitude': bundle.inputData?.[`${keyPrefix}longitude`],
        }
    },
}
