const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}length`,
                label: `Длина упаковки в см.  - [${labelPrefix}length]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}width`,
                label: `Ширина упаковки в см.  - [${labelPrefix}width]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}height`,
                label: `Высота упаковки в см.  - [${labelPrefix}height]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}weight`,
                label: `Вес товара в кг с учетом упаковки (брутто).  - [${labelPrefix}weight]`,
                required: true,
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
