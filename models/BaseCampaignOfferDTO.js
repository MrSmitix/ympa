const utils = require('../utils/utils');
const QuantumDTO = require('../models/QuantumDTO');

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
            ...QuantumDTO.fields(`${keyPrefix}quantum`, isInput),
            {
                key: `${keyPrefix}available`,
                label: `Есть ли товар в продаже.  - [${labelPrefix}available]`,
                type: 'boolean',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'offerId': bundle.inputData?.[`${keyPrefix}offerId`],
            'quantum': utils.removeIfEmpty(QuantumDTO.mapping(bundle, `${keyPrefix}quantum`)),
            'available': bundle.inputData?.[`${keyPrefix}available`],
        }
    },
}
