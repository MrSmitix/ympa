const utils = require('../utils/utils');
const CalculateTariffsOfferInfoDTO = require('../models/CalculateTariffsOfferInfoDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}offers`,
                label: `[${labelPrefix}offers]`,
                children: CalculateTariffsOfferInfoDTO.fields(`${keyPrefix}offers${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'offers': utils.childMapping(bundle.inputData?.[`${keyPrefix}offers`], `${keyPrefix}offers`, CalculateTariffsOfferInfoDTO),
        }
    },
}
