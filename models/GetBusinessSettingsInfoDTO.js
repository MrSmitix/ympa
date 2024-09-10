const utils = require('../utils/utils');
const BusinessDTO = require('../models/BusinessDTO');
const BusinessSettingsDTO = require('../models/BusinessSettingsDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...BusinessDTO.fields(`${keyPrefix}info`, isInput),
            ...BusinessSettingsDTO.fields(`${keyPrefix}settings`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'info': utils.removeIfEmpty(BusinessDTO.mapping(bundle, `${keyPrefix}info`)),
            'settings': utils.removeIfEmpty(BusinessSettingsDTO.mapping(bundle, `${keyPrefix}settings`)),
        }
    },
}
