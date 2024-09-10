const utils = require('../utils/utils');
const FeedbackDeliveryType = require('../models/FeedbackDeliveryType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}shopOrderId`,
                label: `Номер заказа, указанный в отзыве. - [${labelPrefix}shopOrderId]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}delivery`,
                ...FeedbackDeliveryType.fields(`${keyPrefix}delivery`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'shopOrderId': bundle.inputData?.[`${keyPrefix}shopOrderId`],
            'delivery': bundle.inputData?.[`${keyPrefix}delivery`],
        }
    },
}
