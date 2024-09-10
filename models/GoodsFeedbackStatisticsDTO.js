const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}rating`,
                label: `Оценка товара. - [${labelPrefix}rating]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}commentsCount`,
                label: `Количество комментариев к отзыву.  Учитываются только ответы на отзывы, а не дочерние комментарии.  - [${labelPrefix}commentsCount]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}recommended`,
                label: `Рекомендуют ли этот товар. - [${labelPrefix}recommended]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}paidAmount`,
                label: `Количество баллов Плюса, которое автор получил за отзыв. - [${labelPrefix}paidAmount]`,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'rating': bundle.inputData?.[`${keyPrefix}rating`],
            'commentsCount': bundle.inputData?.[`${keyPrefix}commentsCount`],
            'recommended': bundle.inputData?.[`${keyPrefix}recommended`],
            'paidAmount': bundle.inputData?.[`${keyPrefix}paidAmount`],
        }
    },
}
