const utils = require('../utils/utils');
const HiddenOfferDTO = require('../models/HiddenOfferDTO');
const ScrollingPagerDTO = require('../models/ScrollingPagerDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...ScrollingPagerDTO.fields(`${keyPrefix}paging`, isInput),
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
            'paging': utils.removeIfEmpty(ScrollingPagerDTO.mapping(bundle, `${keyPrefix}paging`)),
            'hiddenOffers': utils.childMapping(bundle.inputData?.[`${keyPrefix}hiddenOffers`], `${keyPrefix}hiddenOffers`, HiddenOfferDTO),
        }
    },
}
