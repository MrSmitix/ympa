const utils = require('../utils/utils');
const CurrencyType = require('../models/CurrencyType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}value`,
                label: `Значение. - [${labelPrefix}value]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}currencyId`,
                ...CurrencyType.fields(`${keyPrefix}currencyId`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'value': bundle.inputData?.[`${keyPrefix}value`],
            'currencyId': bundle.inputData?.[`${keyPrefix}currencyId`],
        }
    },
}
