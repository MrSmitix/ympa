//
// DeletePromoOffersResultDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Результат удаления товаров из акции.  Возвращается, только если в запросе был передан параметр &#x60;offerIds&#x60;.  */
public struct DeletePromoOffersResultDTO: Codable, JSONEncodable, Hashable {

    /** Товары, при удалении которых появились ошибки.  Возвращается, только если есть такие товары.  */
    public var rejectedOffers: [RejectedPromoOfferDeleteDTO]?

    public init(rejectedOffers: [RejectedPromoOfferDeleteDTO]? = nil) {
        self.rejectedOffers = rejectedOffers
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case rejectedOffers
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(rejectedOffers, forKey: .rejectedOffers)
    }
}

