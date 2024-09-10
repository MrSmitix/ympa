const utils = require('../utils/utils');
const RegionDTO = require('../models/RegionDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...RegionDTO.fields(`${keyPrefix}region`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'region': utils.removeIfEmpty(RegionDTO.mapping(bundle, `${keyPrefix}region`)),
        }
    },
}
