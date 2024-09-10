const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}feedbackIds`,
                label: `Список идентификаторов отзывов, на которые магазин не будет отвечать. - [${labelPrefix}feedbackIds]`,
                required: true,
                list: true,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'feedbackIds': bundle.inputData?.[`${keyPrefix}feedbackIds`],
        }
    },
}
