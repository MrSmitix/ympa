const utils = require('../utils/utils');
const FlippingPagerDTO = require('../models/FlippingPagerDTO');
const OfferDTO = require('../models/OfferDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}offers`,
                label: `[${labelPrefix}offers]`,
                children: OfferDTO.fields(`${keyPrefix}offers${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...FlippingPagerDTO.fields(`${keyPrefix}pager`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'offers': utils.childMapping(bundle.inputData?.[`${keyPrefix}offers`], `${keyPrefix}offers`, OfferDTO),
            'pager': utils.removeIfEmpty(FlippingPagerDTO.mapping(bundle, `${keyPrefix}pager`)),
        }
    },
}
