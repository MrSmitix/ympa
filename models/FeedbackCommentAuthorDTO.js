const utils = require('../utils/utils');
const FeedbackCommentAuthorType = require('../models/FeedbackCommentAuthorType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                ...FeedbackCommentAuthorType.fields(`${keyPrefix}type`, isInput),
            },
            {
                key: `${keyPrefix}name`,
                label: `Имя автора отзыва или название магазина. - [${labelPrefix}name]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
        }
    },
}
