const utils = require('../utils/utils');
const FlippingPagerDTO = require('../models/FlippingPagerDTO');
const RegionDTO = require('../models/RegionDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...FlippingPagerDTO.fields(`${keyPrefix}pager`, isInput),
            ...RegionDTO.fields(`${keyPrefix}regions`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'pager': utils.removeIfEmpty(FlippingPagerDTO.mapping(bundle, `${keyPrefix}pager`)),
            'regions': utils.removeIfEmpty(RegionDTO.mapping(bundle, `${keyPrefix}regions`)),
        }
    },
}
