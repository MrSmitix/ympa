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
            {
                key: `${keyPrefix}prevPageToken`,
                label: `Идентификатор предыдущей страницы результатов. - [${labelPrefix}prevPageToken]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'nextPageToken': bundle.inputData?.[`${keyPrefix}nextPageToken`],
            'prevPageToken': bundle.inputData?.[`${keyPrefix}prevPageToken`],
        }
    },
}
