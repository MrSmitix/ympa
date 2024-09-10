const utils = require('../utils/utils');
const OrdersStatsPriceType = require('../models/OrdersStatsPriceType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                ...OrdersStatsPriceType.fields(`${keyPrefix}type`, isInput),
            },
            {
                key: `${keyPrefix}costPerItem`,
                label: `Цена или скидка на единицу товара в заказе. Указана в рублях. Точность — два знака после запятой.  - [${labelPrefix}costPerItem]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}total`,
                label: `Суммарная цена или скидка на все единицы товара в заказе. Указана в рублях. Точность — два знака после запятой.  - [${labelPrefix}total]`,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'costPerItem': bundle.inputData?.[`${keyPrefix}costPerItem`],
            'total': bundle.inputData?.[`${keyPrefix}total`],
        }
    },
}
