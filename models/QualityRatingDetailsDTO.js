const utils = require('../utils/utils');
const QualityRatingAffectedOrderDTO = require('../models/QualityRatingAffectedOrderDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}affectedOrders`,
                label: `[${labelPrefix}affectedOrders]`,
                children: QualityRatingAffectedOrderDTO.fields(`${keyPrefix}affectedOrders${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'affectedOrders': utils.childMapping(bundle.inputData?.[`${keyPrefix}affectedOrders`], `${keyPrefix}affectedOrders`, QualityRatingAffectedOrderDTO),
        }
    },
}
