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
pub enum GenerateBoostConsolidatedReportResponse {
    /// В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.
    Status200
    (models::GenerateReportResponse)
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
pub enum GenerateCompetitorsPositionReportResponse {
    /// В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.
    Status200
    (models::GenerateReportResponse)
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
pub enum GenerateGoodsFeedbackReportResponse {
    /// В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.
    Status200
    (models::GenerateReportResponse)
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
pub enum GeneratePricesReportResponse {
    /// В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.
    Status200
    (models::GenerateReportResponse)
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
pub enum GenerateShelfsStatisticsReportResponse {
    /// В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.
    Status200
    (models::GenerateReportResponse)
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
pub enum GenerateShowsSalesReportResponse {
    /// В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.
    Status200
    (models::GenerateReportResponse)
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
pub enum GenerateStocksOnWarehousesReportResponse {
    /// В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.
    Status200
    (models::GenerateReportResponse)
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
pub enum GenerateUnitedMarketplaceServicesReportResponse {
    /// В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.
    Status200
    (models::GenerateReportResponse)
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
pub enum GenerateUnitedNettingReportResponse {
    /// В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.
    Status200
    (models::GenerateReportResponse)
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
pub enum GenerateUnitedOrdersReportResponse {
    /// В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.
    Status200
    (models::GenerateReportResponse)
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
pub enum GetReportInfoResponse {
    /// Статус генерации отчета и ссылка, если она уже есть.  {% note tip %}  Если статус генерации отчета — `FAILED` или `NO_DATA`, проверьте корректность запроса на генерацию. Например, верно ли указан идентификатор магазина, период или номер платежного поручения.  {% endnote %}    
    Status200
    (models::GetReportInfoResponse)
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


/// DbsExpressFbsFbyReports
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait DbsExpressFbsFbyReports {
    /// Отчет по бусту продаж.
    ///
    /// GenerateBoostConsolidatedReport - POST /reports/boost-consolidated/generate
    async fn generate_boost_consolidated_report(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::GenerateBoostConsolidatedReportQueryParams,
            body: models::GenerateBoostConsolidatedRequest,
    ) -> Result<GenerateBoostConsolidatedReportResponse, String>;

    /// Отчет «Конкурентная позиция».
    ///
    /// GenerateCompetitorsPositionReport - POST /reports/competitors-position/generate
    async fn generate_competitors_position_report(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::GenerateCompetitorsPositionReportQueryParams,
            body: models::GenerateCompetitorsPositionReportRequest,
    ) -> Result<GenerateCompetitorsPositionReportResponse, String>;

    /// Отчет по отзывам о товарах.
    ///
    /// GenerateGoodsFeedbackReport - POST /reports/goods-feedback/generate
    async fn generate_goods_feedback_report(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::GenerateGoodsFeedbackReportQueryParams,
            body: models::GenerateGoodsFeedbackRequest,
    ) -> Result<GenerateGoodsFeedbackReportResponse, String>;

    /// Отчет «Цены на рынке».
    ///
    /// GeneratePricesReport - POST /reports/prices/generate
    async fn generate_prices_report(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::GeneratePricesReportQueryParams,
            body: models::GeneratePricesReportRequest,
    ) -> Result<GeneratePricesReportResponse, String>;

    /// Отчет по полкам.
    ///
    /// GenerateShelfsStatisticsReport - POST /reports/shelf-statistics/generate
    async fn generate_shelfs_statistics_report(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::GenerateShelfsStatisticsReportQueryParams,
            body: models::GenerateShelfsStatisticsRequest,
    ) -> Result<GenerateShelfsStatisticsReportResponse, String>;

    /// Отчет «Аналитика продаж».
    ///
    /// GenerateShowsSalesReport - POST /reports/shows-sales/generate
    async fn generate_shows_sales_report(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::GenerateShowsSalesReportQueryParams,
            body: models::GenerateShowsSalesReportRequest,
    ) -> Result<GenerateShowsSalesReportResponse, String>;

    /// Отчет по остаткам на складах.
    ///
    /// GenerateStocksOnWarehousesReport - POST /reports/stocks-on-warehouses/generate
    async fn generate_stocks_on_warehouses_report(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::GenerateStocksOnWarehousesReportQueryParams,
            body: models::GenerateStocksOnWarehousesReportRequest,
    ) -> Result<GenerateStocksOnWarehousesReportResponse, String>;

    /// Отчет по стоимости услуг.
    ///
    /// GenerateUnitedMarketplaceServicesReport - POST /reports/united-marketplace-services/generate
    async fn generate_united_marketplace_services_report(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::GenerateUnitedMarketplaceServicesReportQueryParams,
            body: models::GenerateUnitedMarketplaceServicesReportRequest,
    ) -> Result<GenerateUnitedMarketplaceServicesReportResponse, String>;

    /// Отчет по платежам.
    ///
    /// GenerateUnitedNettingReport - POST /reports/united-netting/generate
    async fn generate_united_netting_report(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::GenerateUnitedNettingReportQueryParams,
            body: models::GenerateUnitedNettingReportRequest,
    ) -> Result<GenerateUnitedNettingReportResponse, String>;

    /// Отчет по заказам.
    ///
    /// GenerateUnitedOrdersReport - POST /reports/united-orders/generate
    async fn generate_united_orders_report(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::GenerateUnitedOrdersReportQueryParams,
            body: models::GenerateUnitedOrdersRequest,
    ) -> Result<GenerateUnitedOrdersReportResponse, String>;

    /// Получение заданного отчета.
    ///
    /// GetReportInfo - GET /reports/info/{reportId}
    async fn get_report_info(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetReportInfoPathParams,
    ) -> Result<GetReportInfoResponse, String>;
}
