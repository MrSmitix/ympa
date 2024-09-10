const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}limitingOptionValueId`,
                label: `Идентификатор значения ограничивающей характеристики. - [${labelPrefix}limitingOptionValueId]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}optionValueIds`,
                label: `Идентификаторы допустимых значений ограничиваемой характеристики.  - [${labelPrefix}optionValueIds]`,
                required: true,
                list: true,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'limitingOptionValueId': bundle.inputData?.[`${keyPrefix}limitingOptionValueId`],
            'optionValueIds': bundle.inputData?.[`${keyPrefix}optionValueIds`],
        }
    },
}
