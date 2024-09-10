const utils = require('../utils/utils');
const GetPromoDTO = require('../models/GetPromoDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}promos`,
                label: `[${labelPrefix}promos]`,
                children: GetPromoDTO.fields(`${keyPrefix}promos${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'promos': utils.childMapping(bundle.inputData?.[`${keyPrefix}promos`], `${keyPrefix}promos`, GetPromoDTO),
        }
    },
}
