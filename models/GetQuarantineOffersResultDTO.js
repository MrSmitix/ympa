const utils = require('../utils/utils');
const QuarantineOfferDTO = require('../models/QuarantineOfferDTO');
const ScrollingPagerDTO = require('../models/ScrollingPagerDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...ScrollingPagerDTO.fields(`${keyPrefix}paging`, isInput),
            {
                key: `${keyPrefix}offers`,
                label: `[${labelPrefix}offers]`,
                children: QuarantineOfferDTO.fields(`${keyPrefix}offers${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'paging': utils.removeIfEmpty(ScrollingPagerDTO.mapping(bundle, `${keyPrefix}paging`)),
            'offers': utils.childMapping(bundle.inputData?.[`${keyPrefix}offers`], `${keyPrefix}offers`, QuarantineOfferDTO),
        }
    },
}
