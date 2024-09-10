const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}businessId`,
                label: `Идентификатор бизнеса.  В большинстве случаев обязателен. Не указывается, если задан `campaignId`.  - [${labelPrefix}businessId]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}campaignId`,
                label: `Идентификатор кампании.  Как правило, не используется. Передавайте только если в кабинете есть магазины с уникальными ценами и вы хотите получить отчет для них. В этом случае передавать `businessId` не нужно.  - [${labelPrefix}campaignId]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}categoryIds`,
                label: `Фильтр по категориям на Маркете. - [${labelPrefix}categoryIds]`,
                list: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}creationDateFrom`,
                label: `Фильтр по времени появления предложения — начало периода.  Формат даты: `ДД-ММ-ГГГГ`.  - [${labelPrefix}creationDateFrom]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}creationDateTo`,
                label: `Фильтр по времени появления предложения — окончание периода.  Формат даты: `ДД-ММ-ГГГГ`.  - [${labelPrefix}creationDateTo]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'businessId': bundle.inputData?.[`${keyPrefix}businessId`],
            'campaignId': bundle.inputData?.[`${keyPrefix}campaignId`],
            'categoryIds': bundle.inputData?.[`${keyPrefix}categoryIds`],
            'creationDateFrom': bundle.inputData?.[`${keyPrefix}creationDateFrom`],
            'creationDateTo': bundle.inputData?.[`${keyPrefix}creationDateTo`],
        }
    },
}
