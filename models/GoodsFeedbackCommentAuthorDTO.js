const utils = require('../utils/utils');
const GoodsFeedbackCommentAuthorType = require('../models/GoodsFeedbackCommentAuthorType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                ...GoodsFeedbackCommentAuthorType.fields(`${keyPrefix}type`, isInput),
            },
            {
                key: `${keyPrefix}name`,
                label: `Имя автора или название кабинета. - [${labelPrefix}name]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
        }
    },
}
