const utils = require('../utils/utils');
const OrdersStatsCommissionType = require('../models/OrdersStatsCommissionType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                ...OrdersStatsCommissionType.fields(`${keyPrefix}type`, isInput),
            },
            {
                key: `${keyPrefix}actual`,
                label: `Сумма в рублях, которая была выставлена в момент создания заказа и которую нужно оплатить. Точность — два знака после запятой.  - [${labelPrefix}actual]`,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'actual': bundle.inputData?.[`${keyPrefix}actual`],
        }
    },
}
