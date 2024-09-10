const utils = require('../utils/utils');
const GetMappingDTO = require('../models/GetMappingDTO');
const OfferCardRecommendationDTO = require('../models/OfferCardRecommendationDTO');
const OfferCardStatusType = require('../models/OfferCardStatusType');
const OfferErrorDTO = require('../models/OfferErrorDTO');
const ParameterValueDTO = require('../models/ParameterValueDTO');

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
            ...GetMappingDTO.fields(`${keyPrefix}mapping`, isInput),
            {
                key: `${keyPrefix}parameterValues`,
                label: `[${labelPrefix}parameterValues]`,
                children: ParameterValueDTO.fields(`${keyPrefix}parameterValues${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}cardStatus`,
                ...OfferCardStatusType.fields(`${keyPrefix}cardStatus`, isInput),
            },
            {
                key: `${keyPrefix}contentRating`,
                label: `Процент заполненности карточки. - [${labelPrefix}contentRating]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}recommendations`,
                label: `[${labelPrefix}recommendations]`,
                children: OfferCardRecommendationDTO.fields(`${keyPrefix}recommendations${!isInput ? '[]' : ''}`, isInput, true), 
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
            'mapping': utils.removeIfEmpty(GetMappingDTO.mapping(bundle, `${keyPrefix}mapping`)),
            'parameterValues': utils.childMapping(bundle.inputData?.[`${keyPrefix}parameterValues`], `${keyPrefix}parameterValues`, ParameterValueDTO),
            'cardStatus': bundle.inputData?.[`${keyPrefix}cardStatus`],
            'contentRating': bundle.inputData?.[`${keyPrefix}contentRating`],
            'recommendations': utils.childMapping(bundle.inputData?.[`${keyPrefix}recommendations`], `${keyPrefix}recommendations`, OfferCardRecommendationDTO),
            'errors': utils.childMapping(bundle.inputData?.[`${keyPrefix}errors`], `${keyPrefix}errors`, OfferErrorDTO),
            'warnings': utils.childMapping(bundle.inputData?.[`${keyPrefix}warnings`], `${keyPrefix}warnings`, OfferErrorDTO),
        }
    },
}
