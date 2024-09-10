const utils = require('../utils/utils');
const ParcelBoxLabelDTO = require('../models/ParcelBoxLabelDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}orderId`,
                label: `Идентификатор заказа. - [${labelPrefix}orderId]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}placesNumber`,
                label: `Количество коробок в заказе. - [${labelPrefix}placesNumber]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}url`,
                label: `URL файла с ярлыками‑наклейками на все коробки в заказе.  Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/labels](../../reference/orders/generateOrderLabels.md).  - [${labelPrefix}url]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}parcelBoxLabels`,
                label: `[${labelPrefix}parcelBoxLabels]`,
                children: ParcelBoxLabelDTO.fields(`${keyPrefix}parcelBoxLabels${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'orderId': bundle.inputData?.[`${keyPrefix}orderId`],
            'placesNumber': bundle.inputData?.[`${keyPrefix}placesNumber`],
            'url': bundle.inputData?.[`${keyPrefix}url`],
            'parcelBoxLabels': utils.childMapping(bundle.inputData?.[`${keyPrefix}parcelBoxLabels`], `${keyPrefix}parcelBoxLabels`, ParcelBoxLabelDTO),
        }
    },
}
