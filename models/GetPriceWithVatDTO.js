const utils = require('../utils/utils');
const CurrencyType = require('../models/CurrencyType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}value`,
                label: `Цена на товар. - [${labelPrefix}value]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}discountBase`,
                label: `Цена на товар без скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар.  - [${labelPrefix}discountBase]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}currencyId`,
                ...CurrencyType.fields(`${keyPrefix}currencyId`, isInput),
            },
            {
                key: `${keyPrefix}vat`,
                label: `Идентификатор ставки НДС, применяемой для товара:  * `2` — 10%. * `5` — 0%. * `6` — не облагается НДС. * `7` — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете.  - [${labelPrefix}vat]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}updatedAt`,
                label: `Время последнего обновления. - [${labelPrefix}updatedAt]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'value': bundle.inputData?.[`${keyPrefix}value`],
            'discountBase': bundle.inputData?.[`${keyPrefix}discountBase`],
            'currencyId': bundle.inputData?.[`${keyPrefix}currencyId`],
            'vat': bundle.inputData?.[`${keyPrefix}vat`],
            'updatedAt': bundle.inputData?.[`${keyPrefix}updatedAt`],
        }
    },
}
