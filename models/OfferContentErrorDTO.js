const utils = require('../utils/utils');
const OfferContentErrorType = require('../models/OfferContentErrorType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                ...OfferContentErrorType.fields(`${keyPrefix}type`, isInput),
            },
            {
                key: `${keyPrefix}parameterId`,
                label: `Идентификатор характеристики, с которой связана ошибка. - [${labelPrefix}parameterId]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}message`,
                label: `Текст ошибки. - [${labelPrefix}message]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'parameterId': bundle.inputData?.[`${keyPrefix}parameterId`],
            'message': bundle.inputData?.[`${keyPrefix}message`],
        }
    },
}
