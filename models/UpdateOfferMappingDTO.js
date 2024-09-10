const utils = require('../utils/utils');
const UpdateMappingDTO = require('../models/UpdateMappingDTO');
const UpdateOfferDTO = require('../models/UpdateOfferDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...UpdateOfferDTO.fields(`${keyPrefix}offer`, isInput),
            ...UpdateMappingDTO.fields(`${keyPrefix}mapping`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'offer': utils.removeIfEmpty(UpdateOfferDTO.mapping(bundle, `${keyPrefix}offer`)),
            'mapping': utils.removeIfEmpty(UpdateMappingDTO.mapping(bundle, `${keyPrefix}mapping`)),
        }
    },
}
