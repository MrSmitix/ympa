const utils = require('../utils/utils');
const OfferPriceResponseDTO = require('../models/OfferPriceResponseDTO');
const ScrollingPagerDTO = require('../models/ScrollingPagerDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}offers`,
                label: `[${labelPrefix}offers]`,
                children: OfferPriceResponseDTO.fields(`${keyPrefix}offers${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...ScrollingPagerDTO.fields(`${keyPrefix}paging`, isInput),
            {
                key: `${keyPrefix}total`,
                label: `Количество всех цен магазина, измененных через API. - [${labelPrefix}total]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'offers': utils.childMapping(bundle.inputData?.[`${keyPrefix}offers`], `${keyPrefix}offers`, OfferPriceResponseDTO),
            'paging': utils.removeIfEmpty(ScrollingPagerDTO.mapping(bundle, `${keyPrefix}paging`)),
            'total': bundle.inputData?.[`${keyPrefix}total`],
        }
    },
}
