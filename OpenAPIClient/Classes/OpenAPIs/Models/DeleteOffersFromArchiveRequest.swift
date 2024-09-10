//
// DeleteOffersFromArchiveRequest.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Товары, которые нужно восстановить из архива.  */
public struct DeleteOffersFromArchiveRequest: Codable, JSONEncodable, Hashable {

    static let offerIdsRule = ArrayRule(minItems: 1, maxItems: 200, uniqueItems: false)
    /** Список товаров, которые нужно восстановить из архива. */
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

