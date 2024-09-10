const utils = require('../utils/utils');
const OfferCardStatusType = require('../models/OfferCardStatusType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}offerIds`,
                label: `Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте: * `page_token`; * `limit`; * `cardStatuses`; * `categoryIds`; * `vendorNames`; * `tags`; * `archived`.  {% endnote %}     - [${labelPrefix}offerIds]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}cardStatuses`,
                list: true,
                type: 'string',
                ...OfferCardStatusType.fields(`${keyPrefix}cardStatuses`, isInput),
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
            {
                key: `${keyPrefix}archived`,
                label: `Фильтр по нахождению в архиве.  Передайте `true`, чтобы получить товары, находящиеся в архиве. Если фильтр не заполнен или передано `false`, в ответе возвращаются товары, не находящиеся в архиве.  - [${labelPrefix}archived]`,
                type: 'boolean',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'offerIds': bundle.inputData?.[`${keyPrefix}offerIds`],
            'cardStatuses': utils.childMapping(bundle.inputData?.[`${keyPrefix}cardStatuses`], `${keyPrefix}cardStatuses`, OfferCardStatusType),
            'categoryIds': bundle.inputData?.[`${keyPrefix}categoryIds`],
            'vendorNames': bundle.inputData?.[`${keyPrefix}vendorNames`],
            'tags': bundle.inputData?.[`${keyPrefix}tags`],
            'archived': bundle.inputData?.[`${keyPrefix}archived`],
        }
    },
}
