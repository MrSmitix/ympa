const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}photos`,
                label: `Ссылки на фото. - [${labelPrefix}photos]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}videos`,
                label: `Ссылки на видео. - [${labelPrefix}videos]`,
                list: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'photos': bundle.inputData?.[`${keyPrefix}photos`],
            'videos': bundle.inputData?.[`${keyPrefix}videos`],
        }
    },
}
