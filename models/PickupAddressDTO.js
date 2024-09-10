const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}country`,
                label: `Страна. - [${labelPrefix}country]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}city`,
                label: `Город. - [${labelPrefix}city]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}street`,
                label: `Улица. - [${labelPrefix}street]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}house`,
                label: `Номер дома. - [${labelPrefix}house]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}postcode`,
                label: `Почтовый индекс. - [${labelPrefix}postcode]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'country': bundle.inputData?.[`${keyPrefix}country`],
            'city': bundle.inputData?.[`${keyPrefix}city`],
            'street': bundle.inputData?.[`${keyPrefix}street`],
            'house': bundle.inputData?.[`${keyPrefix}house`],
            'postcode': bundle.inputData?.[`${keyPrefix}postcode`],
        }
    },
}
