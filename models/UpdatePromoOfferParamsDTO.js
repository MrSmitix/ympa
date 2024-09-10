const utils = require('../utils/utils');
const UpdatePromoOfferDiscountParamsDTO = require('../models/UpdatePromoOfferDiscountParamsDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...UpdatePromoOfferDiscountParamsDTO.fields(`${keyPrefix}discountParams`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'discountParams': utils.removeIfEmpty(UpdatePromoOfferDiscountParamsDTO.mapping(bundle, `${keyPrefix}discountParams`)),
        }
    },
}
