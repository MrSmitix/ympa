const utils = require('../utils/utils');
const FeedbackCommentAuthorDTO = require('../models/FeedbackCommentAuthorDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `Идентификатор ответа. - [${labelPrefix}id]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}parentId`,
                label: `Идентификатор родительского ответа. - [${labelPrefix}parentId]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}body`,
                label: `Текст ответа. - [${labelPrefix}body]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}createdAt`,
                label: `Дата и время создания ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`.  - [${labelPrefix}createdAt]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}updatedAt`,
                label: `Дата и время изменения ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`.  - [${labelPrefix}updatedAt]`,
                type: 'string',
            },
            ...FeedbackCommentAuthorDTO.fields(`${keyPrefix}author`, isInput),
            {
                key: `${keyPrefix}children`,
                label: `[${labelPrefix}children]`,
                children: FeedbackCommentDTO.fields(`${keyPrefix}children${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'parentId': bundle.inputData?.[`${keyPrefix}parentId`],
            'body': bundle.inputData?.[`${keyPrefix}body`],
            'createdAt': bundle.inputData?.[`${keyPrefix}createdAt`],
            'updatedAt': bundle.inputData?.[`${keyPrefix}updatedAt`],
            'author': utils.removeIfEmpty(FeedbackCommentAuthorDTO.mapping(bundle, `${keyPrefix}author`)),
            'children': utils.childMapping(bundle.inputData?.[`${keyPrefix}children`], `${keyPrefix}children`, FeedbackCommentDTO),
        }
    },
}
