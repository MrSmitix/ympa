const utils = require('../utils/utils');
const OrderStatsStatusType = require('../models/OrderStatsStatusType');
const OrdersStatsCommissionDTO = require('../models/OrdersStatsCommissionDTO');
const OrdersStatsDeliveryRegionDTO = require('../models/OrdersStatsDeliveryRegionDTO');
const OrdersStatsItemDTO = require('../models/OrdersStatsItemDTO');
const OrdersStatsOrderPaymentType = require('../models/OrdersStatsOrderPaymentType');
const OrdersStatsPaymentDTO = require('../models/OrdersStatsPaymentDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `Идентификатор заказа. - [${labelPrefix}id]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}creationDate`,
                label: `Дата создания заказа.  Формат даты: `ГГГГ-ММ-ДД`.  - [${labelPrefix}creationDate]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}statusUpdateDate`,
                label: `Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, `2017-11-21T00:00:00`. Часовой пояс — UTC+03:00 (Москва).  - [${labelPrefix}statusUpdateDate]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}status`,
                ...OrderStatsStatusType.fields(`${keyPrefix}status`, isInput),
            },
            {
                key: `${keyPrefix}partnerOrderId`,
                label: `Идентификатор заказа в информационной системе магазина. - [${labelPrefix}partnerOrderId]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}paymentType`,
                ...OrdersStatsOrderPaymentType.fields(`${keyPrefix}paymentType`, isInput),
            },
            {
                key: `${keyPrefix}fake`,
                label: `Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  - [${labelPrefix}fake]`,
                type: 'boolean',
            },
            ...OrdersStatsDeliveryRegionDTO.fields(`${keyPrefix}deliveryRegion`, isInput),
            {
                key: `${keyPrefix}items`,
                label: `[${labelPrefix}items]`,
                children: OrdersStatsItemDTO.fields(`${keyPrefix}items${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}initialItems`,
                label: `[${labelPrefix}initialItems]`,
                children: OrdersStatsItemDTO.fields(`${keyPrefix}initialItems${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}payments`,
                label: `[${labelPrefix}payments]`,
                children: OrdersStatsPaymentDTO.fields(`${keyPrefix}payments${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}commissions`,
                label: `[${labelPrefix}commissions]`,
                children: OrdersStatsCommissionDTO.fields(`${keyPrefix}commissions${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'creationDate': bundle.inputData?.[`${keyPrefix}creationDate`],
            'statusUpdateDate': bundle.inputData?.[`${keyPrefix}statusUpdateDate`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'partnerOrderId': bundle.inputData?.[`${keyPrefix}partnerOrderId`],
            'paymentType': bundle.inputData?.[`${keyPrefix}paymentType`],
            'fake': bundle.inputData?.[`${keyPrefix}fake`],
            'deliveryRegion': utils.removeIfEmpty(OrdersStatsDeliveryRegionDTO.mapping(bundle, `${keyPrefix}deliveryRegion`)),
            'items': utils.childMapping(bundle.inputData?.[`${keyPrefix}items`], `${keyPrefix}items`, OrdersStatsItemDTO),
            'initialItems': utils.childMapping(bundle.inputData?.[`${keyPrefix}initialItems`], `${keyPrefix}initialItems`, OrdersStatsItemDTO),
            'payments': utils.childMapping(bundle.inputData?.[`${keyPrefix}payments`], `${keyPrefix}payments`, OrdersStatsPaymentDTO),
            'commissions': utils.childMapping(bundle.inputData?.[`${keyPrefix}commissions`], `${keyPrefix}commissions`, OrdersStatsCommissionDTO),
        }
    },
}
