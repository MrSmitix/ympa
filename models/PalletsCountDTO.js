const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}planned`,
                label: `Количество палет, которое заявил продавец. - [${labelPrefix}planned]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}fact`,
                label: `Количество палет, которое приняли в сортировочном центре. - [${labelPrefix}fact]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'planned': bundle.inputData?.[`${keyPrefix}planned`],
            'fact': bundle.inputData?.[`${keyPrefix}fact`],
        }
    },
}
