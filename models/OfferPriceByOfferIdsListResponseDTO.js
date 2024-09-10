const utils = require('../utils/utils');
const OfferPriceByOfferIdsResponseDTO = require('../models/OfferPriceByOfferIdsResponseDTO');
const ScrollingPagerDTO = require('../models/ScrollingPagerDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}offers`,
                label: `[${labelPrefix}offers]`,
                children: OfferPriceByOfferIdsResponseDTO.fields(`${keyPrefix}offers${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...ScrollingPagerDTO.fields(`${keyPrefix}paging`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'offers': utils.childMapping(bundle.inputData?.[`${keyPrefix}offers`], `${keyPrefix}offers`, OfferPriceByOfferIdsResponseDTO),
            'paging': utils.removeIfEmpty(ScrollingPagerDTO.mapping(bundle, `${keyPrefix}paging`)),
        }
    },
}
