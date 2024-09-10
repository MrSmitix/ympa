const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}avg`,
                label: `Средняя цена предложения для модели в регионе. - [${labelPrefix}avg]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}max`,
                label: `Максимальная цена предложения для модели в регионе. - [${labelPrefix}max]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}min`,
                label: `Минимальная цена предложения для модели в регионе. - [${labelPrefix}min]`,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'avg': bundle.inputData?.[`${keyPrefix}avg`],
            'max': bundle.inputData?.[`${keyPrefix}max`],
            'min': bundle.inputData?.[`${keyPrefix}min`],
        }
    },
}
