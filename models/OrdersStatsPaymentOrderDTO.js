const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `Номер платежного поручения. - [${labelPrefix}id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}date`,
                label: `Дата платежного поручения.  Формат даты: `ГГГГ‑ММ‑ДД`.  - [${labelPrefix}date]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'date': bundle.inputData?.[`${keyPrefix}date`],
        }
    },
}
