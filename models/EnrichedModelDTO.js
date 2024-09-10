const utils = require('../utils/utils');
const ModelOfferDTO = require('../models/ModelOfferDTO');
const ModelPriceDTO = require('../models/ModelPriceDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `Идентификатор модели товара. - [${labelPrefix}id]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}name`,
                label: `Название модели товара. - [${labelPrefix}name]`,
                type: 'string',
            },
            ...ModelPriceDTO.fields(`${keyPrefix}prices`, isInput),
            {
                key: `${keyPrefix}offers`,
                label: `[${labelPrefix}offers]`,
                children: ModelOfferDTO.fields(`${keyPrefix}offers${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}offlineOffers`,
                label: `Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина. - [${labelPrefix}offlineOffers]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}onlineOffers`,
                label: `Суммарное количество предложений в интернет-магазинах в регионе. Учитываются все предложения от каждого магазина. - [${labelPrefix}onlineOffers]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'prices': utils.removeIfEmpty(ModelPriceDTO.mapping(bundle, `${keyPrefix}prices`)),
            'offers': utils.childMapping(bundle.inputData?.[`${keyPrefix}offers`], `${keyPrefix}offers`, ModelOfferDTO),
            'offlineOffers': bundle.inputData?.[`${keyPrefix}offlineOffers`],
            'onlineOffers': bundle.inputData?.[`${keyPrefix}onlineOffers`],
        }
    },
}
