const utils = require('../utils/utils');
const ChatStatusType = require('../models/ChatStatusType');
const ChatType = require('../models/ChatType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}chatId`,
                label: `Идентификатор чата. - [${labelPrefix}chatId]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}orderId`,
                label: `Идентификатор заказа. - [${labelPrefix}orderId]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}type`,
                ...ChatType.fields(`${keyPrefix}type`, isInput),
            },
            {
                key: `${keyPrefix}status`,
                ...ChatStatusType.fields(`${keyPrefix}status`, isInput),
            },
            {
                key: `${keyPrefix}createdAt`,
                label: `Дата и время создания чата.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`.  - [${labelPrefix}createdAt]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}updatedAt`,
                label: `Дата и время последнего сообщения в чате. - [${labelPrefix}updatedAt]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'chatId': bundle.inputData?.[`${keyPrefix}chatId`],
            'orderId': bundle.inputData?.[`${keyPrefix}orderId`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'createdAt': bundle.inputData?.[`${keyPrefix}createdAt`],
            'updatedAt': bundle.inputData?.[`${keyPrefix}updatedAt`],
        }
    },
}
