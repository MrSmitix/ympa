const utils = require('../utils/utils');
const ApiResponseStatusType = require('../models/ApiResponseStatusType');
const CalculateTariffsResponseDTO = require('../models/CalculateTariffsResponseDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}status`,
                ...ApiResponseStatusType.fields(`${keyPrefix}status`, isInput),
            },
            ...CalculateTariffsResponseDTO.fields(`${keyPrefix}result`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'result': utils.removeIfEmpty(CalculateTariffsResponseDTO.mapping(bundle, `${keyPrefix}result`)),
        }
    },
}
