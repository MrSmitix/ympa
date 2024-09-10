const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}parameterId`,
                label: `Идентификатор характеристики. - [${labelPrefix}parameterId]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}unitId`,
                label: `Идентификатор единицы измерения. Если вы не передали параметр `unitId`, используется единица измерения по умолчанию. - [${labelPrefix}unitId]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}valueId`,
                label: `Идентификатор значения.  Обязательно указывайте идентификатор, если передаете значение из перечня допустимых значений, полученного от Маркета.  Только для характеристик типа `ENUM`.  - [${labelPrefix}valueId]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}value`,
                label: `Значение. - [${labelPrefix}value]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'parameterId': bundle.inputData?.[`${keyPrefix}parameterId`],
            'unitId': bundle.inputData?.[`${keyPrefix}unitId`],
            'valueId': bundle.inputData?.[`${keyPrefix}valueId`],
            'value': bundle.inputData?.[`${keyPrefix}value`],
        }
    },
}
