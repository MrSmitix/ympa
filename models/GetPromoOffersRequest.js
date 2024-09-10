const utils = require('../utils/utils');
const PromoOfferParticipationStatusFilterType = require('../models/PromoOfferParticipationStatusFilterType');

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
                key: `${keyPrefix}statusType`,
                ...PromoOfferParticipationStatusFilterType.fields(`${keyPrefix}statusType`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'promoId': bundle.inputData?.[`${keyPrefix}promoId`],
            'statusType': bundle.inputData?.[`${keyPrefix}statusType`],
        }
    },
}
