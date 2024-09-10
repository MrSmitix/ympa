//
// EnrichedModelDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Модель товара. */
public struct EnrichedModelDTO: Codable, JSONEncodable, Hashable {

    /** Идентификатор модели товара. */
    public var id: Int64?
    /** Название модели товара. */
    public var name: String?
    public var prices: ModelPriceDTO?
    /** Список первых десяти предложений, расположенных на карточке модели.  В ответе на запрос возвращаются предложения различных магазинов. Если есть несколько предложений от одного магазина, в ответе отображается только одно, наиболее релевантное из них.  */
    public var offers: [ModelOfferDTO]?
    /** Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина. */
    public var offlineOffers: Int?
    /** Суммарное количество предложений в интернет-магазинах в регионе. Учитываются все предложения от каждого магазина. */
    public var onlineOffers: Int?

    public init(id: Int64? = nil, name: String? = nil, prices: ModelPriceDTO? = nil, offers: [ModelOfferDTO]? = nil, offlineOffers: Int? = nil, onlineOffers: Int? = nil) {
        self.id = id
        self.name = name
        self.prices = prices
        self.offers = offers
        self.offlineOffers = offlineOffers
        self.onlineOffers = onlineOffers
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case id
        case name
        case prices
        case offers
        case offlineOffers
        case onlineOffers
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(id, forKey: .id)
        try container.encodeIfPresent(name, forKey: .name)
        try container.encodeIfPresent(prices, forKey: .prices)
        try container.encodeIfPresent(offers, forKey: .offers)
        try container.encodeIfPresent(offlineOffers, forKey: .offlineOffers)
        try container.encodeIfPresent(onlineOffers, forKey: .onlineOffers)
    }
}

