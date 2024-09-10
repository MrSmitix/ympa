const utils = require('../utils/utils');
const GoodsFeedbackCommentAuthorDTO = require('../models/GoodsFeedbackCommentAuthorDTO');
const GoodsFeedbackCommentStatusType = require('../models/GoodsFeedbackCommentStatusType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `Идентификатор комментария к отзыву.  - [${labelPrefix}id]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}text`,
                label: `Текст комментария. - [${labelPrefix}text]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}canModify`,
                label: `Может ли продавец изменять комментарий или удалять его. - [${labelPrefix}canModify]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}parentId`,
                label: `Идентификатор комментария к отзыву.  - [${labelPrefix}parentId]`,
                type: 'number',
            },
            ...GoodsFeedbackCommentAuthorDTO.fields(`${keyPrefix}author`, isInput),
            {
                key: `${keyPrefix}status`,
                ...GoodsFeedbackCommentStatusType.fields(`${keyPrefix}status`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'text': bundle.inputData?.[`${keyPrefix}text`],
            'canModify': bundle.inputData?.[`${keyPrefix}canModify`],
            'parentId': bundle.inputData?.[`${keyPrefix}parentId`],
            'author': utils.removeIfEmpty(GoodsFeedbackCommentAuthorDTO.mapping(bundle, `${keyPrefix}author`)),
            'status': bundle.inputData?.[`${keyPrefix}status`],
        }
    },
}
