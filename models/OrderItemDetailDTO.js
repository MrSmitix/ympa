const utils = require('../utils/utils');
const OrderItemStatusType = require('../models/OrderItemStatusType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}itemCount`,
                label: `Количество единиц товара. - [${labelPrefix}itemCount]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}itemStatus`,
                ...OrderItemStatusType.fields(`${keyPrefix}itemStatus`, isInput),
            },
            {
                key: `${keyPrefix}updateDate`,
                label: `Формат даты: `ДД-ММ-ГГГГ`.  - [${labelPrefix}updateDate]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'itemCount': bundle.inputData?.[`${keyPrefix}itemCount`],
            'itemStatus': bundle.inputData?.[`${keyPrefix}itemStatus`],
            'updateDate': bundle.inputData?.[`${keyPrefix}updateDate`],
        }
    },
}
