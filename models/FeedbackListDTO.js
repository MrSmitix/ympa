const utils = require('../utils/utils');
const FeedbackDTO = require('../models/FeedbackDTO');
const ScrollingPagerDTO = require('../models/ScrollingPagerDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...ScrollingPagerDTO.fields(`${keyPrefix}paging`, isInput),
            {
                key: `${keyPrefix}feedbackList`,
                label: `[${labelPrefix}feedbackList]`,
                children: FeedbackDTO.fields(`${keyPrefix}feedbackList${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'paging': utils.removeIfEmpty(ScrollingPagerDTO.mapping(bundle, `${keyPrefix}paging`)),
            'feedbackList': utils.childMapping(bundle.inputData?.[`${keyPrefix}feedbackList`], `${keyPrefix}feedbackList`, FeedbackDTO),
        }
    },
}
