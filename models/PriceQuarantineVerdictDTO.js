const utils = require('../utils/utils');
const PriceQuarantineVerdictParameterDTO = require('../models/PriceQuarantineVerdictParameterDTO');
const PriceQuarantineVerdictType = require('../models/PriceQuarantineVerdictType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                ...PriceQuarantineVerdictType.fields(`${keyPrefix}type`, isInput),
            },
            {
                key: `${keyPrefix}params`,
                label: `[${labelPrefix}params]`,
                children: PriceQuarantineVerdictParameterDTO.fields(`${keyPrefix}params${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'params': utils.childMapping(bundle.inputData?.[`${keyPrefix}params`], `${keyPrefix}params`, PriceQuarantineVerdictParameterDTO),
        }
    },
}
