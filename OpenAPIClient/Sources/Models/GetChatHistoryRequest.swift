//
// GetChatHistoryRequest.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

/// Историю какого чата нужно получить — и начиная с какого сообщения.  
public struct GetChatHistoryRequest: Codable {
    /// Идентификатор сообщения, начиная с которого нужно получить все последующие сообщения.
    public var messageIdFrom: Int64?

    public init(messageIdFrom: Int64? = nil) {
        self.messageIdFrom = messageIdFrom
    }
}
