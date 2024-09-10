//
// WarehouseGroupDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Информация о группе складов. */
public struct WarehouseGroupDTO: Codable, JSONEncodable, Hashable {

    /** Название группы складов. */
    public var name: String
    public var mainWarehouse: WarehouseDTO
    /** Список складов, входящих в группу. */
    public var warehouses: [WarehouseDTO]

    public init(name: String, mainWarehouse: WarehouseDTO, warehouses: [WarehouseDTO]) {
        self.name = name
        self.mainWarehouse = mainWarehouse
        self.warehouses = warehouses
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case name
        case mainWarehouse
        case warehouses
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(name, forKey: .name)
        try container.encode(mainWarehouse, forKey: .mainWarehouse)
        try container.encode(warehouses, forKey: .warehouses)
    }
}

