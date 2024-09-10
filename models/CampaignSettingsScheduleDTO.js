const utils = require('../utils/utils');
const CampaignSettingsTimePeriodDTO = require('../models/CampaignSettingsTimePeriodDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}availableOnHolidays`,
                label: `Признак работы службы доставки в государственные праздники. Возможные значения. * `false` — служба доставки не работает в праздничные дни. * `true` — служба доставки работает в праздничные дни.  - [${labelPrefix}availableOnHolidays]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}customHolidays`,
                label: `Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете. - [${labelPrefix}customHolidays]`,
                required: true,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}customWorkingDays`,
                label: `Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете. - [${labelPrefix}customWorkingDays]`,
                required: true,
                list: true,
                type: 'string',
            },
            ...CampaignSettingsTimePeriodDTO.fields(`${keyPrefix}period`, isInput),
            {
                key: `${keyPrefix}totalHolidays`,
                label: `Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете. - [${labelPrefix}totalHolidays]`,
                required: true,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}weeklyHolidays`,
                label: `Список выходных дней недели и государственных праздников. - [${labelPrefix}weeklyHolidays]`,
                required: true,
                list: true,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'availableOnHolidays': bundle.inputData?.[`${keyPrefix}availableOnHolidays`],
            'customHolidays': bundle.inputData?.[`${keyPrefix}customHolidays`],
            'customWorkingDays': bundle.inputData?.[`${keyPrefix}customWorkingDays`],
            'period': utils.removeIfEmpty(CampaignSettingsTimePeriodDTO.mapping(bundle, `${keyPrefix}period`)),
            'totalHolidays': bundle.inputData?.[`${keyPrefix}totalHolidays`],
            'weeklyHolidays': bundle.inputData?.[`${keyPrefix}weeklyHolidays`],
        }
    },
}
