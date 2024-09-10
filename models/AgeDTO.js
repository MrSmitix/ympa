const utils = require('../utils/utils');
const AgeUnitType = require('../models/AgeUnitType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}value`,
                label: `Значение.  - [${labelPrefix}value]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}ageUnit`,
                ...AgeUnitType.fields(`${keyPrefix}ageUnit`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'value': bundle.inputData?.[`${keyPrefix}value`],
            'ageUnit': bundle.inputData?.[`${keyPrefix}ageUnit`],
        }
    },
}
