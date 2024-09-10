const utils = require('../utils/utils');
const OrderDocumentStatusType = require('../models/OrderDocumentStatusType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}status`,
                ...OrderDocumentStatusType.fields(`${keyPrefix}status`, isInput),
            },
            {
                key: `${keyPrefix}number`,
                label: `Номер документа. - [${labelPrefix}number]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}date`,
                label: `Дата создания документа. - [${labelPrefix}date]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'number': bundle.inputData?.[`${keyPrefix}number`],
            'date': bundle.inputData?.[`${keyPrefix}date`],
        }
    },
}
