//
// PartnerShipmentWarehouseDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Данные о складе отправления. */
public struct PartnerShipmentWarehouseDTO: Codable, JSONEncodable, Hashable {

    /** Идентификатор склада отправления. */
    public var id: Int64?
    /** Наименование склада отправления. */
    public var name: String?
    /** Адрес склада отправления. */
    public var address: String?

    public init(id: Int64? = nil, name: String? = nil, address: String? = nil) {
        self.id = id
        self.name = name
        self.address = address
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case id
        case name
        case address
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(id, forKey: .id)
        try container.encodeIfPresent(name, forKey: .name)
        try container.encodeIfPresent(address, forKey: .address)
    }
}

