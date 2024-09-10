const utils = require('../utils/utils');
const OfferRecommendationDTO = require('../models/OfferRecommendationDTO');
const ScrollingPagerDTO = require('../models/ScrollingPagerDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...ScrollingPagerDTO.fields(`${keyPrefix}paging`, isInput),
            {
                key: `${keyPrefix}offerRecommendations`,
                label: `[${labelPrefix}offerRecommendations]`,
                children: OfferRecommendationDTO.fields(`${keyPrefix}offerRecommendations${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'paging': utils.removeIfEmpty(ScrollingPagerDTO.mapping(bundle, `${keyPrefix}paging`)),
            'offerRecommendations': utils.childMapping(bundle.inputData?.[`${keyPrefix}offerRecommendations`], `${keyPrefix}offerRecommendations`, OfferRecommendationDTO),
        }
    },
}
