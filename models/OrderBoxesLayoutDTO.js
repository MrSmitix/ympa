const utils = require('../utils/utils');
const EnrichedOrderBoxLayoutDTO = require('../models/EnrichedOrderBoxLayoutDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}boxes`,
                label: `[${labelPrefix}boxes]`,
                children: EnrichedOrderBoxLayoutDTO.fields(`${keyPrefix}boxes${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'boxes': utils.childMapping(bundle.inputData?.[`${keyPrefix}boxes`], `${keyPrefix}boxes`, EnrichedOrderBoxLayoutDTO),
        }
    },
}
