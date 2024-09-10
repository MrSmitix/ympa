const utils = require('../utils/utils');
const GetMappingDTO = require('../models/GetMappingDTO');
const GetOfferDTO = require('../models/GetOfferDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...GetOfferDTO.fields(`${keyPrefix}offer`, isInput),
            ...GetMappingDTO.fields(`${keyPrefix}mapping`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'offer': utils.removeIfEmpty(GetOfferDTO.mapping(bundle, `${keyPrefix}offer`)),
            'mapping': utils.removeIfEmpty(GetMappingDTO.mapping(bundle, `${keyPrefix}mapping`)),
        }
    },
}
