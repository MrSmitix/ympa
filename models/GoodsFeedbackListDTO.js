const utils = require('../utils/utils');
const ForwardScrollingPagerDTO = require('../models/ForwardScrollingPagerDTO');
const GoodsFeedbackDTO = require('../models/GoodsFeedbackDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}feedbacks`,
                label: `[${labelPrefix}feedbacks]`,
                children: GoodsFeedbackDTO.fields(`${keyPrefix}feedbacks${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...ForwardScrollingPagerDTO.fields(`${keyPrefix}paging`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'feedbacks': utils.childMapping(bundle.inputData?.[`${keyPrefix}feedbacks`], `${keyPrefix}feedbacks`, GoodsFeedbackDTO),
            'paging': utils.removeIfEmpty(ForwardScrollingPagerDTO.mapping(bundle, `${keyPrefix}paging`)),
        }
    },
}
