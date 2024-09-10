const utils = require('../utils/utils');
const OfferConditionQualityType = require('../models/OfferConditionQualityType');
const OfferConditionType = require('../models/OfferConditionType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                ...OfferConditionType.fields(`${keyPrefix}type`, isInput),
            },
            {
                key: `${keyPrefix}quality`,
                ...OfferConditionQualityType.fields(`${keyPrefix}quality`, isInput),
            },
            {
                key: `${keyPrefix}reason`,
                label: `Описание товара. Подробно опишите дефекты, насколько они заметны и где их искать.  - [${labelPrefix}reason]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'quality': bundle.inputData?.[`${keyPrefix}quality`],
            'reason': bundle.inputData?.[`${keyPrefix}reason`],
        }
    },
}
