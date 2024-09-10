const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}withTurnover`,
                label: `**Только для модели FBY**  Возвращать ли информацию по оборачиваемости.  Значение по умолчанию — `false`. Если информация нужна, передайте значение `true`.  - [${labelPrefix}withTurnover]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}archived`,
                label: `Фильтр по нахождению в архиве.  Передайте `true`, чтобы получить информацию об остатках товаров, которые находятся в архиве. Если фильтр не заполнен или передано `false`, в ответе возвращается информация о товарах, которые не находятся в архиве.  - [${labelPrefix}archived]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}offerIds`,
                label: `Фильтр по вашим SKU товаров.  Возвращается информация об остатках всех переданных SKU, включая товары в архиве.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit` * `archived`  {% endnote %}     - [${labelPrefix}offerIds]`,
                list: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'withTurnover': bundle.inputData?.[`${keyPrefix}withTurnover`],
            'archived': bundle.inputData?.[`${keyPrefix}archived`],
            'offerIds': bundle.inputData?.[`${keyPrefix}offerIds`],
        }
    },
}
