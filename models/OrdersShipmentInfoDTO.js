const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}orderIdsWithLabels`,
                label: `Идентификаторы заказов в отгрузке, для которых можно распечатать ярлыки. - [${labelPrefix}orderIdsWithLabels]`,
                required: true,
                list: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}orderIdsWithoutLabels`,
                label: `Идентификаторы заказов в отгрузке, для которых нельзя распечатать ярлыки. - [${labelPrefix}orderIdsWithoutLabels]`,
                required: true,
                list: true,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'orderIdsWithLabels': bundle.inputData?.[`${keyPrefix}orderIdsWithLabels`],
            'orderIdsWithoutLabels': bundle.inputData?.[`${keyPrefix}orderIdsWithoutLabels`],
        }
    },
}
