const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}url`,
                label: `Ссылка на инструкцию. - [${labelPrefix}url]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}title`,
                label: `Название инструкции, которое будет отображаться на карточке товара.  - [${labelPrefix}title]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'url': bundle.inputData?.[`${keyPrefix}url`],
            'title': bundle.inputData?.[`${keyPrefix}title`],
        }
    },
}
