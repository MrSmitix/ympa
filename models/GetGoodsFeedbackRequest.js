const utils = require('../utils/utils');
const FeedbackReactionStatusType = require('../models/FeedbackReactionStatusType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}dateTimeFrom`,
                label: `Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в `dateTimeTo` даты.  - [${labelPrefix}dateTimeFrom]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}dateTimeTo`,
                label: `Конец периода. Не включительно.  Если параметр не указан, используется текущая дата.  - [${labelPrefix}dateTimeTo]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}reactionStatus`,
                ...FeedbackReactionStatusType.fields(`${keyPrefix}reactionStatus`, isInput),
            },
            {
                key: `${keyPrefix}ratingValues`,
                label: `Оценка товара. - [${labelPrefix}ratingValues]`,
                list: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}modelIds`,
                label: `Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md).  - [${labelPrefix}modelIds]`,
                list: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}paid`,
                label: `Фильтр отзывов за баллы Плюса. - [${labelPrefix}paid]`,
                type: 'boolean',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'dateTimeFrom': bundle.inputData?.[`${keyPrefix}dateTimeFrom`],
            'dateTimeTo': bundle.inputData?.[`${keyPrefix}dateTimeTo`],
            'reactionStatus': bundle.inputData?.[`${keyPrefix}reactionStatus`],
            'ratingValues': bundle.inputData?.[`${keyPrefix}ratingValues`],
            'modelIds': bundle.inputData?.[`${keyPrefix}modelIds`],
            'paid': bundle.inputData?.[`${keyPrefix}paid`],
        }
    },
}
