const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}promocode`,
                label: `Промокод. - [${labelPrefix}promocode]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}discount`,
                label: `Процент скидки по промокоду. - [${labelPrefix}discount]`,
                required: true,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'promocode': bundle.inputData?.[`${keyPrefix}promocode`],
            'discount': bundle.inputData?.[`${keyPrefix}discount`],
        }
    },
}
