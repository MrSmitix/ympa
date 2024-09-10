const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}minValue`,
                label: `Минимальное число. - [${labelPrefix}minValue]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}maxValue`,
                label: `Максимальное число. - [${labelPrefix}maxValue]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}maxLength`,
                label: `Максимальная длина текста. - [${labelPrefix}maxLength]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'minValue': bundle.inputData?.[`${keyPrefix}minValue`],
            'maxValue': bundle.inputData?.[`${keyPrefix}maxValue`],
            'maxLength': bundle.inputData?.[`${keyPrefix}maxLength`],
        }
    },
}
