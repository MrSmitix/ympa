const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `Идентификатор грузоместа. - [${labelPrefix}id]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}fulfilmentId`,
                label: `Идентификатор грузового места в информационной системе магазина. - [${labelPrefix}fulfilmentId]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'fulfilmentId': bundle.inputData?.[`${keyPrefix}fulfilmentId`],
        }
    },
}
