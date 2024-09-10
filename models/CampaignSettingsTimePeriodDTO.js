const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}fromDate`,
                label: `Формат даты: `ДД-ММ-ГГГГ`.  - [${labelPrefix}fromDate]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}toDate`,
                label: `Формат даты: `ДД-ММ-ГГГГ`.  - [${labelPrefix}toDate]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'fromDate': bundle.inputData?.[`${keyPrefix}fromDate`],
            'toDate': bundle.inputData?.[`${keyPrefix}toDate`],
        }
    },
}
