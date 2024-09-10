const utils = require('../utils/utils');
const OutletAddressDTO = require('../models/OutletAddressDTO');
const OutletDeliveryRuleDTO = require('../models/OutletDeliveryRuleDTO');
const OutletType = require('../models/OutletType');
const OutletVisibilityType = require('../models/OutletVisibilityType');
const OutletWorkingScheduleDTO = require('../models/OutletWorkingScheduleDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}name`,
                label: `Название точки продаж.  - [${labelPrefix}name]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}type`,
                ...OutletType.fields(`${keyPrefix}type`, isInput),
            },
            {
                key: `${keyPrefix}coords`,
                label: `Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, `20.4522144, 54.7104264`.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в `address`.  - [${labelPrefix}coords]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}isMain`,
                label: `Признак основной точки продаж.  Возможные значения:  * `false` — неосновная точка продаж. * `true` — основная точка продаж.  - [${labelPrefix}isMain]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}shopOutletCode`,
                label: `Идентификатор точки продаж, присвоенный магазином. - [${labelPrefix}shopOutletCode]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}visibility`,
                ...OutletVisibilityType.fields(`${keyPrefix}visibility`, isInput),
            },
            ...OutletAddressDTO.fields(`${keyPrefix}address`, isInput),
            {
                key: `${keyPrefix}phones`,
                label: `Номера телефонов точки продаж. Передавайте в формате: `+7 (999) 999-99-99`.  - [${labelPrefix}phones]`,
                required: true,
                list: true,
                type: 'string',
            },
            ...OutletWorkingScheduleDTO.fields(`${keyPrefix}workingSchedule`, isInput),
            {
                key: `${keyPrefix}deliveryRules`,
                label: `[${labelPrefix}deliveryRules]`,
                children: OutletDeliveryRuleDTO.fields(`${keyPrefix}deliveryRules${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}storagePeriod`,
                label: `Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях. - [${labelPrefix}storagePeriod]`,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'coords': bundle.inputData?.[`${keyPrefix}coords`],
            'isMain': bundle.inputData?.[`${keyPrefix}isMain`],
            'shopOutletCode': bundle.inputData?.[`${keyPrefix}shopOutletCode`],
            'visibility': bundle.inputData?.[`${keyPrefix}visibility`],
            'address': utils.removeIfEmpty(OutletAddressDTO.mapping(bundle, `${keyPrefix}address`)),
            'phones': bundle.inputData?.[`${keyPrefix}phones`],
            'workingSchedule': utils.removeIfEmpty(OutletWorkingScheduleDTO.mapping(bundle, `${keyPrefix}workingSchedule`)),
            'deliveryRules': utils.childMapping(bundle.inputData?.[`${keyPrefix}deliveryRules`], `${keyPrefix}deliveryRules`, OutletDeliveryRuleDTO),
            'storagePeriod': bundle.inputData?.[`${keyPrefix}storagePeriod`],
        }
    },
}
