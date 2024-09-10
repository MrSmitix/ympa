const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}length`,
                label: `Длина товара в сантиметрах. - [${labelPrefix}length]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}width`,
                label: `Ширина товара в сантиметрах. - [${labelPrefix}width]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}height`,
                label: `Высота товара в сантиметрах. - [${labelPrefix}height]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}weight`,
                label: `Вес товара в килограммах. - [${labelPrefix}weight]`,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'length': bundle.inputData?.[`${keyPrefix}length`],
            'width': bundle.inputData?.[`${keyPrefix}width`],
            'height': bundle.inputData?.[`${keyPrefix}height`],
            'weight': bundle.inputData?.[`${keyPrefix}weight`],
        }
    },
}
