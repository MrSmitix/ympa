const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `Идентификатор значения. - [${labelPrefix}id]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}value`,
                label: `Значение. - [${labelPrefix}value]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}description`,
                label: `Описание значения. - [${labelPrefix}description]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'value': bundle.inputData?.[`${keyPrefix}value`],
            'description': bundle.inputData?.[`${keyPrefix}description`],
        }
    },
}
