const utils = require('../utils/utils');
const OrderStatsStatusType = require('../models/OrderStatsStatusType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}dateFrom`,
                label: `Начальная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`.  - [${labelPrefix}dateFrom]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}dateTo`,
                label: `Конечная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`.  - [${labelPrefix}dateTo]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}updateFrom`,
                label: `Начальная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`.  - [${labelPrefix}updateFrom]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}updateTo`,
                label: `Конечная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`.  - [${labelPrefix}updateTo]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}orders`,
                label: `Список идентификаторов заказов. - [${labelPrefix}orders]`,
                list: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}statuses`,
                list: true,
                type: 'string',
                ...OrderStatsStatusType.fields(`${keyPrefix}statuses`, isInput),
            },
            {
                key: `${keyPrefix}hasCis`,
                label: `Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * `true` — да. * `false` — нет. Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям.  - [${labelPrefix}hasCis]`,
                type: 'boolean',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'dateFrom': bundle.inputData?.[`${keyPrefix}dateFrom`],
            'dateTo': bundle.inputData?.[`${keyPrefix}dateTo`],
            'updateFrom': bundle.inputData?.[`${keyPrefix}updateFrom`],
            'updateTo': bundle.inputData?.[`${keyPrefix}updateTo`],
            'orders': bundle.inputData?.[`${keyPrefix}orders`],
            'statuses': utils.childMapping(bundle.inputData?.[`${keyPrefix}statuses`], `${keyPrefix}statuses`, OrderStatsStatusType),
            'hasCis': bundle.inputData?.[`${keyPrefix}hasCis`],
        }
    },
}
