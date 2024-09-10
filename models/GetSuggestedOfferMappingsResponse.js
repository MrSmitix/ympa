const utils = require('../utils/utils');
const ApiResponseStatusType = require('../models/ApiResponseStatusType');
const GetSuggestedOfferMappingsResultDTO = require('../models/GetSuggestedOfferMappingsResultDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}status`,
                ...ApiResponseStatusType.fields(`${keyPrefix}status`, isInput),
            },
            ...GetSuggestedOfferMappingsResultDTO.fields(`${keyPrefix}result`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'result': utils.removeIfEmpty(GetSuggestedOfferMappingsResultDTO.mapping(bundle, `${keyPrefix}result`)),
        }
    },
}
