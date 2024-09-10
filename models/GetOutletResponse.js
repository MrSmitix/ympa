const utils = require('../utils/utils');
const FullOutletDTO = require('../models/FullOutletDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...FullOutletDTO.fields(`${keyPrefix}outlet`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'outlet': utils.removeIfEmpty(FullOutletDTO.mapping(bundle, `${keyPrefix}outlet`)),
        }
    },
}
