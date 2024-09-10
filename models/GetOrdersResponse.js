const utils = require('../utils/utils');
const FlippingPagerDTO = require('../models/FlippingPagerDTO');
const ForwardScrollingPagerDTO = require('../models/ForwardScrollingPagerDTO');
const OrderDTO = require('../models/OrderDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...FlippingPagerDTO.fields(`${keyPrefix}pager`, isInput),
            {
                key: `${keyPrefix}orders`,
                label: `[${labelPrefix}orders]`,
                children: OrderDTO.fields(`${keyPrefix}orders${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...ForwardScrollingPagerDTO.fields(`${keyPrefix}paging`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'pager': utils.removeIfEmpty(FlippingPagerDTO.mapping(bundle, `${keyPrefix}pager`)),
            'orders': utils.childMapping(bundle.inputData?.[`${keyPrefix}orders`], `${keyPrefix}orders`, OrderDTO),
            'paging': utils.removeIfEmpty(ForwardScrollingPagerDTO.mapping(bundle, `${keyPrefix}paging`)),
        }
    },
}
