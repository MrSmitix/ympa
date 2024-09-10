const utils = require('../utils/utils');
const CampaignQualityRatingDTO = require('../models/CampaignQualityRatingDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}campaignRatings`,
                label: `[${labelPrefix}campaignRatings]`,
                children: CampaignQualityRatingDTO.fields(`${keyPrefix}campaignRatings${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'campaignRatings': utils.childMapping(bundle.inputData?.[`${keyPrefix}campaignRatings`], `${keyPrefix}campaignRatings`, CampaignQualityRatingDTO),
        }
    },
}
