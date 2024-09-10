const utils = require('../utils/utils');
const GetMappingDTO = require('../models/GetMappingDTO');
const SuggestedOfferDTO = require('../models/SuggestedOfferDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...SuggestedOfferDTO.fields(`${keyPrefix}offer`, isInput),
            ...GetMappingDTO.fields(`${keyPrefix}mapping`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'offer': utils.removeIfEmpty(SuggestedOfferDTO.mapping(bundle, `${keyPrefix}offer`)),
            'mapping': utils.removeIfEmpty(GetMappingDTO.mapping(bundle, `${keyPrefix}mapping`)),
        }
    },
}
