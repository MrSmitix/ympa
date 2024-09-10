const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}dateFrom`,
                label: `Начало периода.  Формат даты: `ГГГГ‑ММ‑ДД`.  Не может быть раньше 30 дней от текущей даты.  - [${labelPrefix}dateFrom]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}dateTo`,
                label: `Конец периода.  Формат даты: `ГГГГ‑ММ‑ДД`.  Не может быть позже текущей даты.  - [${labelPrefix}dateTo]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}campaignIds`,
                label: `Список идентификаторов магазинов. - [${labelPrefix}campaignIds]`,
                required: true,
                list: true,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'dateFrom': bundle.inputData?.[`${keyPrefix}dateFrom`],
            'dateTo': bundle.inputData?.[`${keyPrefix}dateTo`],
            'campaignIds': bundle.inputData?.[`${keyPrefix}campaignIds`],
        }
    },
}
