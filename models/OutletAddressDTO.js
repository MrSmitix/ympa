const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}regionId`,
                label: `Идентификатор региона.  Идентификатор можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  {% note alert %}  При создании и редактировании точек продаж можно указывать только регионы типов `TOWN` (город), `CITY` (крупный город) и `REPUBLIC_AREA` (район субъекта федерации). Тип региона указан в выходных параметрах type запросов [GET regions](../../reference/regions/searchRegionsByName.md) и [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  {% endnote %}  - [${labelPrefix}regionId]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}street`,
                label: `Улица. - [${labelPrefix}street]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}number`,
                label: `Номер дома. - [${labelPrefix}number]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}building`,
                label: `Номер строения. - [${labelPrefix}building]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}estate`,
                label: `Номер владения. - [${labelPrefix}estate]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}block`,
                label: `Номер корпуса. - [${labelPrefix}block]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}additional`,
                label: `Дополнительная информация. - [${labelPrefix}additional]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}km`,
                label: `Порядковый номер километра дороги, на котором располагается точка продаж, если отсутствует улица. - [${labelPrefix}km]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}city`,
                label: `{% note warning \"\" %}  Этот параметр устарел. Не используйте его. Город или населенный пункт возвращается в параметре `regionId`.  {% endnote %}  - [${labelPrefix}city]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'regionId': bundle.inputData?.[`${keyPrefix}regionId`],
            'street': bundle.inputData?.[`${keyPrefix}street`],
            'number': bundle.inputData?.[`${keyPrefix}number`],
            'building': bundle.inputData?.[`${keyPrefix}building`],
            'estate': bundle.inputData?.[`${keyPrefix}estate`],
            'block': bundle.inputData?.[`${keyPrefix}block`],
            'additional': bundle.inputData?.[`${keyPrefix}additional`],
            'km': bundle.inputData?.[`${keyPrefix}km`],
            'city': bundle.inputData?.[`${keyPrefix}city`],
        }
    },
}
