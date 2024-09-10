const utils = require('../utils/utils');
const CalculateTariffsOfferDTO = require('../models/CalculateTariffsOfferDTO');
const CalculatedTariffDTO = require('../models/CalculatedTariffDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...CalculateTariffsOfferDTO.fields(`${keyPrefix}offer`, isInput),
            {
                key: `${keyPrefix}tariffs`,
                label: `[${labelPrefix}tariffs]`,
                children: CalculatedTariffDTO.fields(`${keyPrefix}tariffs${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'offer': utils.removeIfEmpty(CalculateTariffsOfferDTO.mapping(bundle, `${keyPrefix}offer`)),
            'tariffs': utils.childMapping(bundle.inputData?.[`${keyPrefix}tariffs`], `${keyPrefix}tariffs`, CalculatedTariffDTO),
        }
    },
}
