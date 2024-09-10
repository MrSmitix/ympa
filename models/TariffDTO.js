const utils = require('../utils/utils');
const TariffParameterDTO = require('../models/TariffParameterDTO');
const TariffType = require('../models/TariffType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                ...TariffType.fields(`${keyPrefix}type`, isInput),
            },
            {
                key: `${keyPrefix}percent`,
                label: `{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах.  - [${labelPrefix}percent]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}amount`,
                label: `Значение тарифа в рублях. - [${labelPrefix}amount]`,
                required: true,
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
            'percent': bundle.inputData?.[`${keyPrefix}percent`],
            'amount': bundle.inputData?.[`${keyPrefix}amount`],
            'parameters': utils.childMapping(bundle.inputData?.[`${keyPrefix}parameters`], `${keyPrefix}parameters`, TariffParameterDTO),
        }
    },
}
