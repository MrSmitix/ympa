const utils = require('../utils/utils');
const PlacementType = require('../models/PlacementType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}businessId`,
                label: `Идентификатор бизнеса. - [${labelPrefix}businessId]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}dateTimeFrom`,
                label: `{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно.  - [${labelPrefix}dateTimeFrom]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}dateTimeTo`,
                label: `{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год.  - [${labelPrefix}dateTimeTo]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}dateFrom`,
                label: `Начало периода, включительно. - [${labelPrefix}dateFrom]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}dateTo`,
                label: `Конец периода, включительно. Максимальный период — 1 год. - [${labelPrefix}dateTo]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}yearFrom`,
                label: `Начальный год формирования акта. - [${labelPrefix}yearFrom]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}monthFrom`,
                label: `Начальный номер месяца формирования акта. - [${labelPrefix}monthFrom]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}yearTo`,
                label: `Конечный год формирования акта. - [${labelPrefix}yearTo]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}monthTo`,
                label: `Конечный номер месяца формирования акта. - [${labelPrefix}monthTo]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}placementPrograms`,
                list: true,
                type: 'string',
                ...PlacementType.fields(`${keyPrefix}placementPrograms`, isInput),
            },
            {
                key: `${keyPrefix}inns`,
                label: `Список ИНН, которые нужны в отчете. - [${labelPrefix}inns]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}campaignIds`,
                label: `Список магазинов, которые нужны в отчете. - [${labelPrefix}campaignIds]`,
                list: true,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'businessId': bundle.inputData?.[`${keyPrefix}businessId`],
            'dateTimeFrom': bundle.inputData?.[`${keyPrefix}dateTimeFrom`],
            'dateTimeTo': bundle.inputData?.[`${keyPrefix}dateTimeTo`],
            'dateFrom': bundle.inputData?.[`${keyPrefix}dateFrom`],
            'dateTo': bundle.inputData?.[`${keyPrefix}dateTo`],
            'yearFrom': bundle.inputData?.[`${keyPrefix}yearFrom`],
            'monthFrom': bundle.inputData?.[`${keyPrefix}monthFrom`],
            'yearTo': bundle.inputData?.[`${keyPrefix}yearTo`],
            'monthTo': bundle.inputData?.[`${keyPrefix}monthTo`],
            'placementPrograms': utils.childMapping(bundle.inputData?.[`${keyPrefix}placementPrograms`], `${keyPrefix}placementPrograms`, PlacementType),
            'inns': bundle.inputData?.[`${keyPrefix}inns`],
            'campaignIds': bundle.inputData?.[`${keyPrefix}campaignIds`],
        }
    },
}
