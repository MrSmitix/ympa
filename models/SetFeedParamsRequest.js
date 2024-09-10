const utils = require('../utils/utils');
const FeedParameterDTO = require('../models/FeedParameterDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}parameters`,
                label: `[${labelPrefix}parameters]`,
                children: FeedParameterDTO.fields(`${keyPrefix}parameters${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'parameters': utils.childMapping(bundle.inputData?.[`${keyPrefix}parameters`], `${keyPrefix}parameters`, FeedParameterDTO),
        }
    },
}
