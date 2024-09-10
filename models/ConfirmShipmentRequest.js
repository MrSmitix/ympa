const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}externalShipmentId`,
                label: `Идентификатор отгрузки в системе поставщика. - [${labelPrefix}externalShipmentId]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'externalShipmentId': bundle.inputData?.[`${keyPrefix}externalShipmentId`],
        }
    },
}
