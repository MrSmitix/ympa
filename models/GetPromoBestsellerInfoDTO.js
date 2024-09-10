const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}bestseller`,
                label: `Является ли акция «Бестселлером Маркета». Подробнее об этой акции читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/bestsellers). - [${labelPrefix}bestseller]`,
                required: true,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}entryDeadline`,
                label: `До какой даты можно добавить товар в акцию «Бестселлеры Маркета».  Параметр возвращается только для текущих и будущих акций «Бестселлеры Маркета».  - [${labelPrefix}entryDeadline]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'bestseller': bundle.inputData?.[`${keyPrefix}bestseller`],
            'entryDeadline': bundle.inputData?.[`${keyPrefix}entryDeadline`],
        }
    },
}
