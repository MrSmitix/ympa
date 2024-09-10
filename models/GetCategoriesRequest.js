const utils = require('../utils/utils');
const LanguageType = require('../models/LanguageType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}language`,
                ...LanguageType.fields(`${keyPrefix}language`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'language': bundle.inputData?.[`${keyPrefix}language`],
        }
    },
}
