//
// GetChatInfoDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

/// Информация о чатах. 
public struct GetChatInfoDTO: Codable {
    /// Идентификатор чата.
    public var chatId: Int64
    /// Идентификатор заказа.
    public var orderId: Int64
    public var type: ChatType
    public var status: ChatStatusType
    /// Дата и время создания чата.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
    public var createdAt: Date
    /// Дата и время последнего сообщения в чате.
    public var updatedAt: Date

    public init(chatId: Int64, orderId: Int64, type: ChatType, status: ChatStatusType, createdAt: Date, updatedAt: Date) {
        self.chatId = chatId
        self.orderId = orderId
        self.type = type
        self.status = status
        self.createdAt = createdAt
        self.updatedAt = updatedAt
    }
}
