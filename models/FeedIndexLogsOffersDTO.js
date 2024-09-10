const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}rejectedCount`,
                label: `Количество предложений, который не опубликованы на Маркете из-за найденных ошибок. - [${labelPrefix}rejectedCount]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}totalCount`,
                label: `Количество предложений в прайс-листе. - [${labelPrefix}totalCount]`,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'rejectedCount': bundle.inputData?.[`${keyPrefix}rejectedCount`],
            'totalCount': bundle.inputData?.[`${keyPrefix}totalCount`],
        }
    },
}
