const utils = require('../utils/utils');
const DeliveryServiceDTO = require('../models/DeliveryServiceDTO');
const PalletsCountDTO = require('../models/PalletsCountDTO');
const PartnerShipmentWarehouseDTO = require('../models/PartnerShipmentWarehouseDTO');
const ShipmentStatusType = require('../models/ShipmentStatusType');
const ShipmentType = require('../models/ShipmentType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `Идентификатор отгрузки. - [${labelPrefix}id]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}planIntervalFrom`,
                label: `Начало планового интервала отгрузки. - [${labelPrefix}planIntervalFrom]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}planIntervalTo`,
                label: `Конец планового интервала отгрузки. - [${labelPrefix}planIntervalTo]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}shipmentType`,
                ...ShipmentType.fields(`${keyPrefix}shipmentType`, isInput),
            },
            ...PartnerShipmentWarehouseDTO.fields(`${keyPrefix}warehouse`, isInput),
            ...PartnerShipmentWarehouseDTO.fields(`${keyPrefix}warehouseTo`, isInput),
            {
                key: `${keyPrefix}externalId`,
                label: `Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра `id`. - [${labelPrefix}externalId]`,
                type: 'string',
            },
            ...DeliveryServiceDTO.fields(`${keyPrefix}deliveryService`, isInput),
            ...PalletsCountDTO.fields(`${keyPrefix}palletsCount`, isInput),
            {
                key: `${keyPrefix}orderIds`,
                label: `Идентификаторы заказов в отгрузке. - [${labelPrefix}orderIds]`,
                required: true,
                list: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}draftCount`,
                label: `Количество заказов, которое Маркет запланировал к отгрузке. - [${labelPrefix}draftCount]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}plannedCount`,
                label: `Количество заказов, которое Маркет подтвердил к отгрузке. - [${labelPrefix}plannedCount]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}factCount`,
                label: `Количество заказов, принятых в сортировочном центре или пункте приема. - [${labelPrefix}factCount]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}status`,
                ...ShipmentStatusType.fields(`${keyPrefix}status`, isInput),
            },
            {
                key: `${keyPrefix}statusDescription`,
                label: `Описание статуса отгрузки. - [${labelPrefix}statusDescription]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}statusUpdateTime`,
                label: `Время последнего изменения статуса отгрузки. - [${labelPrefix}statusUpdateTime]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'planIntervalFrom': bundle.inputData?.[`${keyPrefix}planIntervalFrom`],
            'planIntervalTo': bundle.inputData?.[`${keyPrefix}planIntervalTo`],
            'shipmentType': bundle.inputData?.[`${keyPrefix}shipmentType`],
            'warehouse': utils.removeIfEmpty(PartnerShipmentWarehouseDTO.mapping(bundle, `${keyPrefix}warehouse`)),
            'warehouseTo': utils.removeIfEmpty(PartnerShipmentWarehouseDTO.mapping(bundle, `${keyPrefix}warehouseTo`)),
            'externalId': bundle.inputData?.[`${keyPrefix}externalId`],
            'deliveryService': utils.removeIfEmpty(DeliveryServiceDTO.mapping(bundle, `${keyPrefix}deliveryService`)),
            'palletsCount': utils.removeIfEmpty(PalletsCountDTO.mapping(bundle, `${keyPrefix}palletsCount`)),
            'orderIds': bundle.inputData?.[`${keyPrefix}orderIds`],
            'draftCount': bundle.inputData?.[`${keyPrefix}draftCount`],
            'plannedCount': bundle.inputData?.[`${keyPrefix}plannedCount`],
            'factCount': bundle.inputData?.[`${keyPrefix}factCount`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'statusDescription': bundle.inputData?.[`${keyPrefix}statusDescription`],
            'statusUpdateTime': bundle.inputData?.[`${keyPrefix}statusUpdateTime`],
        }
    },
}
