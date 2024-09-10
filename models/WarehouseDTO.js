const utils = require('../utils/utils');
const WarehouseAddressDTO = require('../models/WarehouseAddressDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `Идентификатор склада. - [${labelPrefix}id]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}name`,
                label: `Название склада. - [${labelPrefix}name]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}campaignId`,
                label: `Идентификатор кампании в API и идентификатор магазина. - [${labelPrefix}campaignId]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}express`,
                label: `Возможна ли доставка по модели Экспресс. - [${labelPrefix}express]`,
                required: true,
                type: 'boolean',
            },
            ...WarehouseAddressDTO.fields(`${keyPrefix}address`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'campaignId': bundle.inputData?.[`${keyPrefix}campaignId`],
            'express': bundle.inputData?.[`${keyPrefix}express`],
            'address': utils.removeIfEmpty(WarehouseAddressDTO.mapping(bundle, `${keyPrefix}address`)),
        }
    },
}
