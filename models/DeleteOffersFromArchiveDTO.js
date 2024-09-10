const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}notUnarchivedOfferIds`,
                label: `Список товаров, которые не удалось восстановить из архива. - [${labelPrefix}notUnarchivedOfferIds]`,
                list: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'notUnarchivedOfferIds': bundle.inputData?.[`${keyPrefix}notUnarchivedOfferIds`],
        }
    },
}
