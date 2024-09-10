const utils = require('../utils/utils');
const CampaignSettingsLocalRegionDTO = require('../models/CampaignSettingsLocalRegionDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}countryRegion`,
                label: `Идентификатор региона, в котором находится магазин. - [${labelPrefix}countryRegion]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}shopName`,
                label: `Наименование магазина на Яндекс Маркете. Если наименование отсутствует, значение параметра выводится — `null`.  - [${labelPrefix}shopName]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}showInContext`,
                label: `Признак размещения магазина на сайтах партнеров Яндекс Дистрибуции. Возможные значения: * `false` — магазин не размещен на сайтах партнеров Яндекс Дистрибуции. * `true` — магазин размещен на сайтах партнеров Яндекс Дистрибуции.  - [${labelPrefix}showInContext]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}showInPremium`,
                label: `Признак показа предложений магазина в рекламном блоке над результатами поиска (cпецразмещение). Возможные значения: * `false` — предложения не показываются в блоке cпецразмещения. * `true` — предложения показываются в блоке cпецразмещения.  - [${labelPrefix}showInPremium]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}useOpenStat`,
                label: `Признак использования внешней интернет-статистики. Возможные значения: * `false` — внешняя интернет-статистика не используется. * `true` — внешняя интернет-статистика используется.  - [${labelPrefix}useOpenStat]`,
                type: 'boolean',
            },
            ...CampaignSettingsLocalRegionDTO.fields(`${keyPrefix}localRegion`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'countryRegion': bundle.inputData?.[`${keyPrefix}countryRegion`],
            'shopName': bundle.inputData?.[`${keyPrefix}shopName`],
            'showInContext': bundle.inputData?.[`${keyPrefix}showInContext`],
            'showInPremium': bundle.inputData?.[`${keyPrefix}showInPremium`],
            'useOpenStat': bundle.inputData?.[`${keyPrefix}useOpenStat`],
            'localRegion': utils.removeIfEmpty(CampaignSettingsLocalRegionDTO.mapping(bundle, `${keyPrefix}localRegion`)),
        }
    },
}
