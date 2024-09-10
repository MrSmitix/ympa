const utils = require('../utils/utils');
const OrderBuyerType = require('../models/OrderBuyerType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `Идентификатор покупателя. - [${labelPrefix}id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}lastName`,
                label: `Фамилия покупателя. - [${labelPrefix}lastName]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}firstName`,
                label: `Имя покупателя. - [${labelPrefix}firstName]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}middleName`,
                label: `Отчество покупателя. - [${labelPrefix}middleName]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}type`,
                ...OrderBuyerType.fields(`${keyPrefix}type`, isInput),
            },
            {
                key: `${keyPrefix}phone`,
                label: `Подменный номер телефона покупателя. Подробнее о таких номерах читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/orders/dbs/call#fake-number).  Формат номера: `+<код_страны><код_региона><номер_телефона>`.  - [${labelPrefix}phone]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'lastName': bundle.inputData?.[`${keyPrefix}lastName`],
            'firstName': bundle.inputData?.[`${keyPrefix}firstName`],
            'middleName': bundle.inputData?.[`${keyPrefix}middleName`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'phone': bundle.inputData?.[`${keyPrefix}phone`],
        }
    },
}
