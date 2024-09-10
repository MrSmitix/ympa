const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}dateTimeFrom`,
                label: `Дата и время начала акции. - [${labelPrefix}dateTimeFrom]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}dateTimeTo`,
                label: `Дата и время окончания акции. - [${labelPrefix}dateTimeTo]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'dateTimeFrom': bundle.inputData?.[`${keyPrefix}dateTimeFrom`],
            'dateTimeTo': bundle.inputData?.[`${keyPrefix}dateTimeTo`],
        }
    },
}
