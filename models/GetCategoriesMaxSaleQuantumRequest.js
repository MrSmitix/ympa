const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}marketCategoryIds`,
                label: `Идентификаторы листовых категории на Маркете — тех, у которых нет дочерних категорий. - [${labelPrefix}marketCategoryIds]`,
                required: true,
                list: true,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'marketCategoryIds': bundle.inputData?.[`${keyPrefix}marketCategoryIds`],
        }
    },
}
