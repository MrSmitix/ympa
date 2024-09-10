const utils = require('../utils/utils');
const ApiResponseStatusType = require('../models/ApiResponseStatusType');
const SearchShipmentsResponseDTO = require('../models/SearchShipmentsResponseDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}status`,
                ...ApiResponseStatusType.fields(`${keyPrefix}status`, isInput),
            },
            ...SearchShipmentsResponseDTO.fields(`${keyPrefix}result`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'result': utils.removeIfEmpty(SearchShipmentsResponseDTO.mapping(bundle, `${keyPrefix}result`)),
        }
    },
}
