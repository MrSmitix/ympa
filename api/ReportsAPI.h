#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/api_client_data_error_response.h"
#include "../model/api_forbidden_error_response.h"
#include "../model/api_limit_error_response.h"
#include "../model/api_not_found_error_response.h"
#include "../model/api_server_error_response.h"
#include "../model/api_unauthorized_error_response.h"
#include "../model/generate_boost_consolidated_request.h"
#include "../model/generate_competitors_position_report_request.h"
#include "../model/generate_goods_feedback_request.h"
#include "../model/generate_goods_movement_report_request.h"
#include "../model/generate_goods_realization_report_request.h"
#include "../model/generate_goods_turnover_request.h"
#include "../model/generate_mass_order_labels_request.h"
#include "../model/generate_prices_report_request.h"
#include "../model/generate_report_response.h"
#include "../model/generate_shelfs_statistics_request.h"
#include "../model/generate_shipment_list_document_report_request.h"
#include "../model/generate_shows_sales_report_request.h"
#include "../model/generate_stocks_on_warehouses_report_request.h"
#include "../model/generate_united_marketplace_services_report_request.h"
#include "../model/generate_united_netting_report_request.h"
#include "../model/generate_united_orders_request.h"
#include "../model/get_report_info_response.h"
#include "../model/page_format_type.h"
#include "../model/report_format_type.h"

// Enum  for ReportsAPI_generateBoostConsolidatedReport
typedef enum  { _api__generateBoostConsolidatedReport__NULL = 0, _api__generateBoostConsolidatedReport__FILE, _api__generateBoostConsolidatedReport__CSV } _api__generateBoostConsolidatedReport_format_e;

// Enum  for ReportsAPI_generateCompetitorsPositionReport
typedef enum  { _api__generateCompetitorsPositionReport__NULL = 0, _api__generateCompetitorsPositionReport__FILE, _api__generateCompetitorsPositionReport__CSV } _api__generateCompetitorsPositionReport_format_e;

// Enum  for ReportsAPI_generateGoodsFeedbackReport
typedef enum  { _api__generateGoodsFeedbackReport__NULL = 0, _api__generateGoodsFeedbackReport__FILE, _api__generateGoodsFeedbackReport__CSV } _api__generateGoodsFeedbackReport_format_e;

// Enum  for ReportsAPI_generateGoodsMovementReport
typedef enum  { _api__generateGoodsMovementReport__NULL = 0, _api__generateGoodsMovementReport__FILE, _api__generateGoodsMovementReport__CSV } _api__generateGoodsMovementReport_format_e;

// Enum  for ReportsAPI_generateGoodsRealizationReport
typedef enum  { _api__generateGoodsRealizationReport__NULL = 0, _api__generateGoodsRealizationReport__FILE, _api__generateGoodsRealizationReport__CSV } _api__generateGoodsRealizationReport_format_e;

// Enum  for ReportsAPI_generateGoodsTurnoverReport
typedef enum  { _api__generateGoodsTurnoverReport__NULL = 0, _api__generateGoodsTurnoverReport__FILE, _api__generateGoodsTurnoverReport__CSV } _api__generateGoodsTurnoverReport_format_e;

// Enum  for ReportsAPI_generateMassOrderLabelsReport
typedef enum  { _api__generateMassOrderLabelsReport__NULL = 0, _api__generateMassOrderLabelsReport__A7, _api__generateMassOrderLabelsReport__A4 } _api__generateMassOrderLabelsReport_format_e;

// Enum  for ReportsAPI_generatePricesReport
typedef enum  { _api__generatePricesReport__NULL = 0, _api__generatePricesReport__FILE, _api__generatePricesReport__CSV } _api__generatePricesReport_format_e;

// Enum  for ReportsAPI_generateShelfsStatisticsReport
typedef enum  { _api__generateShelfsStatisticsReport__NULL = 0, _api__generateShelfsStatisticsReport__FILE, _api__generateShelfsStatisticsReport__CSV } _api__generateShelfsStatisticsReport_format_e;

// Enum  for ReportsAPI_generateShowsSalesReport
typedef enum  { _api__generateShowsSalesReport__NULL = 0, _api__generateShowsSalesReport__FILE, _api__generateShowsSalesReport__CSV } _api__generateShowsSalesReport_format_e;

// Enum  for ReportsAPI_generateStocksOnWarehousesReport
typedef enum  { _api__generateStocksOnWarehousesReport__NULL = 0, _api__generateStocksOnWarehousesReport__FILE, _api__generateStocksOnWarehousesReport__CSV } _api__generateStocksOnWarehousesReport_format_e;

// Enum  for ReportsAPI_generateUnitedMarketplaceServicesReport
typedef enum  { _api__generateUnitedMarketplaceServicesReport__NULL = 0, _api__generateUnitedMarketplaceServicesReport__FILE, _api__generateUnitedMarketplaceServicesReport__CSV } _api__generateUnitedMarketplaceServicesReport_format_e;

// Enum  for ReportsAPI_generateUnitedNettingReport
typedef enum  { _api__generateUnitedNettingReport__NULL = 0, _api__generateUnitedNettingReport__FILE, _api__generateUnitedNettingReport__CSV } _api__generateUnitedNettingReport_format_e;

// Enum  for ReportsAPI_generateUnitedOrdersReport
typedef enum  { _api__generateUnitedOrdersReport__NULL = 0, _api__generateUnitedOrdersReport__FILE, _api__generateUnitedOrdersReport__CSV } _api__generateUnitedOrdersReport_format_e;


// Отчет по бусту продаж
//
// Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
generate_report_response_t*
ReportsAPI_generateBoostConsolidatedReport(apiClient_t *apiClient, generate_boost_consolidated_request_t *generate_boost_consolidated_request, report_format_type_e format);


// Отчет «Конкурентная позиция»
//
// Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  {% note info \"Значение -1 в отчете\" %}  Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.  {% endnote %}  |**⚙️ Лимит:** 10 запросов в час| |-| 
//
generate_report_response_t*
ReportsAPI_generateCompetitorsPositionReport(apiClient_t *apiClient, generate_competitors_position_report_request_t *generate_competitors_position_report_request, report_format_type_e format);


// Отчет по отзывам о товарах
//
// Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
generate_report_response_t*
ReportsAPI_generateGoodsFeedbackReport(apiClient_t *apiClient, generate_goods_feedback_request_t *generate_goods_feedback_request, report_format_type_e format);


// Отчет по движению товаров
//
// Запускает генерацию **отчета по движению товаров**. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#flow)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
generate_report_response_t*
ReportsAPI_generateGoodsMovementReport(apiClient_t *apiClient, generate_goods_movement_report_request_t *generate_goods_movement_report_request, report_format_type_e format);


// Отчет по реализации
//
// Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
generate_report_response_t*
ReportsAPI_generateGoodsRealizationReport(apiClient_t *apiClient, generate_goods_realization_report_request_t *generate_goods_realization_report_request, report_format_type_e format);


// Отчет по оборачиваемости
//
// Запускает генерацию **отчета по оборачиваемости** за заданную дату.  [Что это за отчет](https://yandex.ru/support/marketplace/analytics/turnover.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
generate_report_response_t*
ReportsAPI_generateGoodsTurnoverReport(apiClient_t *apiClient, generate_goods_turnover_request_t *generate_goods_turnover_request, report_format_type_e format);


// Готовые ярлыки‑наклейки на все коробки в нескольких заказах
//
// Запускает генерацию PDF-файла с ярлыками для переданных заказов. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  Узнать статус генерации и получить ссылку на готовый файл можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 1000 запросов в час| |-| 
//
generate_report_response_t*
ReportsAPI_generateMassOrderLabelsReport(apiClient_t *apiClient, generate_mass_order_labels_request_t *generate_mass_order_labels_request, page_format_type_e format);


// Отчет «Цены на рынке»
//
// Запускает генерацию **отчета «Цены на рынке»**.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
generate_report_response_t*
ReportsAPI_generatePricesReport(apiClient_t *apiClient, generate_prices_report_request_t *generate_prices_report_request, report_format_type_e format);


// Отчет по полкам
//
// Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
generate_report_response_t*
ReportsAPI_generateShelfsStatisticsReport(apiClient_t *apiClient, generate_shelfs_statistics_request_t *generate_shelfs_statistics_request, report_format_type_e format);


// Получение листа сборки
//
// Запускает генерацию **листа сборки** для отгрузки.  Узнать статус генерации и получить ссылку на готовый документ можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
generate_report_response_t*
ReportsAPI_generateShipmentListDocumentReport(apiClient_t *apiClient, generate_shipment_list_document_report_request_t *generate_shipment_list_document_report_request);


// Отчет «Аналитика продаж»
//
// Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 10 запросов в час| |-| 
//
generate_report_response_t*
ReportsAPI_generateShowsSalesReport(apiClient_t *apiClient, generate_shows_sales_report_request_t *generate_shows_sales_report_request, report_format_type_e format);


// Отчет по остаткам на складах
//
// Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:  * Для модели FBY — об остатках на складах Маркета. * Для остальных моделей — об остатках на соответствующем складе магазина.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
generate_report_response_t*
ReportsAPI_generateStocksOnWarehousesReport(apiClient_t *apiClient, generate_stocks_on_warehouses_report_request_t *generate_stocks_on_warehouses_report_request, report_format_type_e format);


// Отчет по стоимости услуг
//
// Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**               |**Какие поля нужны**             | |-----------------------------|---------------------------------| |По дате начисления услуги    |`dateFrom` и `dateTo`            | |По дате формирования акта    |`year` и `month`                 |  Заказать отчеты обоих типов одним запросом нельзя.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
generate_report_response_t*
ReportsAPI_generateUnitedMarketplaceServicesReport(apiClient_t *apiClient, generate_united_marketplace_services_report_request_t *generate_united_marketplace_services_report_request, report_format_type_e format);


// Отчет по платежам
//
// Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**           |**Какие поля нужны**                   | |-------------------------|---------------------------------------| |О платежах за период     |`dateFrom` и `dateTo`                  | |О платежном поручении    |`bankOrderId` и `bankOrderDateTime`    |  Заказать отчеты обоих типов одним запросом нельзя.  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
generate_report_response_t*
ReportsAPI_generateUnitedNettingReport(apiClient_t *apiClient, generate_united_netting_report_request_t *generate_united_netting_report_request, report_format_type_e format);


// Отчет по заказам
//
// Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)  {% note info \"\" %}  Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)  {% endnote %}  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
generate_report_response_t*
ReportsAPI_generateUnitedOrdersReport(apiClient_t *apiClient, generate_united_orders_request_t *generate_united_orders_request, report_format_type_e format);


// Получение заданного отчета
//
// Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.  Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
//
get_report_info_response_t*
ReportsAPI_getReportInfo(apiClient_t *apiClient, char *reportId);


