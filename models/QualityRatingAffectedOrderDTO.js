const utils = require('../utils/utils');
const AffectedOrderQualityRatingComponentType = require('../models/AffectedOrderQualityRatingComponentType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}orderId`,
                label: `Идентификатор заказа. - [${labelPrefix}orderId]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}description`,
                label: `Описание проблемы. - [${labelPrefix}description]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}componentType`,
                ...AffectedOrderQualityRatingComponentType.fields(`${keyPrefix}componentType`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'orderId': bundle.inputData?.[`${keyPrefix}orderId`],
            'description': bundle.inputData?.[`${keyPrefix}description`],
            'componentType': bundle.inputData?.[`${keyPrefix}componentType`],
        }
    },
}
