//
// CampaignSettingsDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

/// Настройки магазина. 
public struct CampaignSettingsDTO: Codable {
    /// Идентификатор региона, в котором находится магазин.
    public var countryRegion: Int64?
    /// Наименование магазина на Яндекс Маркете. Если наименование отсутствует, значение параметра выводится — `null`. 
    public var shopName: String?
    /// Признак размещения магазина на сайтах партнеров Яндекс Дистрибуции. Возможные значения: * `false` — магазин не размещен на сайтах партнеров Яндекс Дистрибуции. * `true` — магазин размещен на сайтах партнеров Яндекс Дистрибуции. 
    public var showInContext: Bool?
    /// Признак показа предложений магазина в рекламном блоке над результатами поиска (cпецразмещение). Возможные значения: * `false` — предложения не показываются в блоке cпецразмещения. * `true` — предложения показываются в блоке cпецразмещения. 
    public var showInPremium: Bool?
    /// Признак использования внешней интернет-статистики. Возможные значения: * `false` — внешняя интернет-статистика не используется. * `true` — внешняя интернет-статистика используется. 
    public var useOpenStat: Bool?
    public var localRegion: CampaignSettingsLocalRegionDTO?

    public init(countryRegion: Int64? = nil, shopName: String? = nil, showInContext: Bool? = nil, showInPremium: Bool? = nil, useOpenStat: Bool? = nil, localRegion: CampaignSettingsLocalRegionDTO? = nil) {
        self.countryRegion = countryRegion
        self.shopName = shopName
        self.showInContext = showInContext
        self.showInPremium = showInPremium
        self.useOpenStat = useOpenStat
        self.localRegion = localRegion
    }
}
