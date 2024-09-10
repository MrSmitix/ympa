const utils = require('../utils/utils');
const OptionValuesLimitedDTO = require('../models/OptionValuesLimitedDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}limitingParameterId`,
                label: `Идентификатор ограничивающей характеристики. - [${labelPrefix}limitingParameterId]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}limitedValues`,
                label: `[${labelPrefix}limitedValues]`,
                children: OptionValuesLimitedDTO.fields(`${keyPrefix}limitedValues${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'limitingParameterId': bundle.inputData?.[`${keyPrefix}limitingParameterId`],
            'limitedValues': utils.childMapping(bundle.inputData?.[`${keyPrefix}limitedValues`], `${keyPrefix}limitedValues`, OptionValuesLimitedDTO),
        }
    },
}
