const utils = require('../utils/utils');
const CampaignDTO = require('../models/CampaignDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...CampaignDTO.fields(`${keyPrefix}campaign`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'campaign': utils.removeIfEmpty(CampaignDTO.mapping(bundle, `${keyPrefix}campaign`)),
        }
    },
}
