const utils = require('../utils/utils');
const PriceQuarantineVerdictParamNameType = require('../models/PriceQuarantineVerdictParamNameType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}name`,
                ...PriceQuarantineVerdictParamNameType.fields(`${keyPrefix}name`, isInput),
            },
            {
                key: `${keyPrefix}value`,
                label: `Значение параметра. - [${labelPrefix}value]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'value': bundle.inputData?.[`${keyPrefix}value`],
        }
    },
}
