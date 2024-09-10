const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}activeOffers`,
                label: `Количество товаров, которые участвуют или участвовали в акции.  Учитываются только товары, которые были добавлены вручную.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index).  - [${labelPrefix}activeOffers]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}potentialOffers`,
                label: `Количество доступных товаров в акции.  Параметр возвращается только для текущих и будущих акций.  - [${labelPrefix}potentialOffers]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}processing`,
                label: `Есть ли изменения в ассортименте, которые еще не применились. Сохранение изменений занимает некоторое время.  Параметр возвращается только для текущих и будущих акций.  - [${labelPrefix}processing]`,
                type: 'boolean',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'activeOffers': bundle.inputData?.[`${keyPrefix}activeOffers`],
            'potentialOffers': bundle.inputData?.[`${keyPrefix}potentialOffers`],
            'processing': bundle.inputData?.[`${keyPrefix}processing`],
        }
    },
}
