const utils = require('../utils/utils');
const GoodsStatsWarehouseDTO = require('../models/GoodsStatsWarehouseDTO');
const GoodsStatsWeightDimensionsDTO = require('../models/GoodsStatsWeightDimensionsDTO');
const TariffDTO = require('../models/TariffDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}shopSku`,
                label: `Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  - [${labelPrefix}shopSku]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}marketSku`,
                label: `SKU на Маркете. - [${labelPrefix}marketSku]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}name`,
                label: `Название товара. - [${labelPrefix}name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}price`,
                label: `Цена на товар в валюте, которая установлена [в кабинете продавца на Маркете](https://partner.market.yandex.ru/). - [${labelPrefix}price]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}categoryId`,
                label: `Идентификатор категории товара на Маркете. - [${labelPrefix}categoryId]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}categoryName`,
                label: `Название категории товара на Маркете. - [${labelPrefix}categoryName]`,
                type: 'string',
            },
            ...GoodsStatsWeightDimensionsDTO.fields(`${keyPrefix}weightDimensions`, isInput),
            {
                key: `${keyPrefix}warehouses`,
                label: `[${labelPrefix}warehouses]`,
                children: GoodsStatsWarehouseDTO.fields(`${keyPrefix}warehouses${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}tariffs`,
                label: `[${labelPrefix}tariffs]`,
                children: TariffDTO.fields(`${keyPrefix}tariffs${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}pictures`,
                label: `Ссылки (URL) изображений товара в хорошем качестве. - [${labelPrefix}pictures]`,
                list: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'shopSku': bundle.inputData?.[`${keyPrefix}shopSku`],
            'marketSku': bundle.inputData?.[`${keyPrefix}marketSku`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'price': bundle.inputData?.[`${keyPrefix}price`],
            'categoryId': bundle.inputData?.[`${keyPrefix}categoryId`],
            'categoryName': bundle.inputData?.[`${keyPrefix}categoryName`],
            'weightDimensions': utils.removeIfEmpty(GoodsStatsWeightDimensionsDTO.mapping(bundle, `${keyPrefix}weightDimensions`)),
            'warehouses': utils.childMapping(bundle.inputData?.[`${keyPrefix}warehouses`], `${keyPrefix}warehouses`, GoodsStatsWarehouseDTO),
            'tariffs': utils.childMapping(bundle.inputData?.[`${keyPrefix}tariffs`], `${keyPrefix}tariffs`, TariffDTO),
            'pictures': bundle.inputData?.[`${keyPrefix}pictures`],
        }
    },
}
