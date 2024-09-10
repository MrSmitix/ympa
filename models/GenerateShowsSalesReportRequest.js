const utils = require('../utils/utils');
const ShowsSalesGroupingType = require('../models/ShowsSalesGroupingType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}businessId`,
                label: `Идентификатор бизнеса.  Указывается, если нужно составить отчет по всем магазинам бизнеса. В запросе обязательно должен быть либо `businessID`, либо `campaignId`, но не оба сразу.  - [${labelPrefix}businessId]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}campaignId`,
                label: `Идентификатор кампании.  Указывается, если нужно составить отчет по конкретному магазину. В запросе обязательно должен быть либо `businessID`, либо `campaignId`, но не оба сразу.  - [${labelPrefix}campaignId]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}dateFrom`,
                label: `Начало периода, включительно. - [${labelPrefix}dateFrom]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}dateTo`,
                label: `Конец периода, включительно. - [${labelPrefix}dateTo]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}grouping`,
                ...ShowsSalesGroupingType.fields(`${keyPrefix}grouping`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'businessId': bundle.inputData?.[`${keyPrefix}businessId`],
            'campaignId': bundle.inputData?.[`${keyPrefix}campaignId`],
            'dateFrom': bundle.inputData?.[`${keyPrefix}dateFrom`],
            'dateTo': bundle.inputData?.[`${keyPrefix}dateTo`],
            'grouping': bundle.inputData?.[`${keyPrefix}grouping`],
        }
    },
}
