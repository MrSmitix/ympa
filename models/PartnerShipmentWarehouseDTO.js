const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `Идентификатор склада отправления. - [${labelPrefix}id]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}name`,
                label: `Наименование склада отправления. - [${labelPrefix}name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}address`,
                label: `Адрес склада отправления. - [${labelPrefix}address]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'address': bundle.inputData?.[`${keyPrefix}address`],
        }
    },
}
