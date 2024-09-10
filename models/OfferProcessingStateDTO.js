const utils = require('../utils/utils');
const OfferProcessingNoteDTO = require('../models/OfferProcessingNoteDTO');
const OfferProcessingStatusType = require('../models/OfferProcessingStatusType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}status`,
                ...OfferProcessingStatusType.fields(`${keyPrefix}status`, isInput),
            },
            {
                key: `${keyPrefix}notes`,
                label: `[${labelPrefix}notes]`,
                children: OfferProcessingNoteDTO.fields(`${keyPrefix}notes${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'notes': utils.childMapping(bundle.inputData?.[`${keyPrefix}notes`], `${keyPrefix}notes`, OfferProcessingNoteDTO),
        }
    },
}
