//
// OutletAddressDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Адрес точки продаж.  */
public struct OutletAddressDTO: Codable, JSONEncodable, Hashable {

    static let streetRule = StringRule(minLength: nil, maxLength: 512, pattern: nil)
    static let numberRule = StringRule(minLength: nil, maxLength: 256, pattern: nil)
    static let buildingRule = StringRule(minLength: nil, maxLength: 16, pattern: nil)
    static let estateRule = StringRule(minLength: nil, maxLength: 16, pattern: nil)
    static let blockRule = StringRule(minLength: nil, maxLength: 16, pattern: nil)
    static let cityRule = StringRule(minLength: nil, maxLength: 200, pattern: nil)
    /** Идентификатор региона.  Идентификатор можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  {% note alert %}  При создании и редактировании точек продаж можно указывать только регионы типов `TOWN` (город), `CITY` (крупный город) и `REPUBLIC_AREA` (район субъекта федерации). Тип региона указан в выходных параметрах type запросов [GET regions](../../reference/regions/searchRegionsByName.md) и [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  {% endnote %}  */
    public var regionId: Int64
    /** Улица. */
    public var street: String?
    /** Номер дома. */
    public var number: String?
    /** Номер строения. */
    public var building: String?
    /** Номер владения. */
    public var estate: String?
    /** Номер корпуса. */
    public var block: String?
    /** Дополнительная информация. */
    public var additional: String?
    /** Порядковый номер километра дороги, на котором располагается точка продаж, если отсутствует улица. */
    public var km: Int?
    /** {% note warning \"\" %}  Этот параметр устарел. Не используйте его. Город или населенный пункт возвращается в параметре `regionId`.  {% endnote %}  */
    public var city: String?

    public init(regionId: Int64, street: String? = nil, number: String? = nil, building: String? = nil, estate: String? = nil, block: String? = nil, additional: String? = nil, km: Int? = nil, city: String? = nil) {
        self.regionId = regionId
        self.street = street
        self.number = number
        self.building = building
        self.estate = estate
        self.block = block
        self.additional = additional
        self.km = km
        self.city = city
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case regionId
        case street
        case number
        case building
        case estate
        case block
        case additional
        case km
        case city
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(regionId, forKey: .regionId)
        try container.encodeIfPresent(street, forKey: .street)
        try container.encodeIfPresent(number, forKey: .number)
        try container.encodeIfPresent(building, forKey: .building)
        try container.encodeIfPresent(estate, forKey: .estate)
        try container.encodeIfPresent(block, forKey: .block)
        try container.encodeIfPresent(additional, forKey: .additional)
        try container.encodeIfPresent(km, forKey: .km)
        try container.encodeIfPresent(city, forKey: .city)
    }
}

