const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}fromDate`,
                label: `Формат даты: `ДД-ММ-ГГГГ`.  - [${labelPrefix}fromDate]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}toDate`,
                label: `Формат даты: `ДД-ММ-ГГГГ`.  - [${labelPrefix}toDate]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}fromTime`,
                label: `Начало интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Минимальное значение: `00:00`.  - [${labelPrefix}fromTime]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}toTime`,
                label: `Конец интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Максимальное значение: `23:59`.  - [${labelPrefix}toTime]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}realDeliveryDate`,
                label: `Формат даты: `ДД-ММ-ГГГГ`.  - [${labelPrefix}realDeliveryDate]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'fromDate': bundle.inputData?.[`${keyPrefix}fromDate`],
            'toDate': bundle.inputData?.[`${keyPrefix}toDate`],
            'fromTime': bundle.inputData?.[`${keyPrefix}fromTime`],
            'toTime': bundle.inputData?.[`${keyPrefix}toTime`],
            'realDeliveryDate': bundle.inputData?.[`${keyPrefix}realDeliveryDate`],
        }
    },
}
