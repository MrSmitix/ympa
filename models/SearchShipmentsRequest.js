const utils = require('../utils/utils');
const ShipmentStatusType = require('../models/ShipmentStatusType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}dateFrom`,
                label: `Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`.  - [${labelPrefix}dateFrom]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}dateTo`,
                label: `Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`.  - [${labelPrefix}dateTo]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}statuses`,
                list: true,
                type: 'string',
                ...ShipmentStatusType.fields(`${keyPrefix}statuses`, isInput),
            },
            {
                key: `${keyPrefix}orderIds`,
                label: `Список идентификаторов заказов из отгрузок. - [${labelPrefix}orderIds]`,
                list: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}cancelledOrders`,
                label: `Возвращать ли отмененные заказы.  Значение по умолчанию — `true`. Если возвращать отмененные заказы не нужно, передайте значение `false`.  - [${labelPrefix}cancelledOrders]`,
                type: 'boolean',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'dateFrom': bundle.inputData?.[`${keyPrefix}dateFrom`],
            'dateTo': bundle.inputData?.[`${keyPrefix}dateTo`],
            'statuses': utils.childMapping(bundle.inputData?.[`${keyPrefix}statuses`], `${keyPrefix}statuses`, ShipmentStatusType),
            'orderIds': bundle.inputData?.[`${keyPrefix}orderIds`],
            'cancelledOrders': bundle.inputData?.[`${keyPrefix}cancelledOrders`],
        }
    },
}
