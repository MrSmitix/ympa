const utils = require('../utils/utils');
const OfferProcessingNoteType = require('../models/OfferProcessingNoteType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                ...OfferProcessingNoteType.fields(`${keyPrefix}type`, isInput),
            },
            {
                key: `${keyPrefix}payload`,
                label: `Дополнительная информация о причине отклонения товара.  - [${labelPrefix}payload]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'payload': bundle.inputData?.[`${keyPrefix}payload`],
        }
    },
}
