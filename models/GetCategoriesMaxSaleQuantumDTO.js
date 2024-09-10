const utils = require('../utils/utils');
const CategoryErrorDTO = require('../models/CategoryErrorDTO');
const MaxSaleQuantumDTO = require('../models/MaxSaleQuantumDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}results`,
                label: `[${labelPrefix}results]`,
                children: MaxSaleQuantumDTO.fields(`${keyPrefix}results${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}errors`,
                label: `[${labelPrefix}errors]`,
                children: CategoryErrorDTO.fields(`${keyPrefix}errors${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'results': utils.childMapping(bundle.inputData?.[`${keyPrefix}results`], `${keyPrefix}results`, MaxSaleQuantumDTO),
            'errors': utils.childMapping(bundle.inputData?.[`${keyPrefix}errors`], `${keyPrefix}errors`, CategoryErrorDTO),
        }
    },
}
