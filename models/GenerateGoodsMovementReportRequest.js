const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}campaignId`,
                label: `Идентификатор кампании. - [${labelPrefix}campaignId]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}dateFrom`,
                label: `Начало периода, включительно. - [${labelPrefix}dateFrom]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}dateTo`,
                label: `Конец периода, включительно. - [${labelPrefix}dateTo]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}shopSku`,
                label: `Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  - [${labelPrefix}shopSku]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'campaignId': bundle.inputData?.[`${keyPrefix}campaignId`],
            'dateFrom': bundle.inputData?.[`${keyPrefix}dateFrom`],
            'dateTo': bundle.inputData?.[`${keyPrefix}dateTo`],
            'shopSku': bundle.inputData?.[`${keyPrefix}shopSku`],
        }
    },
}
