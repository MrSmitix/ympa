const utils = require('../utils/utils');
const QualityRatingDTO = require('../models/QualityRatingDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}campaignId`,
                label: `Идентификатор магазина. - [${labelPrefix}campaignId]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}ratings`,
                label: `[${labelPrefix}ratings]`,
                children: QualityRatingDTO.fields(`${keyPrefix}ratings${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'campaignId': bundle.inputData?.[`${keyPrefix}campaignId`],
            'ratings': utils.childMapping(bundle.inputData?.[`${keyPrefix}ratings`], `${keyPrefix}ratings`, QualityRatingDTO),
        }
    },
}
