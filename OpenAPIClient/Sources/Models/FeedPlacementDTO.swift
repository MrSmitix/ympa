//
// FeedPlacementDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

/// Информация о размещении предложений из прайс-листа на Маркете на момент выполнения запроса. 
public struct FeedPlacementDTO: Codable {
    public var status: FeedStatusType?
    /// Количество предложений из прайс-листа, которые размещаются на Яндекс Маркете в момент выполнения запроса.
    public var totalOffersCount: Int?

    public init(status: FeedStatusType? = nil, totalOffersCount: Int? = nil) {
        self.status = status
        self.totalOffersCount = totalOffersCount
    }
}
