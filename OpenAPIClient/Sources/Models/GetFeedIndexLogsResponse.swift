//
// GetFeedIndexLogsResponse.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

public struct GetFeedIndexLogsResponse: Codable {
    public var status: ApiResponseStatusType?
    public var result: FeedIndexLogsResultDTO?

    public init(status: ApiResponseStatusType? = nil, result: FeedIndexLogsResultDTO? = nil) {
        self.status = status
        self.result = result
    }
}
