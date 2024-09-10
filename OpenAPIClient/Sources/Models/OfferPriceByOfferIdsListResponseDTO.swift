//
// OfferPriceByOfferIdsListResponseDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

/// Список цен. 
public struct OfferPriceByOfferIdsListResponseDTO: Codable {
    /// Страница списка цен.
    public var offers: [OfferPriceByOfferIdsResponseDTO]
    public var paging: ScrollingPagerDTO?

    public init(offers: [OfferPriceByOfferIdsResponseDTO], paging: ScrollingPagerDTO? = nil) {
        self.offers = offers
        self.paging = paging
    }
}
