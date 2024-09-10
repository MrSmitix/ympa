//
// DeleteHiddenOffersRequest.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Запрос на возобновление показа оферов. */
public struct DeleteHiddenOffersRequest: Codable, JSONEncodable, Hashable {

    static let hiddenOffersRule = ArrayRule(minItems: 1, maxItems: 500, uniqueItems: false)
    /** Список скрытых товаров.  */
    public var hiddenOffers: [HiddenOfferDTO]

    public init(hiddenOffers: [HiddenOfferDTO]) {
        self.hiddenOffers = hiddenOffers
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case hiddenOffers
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(hiddenOffers, forKey: .hiddenOffers)
    }
}

