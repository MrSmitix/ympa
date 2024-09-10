//
// UpdateOfferMappingsRequest.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct UpdateOfferMappingsRequest: Codable, JSONEncodable, Hashable {

    static let offerMappingsRule = ArrayRule(minItems: 1, maxItems: 500, uniqueItems: false)
    /** Перечень товаров, которые нужно добавить или обновить. */
    public var offerMappings: [UpdateOfferMappingDTO]
    /** Будут использоваться только переданные вами изображения товаров.  Значение по умолчанию — `false`. Если вы хотите заменить изображения, которые добавил Маркет, передайте значение `true`.  */
    public var onlyPartnerMediaContent: Bool?

    public init(offerMappings: [UpdateOfferMappingDTO], onlyPartnerMediaContent: Bool? = nil) {
        self.offerMappings = offerMappings
        self.onlyPartnerMediaContent = onlyPartnerMediaContent
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case offerMappings
        case onlyPartnerMediaContent
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(offerMappings, forKey: .offerMappings)
        try container.encodeIfPresent(onlyPartnerMediaContent, forKey: .onlyPartnerMediaContent)
    }
}

