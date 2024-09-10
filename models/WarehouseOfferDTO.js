const utils = require('../utils/utils');
const TurnoverDTO = require('../models/TurnoverDTO');
const WarehouseStockDTO = require('../models/WarehouseStockDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}offerId`,
                label: `Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  - [${labelPrefix}offerId]`,
                required: true,
                type: 'string',
            },
            ...TurnoverDTO.fields(`${keyPrefix}turnoverSummary`, isInput),
            {
                key: `${keyPrefix}stocks`,
                label: `[${labelPrefix}stocks]`,
                children: WarehouseStockDTO.fields(`${keyPrefix}stocks${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}updatedAt`,
                label: `Дата и время последнего обновления информации об остатках.  Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, `2023-11-21T00:42:42+03:00`.  - [${labelPrefix}updatedAt]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'offerId': bundle.inputData?.[`${keyPrefix}offerId`],
            'turnoverSummary': utils.removeIfEmpty(TurnoverDTO.mapping(bundle, `${keyPrefix}turnoverSummary`)),
            'stocks': utils.childMapping(bundle.inputData?.[`${keyPrefix}stocks`], `${keyPrefix}stocks`, WarehouseStockDTO),
            'updatedAt': bundle.inputData?.[`${keyPrefix}updatedAt`],
        }
    },
}
