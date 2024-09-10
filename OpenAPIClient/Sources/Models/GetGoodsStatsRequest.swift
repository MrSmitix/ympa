//
// GetGoodsStatsRequest.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

/// Запрос отчета по товарам. 
public struct GetGoodsStatsRequest: Codable {
    /// Список ваших идентификаторов SKU. 
    public var shopSkus: [String]

    public init(shopSkus: [String]) {
        self.shopSkus = shopSkus
    }
}
