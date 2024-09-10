const utils = require('../utils/utils');
const DocumentDTO = require('../models/DocumentDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...DocumentDTO.fields(`${keyPrefix}upd`, isInput),
            ...DocumentDTO.fields(`${keyPrefix}ukd`, isInput),
            ...DocumentDTO.fields(`${keyPrefix}torgTwelve`, isInput),
            ...DocumentDTO.fields(`${keyPrefix}sf`, isInput),
            ...DocumentDTO.fields(`${keyPrefix}ksf`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'upd': utils.removeIfEmpty(DocumentDTO.mapping(bundle, `${keyPrefix}upd`)),
            'ukd': utils.removeIfEmpty(DocumentDTO.mapping(bundle, `${keyPrefix}ukd`)),
            'torgTwelve': utils.removeIfEmpty(DocumentDTO.mapping(bundle, `${keyPrefix}torgTwelve`)),
            'sf': utils.removeIfEmpty(DocumentDTO.mapping(bundle, `${keyPrefix}sf`)),
            'ksf': utils.removeIfEmpty(DocumentDTO.mapping(bundle, `${keyPrefix}ksf`)),
        }
    },
}
