//
// GetPromoConstraintsDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Ограничения в акции. */
public struct GetPromoConstraintsDTO: Codable, JSONEncodable, Hashable {

    /** Идентификаторы складов, для которых действует акция. Товары, которые лежат на других складах, не будут продаваться по акции.  Параметр возвращается, только если в условиях акции есть ограничение по складу.  */
    public var warehouseIds: [Int64]?

    public init(warehouseIds: [Int64]? = nil) {
        self.warehouseIds = warehouseIds
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case warehouseIds
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(warehouseIds, forKey: .warehouseIds)
    }
}

