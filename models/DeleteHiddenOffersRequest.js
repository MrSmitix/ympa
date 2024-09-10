const utils = require('../utils/utils');
const HiddenOfferDTO = require('../models/HiddenOfferDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}hiddenOffers`,
                label: `[${labelPrefix}hiddenOffers]`,
                children: HiddenOfferDTO.fields(`${keyPrefix}hiddenOffers${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'hiddenOffers': utils.childMapping(bundle.inputData?.[`${keyPrefix}hiddenOffers`], `${keyPrefix}hiddenOffers`, HiddenOfferDTO),
        }
    },
}
