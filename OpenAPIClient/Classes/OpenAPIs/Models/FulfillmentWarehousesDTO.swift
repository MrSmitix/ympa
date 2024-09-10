//
// FulfillmentWarehousesDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Список складов Маркета (FBY). */
public struct FulfillmentWarehousesDTO: Codable, JSONEncodable, Hashable {

    /** Список складов Маркета (FBY). */
    public var warehouses: [FulfillmentWarehouseDTO]

    public init(warehouses: [FulfillmentWarehouseDTO]) {
        self.warehouses = warehouses
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case warehouses
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(warehouses, forKey: .warehouses)
    }
}

