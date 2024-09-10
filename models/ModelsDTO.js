const utils = require('../utils/utils');
const ModelDTO = require('../models/ModelDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}models`,
                label: `[${labelPrefix}models]`,
                children: ModelDTO.fields(`${keyPrefix}models${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'models': utils.childMapping(bundle.inputData?.[`${keyPrefix}models`], `${keyPrefix}models`, ModelDTO),
        }
    },
}
