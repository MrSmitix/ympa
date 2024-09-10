const utils = require('../utils/utils');
const OutletLicenseDTO = require('../models/OutletLicenseDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}licenses`,
                label: `[${labelPrefix}licenses]`,
                children: OutletLicenseDTO.fields(`${keyPrefix}licenses${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'licenses': utils.childMapping(bundle.inputData?.[`${keyPrefix}licenses`], `${keyPrefix}licenses`, OutletLicenseDTO),
        }
    },
}
