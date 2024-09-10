const utils = require('../utils/utils');
const FeedDTO = require('../models/FeedDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...FeedDTO.fields(`${keyPrefix}feed`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'feed': utils.removeIfEmpty(FeedDTO.mapping(bundle, `${keyPrefix}feed`)),
        }
    },
}
