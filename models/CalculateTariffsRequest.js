const utils = require('../utils/utils');
const CalculateTariffsOfferDTO = require('../models/CalculateTariffsOfferDTO');
const CalculateTariffsParametersDTO = require('../models/CalculateTariffsParametersDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...CalculateTariffsParametersDTO.fields(`${keyPrefix}parameters`, isInput),
            {
                key: `${keyPrefix}offers`,
                label: `[${labelPrefix}offers]`,
                children: CalculateTariffsOfferDTO.fields(`${keyPrefix}offers${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'parameters': utils.removeIfEmpty(CalculateTariffsParametersDTO.mapping(bundle, `${keyPrefix}parameters`)),
            'offers': utils.childMapping(bundle.inputData?.[`${keyPrefix}offers`], `${keyPrefix}offers`, CalculateTariffsOfferDTO),
        }
    },
}
