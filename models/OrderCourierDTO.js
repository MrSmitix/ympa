const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}fullName`,
                label: `Полное имя курьера. - [${labelPrefix}fullName]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}phone`,
                label: `Номер телефона курьера. - [${labelPrefix}phone]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}phoneExtension`,
                label: `Добавочный номер телефона. - [${labelPrefix}phoneExtension]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}vehicleNumber`,
                label: `Номер транспортного средства. - [${labelPrefix}vehicleNumber]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}vehicleDescription`,
                label: `Описание машины. Например, модель и цвет. - [${labelPrefix}vehicleDescription]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'fullName': bundle.inputData?.[`${keyPrefix}fullName`],
            'phone': bundle.inputData?.[`${keyPrefix}phone`],
            'phoneExtension': bundle.inputData?.[`${keyPrefix}phoneExtension`],
            'vehicleNumber': bundle.inputData?.[`${keyPrefix}vehicleNumber`],
            'vehicleDescription': bundle.inputData?.[`${keyPrefix}vehicleDescription`],
        }
    },
}
