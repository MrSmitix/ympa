const utils = require('../utils/utils');
const CalculatedTariffType = require('../models/CalculatedTariffType');
const TariffParameterDTO = require('../models/TariffParameterDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                ...CalculatedTariffType.fields(`${keyPrefix}type`, isInput),
            },
            {
                key: `${keyPrefix}amount`,
                label: `Стоимость услуги в рублях. - [${labelPrefix}amount]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}parameters`,
                label: `[${labelPrefix}parameters]`,
                children: TariffParameterDTO.fields(`${keyPrefix}parameters${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'amount': bundle.inputData?.[`${keyPrefix}amount`],
            'parameters': utils.childMapping(bundle.inputData?.[`${keyPrefix}parameters`], `${keyPrefix}parameters`, TariffParameterDTO),
        }
    },
}
