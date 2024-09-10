use async_trait::async_trait;
use axum::extract::*;
use axum_extra::extract::{CookieJar, Multipart};
use bytes::Bytes;
use http::Method;
use serde::{Deserialize, Serialize};

use crate::{models, types::*};

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ProvideOrderItemIdentifiersResponse {
    /// Ответ 200 обозначает, что коды успешно записались. Ответ содержит краткие сведения о промаркированных товарах.
    Status200
    (models::ProvideOrderItemIdentifiersResponse)
    ,
    /// Запрос содержит неправильные данные.
    Status400
    (models::ApiClientDataErrorResponse)
    ,
    /// В запросе не указаны данные для авторизации.
    Status401
    (models::ApiUnauthorizedErrorResponse)
    ,
    /// Данные для авторизации неверны или доступ к ресурсу запрещен.
    Status403
    (models::ApiForbiddenErrorResponse)
    ,
    /// Запрашиваемый ресурс не найден.
    Status404
    (models::ApiNotFoundErrorResponse)
    ,
    /// Превышено ограничение на доступ к ресурсу.
    Status420
    (models::ApiLimitErrorResponse)
    ,
    /// Внутренняя ошибка сервера.
    Status500
    (models::ApiServerErrorResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum SetOrderBoxLayoutResponse {
    /// В ответ придет переданная раскладка с идентификаторами коробок — они понадобятся для запроса ярлыков. 
    Status200
    (models::SetOrderBoxLayoutResponse)
    ,
    /// Запрос содержит неправильные данные.
    Status400
    (models::ApiClientDataErrorResponse)
    ,
    /// В запросе не указаны данные для авторизации.
    Status401
    (models::ApiUnauthorizedErrorResponse)
    ,
    /// Данные для авторизации неверны или доступ к ресурсу запрещен.
    Status403
    (models::ApiForbiddenErrorResponse)
    ,
    /// Запрашиваемый ресурс не найден.
    Status404
    (models::ApiNotFoundErrorResponse)
    ,
    /// Превышено ограничение на доступ к ресурсу.
    Status420
    (models::ApiLimitErrorResponse)
    ,
    /// Внутренняя ошибка сервера.
    Status500
    (models::ApiServerErrorResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum SetOrderShipmentBoxesResponse {
    /// Имеет значение только тип ответа. Если ответ `ОК`, количество грузомест записано.
    Status200
    (models::SetOrderShipmentBoxesResponse)
    ,
    /// Запрос содержит неправильные данные.
    Status400
    (models::ApiClientDataErrorResponse)
    ,
    /// В запросе не указаны данные для авторизации.
    Status401
    (models::ApiUnauthorizedErrorResponse)
    ,
    /// Данные для авторизации неверны или доступ к ресурсу запрещен.
    Status403
    (models::ApiForbiddenErrorResponse)
    ,
    /// Запрашиваемый ресурс не найден.
    Status404
    (models::ApiNotFoundErrorResponse)
    ,
    /// Превышено ограничение на доступ к ресурсу.
    Status420
    (models::ApiLimitErrorResponse)
    ,
    /// Внутренняя ошибка сервера.
    Status500
    (models::ApiServerErrorResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum UpdateOrderItemsResponse {
    /// Маркет успешно обработал ваш запрос. Выходные данные не ожидаются.
    Status200
    ,
    /// Запрос содержит неправильные данные.
    Status400
    (models::ApiClientDataErrorResponse)
    ,
    /// В запросе не указаны данные для авторизации.
    Status401
    (models::ApiUnauthorizedErrorResponse)
    ,
    /// Данные для авторизации неверны или доступ к ресурсу запрещен.
    Status403
    (models::ApiForbiddenErrorResponse)
    ,
    /// Запрашиваемый ресурс не найден.
    Status404
    (models::ApiNotFoundErrorResponse)
    ,
    /// Превышено ограничение на доступ к ресурсу.
    Status420
    (models::ApiLimitErrorResponse)
    ,
    /// Внутренняя ошибка сервера.
    Status500
    (models::ApiServerErrorResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum UpdateOrderStatusResponse {
    /// В случае успешного изменения статуса заказа возвращается обновленная информация о заказе.
    Status200
    (models::UpdateOrderStatusResponse)
    ,
    /// Запрос содержит неправильные данные.
    Status400
    (models::ApiClientDataErrorResponse)
    ,
    /// В запросе не указаны данные для авторизации.
    Status401
    (models::ApiUnauthorizedErrorResponse)
    ,
    /// Данные для авторизации неверны или доступ к ресурсу запрещен.
    Status403
    (models::ApiForbiddenErrorResponse)
    ,
    /// Запрашиваемый ресурс не найден.
    Status404
    (models::ApiNotFoundErrorResponse)
    ,
    /// Превышено ограничение на доступ к ресурсу.
    Status420
    (models::ApiLimitErrorResponse)
    ,
    /// Внутренняя ошибка сервера.
    Status500
    (models::ApiServerErrorResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum UpdateOrderStatusesResponse {
    /// Возвращается информация об обновленных статусах заказов.
    Status200
    (models::UpdateOrderStatusesResponse)
    ,
    /// Запрос содержит неправильные данные.
    Status400
    (models::ApiClientDataErrorResponse)
    ,
    /// В запросе не указаны данные для авторизации.
    Status401
    (models::ApiUnauthorizedErrorResponse)
    ,
    /// Данные для авторизации неверны или доступ к ресурсу запрещен.
    Status403
    (models::ApiForbiddenErrorResponse)
    ,
    /// Запрашиваемый ресурс не найден.
    Status404
    (models::ApiNotFoundErrorResponse)
    ,
    /// Превышено ограничение на доступ к ресурсу.
    Status420
    (models::ApiLimitErrorResponse)
    ,
    /// Внутренняя ошибка сервера.
    Status500
    (models::ApiServerErrorResponse)
}


/// DbsExpressFbsOrders
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait DbsExpressFbsOrders {
    /// Передача кодов маркировки единиц товара.
    ///
    /// ProvideOrderItemIdentifiers - PUT /campaigns/{campaignId}/orders/{orderId}/identifiers
    async fn provide_order_item_identifiers(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::ProvideOrderItemIdentifiersPathParams,
            body: models::ProvideOrderItemIdentifiersRequest,
    ) -> Result<ProvideOrderItemIdentifiersResponse, String>;

    /// Подготовка заказа.
    ///
    /// SetOrderBoxLayout - PUT /campaigns/{campaignId}/orders/{orderId}/boxes
    async fn set_order_box_layout(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::SetOrderBoxLayoutPathParams,
            body: models::SetOrderBoxLayoutRequest,
    ) -> Result<SetOrderBoxLayoutResponse, String>;

    /// Передача количества грузовых мест в заказе.
    ///
    /// SetOrderShipmentBoxes - PUT /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes
    async fn set_order_shipment_boxes(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::SetOrderShipmentBoxesPathParams,
            body: models::SetOrderShipmentBoxesRequest,
    ) -> Result<SetOrderShipmentBoxesResponse, String>;

    /// Удаление товара из заказа или уменьшение числа единиц.
    ///
    /// UpdateOrderItems - PUT /campaigns/{campaignId}/orders/{orderId}/items
    async fn update_order_items(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::UpdateOrderItemsPathParams,
            body: models::UpdateOrderItemRequest,
    ) -> Result<UpdateOrderItemsResponse, String>;

    /// Изменение статуса одного заказа.
    ///
    /// UpdateOrderStatus - PUT /campaigns/{campaignId}/orders/{orderId}/status
    async fn update_order_status(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::UpdateOrderStatusPathParams,
            body: models::UpdateOrderStatusRequest,
    ) -> Result<UpdateOrderStatusResponse, String>;

    /// Изменение статусов нескольких заказов.
    ///
    /// UpdateOrderStatuses - POST /campaigns/{campaignId}/orders/status-update
    async fn update_order_statuses(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::UpdateOrderStatusesPathParams,
            body: models::UpdateOrderStatusesRequest,
    ) -> Result<UpdateOrderStatusesResponse, String>;
}
