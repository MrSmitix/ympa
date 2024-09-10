const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}toDate`,
                label: `Новая дата доставки заказа.  Формат даты: `ГГГГ-ММ-ДД`.  - [${labelPrefix}toDate]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'toDate': bundle.inputData?.[`${keyPrefix}toDate`],
        }
    },
}
