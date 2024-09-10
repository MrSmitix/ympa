const utils = require('../utils/utils');
const OrdersStatsDetailsDTO = require('../models/OrdersStatsDetailsDTO');
const OrdersStatsPriceDTO = require('../models/OrdersStatsPriceDTO');
const OrdersStatsWarehouseDTO = require('../models/OrdersStatsWarehouseDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}offerName`,
                label: `Название товара. - [${labelPrefix}offerName]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}marketSku`,
                label: `SKU на Маркете. - [${labelPrefix}marketSku]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}shopSku`,
                label: `Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  - [${labelPrefix}shopSku]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}count`,
                label: `Количество единиц товара с учетом удаленных единиц.  Если из заказа удалены все единицы товара, он попадет только в список `initialItems`.  - [${labelPrefix}count]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}prices`,
                label: `[${labelPrefix}prices]`,
                children: OrdersStatsPriceDTO.fields(`${keyPrefix}prices${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...OrdersStatsWarehouseDTO.fields(`${keyPrefix}warehouse`, isInput),
            {
                key: `${keyPrefix}details`,
                label: `[${labelPrefix}details]`,
                children: OrdersStatsDetailsDTO.fields(`${keyPrefix}details${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}cisList`,
                label: `Список кодов идентификации товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/). - [${labelPrefix}cisList]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}initialCount`,
                label: `Первоначальное количество единиц товара. - [${labelPrefix}initialCount]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}bidFee`,
                label: `Списанная ставка ближайшего конкурента.  Указывается в процентах от стоимости товара и умножается на 100. Например, ставка 5% обозначается как 500.  - [${labelPrefix}bidFee]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}cofinanceThreshold`,
                label: `Порог для скидок с Маркетом на момент оформления заказа. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указан в рублях. Точность — два знака после запятой.  - [${labelPrefix}cofinanceThreshold]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}cofinanceValue`,
                label: `Скидка с Маркетом. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указана в рублях. Точность — два знака после запятой.  - [${labelPrefix}cofinanceValue]`,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'offerName': bundle.inputData?.[`${keyPrefix}offerName`],
            'marketSku': bundle.inputData?.[`${keyPrefix}marketSku`],
            'shopSku': bundle.inputData?.[`${keyPrefix}shopSku`],
            'count': bundle.inputData?.[`${keyPrefix}count`],
            'prices': utils.childMapping(bundle.inputData?.[`${keyPrefix}prices`], `${keyPrefix}prices`, OrdersStatsPriceDTO),
            'warehouse': utils.removeIfEmpty(OrdersStatsWarehouseDTO.mapping(bundle, `${keyPrefix}warehouse`)),
            'details': utils.childMapping(bundle.inputData?.[`${keyPrefix}details`], `${keyPrefix}details`, OrdersStatsDetailsDTO),
            'cisList': bundle.inputData?.[`${keyPrefix}cisList`],
            'initialCount': bundle.inputData?.[`${keyPrefix}initialCount`],
            'bidFee': bundle.inputData?.[`${keyPrefix}bidFee`],
            'cofinanceThreshold': bundle.inputData?.[`${keyPrefix}cofinanceThreshold`],
            'cofinanceValue': bundle.inputData?.[`${keyPrefix}cofinanceValue`],
        }
    },
}
