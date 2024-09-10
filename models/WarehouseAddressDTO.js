const utils = require('../utils/utils');
const GpsDTO = require('../models/GpsDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}city`,
                label: `Город. - [${labelPrefix}city]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}street`,
                label: `Улица. - [${labelPrefix}street]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}number`,
                label: `Номер дома. - [${labelPrefix}number]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}building`,
                label: `Номер строения. - [${labelPrefix}building]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}block`,
                label: `Номер корпуса. - [${labelPrefix}block]`,
                type: 'string',
            },
            ...GpsDTO.fields(`${keyPrefix}gps`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'city': bundle.inputData?.[`${keyPrefix}city`],
            'street': bundle.inputData?.[`${keyPrefix}street`],
            'number': bundle.inputData?.[`${keyPrefix}number`],
            'building': bundle.inputData?.[`${keyPrefix}building`],
            'block': bundle.inputData?.[`${keyPrefix}block`],
            'gps': utils.removeIfEmpty(GpsDTO.mapping(bundle, `${keyPrefix}gps`)),
        }
    },
}
