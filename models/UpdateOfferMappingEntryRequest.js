const utils = require('../utils/utils');
const UpdateOfferMappingEntryDTO = require('../models/UpdateOfferMappingEntryDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}offerMappingEntries`,
                label: `[${labelPrefix}offerMappingEntries]`,
                children: UpdateOfferMappingEntryDTO.fields(`${keyPrefix}offerMappingEntries${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'offerMappingEntries': utils.childMapping(bundle.inputData?.[`${keyPrefix}offerMappingEntries`], `${keyPrefix}offerMappingEntries`, UpdateOfferMappingEntryDTO),
        }
    },
}
