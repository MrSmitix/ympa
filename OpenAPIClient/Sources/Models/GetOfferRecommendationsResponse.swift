//
// GetOfferRecommendationsResponse.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

public struct GetOfferRecommendationsResponse: Codable {
    public var status: ApiResponseStatusType?
    public var result: OfferRecommendationsResultDTO?

    public init(status: ApiResponseStatusType? = nil, result: OfferRecommendationsResultDTO? = nil) {
        self.status = status
        self.result = result
    }
}
