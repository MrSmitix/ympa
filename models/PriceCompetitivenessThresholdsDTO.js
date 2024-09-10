const utils = require('../utils/utils');
const BasePriceDTO = require('../models/BasePriceDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...BasePriceDTO.fields(`${keyPrefix}optimalPrice`, isInput),
            ...BasePriceDTO.fields(`${keyPrefix}averagePrice`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'optimalPrice': utils.removeIfEmpty(BasePriceDTO.mapping(bundle, `${keyPrefix}optimalPrice`)),
            'averagePrice': utils.removeIfEmpty(BasePriceDTO.mapping(bundle, `${keyPrefix}averagePrice`)),
        }
    },
}
