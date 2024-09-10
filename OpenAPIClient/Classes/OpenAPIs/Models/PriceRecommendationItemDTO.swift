//
// PriceRecommendationItemDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Рекомендованная цена. */
public struct PriceRecommendationItemDTO: Codable, JSONEncodable, Hashable {

    static let priceRule = NumericRule<Double>(minimum: 1, exclusiveMinimum: false, maximum: nil, exclusiveMaximum: false, multipleOf: nil)
    /** Идентификатор кампании. */
    public var campaignId: Int64
    /** Рекомендованная цена на товар. Чтобы продвижение хорошо работало, цена на товар должна быть не выше этого значения. [Подробно о рекомендованных ценах](https://yandex.ru/support/marketplace/marketing/campaigns.html#prices)  */
    public var price: Double

    public init(campaignId: Int64, price: Double) {
        self.campaignId = campaignId
        self.price = price
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case campaignId
        case price
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(campaignId, forKey: .campaignId)
        try container.encode(price, forKey: .price)
    }
}

