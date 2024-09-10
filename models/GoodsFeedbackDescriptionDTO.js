const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}advantages`,
                label: `Описание плюсов товара в отзыве. - [${labelPrefix}advantages]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}disadvantages`,
                label: `Описание минусов товара в отзыве. - [${labelPrefix}disadvantages]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}comment`,
                label: `Комментарий в отзыве. - [${labelPrefix}comment]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'advantages': bundle.inputData?.[`${keyPrefix}advantages`],
            'disadvantages': bundle.inputData?.[`${keyPrefix}disadvantages`],
            'comment': bundle.inputData?.[`${keyPrefix}comment`],
        }
    },
}
