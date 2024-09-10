const utils = require('../utils/utils');
const OfferMappingEntryDTO = require('../models/OfferMappingEntryDTO');
const ScrollingPagerDTO = require('../models/ScrollingPagerDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...ScrollingPagerDTO.fields(`${keyPrefix}paging`, isInput),
            {
                key: `${keyPrefix}offerMappingEntries`,
                label: `[${labelPrefix}offerMappingEntries]`,
                children: OfferMappingEntryDTO.fields(`${keyPrefix}offerMappingEntries${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'paging': utils.removeIfEmpty(ScrollingPagerDTO.mapping(bundle, `${keyPrefix}paging`)),
            'offerMappingEntries': utils.childMapping(bundle.inputData?.[`${keyPrefix}offerMappingEntries`], `${keyPrefix}offerMappingEntries`, OfferMappingEntryDTO),
        }
    },
}
