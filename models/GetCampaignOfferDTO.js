const utils = require('../utils/utils');
const GetPriceWithDiscountDTO = require('../models/GetPriceWithDiscountDTO');
const GetPriceWithVatDTO = require('../models/GetPriceWithVatDTO');
const OfferCampaignStatusType = require('../models/OfferCampaignStatusType');
const OfferErrorDTO = require('../models/OfferErrorDTO');
const QuantumDTO = require('../models/QuantumDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}offerId`,
                label: `Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  - [${labelPrefix}offerId]`,
                required: true,
                type: 'string',
            },
            ...QuantumDTO.fields(`${keyPrefix}quantum`, isInput),
            {
                key: `${keyPrefix}available`,
                label: `Есть ли товар в продаже.  - [${labelPrefix}available]`,
                type: 'boolean',
            },
            ...GetPriceWithDiscountDTO.fields(`${keyPrefix}basicPrice`, isInput),
            ...GetPriceWithVatDTO.fields(`${keyPrefix}campaignPrice`, isInput),
            {
                key: `${keyPrefix}status`,
                ...OfferCampaignStatusType.fields(`${keyPrefix}status`, isInput),
            },
            {
                key: `${keyPrefix}errors`,
                label: `[${labelPrefix}errors]`,
                children: OfferErrorDTO.fields(`${keyPrefix}errors${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}warnings`,
                label: `[${labelPrefix}warnings]`,
                children: OfferErrorDTO.fields(`${keyPrefix}warnings${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'offerId': bundle.inputData?.[`${keyPrefix}offerId`],
            'quantum': utils.removeIfEmpty(QuantumDTO.mapping(bundle, `${keyPrefix}quantum`)),
            'available': bundle.inputData?.[`${keyPrefix}available`],
            'basicPrice': utils.removeIfEmpty(GetPriceWithDiscountDTO.mapping(bundle, `${keyPrefix}basicPrice`)),
            'campaignPrice': utils.removeIfEmpty(GetPriceWithVatDTO.mapping(bundle, `${keyPrefix}campaignPrice`)),
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'errors': utils.childMapping(bundle.inputData?.[`${keyPrefix}errors`], `${keyPrefix}errors`, OfferErrorDTO),
            'warnings': utils.childMapping(bundle.inputData?.[`${keyPrefix}warnings`], `${keyPrefix}warnings`, OfferErrorDTO),
        }
    },
}
