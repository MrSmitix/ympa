const utils = require('../utils/utils');
const QualityRatingComponentType = require('../models/QualityRatingComponentType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}value`,
                label: `Значение составляющей в процентах. - [${labelPrefix}value]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}componentType`,
                ...QualityRatingComponentType.fields(`${keyPrefix}componentType`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'value': bundle.inputData?.[`${keyPrefix}value`],
            'componentType': bundle.inputData?.[`${keyPrefix}componentType`],
        }
    },
}
