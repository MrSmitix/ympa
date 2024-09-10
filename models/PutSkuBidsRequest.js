const utils = require('../utils/utils');
const SkuBidItemDTO = require('../models/SkuBidItemDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}bids`,
                label: `[${labelPrefix}bids]`,
                children: SkuBidItemDTO.fields(`${keyPrefix}bids${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'bids': utils.childMapping(bundle.inputData?.[`${keyPrefix}bids`], `${keyPrefix}bids`, SkuBidItemDTO),
        }
    },
}
