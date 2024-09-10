const utils = require('../utils/utils');
const GetOfferMappingDTO = require('../models/GetOfferMappingDTO');
const ScrollingPagerDTO = require('../models/ScrollingPagerDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...ScrollingPagerDTO.fields(`${keyPrefix}paging`, isInput),
            {
                key: `${keyPrefix}offerMappings`,
                label: `[${labelPrefix}offerMappings]`,
                children: GetOfferMappingDTO.fields(`${keyPrefix}offerMappings${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'paging': utils.removeIfEmpty(ScrollingPagerDTO.mapping(bundle, `${keyPrefix}paging`)),
            'offerMappings': utils.childMapping(bundle.inputData?.[`${keyPrefix}offerMappings`], `${keyPrefix}offerMappings`, GetOfferMappingDTO),
        }
    },
}
