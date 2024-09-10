const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}price`,
                label: `Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Число должно быть целым.  - [${labelPrefix}price]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}promoPrice`,
                label: `Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Число должно быть целым.  - [${labelPrefix}promoPrice]`,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'price': bundle.inputData?.[`${keyPrefix}price`],
            'promoPrice': bundle.inputData?.[`${keyPrefix}promoPrice`],
        }
    },
}
