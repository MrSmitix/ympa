const utils = require('../utils/utils');
const OrdersStatsItemStatusType = require('../models/OrdersStatsItemStatusType');
const OrdersStatsStockType = require('../models/OrdersStatsStockType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}itemStatus`,
                ...OrdersStatsItemStatusType.fields(`${keyPrefix}itemStatus`, isInput),
            },
            {
                key: `${keyPrefix}itemCount`,
                label: `Количество товара со статусом, указанном в параметре `itemStatus`. - [${labelPrefix}itemCount]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}updateDate`,
                label: `Дата, когда товар получил статус, указанный в параметре `itemStatus`.  Формат даты: `ГГГГ-ММ-ДД`.  - [${labelPrefix}updateDate]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}stockType`,
                ...OrdersStatsStockType.fields(`${keyPrefix}stockType`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'itemStatus': bundle.inputData?.[`${keyPrefix}itemStatus`],
            'itemCount': bundle.inputData?.[`${keyPrefix}itemCount`],
            'updateDate': bundle.inputData?.[`${keyPrefix}updateDate`],
            'stockType': bundle.inputData?.[`${keyPrefix}stockType`],
        }
    },
}
