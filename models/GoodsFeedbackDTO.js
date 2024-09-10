const utils = require('../utils/utils');
const GoodsFeedbackDescriptionDTO = require('../models/GoodsFeedbackDescriptionDTO');
const GoodsFeedbackIdentifiersDTO = require('../models/GoodsFeedbackIdentifiersDTO');
const GoodsFeedbackMediaDTO = require('../models/GoodsFeedbackMediaDTO');
const GoodsFeedbackStatisticsDTO = require('../models/GoodsFeedbackStatisticsDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}feedbackId`,
                label: `Идентификатор отзыва.  - [${labelPrefix}feedbackId]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}createdAt`,
                label: `Дата и время создания отзыва. - [${labelPrefix}createdAt]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}needReaction`,
                label: `Нужен ли ответ на отзыв. - [${labelPrefix}needReaction]`,
                required: true,
                type: 'boolean',
            },
            ...GoodsFeedbackIdentifiersDTO.fields(`${keyPrefix}identifiers`, isInput),
            {
                key: `${keyPrefix}author`,
                label: `Имя автора отзыва. - [${labelPrefix}author]`,
                type: 'string',
            },
            ...GoodsFeedbackDescriptionDTO.fields(`${keyPrefix}description`, isInput),
            ...GoodsFeedbackMediaDTO.fields(`${keyPrefix}media`, isInput),
            ...GoodsFeedbackStatisticsDTO.fields(`${keyPrefix}statistics`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'feedbackId': bundle.inputData?.[`${keyPrefix}feedbackId`],
            'createdAt': bundle.inputData?.[`${keyPrefix}createdAt`],
            'needReaction': bundle.inputData?.[`${keyPrefix}needReaction`],
            'identifiers': utils.removeIfEmpty(GoodsFeedbackIdentifiersDTO.mapping(bundle, `${keyPrefix}identifiers`)),
            'author': bundle.inputData?.[`${keyPrefix}author`],
            'description': utils.removeIfEmpty(GoodsFeedbackDescriptionDTO.mapping(bundle, `${keyPrefix}description`)),
            'media': utils.removeIfEmpty(GoodsFeedbackMediaDTO.mapping(bundle, `${keyPrefix}media`)),
            'statistics': utils.removeIfEmpty(GoodsFeedbackStatisticsDTO.mapping(bundle, `${keyPrefix}statistics`)),
        }
    },
}
