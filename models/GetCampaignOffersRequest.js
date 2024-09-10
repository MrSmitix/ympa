const utils = require('../utils/utils');
const OfferCampaignStatusType = require('../models/OfferCampaignStatusType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}offerIds`,
                label: `Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit`  {% endnote %}     - [${labelPrefix}offerIds]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}statuses`,
                list: true,
                type: 'string',
                ...OfferCampaignStatusType.fields(`${keyPrefix}statuses`, isInput),
            },
            {
                key: `${keyPrefix}categoryIds`,
                label: `Фильтр по категориям на Маркете. - [${labelPrefix}categoryIds]`,
                list: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}vendorNames`,
                label: `Фильтр по брендам. - [${labelPrefix}vendorNames]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}tags`,
                label: `Фильтр по тегам. - [${labelPrefix}tags]`,
                list: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'offerIds': bundle.inputData?.[`${keyPrefix}offerIds`],
            'statuses': utils.childMapping(bundle.inputData?.[`${keyPrefix}statuses`], `${keyPrefix}statuses`, OfferCampaignStatusType),
            'categoryIds': bundle.inputData?.[`${keyPrefix}categoryIds`],
            'vendorNames': bundle.inputData?.[`${keyPrefix}vendorNames`],
            'tags': bundle.inputData?.[`${keyPrefix}tags`],
        }
    },
}
