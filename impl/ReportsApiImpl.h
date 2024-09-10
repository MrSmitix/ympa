/**
* Партнерский API Маркета
* API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
*
* The version of the OpenAPI document: LATEST
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/

/*
* ReportsApiImpl.h
*
* 
*/

#ifndef REPORTS_API_IMPL_H_
#define REPORTS_API_IMPL_H_


#include <pistache/endpoint.h>
#include <pistache/http.h>
#include <pistache/router.h>
#include <memory>
#include <optional>

#include <ReportsApi.h>


#include "ApiClientDataErrorResponse.h"
#include "ApiForbiddenErrorResponse.h"
#include "ApiLimitErrorResponse.h"
#include "ApiNotFoundErrorResponse.h"
#include "ApiServerErrorResponse.h"
#include "ApiUnauthorizedErrorResponse.h"
#include "GenerateBoostConsolidatedRequest.h"
#include "GenerateCompetitorsPositionReportRequest.h"
#include "GenerateGoodsFeedbackRequest.h"
#include "GenerateGoodsMovementReportRequest.h"
#include "GenerateGoodsRealizationReportRequest.h"
#include "GenerateGoodsTurnoverRequest.h"
#include "GenerateMassOrderLabelsRequest.h"
#include "GeneratePricesReportRequest.h"
#include "GenerateReportResponse.h"
#include "GenerateShelfsStatisticsRequest.h"
#include "GenerateShipmentListDocumentReportRequest.h"
#include "GenerateShowsSalesReportRequest.h"
#include "GenerateStocksOnWarehousesReportRequest.h"
#include "GenerateUnitedMarketplaceServicesReportRequest.h"
#include "GenerateUnitedNettingReportRequest.h"
#include "GenerateUnitedOrdersRequest.h"
#include "GetReportInfoResponse.h"
#include "PageFormatType.h"
#include "ReportFormatType.h"
#include <string>

namespace org::openapitools::server::api
{

using namespace org::openapitools::server::model;

class  ReportsApiImpl : public org::openapitools::server::api::ReportsApi {
public:
    explicit ReportsApiImpl(const std::shared_ptr<Pistache::Rest::Router>& rtr);
    ~ReportsApiImpl() override = default;

    void generate_boost_consolidated_report(const GenerateBoostConsolidatedRequest &generateBoostConsolidatedRequest, const std::optional<org::openapitools::server::model::ReportFormatType> &format, Pistache::Http::ResponseWriter &response);
    void generate_competitors_position_report(const GenerateCompetitorsPositionReportRequest &generateCompetitorsPositionReportRequest, const std::optional<org::openapitools::server::model::ReportFormatType> &format, Pistache::Http::ResponseWriter &response);
    void generate_goods_feedback_report(const GenerateGoodsFeedbackRequest &generateGoodsFeedbackRequest, const std::optional<org::openapitools::server::model::ReportFormatType> &format, Pistache::Http::ResponseWriter &response);
    void generate_goods_movement_report(const GenerateGoodsMovementReportRequest &generateGoodsMovementReportRequest, const std::optional<org::openapitools::server::model::ReportFormatType> &format, Pistache::Http::ResponseWriter &response);
    void generate_goods_realization_report(const GenerateGoodsRealizationReportRequest &generateGoodsRealizationReportRequest, const std::optional<org::openapitools::server::model::ReportFormatType> &format, Pistache::Http::ResponseWriter &response);
    void generate_goods_turnover_report(const GenerateGoodsTurnoverRequest &generateGoodsTurnoverRequest, const std::optional<org::openapitools::server::model::ReportFormatType> &format, Pistache::Http::ResponseWriter &response);
    void generate_mass_order_labels_report(const GenerateMassOrderLabelsRequest &generateMassOrderLabelsRequest, const std::optional<org::openapitools::server::model::PageFormatType> &format, Pistache::Http::ResponseWriter &response);
    void generate_prices_report(const GeneratePricesReportRequest &generatePricesReportRequest, const std::optional<org::openapitools::server::model::ReportFormatType> &format, Pistache::Http::ResponseWriter &response);
    void generate_shelfs_statistics_report(const GenerateShelfsStatisticsRequest &generateShelfsStatisticsRequest, const std::optional<org::openapitools::server::model::ReportFormatType> &format, Pistache::Http::ResponseWriter &response);
    void generate_shipment_list_document_report(const GenerateShipmentListDocumentReportRequest &generateShipmentListDocumentReportRequest, Pistache::Http::ResponseWriter &response);
    void generate_shows_sales_report(const GenerateShowsSalesReportRequest &generateShowsSalesReportRequest, const std::optional<org::openapitools::server::model::ReportFormatType> &format, Pistache::Http::ResponseWriter &response);
    void generate_stocks_on_warehouses_report(const GenerateStocksOnWarehousesReportRequest &generateStocksOnWarehousesReportRequest, const std::optional<org::openapitools::server::model::ReportFormatType> &format, Pistache::Http::ResponseWriter &response);
    void generate_united_marketplace_services_report(const GenerateUnitedMarketplaceServicesReportRequest &generateUnitedMarketplaceServicesReportRequest, const std::optional<org::openapitools::server::model::ReportFormatType> &format, Pistache::Http::ResponseWriter &response);
    void generate_united_netting_report(const GenerateUnitedNettingReportRequest &generateUnitedNettingReportRequest, const std::optional<org::openapitools::server::model::ReportFormatType> &format, Pistache::Http::ResponseWriter &response);
    void generate_united_orders_report(const GenerateUnitedOrdersRequest &generateUnitedOrdersRequest, const std::optional<org::openapitools::server::model::ReportFormatType> &format, Pistache::Http::ResponseWriter &response);
    void get_report_info(const std::string &reportId, Pistache::Http::ResponseWriter &response);

};

} // namespace org::openapitools::server::api



#endif
