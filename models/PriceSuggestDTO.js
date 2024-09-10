const utils = require('../utils/utils');
const PriceSuggestType = require('../models/PriceSuggestType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                ...PriceSuggestType.fields(`${keyPrefix}type`, isInput),
            },
            {
                key: `${keyPrefix}price`,
                label: `Цена в рублях. - [${labelPrefix}price]`,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'price': bundle.inputData?.[`${keyPrefix}price`],
        }
    },
}
