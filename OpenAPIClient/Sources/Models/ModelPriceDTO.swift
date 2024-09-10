//
// ModelPriceDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

/// Информация о ценах на модель товара. 
public struct ModelPriceDTO: Codable {
    /// Средняя цена предложения для модели в регионе.
    public var avg: Double?
    /// Максимальная цена предложения для модели в регионе.
    public var max: Double?
    /// Минимальная цена предложения для модели в регионе.
    public var min: Double?

    public init(avg: Double? = nil, max: Double? = nil, min: Double? = nil) {
        self.avg = avg
        self.max = max
        self.min = min
    }
}
