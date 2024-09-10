const utils = require('../utils/utils');
const OfferSellingProgramStatusType = require('../models/OfferSellingProgramStatusType');
const SellingProgramType = require('../models/SellingProgramType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}sellingProgram`,
                ...SellingProgramType.fields(`${keyPrefix}sellingProgram`, isInput),
            },
            {
                key: `${keyPrefix}status`,
                ...OfferSellingProgramStatusType.fields(`${keyPrefix}status`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'sellingProgram': bundle.inputData?.[`${keyPrefix}sellingProgram`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
        }
    },
}
