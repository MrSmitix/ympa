//
// OfferMappingSuggestionsListDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

/// Список рекомендованных карточек товара. 
public struct OfferMappingSuggestionsListDTO: Codable {
    /// Список товаров.
    public var offers: [EnrichedMappingsOfferDTO]

    public init(offers: [EnrichedMappingsOfferDTO]) {
        self.offers = offers
    }
}
