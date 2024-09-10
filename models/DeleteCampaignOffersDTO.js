const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}notDeletedOfferIds`,
                label: `Список SKU. - [${labelPrefix}notDeletedOfferIds]`,
                list: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'notDeletedOfferIds': bundle.inputData?.[`${keyPrefix}notDeletedOfferIds`],
        }
    },
}
