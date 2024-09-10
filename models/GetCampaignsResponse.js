const utils = require('../utils/utils');
const CampaignDTO = require('../models/CampaignDTO');
const FlippingPagerDTO = require('../models/FlippingPagerDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}campaigns`,
                label: `[${labelPrefix}campaigns]`,
                children: CampaignDTO.fields(`${keyPrefix}campaigns${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...FlippingPagerDTO.fields(`${keyPrefix}pager`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'campaigns': utils.childMapping(bundle.inputData?.[`${keyPrefix}campaigns`], `${keyPrefix}campaigns`, CampaignDTO),
            'pager': utils.removeIfEmpty(FlippingPagerDTO.mapping(bundle, `${keyPrefix}pager`)),
        }
    },
}
