//
// OrderItemsModificationRequestReasonType.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

/// Причина обновления состава заказа. 
public enum OrderItemsModificationRequestReasonType: String, Codable, CaseIterable {
    case partnerRequestedRemove = "PARTNER_REQUESTED_REMOVE"
    case userRequestedRemove = "USER_REQUESTED_REMOVE"
}
