const utils = require('../utils/utils');
const UpdateStockDTO = require('../models/UpdateStockDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}skus`,
                label: `[${labelPrefix}skus]`,
                children: UpdateStockDTO.fields(`${keyPrefix}skus${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'skus': utils.childMapping(bundle.inputData?.[`${keyPrefix}skus`], `${keyPrefix}skus`, UpdateStockDTO),
        }
    },
}
