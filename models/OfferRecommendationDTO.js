const utils = require('../utils/utils');
const OfferForRecommendationDTO = require('../models/OfferForRecommendationDTO');
const OfferRecommendationInfoDTO = require('../models/OfferRecommendationInfoDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...OfferForRecommendationDTO.fields(`${keyPrefix}offer`, isInput),
            ...OfferRecommendationInfoDTO.fields(`${keyPrefix}recommendation`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'offer': utils.removeIfEmpty(OfferForRecommendationDTO.mapping(bundle, `${keyPrefix}offer`)),
            'recommendation': utils.removeIfEmpty(OfferRecommendationInfoDTO.mapping(bundle, `${keyPrefix}recommendation`)),
        }
    },
}
