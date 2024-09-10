const utils = require('../utils/utils');
const OfferContentDTO = require('../models/OfferContentDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}offersContent`,
                label: `[${labelPrefix}offersContent]`,
                children: OfferContentDTO.fields(`${keyPrefix}offersContent${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'offersContent': utils.childMapping(bundle.inputData?.[`${keyPrefix}offersContent`], `${keyPrefix}offersContent`, OfferContentDTO),
        }
    },
}
