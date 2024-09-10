const utils = require('../utils/utils');
const LogisticPickupPointDTO = require('../models/LogisticPickupPointDTO');
const RecipientType = require('../models/RecipientType');
const RefundStatusType = require('../models/RefundStatusType');
const ReturnItemDTO = require('../models/ReturnItemDTO');
const ReturnShipmentStatusType = require('../models/ReturnShipmentStatusType');
const ReturnType = require('../models/ReturnType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `Идентификатор возврата. - [${labelPrefix}id]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}orderId`,
                label: `Номер заказа. - [${labelPrefix}orderId]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}creationDate`,
                label: `Дата создания возврата клиентом. - [${labelPrefix}creationDate]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}updateDate`,
                label: `Дата обновления возврата. - [${labelPrefix}updateDate]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}refundStatus`,
                ...RefundStatusType.fields(`${keyPrefix}refundStatus`, isInput),
            },
            ...LogisticPickupPointDTO.fields(`${keyPrefix}logisticPickupPoint`, isInput),
            {
                key: `${keyPrefix}shipmentRecipientType`,
                ...RecipientType.fields(`${keyPrefix}shipmentRecipientType`, isInput),
            },
            {
                key: `${keyPrefix}shipmentStatus`,
                ...ReturnShipmentStatusType.fields(`${keyPrefix}shipmentStatus`, isInput),
            },
            {
                key: `${keyPrefix}refundAmount`,
                label: `Сумма возврата. - [${labelPrefix}refundAmount]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}items`,
                label: `[${labelPrefix}items]`,
                children: ReturnItemDTO.fields(`${keyPrefix}items${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}returnType`,
                ...ReturnType.fields(`${keyPrefix}returnType`, isInput),
            },
            {
                key: `${keyPrefix}fastReturn`,
                label: `Используется ли опция **Быстрый возврат денег за дешевый брак**.  - [${labelPrefix}fastReturn]`,
                type: 'boolean',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'orderId': bundle.inputData?.[`${keyPrefix}orderId`],
            'creationDate': bundle.inputData?.[`${keyPrefix}creationDate`],
            'updateDate': bundle.inputData?.[`${keyPrefix}updateDate`],
            'refundStatus': bundle.inputData?.[`${keyPrefix}refundStatus`],
            'logisticPickupPoint': utils.removeIfEmpty(LogisticPickupPointDTO.mapping(bundle, `${keyPrefix}logisticPickupPoint`)),
            'shipmentRecipientType': bundle.inputData?.[`${keyPrefix}shipmentRecipientType`],
            'shipmentStatus': bundle.inputData?.[`${keyPrefix}shipmentStatus`],
            'refundAmount': bundle.inputData?.[`${keyPrefix}refundAmount`],
            'items': utils.childMapping(bundle.inputData?.[`${keyPrefix}items`], `${keyPrefix}items`, ReturnItemDTO),
            'returnType': bundle.inputData?.[`${keyPrefix}returnType`],
            'fastReturn': bundle.inputData?.[`${keyPrefix}fastReturn`],
        }
    },
}
