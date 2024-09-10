const utils = require('../utils/utils');
const UpdatePriceWithDiscountDTO = require('../models/UpdatePriceWithDiscountDTO');

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
            ...UpdatePriceWithDiscountDTO.fields(`${keyPrefix}price`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'offerId': bundle.inputData?.[`${keyPrefix}offerId`],
            'price': utils.removeIfEmpty(UpdatePriceWithDiscountDTO.mapping(bundle, `${keyPrefix}price`)),
        }
    },
}
