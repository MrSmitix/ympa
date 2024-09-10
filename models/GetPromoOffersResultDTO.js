const utils = require('../utils/utils');
const ForwardScrollingPagerDTO = require('../models/ForwardScrollingPagerDTO');
const GetPromoOfferDTO = require('../models/GetPromoOfferDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}offers`,
                label: `[${labelPrefix}offers]`,
                children: GetPromoOfferDTO.fields(`${keyPrefix}offers${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...ForwardScrollingPagerDTO.fields(`${keyPrefix}paging`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'offers': utils.childMapping(bundle.inputData?.[`${keyPrefix}offers`], `${keyPrefix}offers`, GetPromoOfferDTO),
            'paging': utils.removeIfEmpty(ForwardScrollingPagerDTO.mapping(bundle, `${keyPrefix}paging`)),
        }
    },
}
