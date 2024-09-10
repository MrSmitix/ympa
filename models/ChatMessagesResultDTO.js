const utils = require('../utils/utils');
const ChatMessageDTO = require('../models/ChatMessageDTO');
const ForwardScrollingPagerDTO = require('../models/ForwardScrollingPagerDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}orderId`,
                label: `Идентификатор заказа. - [${labelPrefix}orderId]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}messages`,
                label: `[${labelPrefix}messages]`,
                children: ChatMessageDTO.fields(`${keyPrefix}messages${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...ForwardScrollingPagerDTO.fields(`${keyPrefix}paging`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'orderId': bundle.inputData?.[`${keyPrefix}orderId`],
            'messages': utils.childMapping(bundle.inputData?.[`${keyPrefix}messages`], `${keyPrefix}messages`, ChatMessageDTO),
            'paging': utils.removeIfEmpty(ForwardScrollingPagerDTO.mapping(bundle, `${keyPrefix}paging`)),
        }
    },
}
