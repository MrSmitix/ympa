const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}businessId`,
                label: `Идентификатор кабинета. - [${labelPrefix}businessId]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}orderIds`,
                label: `Список идентификаторов заказов. - [${labelPrefix}orderIds]`,
                required: true,
                list: true,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'businessId': bundle.inputData?.[`${keyPrefix}businessId`],
            'orderIds': bundle.inputData?.[`${keyPrefix}orderIds`],
        }
    },
}
