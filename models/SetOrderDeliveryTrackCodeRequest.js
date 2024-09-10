const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}trackCode`,
                label: `Трек‑номер посылки. - [${labelPrefix}trackCode]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}deliveryServiceId`,
                label: `Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md). - [${labelPrefix}deliveryServiceId]`,
                required: true,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'trackCode': bundle.inputData?.[`${keyPrefix}trackCode`],
            'deliveryServiceId': bundle.inputData?.[`${keyPrefix}deliveryServiceId`],
        }
    },
}
