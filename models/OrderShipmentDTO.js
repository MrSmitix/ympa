const utils = require('../utils/utils');
const OrderParcelBoxDTO = require('../models/OrderParcelBoxDTO');
const OrderTrackDTO = require('../models/OrderTrackDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `Идентификатор посылки, присвоенный Маркетом. - [${labelPrefix}id]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}shipmentDate`,
                label: `Формат даты: `ДД-ММ-ГГГГ`.  - [${labelPrefix}shipmentDate]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}shipmentTime`,
                label: `**Только для модели Экспресс**  Время, к которому магазин должен упаковать заказ и перевести его в статус `READY_TO_SHIP`. После смены статуса за заказом приедет курьер.  Поле может появиться не сразу. Запрашивайте информацию о заказе в течении 5–10 минут, пока оно не вернется.  Формат времени: 24-часовой, `ЧЧ:ММ`.  Если заказ сделан организацией, параметр не возвращается до согласования даты доставки.  - [${labelPrefix}shipmentTime]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}tracks`,
                label: `[${labelPrefix}tracks]`,
                children: OrderTrackDTO.fields(`${keyPrefix}tracks${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}boxes`,
                label: `[${labelPrefix}boxes]`,
                children: OrderParcelBoxDTO.fields(`${keyPrefix}boxes${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'shipmentDate': bundle.inputData?.[`${keyPrefix}shipmentDate`],
            'shipmentTime': bundle.inputData?.[`${keyPrefix}shipmentTime`],
            'tracks': utils.childMapping(bundle.inputData?.[`${keyPrefix}tracks`], `${keyPrefix}tracks`, OrderTrackDTO),
            'boxes': utils.childMapping(bundle.inputData?.[`${keyPrefix}boxes`], `${keyPrefix}boxes`, OrderParcelBoxDTO),
        }
    },
}
