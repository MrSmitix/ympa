const utils = require('../utils/utils');
const RejectedPromoOfferUpdateDTO = require('../models/RejectedPromoOfferUpdateDTO');
const WarningPromoOfferUpdateDTO = require('../models/WarningPromoOfferUpdateDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}rejectedOffers`,
                label: `[${labelPrefix}rejectedOffers]`,
                children: RejectedPromoOfferUpdateDTO.fields(`${keyPrefix}rejectedOffers${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}warningOffers`,
                label: `[${labelPrefix}warningOffers]`,
                children: WarningPromoOfferUpdateDTO.fields(`${keyPrefix}warningOffers${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'rejectedOffers': utils.childMapping(bundle.inputData?.[`${keyPrefix}rejectedOffers`], `${keyPrefix}rejectedOffers`, RejectedPromoOfferUpdateDTO),
            'warningOffers': utils.childMapping(bundle.inputData?.[`${keyPrefix}warningOffers`], `${keyPrefix}warningOffers`, WarningPromoOfferUpdateDTO),
        }
    },
}
