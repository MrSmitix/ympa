const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}nextPageToken`,
                label: `Идентификатор следующей страницы результатов. - [${labelPrefix}nextPageToken]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'nextPageToken': bundle.inputData?.[`${keyPrefix}nextPageToken`],
        }
    },
}
