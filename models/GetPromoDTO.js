const utils = require('../utils/utils');
const ChannelType = require('../models/ChannelType');
const GetPromoAssortmentInfoDTO = require('../models/GetPromoAssortmentInfoDTO');
const GetPromoBestsellerInfoDTO = require('../models/GetPromoBestsellerInfoDTO');
const GetPromoConstraintsDTO = require('../models/GetPromoConstraintsDTO');
const GetPromoMechanicsInfoDTO = require('../models/GetPromoMechanicsInfoDTO');
const PromoPeriodDTO = require('../models/PromoPeriodDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `Идентификатор акции. - [${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}name`,
                label: `Название акции. - [${labelPrefix}name]`,
                required: true,
                type: 'string',
            },
            ...PromoPeriodDTO.fields(`${keyPrefix}period`, isInput),
            {
                key: `${keyPrefix}participating`,
                label: `Участвует или участвовал ли продавец в этой акции.  Для текущих и будущих акций возвращается со значением `true`, если в акции есть товары, которые были добавлены вручную. Если товары не участвуют в акции или добавлены в нее автоматически, параметр возвращается со значением `false`.  Для прошедших акций всегда возвращается со значением `true`.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index).  - [${labelPrefix}participating]`,
                required: true,
                type: 'boolean',
            },
            ...GetPromoAssortmentInfoDTO.fields(`${keyPrefix}assortmentInfo`, isInput),
            ...GetPromoMechanicsInfoDTO.fields(`${keyPrefix}mechanicsInfo`, isInput),
            ...GetPromoBestsellerInfoDTO.fields(`${keyPrefix}bestsellerInfo`, isInput),
            {
                key: `${keyPrefix}channels`,
                list: true,
                type: 'string',
                ...ChannelType.fields(`${keyPrefix}channels`, isInput),
            },
            ...GetPromoConstraintsDTO.fields(`${keyPrefix}constraints`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'period': utils.removeIfEmpty(PromoPeriodDTO.mapping(bundle, `${keyPrefix}period`)),
            'participating': bundle.inputData?.[`${keyPrefix}participating`],
            'assortmentInfo': utils.removeIfEmpty(GetPromoAssortmentInfoDTO.mapping(bundle, `${keyPrefix}assortmentInfo`)),
            'mechanicsInfo': utils.removeIfEmpty(GetPromoMechanicsInfoDTO.mapping(bundle, `${keyPrefix}mechanicsInfo`)),
            'bestsellerInfo': utils.removeIfEmpty(GetPromoBestsellerInfoDTO.mapping(bundle, `${keyPrefix}bestsellerInfo`)),
            'channels': utils.childMapping(bundle.inputData?.[`${keyPrefix}channels`], `${keyPrefix}channels`, ChannelType),
            'constraints': utils.removeIfEmpty(GetPromoConstraintsDTO.mapping(bundle, `${keyPrefix}constraints`)),
        }
    },
}
