const utils = require('../utils/utils');
const ShipmentStatusType = require('../models/ShipmentStatusType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}status`,
                ...ShipmentStatusType.fields(`${keyPrefix}status`, isInput),
            },
            {
                key: `${keyPrefix}description`,
                label: `Описание статуса отгрузки. - [${labelPrefix}description]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}updateTime`,
                label: `Время последнего изменения статуса отгрузки. - [${labelPrefix}updateTime]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'description': bundle.inputData?.[`${keyPrefix}description`],
            'updateTime': bundle.inputData?.[`${keyPrefix}updateTime`],
        }
    },
}
