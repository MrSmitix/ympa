const utils = require('../utils/utils');
const OfferCardRecommendationType = require('../models/OfferCardRecommendationType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                ...OfferCardRecommendationType.fields(`${keyPrefix}type`, isInput),
            },
            {
                key: `${keyPrefix}percent`,
                label: `Процент выполнения рекомендации. Указывается для рекомендаций некоторых типов. - [${labelPrefix}percent]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'percent': bundle.inputData?.[`${keyPrefix}percent`],
        }
    },
}
