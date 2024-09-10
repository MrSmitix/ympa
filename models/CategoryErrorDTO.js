const utils = require('../utils/utils');
const CategoryErrorType = require('../models/CategoryErrorType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}categoryId`,
                label: `Идентификатор категории. - [${labelPrefix}categoryId]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}type`,
                ...CategoryErrorType.fields(`${keyPrefix}type`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'categoryId': bundle.inputData?.[`${keyPrefix}categoryId`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
        }
    },
}
