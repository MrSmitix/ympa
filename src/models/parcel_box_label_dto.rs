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

/// ParcelBoxLabelDto : Информация о ярлыке для коробки.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct ParcelBoxLabelDto {
    /// Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md). 
    #[serde(rename = "url")]
    pub url: String,
    /// Юридическое название магазина.
    #[serde(rename = "supplierName")]
    pub supplier_name: String,
    /// Юридическое название службы доставки.
    #[serde(rename = "deliveryServiceName")]
    pub delivery_service_name: String,
    /// Идентификатор заказа в системе Маркета.
    #[serde(rename = "orderId")]
    pub order_id: i64,
    /// Идентификатор заказа в информационной системе магазина.  Совпадает с `orderId`, если Маркету неизвестен номер заказа в системе магазина. 
    #[serde(rename = "orderNum")]
    pub order_num: String,
    /// Фамилия и инициалы получателя заказа.
    #[serde(rename = "recipientName")]
    pub recipient_name: String,
    /// Идентификатор коробки.
    #[serde(rename = "boxId")]
    pub box_id: i64,
    /// Идентификатор коробки в информационной системе магазина.  Возвращается в формате: `номер заказа на Маркете-номер коробки`. Например, `7206821‑1`, `7206821‑2` и т. д. 
    #[serde(rename = "fulfilmentId")]
    pub fulfilment_id: String,
    /// Номер коробки в заказе. Возвращается в формате: `номер места/общее количество мест`. 
    #[serde(rename = "place")]
    pub place: String,
    /// {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Общая масса всех товаров в заказе. Возвращается в формате: `weight кг`. 
    #[serde(rename = "weight")]
    pub weight: String,
    /// Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
    #[serde(rename = "deliveryServiceId")]
    pub delivery_service_id: String,
    /// Адрес получателя.
    #[serde(rename = "deliveryAddress", skip_serializing_if = "Option::is_none")]
    pub delivery_address: Option<String>,
    /// Дата отгрузки в формате `dd.MM.yyyy`.
    #[serde(rename = "shipmentDate", skip_serializing_if = "Option::is_none")]
    pub shipment_date: Option<String>,
}

impl ParcelBoxLabelDto {
    /// Информация о ярлыке для коробки.
    pub fn new(url: String, supplier_name: String, delivery_service_name: String, order_id: i64, order_num: String, recipient_name: String, box_id: i64, fulfilment_id: String, place: String, weight: String, delivery_service_id: String) -> ParcelBoxLabelDto {
        ParcelBoxLabelDto {
            url,
            supplier_name,
            delivery_service_name,
            order_id,
            order_num,
            recipient_name,
            box_id,
            fulfilment_id,
            place,
            weight,
            delivery_service_id,
            delivery_address: None,
            shipment_date: None,
        }
    }
}

