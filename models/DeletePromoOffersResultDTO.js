const utils = require('../utils/utils');
const RejectedPromoOfferDeleteDTO = require('../models/RejectedPromoOfferDeleteDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}rejectedOffers`,
                label: `[${labelPrefix}rejectedOffers]`,
                children: RejectedPromoOfferDeleteDTO.fields(`${keyPrefix}rejectedOffers${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'rejectedOffers': utils.childMapping(bundle.inputData?.[`${keyPrefix}rejectedOffers`], `${keyPrefix}rejectedOffers`, RejectedPromoOfferDeleteDTO),
        }
    },
}
