const utils = require('../utils/utils');
const DayOfWeekType = require('../models/DayOfWeekType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}startDay`,
                ...DayOfWeekType.fields(`${keyPrefix}startDay`, isInput),
            },
            {
                key: `${keyPrefix}endDay`,
                ...DayOfWeekType.fields(`${keyPrefix}endDay`, isInput),
            },
            {
                key: `${keyPrefix}startTime`,
                label: `Точка продаж работает c указанного часа.  Формат: `ЧЧ:ММ`.  - [${labelPrefix}startTime]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}endTime`,
                label: `Точка продаж работает до указанного часа.  Формат: `ЧЧ:ММ`.  - [${labelPrefix}endTime]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'startDay': bundle.inputData?.[`${keyPrefix}startDay`],
            'endDay': bundle.inputData?.[`${keyPrefix}endDay`],
            'startTime': bundle.inputData?.[`${keyPrefix}startTime`],
            'endTime': bundle.inputData?.[`${keyPrefix}endTime`],
        }
    },
}
