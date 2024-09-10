const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}current`,
                label: `Номер части, начиная с 1. - [${labelPrefix}current]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}total`,
                label: `На сколько всего частей разделен товар. - [${labelPrefix}total]`,
                required: true,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'current': bundle.inputData?.[`${keyPrefix}current`],
            'total': bundle.inputData?.[`${keyPrefix}total`],
        }
    },
}
