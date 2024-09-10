//
// GetPricesByOfferIdsRequest.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

/// Запрос списка цен. 
public struct GetPricesByOfferIdsRequest: Codable {
    /// Список SKU.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit`  {% endnote %}    
    public var offerIds: [String]?

    public init(offerIds: [String]? = nil) {
        self.offerIds = offerIds
    }
}
