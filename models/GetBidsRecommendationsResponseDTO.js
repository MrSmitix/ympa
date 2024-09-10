const utils = require('../utils/utils');
const SkuBidRecommendationItemDTO = require('../models/SkuBidRecommendationItemDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}recommendations`,
                label: `[${labelPrefix}recommendations]`,
                children: SkuBidRecommendationItemDTO.fields(`${keyPrefix}recommendations${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'recommendations': utils.childMapping(bundle.inputData?.[`${keyPrefix}recommendations`], `${keyPrefix}recommendations`, SkuBidRecommendationItemDTO),
        }
    },
}
