const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}inn`,
                label: `ИНН. - [${labelPrefix}inn]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}kpp`,
                label: `КПП. - [${labelPrefix}kpp]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}organizationName`,
                label: `Наименование юридического лица. - [${labelPrefix}organizationName]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}organizationJurAddress`,
                label: `Юридический адрес. - [${labelPrefix}organizationJurAddress]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'inn': bundle.inputData?.[`${keyPrefix}inn`],
            'kpp': bundle.inputData?.[`${keyPrefix}kpp`],
            'organizationName': bundle.inputData?.[`${keyPrefix}organizationName`],
            'organizationJurAddress': bundle.inputData?.[`${keyPrefix}organizationJurAddress`],
        }
    },
}
