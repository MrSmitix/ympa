const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}messageIdFrom`,
                label: `Идентификатор сообщения, начиная с которого нужно получить все последующие сообщения. - [${labelPrefix}messageIdFrom]`,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'messageIdFrom': bundle.inputData?.[`${keyPrefix}messageIdFrom`],
        }
    },
}
