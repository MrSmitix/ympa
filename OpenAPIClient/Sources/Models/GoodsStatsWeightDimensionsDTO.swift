//
// GoodsStatsWeightDimensionsDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

/// Информация о весе и габаритах товара.  Если товар уже привязан к карточке (&#x60;marketSku&#x60;), в ответе вернутся габариты из карточки Маркета, а не размеры, которые вы передаете.  
public struct GoodsStatsWeightDimensionsDTO: Codable {
    /// Длина товара в сантиметрах.
    public var length: Double?
    /// Ширина товара в сантиметрах.
    public var width: Double?
    /// Высота товара в сантиметрах.
    public var height: Double?
    /// Вес товара в килограммах.
    public var weight: Double?

    public init(length: Double? = nil, width: Double? = nil, height: Double? = nil, weight: Double? = nil) {
        self.length = length
        self.width = width
        self.height = height
        self.weight = weight
    }
}
