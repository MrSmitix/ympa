const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}maxPrice`,
                label: `Максимально возможная цена для участия в акции до применения промокода.  Указывается в рублях.  Возвращается для всех товаров.  - [${labelPrefix}maxPrice]`,
                required: true,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'maxPrice': bundle.inputData?.[`${keyPrefix}maxPrice`],
        }
    },
}
