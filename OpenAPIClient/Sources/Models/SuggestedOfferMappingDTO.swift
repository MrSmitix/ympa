//
// SuggestedOfferMappingDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

/// Товар с соответствующей карточкой на Маркете. 
public struct SuggestedOfferMappingDTO: Codable {
    public var offer: SuggestedOfferDTO?
    public var mapping: GetMappingDTO?

    public init(offer: SuggestedOfferDTO? = nil, mapping: GetMappingDTO? = nil) {
        self.offer = offer
        self.mapping = mapping
    }
}
