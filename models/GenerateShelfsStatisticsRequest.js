const utils = require('../utils/utils');
const ShelfsStatisticsAttributionType = require('../models/ShelfsStatisticsAttributionType');

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
                key: `${keyPrefix}attributionType`,
                ...ShelfsStatisticsAttributionType.fields(`${keyPrefix}attributionType`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'businessId': bundle.inputData?.[`${keyPrefix}businessId`],
            'dateFrom': bundle.inputData?.[`${keyPrefix}dateFrom`],
            'dateTo': bundle.inputData?.[`${keyPrefix}dateTo`],
            'attributionType': bundle.inputData?.[`${keyPrefix}attributionType`],
        }
    },
}
