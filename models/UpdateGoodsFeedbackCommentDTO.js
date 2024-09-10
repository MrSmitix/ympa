const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `Идентификатор комментария к отзыву.  - [${labelPrefix}id]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}parentId`,
                label: `Идентификатор комментария к отзыву.  - [${labelPrefix}parentId]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}text`,
                label: `Текст комментария. - [${labelPrefix}text]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'parentId': bundle.inputData?.[`${keyPrefix}parentId`],
            'text': bundle.inputData?.[`${keyPrefix}text`],
        }
    },
}
