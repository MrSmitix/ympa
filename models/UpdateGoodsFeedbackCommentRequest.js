const utils = require('../utils/utils');
const UpdateGoodsFeedbackCommentDTO = require('../models/UpdateGoodsFeedbackCommentDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}feedbackId`,
                label: `Идентификатор отзыва.  - [${labelPrefix}feedbackId]`,
                required: true,
                type: 'number',
            },
            ...UpdateGoodsFeedbackCommentDTO.fields(`${keyPrefix}comment`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'feedbackId': bundle.inputData?.[`${keyPrefix}feedbackId`],
            'comment': utils.removeIfEmpty(UpdateGoodsFeedbackCommentDTO.mapping(bundle, `${keyPrefix}comment`)),
        }
    },
}
