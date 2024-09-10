const utils = require('../utils/utils');
const OutletWorkingScheduleItemDTO = require('../models/OutletWorkingScheduleItemDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}workInHoliday`,
                label: `Признак, работает ли точка продаж в дни государственных праздников.  Возможные значения:  * `false` — точка продаж не работает в дни государственных праздников. * `true` — точка продаж работает в дни государственных праздников.  - [${labelPrefix}workInHoliday]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}scheduleItems`,
                label: `[${labelPrefix}scheduleItems]`,
                children: OutletWorkingScheduleItemDTO.fields(`${keyPrefix}scheduleItems${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'workInHoliday': bundle.inputData?.[`${keyPrefix}workInHoliday`],
            'scheduleItems': utils.childMapping(bundle.inputData?.[`${keyPrefix}scheduleItems`], `${keyPrefix}scheduleItems`, OutletWorkingScheduleItemDTO),
        }
    },
}
