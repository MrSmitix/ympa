//
// DeleteOffersFromArchiveDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Товары, которые не удалось восстановить из архива. */
public struct DeleteOffersFromArchiveDTO: Codable, JSONEncodable, Hashable {

    /** Список товаров, которые не удалось восстановить из архива. */
    public var notUnarchivedOfferIds: [String]?

    public init(notUnarchivedOfferIds: [String]? = nil) {
        self.notUnarchivedOfferIds = notUnarchivedOfferIds
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case notUnarchivedOfferIds
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(notUnarchivedOfferIds, forKey: .notUnarchivedOfferIds)
    }
}

