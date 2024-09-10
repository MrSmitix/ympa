const utils = require('../utils/utils');
const UpdatePromoOfferDTO = require('../models/UpdatePromoOfferDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}promoId`,
                label: `Идентификатор акции. - [${labelPrefix}promoId]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}offers`,
                label: `[${labelPrefix}offers]`,
                children: UpdatePromoOfferDTO.fields(`${keyPrefix}offers${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'promoId': bundle.inputData?.[`${keyPrefix}promoId`],
            'offers': utils.childMapping(bundle.inputData?.[`${keyPrefix}offers`], `${keyPrefix}offers`, UpdatePromoOfferDTO),
        }
    },
}
