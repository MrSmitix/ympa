const utils = require('../utils/utils');
const OrderCourierDTO = require('../models/OrderCourierDTO');
const OrderDeliveryAddressDTO = require('../models/OrderDeliveryAddressDTO');
const OrderDeliveryDatesDTO = require('../models/OrderDeliveryDatesDTO');
const OrderDeliveryDispatchType = require('../models/OrderDeliveryDispatchType');
const OrderDeliveryEacType = require('../models/OrderDeliveryEacType');
const OrderDeliveryPartnerType = require('../models/OrderDeliveryPartnerType');
const OrderDeliveryType = require('../models/OrderDeliveryType');
const OrderLiftType = require('../models/OrderLiftType');
const OrderShipmentDTO = require('../models/OrderShipmentDTO');
const OrderTrackDTO = require('../models/OrderTrackDTO');
const OrderVatType = require('../models/OrderVatType');
const RegionDTO = require('../models/RegionDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md).  - [${labelPrefix}id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}type`,
                ...OrderDeliveryType.fields(`${keyPrefix}type`, isInput),
            },
            {
                key: `${keyPrefix}serviceName`,
                label: `Наименование службы доставки. - [${labelPrefix}serviceName]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}price`,
                label: `{% note warning \"\" %}  Этот параметр устарел. Стоимость доставки смотрите в параметре `deliveryTotal`.  {% endnote %}  Стоимость доставки в валюте заказа.  - [${labelPrefix}price]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}deliveryPartnerType`,
                ...OrderDeliveryPartnerType.fields(`${keyPrefix}deliveryPartnerType`, isInput),
            },
            ...OrderCourierDTO.fields(`${keyPrefix}courier`, isInput),
            ...OrderDeliveryDatesDTO.fields(`${keyPrefix}dates`, isInput),
            ...RegionDTO.fields(`${keyPrefix}region`, isInput),
            ...OrderDeliveryAddressDTO.fields(`${keyPrefix}address`, isInput),
            {
                key: `${keyPrefix}vat`,
                ...OrderVatType.fields(`${keyPrefix}vat`, isInput),
            },
            {
                key: `${keyPrefix}deliveryServiceId`,
                label: `Идентификатор службы доставки. - [${labelPrefix}deliveryServiceId]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}liftType`,
                ...OrderLiftType.fields(`${keyPrefix}liftType`, isInput),
            },
            {
                key: `${keyPrefix}liftPrice`,
                label: `Стоимость подъема на этаж. - [${labelPrefix}liftPrice]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}outletCode`,
                label: `Идентификатор пункта самовывоза, присвоенный магазином. - [${labelPrefix}outletCode]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}outletStorageLimitDate`,
                label: `Формат даты: `ДД-ММ-ГГГГ`.  - [${labelPrefix}outletStorageLimitDate]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}dispatchType`,
                ...OrderDeliveryDispatchType.fields(`${keyPrefix}dispatchType`, isInput),
            },
            {
                key: `${keyPrefix}tracks`,
                label: `[${labelPrefix}tracks]`,
                children: OrderTrackDTO.fields(`${keyPrefix}tracks${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}shipments`,
                label: `[${labelPrefix}shipments]`,
                children: OrderShipmentDTO.fields(`${keyPrefix}shipments${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}estimated`,
                label: `Приблизительная ли дата доставки. - [${labelPrefix}estimated]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}eacType`,
                ...OrderDeliveryEacType.fields(`${keyPrefix}eacType`, isInput),
            },
            {
                key: `${keyPrefix}eacCode`,
                label: `Код подтверждения ЭАПП (для типа `MERCHANT_TO_COURIER`).  - [${labelPrefix}eacCode]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'serviceName': bundle.inputData?.[`${keyPrefix}serviceName`],
            'price': bundle.inputData?.[`${keyPrefix}price`],
            'deliveryPartnerType': bundle.inputData?.[`${keyPrefix}deliveryPartnerType`],
            'courier': utils.removeIfEmpty(OrderCourierDTO.mapping(bundle, `${keyPrefix}courier`)),
            'dates': utils.removeIfEmpty(OrderDeliveryDatesDTO.mapping(bundle, `${keyPrefix}dates`)),
            'region': utils.removeIfEmpty(RegionDTO.mapping(bundle, `${keyPrefix}region`)),
            'address': utils.removeIfEmpty(OrderDeliveryAddressDTO.mapping(bundle, `${keyPrefix}address`)),
            'vat': bundle.inputData?.[`${keyPrefix}vat`],
            'deliveryServiceId': bundle.inputData?.[`${keyPrefix}deliveryServiceId`],
            'liftType': bundle.inputData?.[`${keyPrefix}liftType`],
            'liftPrice': bundle.inputData?.[`${keyPrefix}liftPrice`],
            'outletCode': bundle.inputData?.[`${keyPrefix}outletCode`],
            'outletStorageLimitDate': bundle.inputData?.[`${keyPrefix}outletStorageLimitDate`],
            'dispatchType': bundle.inputData?.[`${keyPrefix}dispatchType`],
            'tracks': utils.childMapping(bundle.inputData?.[`${keyPrefix}tracks`], `${keyPrefix}tracks`, OrderTrackDTO),
            'shipments': utils.childMapping(bundle.inputData?.[`${keyPrefix}shipments`], `${keyPrefix}shipments`, OrderShipmentDTO),
            'estimated': bundle.inputData?.[`${keyPrefix}estimated`],
            'eacType': bundle.inputData?.[`${keyPrefix}eacType`],
            'eacCode': bundle.inputData?.[`${keyPrefix}eacCode`],
        }
    },
}
