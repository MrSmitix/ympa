const utils = require('../utils/utils');
const EnrichedModelDTO = require('../models/EnrichedModelDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}models`,
                label: `[${labelPrefix}models]`,
                children: EnrichedModelDTO.fields(`${keyPrefix}models${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'models': utils.childMapping(bundle.inputData?.[`${keyPrefix}models`], `${keyPrefix}models`, EnrichedModelDTO),
        }
    },
}
