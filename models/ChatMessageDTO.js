const utils = require('../utils/utils');
const ChatMessagePayloadDTO = require('../models/ChatMessagePayloadDTO');
const ChatMessageSenderType = require('../models/ChatMessageSenderType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}messageId`,
                label: `Идентификатор сообщения. - [${labelPrefix}messageId]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}createdAt`,
                label: `Дата и время создания сообщения.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`.  - [${labelPrefix}createdAt]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}sender`,
                ...ChatMessageSenderType.fields(`${keyPrefix}sender`, isInput),
            },
            {
                key: `${keyPrefix}message`,
                label: `Текст сообщения.  Необязательный параметр, если возвращается параметр `payload`.  - [${labelPrefix}message]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}payload`,
                label: `[${labelPrefix}payload]`,
                children: ChatMessagePayloadDTO.fields(`${keyPrefix}payload${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'messageId': bundle.inputData?.[`${keyPrefix}messageId`],
            'createdAt': bundle.inputData?.[`${keyPrefix}createdAt`],
            'sender': bundle.inputData?.[`${keyPrefix}sender`],
            'message': bundle.inputData?.[`${keyPrefix}message`],
            'payload': utils.childMapping(bundle.inputData?.[`${keyPrefix}payload`], `${keyPrefix}payload`, ChatMessagePayloadDTO),
        }
    },
}
