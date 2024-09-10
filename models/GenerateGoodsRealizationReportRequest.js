const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}campaignId`,
                label: `Идентификатор кампании. - [${labelPrefix}campaignId]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}year`,
                label: `Год. - [${labelPrefix}year]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}month`,
                label: `Номер месяца. - [${labelPrefix}month]`,
                required: true,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'campaignId': bundle.inputData?.[`${keyPrefix}campaignId`],
            'year': bundle.inputData?.[`${keyPrefix}year`],
            'month': bundle.inputData?.[`${keyPrefix}month`],
        }
    },
}
