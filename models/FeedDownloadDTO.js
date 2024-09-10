const utils = require('../utils/utils');
const FeedDownloadErrorDTO = require('../models/FeedDownloadErrorDTO');
const FeedStatusType = require('../models/FeedStatusType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}status`,
                ...FeedStatusType.fields(`${keyPrefix}status`, isInput),
            },
            ...FeedDownloadErrorDTO.fields(`${keyPrefix}error`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'error': utils.removeIfEmpty(FeedDownloadErrorDTO.mapping(bundle, `${keyPrefix}error`)),
        }
    },
}
