const utils = require('../utils/utils');
const FeedbackAuthorDTO = require('../models/FeedbackAuthorDTO');
const FeedbackCommentDTO = require('../models/FeedbackCommentDTO');
const FeedbackGradesDTO = require('../models/FeedbackGradesDTO');
const FeedbackOrderDTO = require('../models/FeedbackOrderDTO');
const FeedbackShopDTO = require('../models/FeedbackShopDTO');
const FeedbackStateType = require('../models/FeedbackStateType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `Идентификатор отзыва. - [${labelPrefix}id]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}createdAt`,
                label: `Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`.  - [${labelPrefix}createdAt]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}text`,
                label: `Комментарий автора отзыва. - [${labelPrefix}text]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}state`,
                ...FeedbackStateType.fields(`${keyPrefix}state`, isInput),
            },
            ...FeedbackAuthorDTO.fields(`${keyPrefix}author`, isInput),
            {
                key: `${keyPrefix}pro`,
                label: `Достоинства магазина, описанные в отзыве. - [${labelPrefix}pro]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}contra`,
                label: `Недостатки магазина, описанные в отзыве. - [${labelPrefix}contra]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}comments`,
                label: `[${labelPrefix}comments]`,
                children: FeedbackCommentDTO.fields(`${keyPrefix}comments${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...FeedbackShopDTO.fields(`${keyPrefix}shop`, isInput),
            {
                key: `${keyPrefix}resolved`,
                label: `Решена ли проблема автора отзыва:  * `true` — да. * `false` — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись.  - [${labelPrefix}resolved]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}verified`,
                label: `{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * `true` — да. * `false` — нет.  - [${labelPrefix}verified]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}recommend`,
                label: `Купил бы автор отзыва в магазине снова:  * `true` — да. * `false` — нет.  - [${labelPrefix}recommend]`,
                type: 'boolean',
            },
            ...FeedbackGradesDTO.fields(`${keyPrefix}grades`, isInput),
            ...FeedbackOrderDTO.fields(`${keyPrefix}order`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'createdAt': bundle.inputData?.[`${keyPrefix}createdAt`],
            'text': bundle.inputData?.[`${keyPrefix}text`],
            'state': bundle.inputData?.[`${keyPrefix}state`],
            'author': utils.removeIfEmpty(FeedbackAuthorDTO.mapping(bundle, `${keyPrefix}author`)),
            'pro': bundle.inputData?.[`${keyPrefix}pro`],
            'contra': bundle.inputData?.[`${keyPrefix}contra`],
            'comments': utils.childMapping(bundle.inputData?.[`${keyPrefix}comments`], `${keyPrefix}comments`, FeedbackCommentDTO),
            'shop': utils.removeIfEmpty(FeedbackShopDTO.mapping(bundle, `${keyPrefix}shop`)),
            'resolved': bundle.inputData?.[`${keyPrefix}resolved`],
            'verified': bundle.inputData?.[`${keyPrefix}verified`],
            'recommend': bundle.inputData?.[`${keyPrefix}recommend`],
            'grades': utils.removeIfEmpty(FeedbackGradesDTO.mapping(bundle, `${keyPrefix}grades`)),
            'order': utils.removeIfEmpty(FeedbackOrderDTO.mapping(bundle, `${keyPrefix}order`)),
        }
    },
}
