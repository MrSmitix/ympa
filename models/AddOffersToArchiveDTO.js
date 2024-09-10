const utils = require('../utils/utils');
const AddOffersToArchiveErrorDTO = require('../models/AddOffersToArchiveErrorDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}notArchivedOffers`,
                label: `[${labelPrefix}notArchivedOffers]`,
                children: AddOffersToArchiveErrorDTO.fields(`${keyPrefix}notArchivedOffers${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'notArchivedOffers': utils.childMapping(bundle.inputData?.[`${keyPrefix}notArchivedOffers`], `${keyPrefix}notArchivedOffers`, AddOffersToArchiveErrorDTO),
        }
    },
}
