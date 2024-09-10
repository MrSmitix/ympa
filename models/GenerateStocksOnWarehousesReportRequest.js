const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}campaignId`,
                label: `Идентификатор магазина. - [${labelPrefix}campaignId]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}warehouseIds`,
                label: `Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md). - [${labelPrefix}warehouseIds]`,
                list: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}reportDate`,
                label: `Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день. - [${labelPrefix}reportDate]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}categoryIds`,
                label: `Фильтр по категориям на Маркете (кроме модели FBY). - [${labelPrefix}categoryIds]`,
                list: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}hasStocks`,
                label: `Фильтр по наличию остатков (кроме модели FBY). - [${labelPrefix}hasStocks]`,
                type: 'boolean',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'campaignId': bundle.inputData?.[`${keyPrefix}campaignId`],
            'warehouseIds': bundle.inputData?.[`${keyPrefix}warehouseIds`],
            'reportDate': bundle.inputData?.[`${keyPrefix}reportDate`],
            'categoryIds': bundle.inputData?.[`${keyPrefix}categoryIds`],
            'hasStocks': bundle.inputData?.[`${keyPrefix}hasStocks`],
        }
    },
}
