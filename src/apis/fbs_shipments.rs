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
pub enum ConfirmShipmentResponse {
    /// Пустой ответ.
    Status200
    (models::EmptyApiResponse)
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
pub enum DownloadShipmentActResponse {
    /// Акт приема-передачи для отгрузки в формате PDF.
    Status200
    (ByteArray)
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
pub enum DownloadShipmentDiscrepancyActResponse {
    /// Акт расхождений в формате XLSX.
    Status200
    (ByteArray)
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
pub enum DownloadShipmentInboundActResponse {
    /// Акт в формате PDF.
    Status200
    (ByteArray)
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
pub enum DownloadShipmentPalletLabelsResponse {
    /// PDF‑файл с ярлыками на все упаковки в отгрузке.
    Status200_PDF
    (ByteArray)
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
pub enum DownloadShipmentReceptionTransferActResponse {
    /// Акт приема-передачи в формате PDF.
    Status200
    (ByteArray)
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
pub enum DownloadShipmentTransportationWaybillResponse {
    /// Транспортная накладная в формате XLSX.
    Status200
    (ByteArray)
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
pub enum GetShipmentResponse {
    /// Найденная отгрузка.
    Status200
    (models::GetShipmentResponse)
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
pub enum GetShipmentOrdersInfoResponse {
    /// Информация по годным/негодным для печати ярлыков заказам в отгрузке.
    Status200
    (models::GetShipmentOrdersInfoResponse)
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
pub enum SearchShipmentsResponse {
    /// Найденные отгрузки.
    Status200
    (models::SearchShipmentsResponse)
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
pub enum SetShipmentPalletsCountResponse {
    /// Имеет значение только тип ответа. Если ответ `ОК`, количество упаковок записано.
    Status200
    (models::EmptyApiResponse)
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
pub enum TransferOrdersFromShipmentResponse {
    /// Запрос на перенос заказов проверен и принят, и они будут перенесены спустя несколько минут.
    Status200
    (models::EmptyApiResponse)
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


/// FbsShipments
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait FbsShipments {
    /// Подтверждение отгрузки.
    ///
    /// ConfirmShipment - POST /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm
    async fn confirm_shipment(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::ConfirmShipmentPathParams,
            body: Option<models::ConfirmShipmentRequest>,
    ) -> Result<ConfirmShipmentResponse, String>;

    /// Получение акта приема-передачи.
    ///
    /// DownloadShipmentAct - GET /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act
    async fn download_shipment_act(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::DownloadShipmentActPathParams,
    ) -> Result<DownloadShipmentActResponse, String>;

    /// Получение акта расхождений.
    ///
    /// DownloadShipmentDiscrepancyAct - GET /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act
    async fn download_shipment_discrepancy_act(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::DownloadShipmentDiscrepancyActPathParams,
    ) -> Result<DownloadShipmentDiscrepancyActResponse, String>;

    /// Получение фактического акта приема-передачи.
    ///
    /// DownloadShipmentInboundAct - GET /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act
    async fn download_shipment_inbound_act(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::DownloadShipmentInboundActPathParams,
    ) -> Result<DownloadShipmentInboundActResponse, String>;

    /// Ярлыки для доверительной приемки (FBS).
    ///
    /// DownloadShipmentPalletLabels - GET /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels
    async fn download_shipment_pallet_labels(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::DownloadShipmentPalletLabelsPathParams,
      query_params: models::DownloadShipmentPalletLabelsQueryParams,
    ) -> Result<DownloadShipmentPalletLabelsResponse, String>;

    /// Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее.
    ///
    /// DownloadShipmentReceptionTransferAct - GET /campaigns/{campaignId}/shipments/reception-transfer-act
    async fn download_shipment_reception_transfer_act(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::DownloadShipmentReceptionTransferActPathParams,
      query_params: models::DownloadShipmentReceptionTransferActQueryParams,
    ) -> Result<DownloadShipmentReceptionTransferActResponse, String>;

    /// Получение транспортной накладной.
    ///
    /// DownloadShipmentTransportationWaybill - GET /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill
    async fn download_shipment_transportation_waybill(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::DownloadShipmentTransportationWaybillPathParams,
    ) -> Result<DownloadShipmentTransportationWaybillResponse, String>;

    /// Получение информации об одной отгрузке.
    ///
    /// GetShipment - GET /campaigns/{campaignId}/first-mile/shipments/{shipmentId}
    async fn get_shipment(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetShipmentPathParams,
      query_params: models::GetShipmentQueryParams,
    ) -> Result<GetShipmentResponse, String>;

    /// Получение информации о возможности печати ярлыков (FBS).
    ///
    /// GetShipmentOrdersInfo - GET /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info
    async fn get_shipment_orders_info(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetShipmentOrdersInfoPathParams,
    ) -> Result<GetShipmentOrdersInfoResponse, String>;

    /// Получение информации о нескольких отгрузках.
    ///
    /// SearchShipments - PUT /campaigns/{campaignId}/first-mile/shipments
    async fn search_shipments(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::SearchShipmentsPathParams,
      query_params: models::SearchShipmentsQueryParams,
            body: models::SearchShipmentsRequest,
    ) -> Result<SearchShipmentsResponse, String>;

    /// Передача количества упаковок в отгрузке.
    ///
    /// SetShipmentPalletsCount - PUT /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets
    async fn set_shipment_pallets_count(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::SetShipmentPalletsCountPathParams,
            body: models::SetShipmentPalletsCountRequest,
    ) -> Result<SetShipmentPalletsCountResponse, String>;

    /// Перенос заказов в следующую отгрузку.
    ///
    /// TransferOrdersFromShipment - POST /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer
    async fn transfer_orders_from_shipment(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::TransferOrdersFromShipmentPathParams,
            body: models::TransferOrdersFromShipmentRequest,
    ) -> Result<TransferOrdersFromShipmentResponse, String>;
}
