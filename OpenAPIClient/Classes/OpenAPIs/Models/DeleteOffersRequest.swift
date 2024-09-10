//
// DeleteOffersRequest.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Фильтрации удаляемых товаров по offerIds.  */
public struct DeleteOffersRequest: Codable, JSONEncodable, Hashable {

    static let offerIdsRule = ArrayRule(minItems: 1, maxItems: 500, uniqueItems: false)
    /** Список SKU товаров, которые нужно удалить. */
    public var offerIds: [String]

    public init(offerIds: [String]) {
        self.offerIds = offerIds
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case offerIds
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(offerIds, forKey: .offerIds)
    }
}

