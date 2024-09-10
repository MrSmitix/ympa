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
                key: `${keyPrefix}shipmentId`,
                label: `Идентификатор отгрузки. - [${labelPrefix}shipmentId]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}orderIds`,
                label: `Фильтр по идентификаторам заказа в отгрузке. - [${labelPrefix}orderIds]`,
                list: true,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'campaignId': bundle.inputData?.[`${keyPrefix}campaignId`],
            'shipmentId': bundle.inputData?.[`${keyPrefix}shipmentId`],
            'orderIds': bundle.inputData?.[`${keyPrefix}orderIds`],
        }
    },
}
