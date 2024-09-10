const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}categoryId`,
                label: `Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).  - [${labelPrefix}categoryId]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}price`,
                label: `Цена на товар в рублях. - [${labelPrefix}price]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}length`,
                label: `Длина товара в сантиметрах. - [${labelPrefix}length]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}width`,
                label: `Ширина товара в сантиметрах. - [${labelPrefix}width]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}height`,
                label: `Высота товара в сантиметрах. - [${labelPrefix}height]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}weight`,
                label: `Вес товара в килограммах. - [${labelPrefix}weight]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}quantity`,
                label: `Квант продажи — количество единиц товара в одном товарном предложении. - [${labelPrefix}quantity]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'categoryId': bundle.inputData?.[`${keyPrefix}categoryId`],
            'price': bundle.inputData?.[`${keyPrefix}price`],
            'length': bundle.inputData?.[`${keyPrefix}length`],
            'width': bundle.inputData?.[`${keyPrefix}width`],
            'height': bundle.inputData?.[`${keyPrefix}height`],
            'weight': bundle.inputData?.[`${keyPrefix}weight`],
            'quantity': bundle.inputData?.[`${keyPrefix}quantity`],
        }
    },
}
