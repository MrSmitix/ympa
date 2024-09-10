const utils = require('../utils/utils');
const CampaignSettingsDTO = require('../models/CampaignSettingsDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...CampaignSettingsDTO.fields(`${keyPrefix}settings`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'settings': utils.removeIfEmpty(CampaignSettingsDTO.mapping(bundle, `${keyPrefix}settings`)),
        }
    },
}
