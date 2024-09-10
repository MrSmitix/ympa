const utils = require('../utils/utils');
const ApiResponseStatusType = require('../models/ApiResponseStatusType');
const DeletePromoOffersResultDTO = require('../models/DeletePromoOffersResultDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}status`,
                ...ApiResponseStatusType.fields(`${keyPrefix}status`, isInput),
            },
            ...DeletePromoOffersResultDTO.fields(`${keyPrefix}result`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'result': utils.removeIfEmpty(DeletePromoOffersResultDTO.mapping(bundle, `${keyPrefix}result`)),
        }
    },
}
