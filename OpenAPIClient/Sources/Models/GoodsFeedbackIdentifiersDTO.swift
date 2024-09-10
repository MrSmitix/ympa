//
// GoodsFeedbackIdentifiersDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

/// Идентификаторы, которые связаны с отзывом. 
public struct GoodsFeedbackIdentifiersDTO: Codable {
    /// Идентификатор заказа на Маркете.
    public var orderId: Int64
    /// Идентификатор модели товара.
    public var modelId: Int64

    public init(orderId: Int64, modelId: Int64) {
        self.orderId = orderId
        self.modelId = modelId
    }
}
