//
// GetOrdersStatsResponse.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

/// Ответ на запрос информации по заказам. 
public struct GetOrdersStatsResponse: Codable {
    public var status: ApiResponseStatusType?
    public var result: OrdersStatsDTO?

    public init(status: ApiResponseStatusType? = nil, result: OrdersStatsDTO? = nil) {
        self.status = status
        self.result = result
    }
}
