const utils = require('../utils/utils');
const PromoOfferUpdateWarningCodeType = require('../models/PromoOfferUpdateWarningCodeType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}code`,
                ...PromoOfferUpdateWarningCodeType.fields(`${keyPrefix}code`, isInput),
            },
            {
                key: `${keyPrefix}campaignIds`,
                label: `Идентификаторы магазинов в кабинете, для которых получены предупреждения.  Не возвращается, если предупреждения действуют для всех магазинов в кабинете.  - [${labelPrefix}campaignIds]`,
                list: true,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'code': bundle.inputData?.[`${keyPrefix}code`],
            'campaignIds': bundle.inputData?.[`${keyPrefix}campaignIds`],
        }
    },
}
