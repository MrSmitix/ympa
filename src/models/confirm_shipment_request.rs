/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 * Generated by: https://openapi-generator.tech
 */

use crate::models;
use serde::{Deserialize, Serialize};

/// ConfirmShipmentRequest : Запрос для подтверждения отгрузки.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct ConfirmShipmentRequest {
    /// Идентификатор отгрузки в системе поставщика.
    #[serde(rename = "externalShipmentId", skip_serializing_if = "Option::is_none")]
    pub external_shipment_id: Option<String>,
}

impl ConfirmShipmentRequest {
    /// Запрос для подтверждения отгрузки.
    pub fn new() -> ConfirmShipmentRequest {
        ConfirmShipmentRequest {
            external_shipment_id: None,
        }
    }
}

