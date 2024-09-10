const utils = require('../utils/utils');
const FeedDTO = require('../models/FeedDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}feeds`,
                label: `[${labelPrefix}feeds]`,
                children: FeedDTO.fields(`${keyPrefix}feeds${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'feeds': utils.childMapping(bundle.inputData?.[`${keyPrefix}feeds`], `${keyPrefix}feeds`, FeedDTO),
        }
    },
}
