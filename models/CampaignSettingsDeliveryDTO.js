const utils = require('../utils/utils');
const CampaignSettingsScheduleDTO = require('../models/CampaignSettingsScheduleDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...CampaignSettingsScheduleDTO.fields(`${keyPrefix}schedule`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'schedule': utils.removeIfEmpty(CampaignSettingsScheduleDTO.mapping(bundle, `${keyPrefix}schedule`)),
        }
    },
}
