const utils = require('../utils/utils');
const PromoOfferDiscountParamsDTO = require('../models/PromoOfferDiscountParamsDTO');
const PromoOfferPromocodeParamsDTO = require('../models/PromoOfferPromocodeParamsDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...PromoOfferDiscountParamsDTO.fields(`${keyPrefix}discountParams`, isInput),
            ...PromoOfferPromocodeParamsDTO.fields(`${keyPrefix}promocodeParams`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'discountParams': utils.removeIfEmpty(PromoOfferDiscountParamsDTO.mapping(bundle, `${keyPrefix}discountParams`)),
            'promocodeParams': utils.removeIfEmpty(PromoOfferPromocodeParamsDTO.mapping(bundle, `${keyPrefix}promocodeParams`)),
        }
    },
}
