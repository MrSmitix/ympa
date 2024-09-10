const utils = require('../utils/utils');
const OrdersStatsPaymentOrderDTO = require('../models/OrdersStatsPaymentOrderDTO');
const OrdersStatsPaymentSourceType = require('../models/OrdersStatsPaymentSourceType');
const OrdersStatsPaymentType = require('../models/OrdersStatsPaymentType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `Идентификатор денежного перевода. - [${labelPrefix}id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}date`,
                label: `Дата денежного перевода.  Формат даты: `ГГГГ-ММ-ДД`.  - [${labelPrefix}date]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}type`,
                ...OrdersStatsPaymentType.fields(`${keyPrefix}type`, isInput),
            },
            {
                key: `${keyPrefix}source`,
                ...OrdersStatsPaymentSourceType.fields(`${keyPrefix}source`, isInput),
            },
            {
                key: `${keyPrefix}total`,
                label: `Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой.  - [${labelPrefix}total]`,
                type: 'number',
            },
            ...OrdersStatsPaymentOrderDTO.fields(`${keyPrefix}paymentOrder`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'date': bundle.inputData?.[`${keyPrefix}date`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'source': bundle.inputData?.[`${keyPrefix}source`],
            'total': bundle.inputData?.[`${keyPrefix}total`],
            'paymentOrder': utils.removeIfEmpty(OrdersStatsPaymentOrderDTO.mapping(bundle, `${keyPrefix}paymentOrder`)),
        }
    },
}
