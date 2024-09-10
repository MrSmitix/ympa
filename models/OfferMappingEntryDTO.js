const utils = require('../utils/utils');
const MappingsOfferDTO = require('../models/MappingsOfferDTO');
const OfferMappingDTO = require('../models/OfferMappingDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...OfferMappingDTO.fields(`${keyPrefix}mapping`, isInput),
            ...OfferMappingDTO.fields(`${keyPrefix}awaitingModerationMapping`, isInput),
            ...OfferMappingDTO.fields(`${keyPrefix}rejectedMapping`, isInput),
            ...MappingsOfferDTO.fields(`${keyPrefix}offer`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'mapping': utils.removeIfEmpty(OfferMappingDTO.mapping(bundle, `${keyPrefix}mapping`)),
            'awaitingModerationMapping': utils.removeIfEmpty(OfferMappingDTO.mapping(bundle, `${keyPrefix}awaitingModerationMapping`)),
            'rejectedMapping': utils.removeIfEmpty(OfferMappingDTO.mapping(bundle, `${keyPrefix}rejectedMapping`)),
            'offer': utils.removeIfEmpty(MappingsOfferDTO.mapping(bundle, `${keyPrefix}offer`)),
        }
    },
}
