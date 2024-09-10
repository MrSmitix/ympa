const utils = require('../utils/utils');
const CurrencyType = require('../models/CurrencyType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}value`,
                label: `Значение. - [${labelPrefix}value]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}currencyId`,
                ...CurrencyType.fields(`${keyPrefix}currencyId`, isInput),
            },
            {
                key: `${keyPrefix}discountBase`,
                label: `Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар.  - [${labelPrefix}discountBase]`,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'value': bundle.inputData?.[`${keyPrefix}value`],
            'currencyId': bundle.inputData?.[`${keyPrefix}currencyId`],
            'discountBase': bundle.inputData?.[`${keyPrefix}discountBase`],
        }
    },
}
