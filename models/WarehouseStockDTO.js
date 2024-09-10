const utils = require('../utils/utils');
const WarehouseStockType = require('../models/WarehouseStockType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                ...WarehouseStockType.fields(`${keyPrefix}type`, isInput),
            },
            {
                key: `${keyPrefix}count`,
                label: `Значение остатков. - [${labelPrefix}count]`,
                required: true,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'count': bundle.inputData?.[`${keyPrefix}count`],
        }
    },
}
