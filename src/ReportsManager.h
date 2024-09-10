#ifndef _ReportsManager_H_
#define _ReportsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
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
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Reports Reports
 * \ingroup Operations
 *  @{
 */
class ReportsManager {
public:
	ReportsManager();
	virtual ~ReportsManager();

/*! \brief Отчет по бусту продаж. *Synchronous*
 *
 * Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
 * \param generateBoostConsolidatedRequest  *Required*
 * \param format Формат отчета.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool generateBoostConsolidatedReportSync(char * accessToken,
	std::shared_ptr<GenerateBoostConsolidatedRequest> generateBoostConsolidatedRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData);

/*! \brief Отчет по бусту продаж. *Asynchronous*
 *
 * Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
 * \param generateBoostConsolidatedRequest  *Required*
 * \param format Формат отчета.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool generateBoostConsolidatedReportAsync(char * accessToken,
	std::shared_ptr<GenerateBoostConsolidatedRequest> generateBoostConsolidatedRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData);


/*! \brief Отчет «Конкурентная позиция». *Synchronous*
 *
 * Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  {% note info \"Значение -1 в отчете\" %}  Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.  {% endnote %}  |**⚙️ Лимит:** 10 запросов в час| |-| 
 * \param generateCompetitorsPositionReportRequest  *Required*
 * \param format Формат отчета.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool generateCompetitorsPositionReportSync(char * accessToken,
	std::shared_ptr<GenerateCompetitorsPositionReportRequest> generateCompetitorsPositionReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData);

/*! \brief Отчет «Конкурентная позиция». *Asynchronous*
 *
 * Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  {% note info \"Значение -1 в отчете\" %}  Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.  {% endnote %}  |**⚙️ Лимит:** 10 запросов в час| |-| 
 * \param generateCompetitorsPositionReportRequest  *Required*
 * \param format Формат отчета.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool generateCompetitorsPositionReportAsync(char * accessToken,
	std::shared_ptr<GenerateCompetitorsPositionReportRequest> generateCompetitorsPositionReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData);


/*! \brief Отчет по отзывам о товарах. *Synchronous*
 *
 * Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
 * \param generateGoodsFeedbackRequest  *Required*
 * \param format Формат отчета.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool generateGoodsFeedbackReportSync(char * accessToken,
	std::shared_ptr<GenerateGoodsFeedbackRequest> generateGoodsFeedbackRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData);

/*! \brief Отчет по отзывам о товарах. *Asynchronous*
 *
 * Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
 * \param generateGoodsFeedbackRequest  *Required*
 * \param format Формат отчета.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool generateGoodsFeedbackReportAsync(char * accessToken,
	std::shared_ptr<GenerateGoodsFeedbackRequest> generateGoodsFeedbackRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData);


/*! \brief Отчет по движению товаров. *Synchronous*
 *
 * Запускает генерацию **отчета по движению товаров**. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#flow)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
 * \param generateGoodsMovementReportRequest  *Required*
 * \param format Формат отчета.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool generateGoodsMovementReportSync(char * accessToken,
	std::shared_ptr<GenerateGoodsMovementReportRequest> generateGoodsMovementReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData);

/*! \brief Отчет по движению товаров. *Asynchronous*
 *
 * Запускает генерацию **отчета по движению товаров**. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#flow)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
 * \param generateGoodsMovementReportRequest  *Required*
 * \param format Формат отчета.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool generateGoodsMovementReportAsync(char * accessToken,
	std::shared_ptr<GenerateGoodsMovementReportRequest> generateGoodsMovementReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData);


/*! \brief Отчет по реализации. *Synchronous*
 *
 * Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
 * \param generateGoodsRealizationReportRequest  *Required*
 * \param format Формат отчета.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool generateGoodsRealizationReportSync(char * accessToken,
	std::shared_ptr<GenerateGoodsRealizationReportRequest> generateGoodsRealizationReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData);

/*! \brief Отчет по реализации. *Asynchronous*
 *
 * Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
 * \param generateGoodsRealizationReportRequest  *Required*
 * \param format Формат отчета.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool generateGoodsRealizationReportAsync(char * accessToken,
	std::shared_ptr<GenerateGoodsRealizationReportRequest> generateGoodsRealizationReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData);


/*! \brief Отчет по оборачиваемости. *Synchronous*
 *
 * Запускает генерацию **отчета по оборачиваемости** за заданную дату.  [Что это за отчет](https://yandex.ru/support/marketplace/analytics/turnover.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
 * \param generateGoodsTurnoverRequest  *Required*
 * \param format Формат отчета.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool generateGoodsTurnoverReportSync(char * accessToken,
	std::shared_ptr<GenerateGoodsTurnoverRequest> generateGoodsTurnoverRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData);

/*! \brief Отчет по оборачиваемости. *Asynchronous*
 *
 * Запускает генерацию **отчета по оборачиваемости** за заданную дату.  [Что это за отчет](https://yandex.ru/support/marketplace/analytics/turnover.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
 * \param generateGoodsTurnoverRequest  *Required*
 * \param format Формат отчета.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool generateGoodsTurnoverReportAsync(char * accessToken,
	std::shared_ptr<GenerateGoodsTurnoverRequest> generateGoodsTurnoverRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData);


/*! \brief Готовые ярлыки‑наклейки на все коробки в нескольких заказах. *Synchronous*
 *
 * Запускает генерацию PDF-файла с ярлыками для переданных заказов. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  Узнать статус генерации и получить ссылку на готовый файл можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 1000 запросов в час| |-| 
 * \param generateMassOrderLabelsRequest  *Required*
 * \param format Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A7.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool generateMassOrderLabelsReportSync(char * accessToken,
	std::shared_ptr<GenerateMassOrderLabelsRequest> generateMassOrderLabelsRequest, PageFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData);

/*! \brief Готовые ярлыки‑наклейки на все коробки в нескольких заказах. *Asynchronous*
 *
 * Запускает генерацию PDF-файла с ярлыками для переданных заказов. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  Узнать статус генерации и получить ссылку на готовый файл можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 1000 запросов в час| |-| 
 * \param generateMassOrderLabelsRequest  *Required*
 * \param format Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A7.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool generateMassOrderLabelsReportAsync(char * accessToken,
	std::shared_ptr<GenerateMassOrderLabelsRequest> generateMassOrderLabelsRequest, PageFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData);


/*! \brief Отчет «Цены на рынке». *Synchronous*
 *
 * Запускает генерацию **отчета «Цены на рынке»**.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
 * \param generatePricesReportRequest  *Required*
 * \param format Формат отчета.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool generatePricesReportSync(char * accessToken,
	std::shared_ptr<GeneratePricesReportRequest> generatePricesReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData);

/*! \brief Отчет «Цены на рынке». *Asynchronous*
 *
 * Запускает генерацию **отчета «Цены на рынке»**.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
 * \param generatePricesReportRequest  *Required*
 * \param format Формат отчета.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool generatePricesReportAsync(char * accessToken,
	std::shared_ptr<GeneratePricesReportRequest> generatePricesReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData);


/*! \brief Отчет по полкам. *Synchronous*
 *
 * Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
 * \param generateShelfsStatisticsRequest  *Required*
 * \param format Формат отчета.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool generateShelfsStatisticsReportSync(char * accessToken,
	std::shared_ptr<GenerateShelfsStatisticsRequest> generateShelfsStatisticsRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData);

/*! \brief Отчет по полкам. *Asynchronous*
 *
 * Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
 * \param generateShelfsStatisticsRequest  *Required*
 * \param format Формат отчета.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool generateShelfsStatisticsReportAsync(char * accessToken,
	std::shared_ptr<GenerateShelfsStatisticsRequest> generateShelfsStatisticsRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData);


/*! \brief Получение листа сборки. *Synchronous*
 *
 * Запускает генерацию **листа сборки** для отгрузки.  Узнать статус генерации и получить ссылку на готовый документ можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
 * \param generateShipmentListDocumentReportRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool generateShipmentListDocumentReportSync(char * accessToken,
	std::shared_ptr<GenerateShipmentListDocumentReportRequest> generateShipmentListDocumentReportRequest, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData);

/*! \brief Получение листа сборки. *Asynchronous*
 *
 * Запускает генерацию **листа сборки** для отгрузки.  Узнать статус генерации и получить ссылку на готовый документ можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
 * \param generateShipmentListDocumentReportRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool generateShipmentListDocumentReportAsync(char * accessToken,
	std::shared_ptr<GenerateShipmentListDocumentReportRequest> generateShipmentListDocumentReportRequest, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData);


/*! \brief Отчет «Аналитика продаж». *Synchronous*
 *
 * Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 10 запросов в час| |-| 
 * \param generateShowsSalesReportRequest  *Required*
 * \param format Формат отчета.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool generateShowsSalesReportSync(char * accessToken,
	std::shared_ptr<GenerateShowsSalesReportRequest> generateShowsSalesReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData);

/*! \brief Отчет «Аналитика продаж». *Asynchronous*
 *
 * Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 10 запросов в час| |-| 
 * \param generateShowsSalesReportRequest  *Required*
 * \param format Формат отчета.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool generateShowsSalesReportAsync(char * accessToken,
	std::shared_ptr<GenerateShowsSalesReportRequest> generateShowsSalesReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData);


/*! \brief Отчет по остаткам на складах. *Synchronous*
 *
 * Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:  * Для модели FBY — об остатках на складах Маркета. * Для остальных моделей — об остатках на соответствующем складе магазина.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
 * \param generateStocksOnWarehousesReportRequest  *Required*
 * \param format Формат отчета.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool generateStocksOnWarehousesReportSync(char * accessToken,
	std::shared_ptr<GenerateStocksOnWarehousesReportRequest> generateStocksOnWarehousesReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData);

/*! \brief Отчет по остаткам на складах. *Asynchronous*
 *
 * Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:  * Для модели FBY — об остатках на складах Маркета. * Для остальных моделей — об остатках на соответствующем складе магазина.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
 * \param generateStocksOnWarehousesReportRequest  *Required*
 * \param format Формат отчета.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool generateStocksOnWarehousesReportAsync(char * accessToken,
	std::shared_ptr<GenerateStocksOnWarehousesReportRequest> generateStocksOnWarehousesReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData);


/*! \brief Отчет по стоимости услуг. *Synchronous*
 *
 * Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**               |**Какие поля нужны**             | |-----------------------------|---------------------------------| |По дате начисления услуги    |`dateFrom` и `dateTo`            | |По дате формирования акта    |`year` и `month`                 |  Заказать отчеты обоих типов одним запросом нельзя.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
 * \param generateUnitedMarketplaceServicesReportRequest  *Required*
 * \param format Формат отчета.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool generateUnitedMarketplaceServicesReportSync(char * accessToken,
	std::shared_ptr<GenerateUnitedMarketplaceServicesReportRequest> generateUnitedMarketplaceServicesReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData);

/*! \brief Отчет по стоимости услуг. *Asynchronous*
 *
 * Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**               |**Какие поля нужны**             | |-----------------------------|---------------------------------| |По дате начисления услуги    |`dateFrom` и `dateTo`            | |По дате формирования акта    |`year` и `month`                 |  Заказать отчеты обоих типов одним запросом нельзя.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
 * \param generateUnitedMarketplaceServicesReportRequest  *Required*
 * \param format Формат отчета.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool generateUnitedMarketplaceServicesReportAsync(char * accessToken,
	std::shared_ptr<GenerateUnitedMarketplaceServicesReportRequest> generateUnitedMarketplaceServicesReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData);


/*! \brief Отчет по платежам. *Synchronous*
 *
 * Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**           |**Какие поля нужны**                   | |-------------------------|---------------------------------------| |О платежах за период     |`dateFrom` и `dateTo`                  | |О платежном поручении    |`bankOrderId` и `bankOrderDateTime`    |  Заказать отчеты обоих типов одним запросом нельзя.  |**⚙️ Лимит:** 100 запросов в час| |-| 
 * \param generateUnitedNettingReportRequest  *Required*
 * \param format Формат отчета.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool generateUnitedNettingReportSync(char * accessToken,
	std::shared_ptr<GenerateUnitedNettingReportRequest> generateUnitedNettingReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData);

/*! \brief Отчет по платежам. *Asynchronous*
 *
 * Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**           |**Какие поля нужны**                   | |-------------------------|---------------------------------------| |О платежах за период     |`dateFrom` и `dateTo`                  | |О платежном поручении    |`bankOrderId` и `bankOrderDateTime`    |  Заказать отчеты обоих типов одним запросом нельзя.  |**⚙️ Лимит:** 100 запросов в час| |-| 
 * \param generateUnitedNettingReportRequest  *Required*
 * \param format Формат отчета.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool generateUnitedNettingReportAsync(char * accessToken,
	std::shared_ptr<GenerateUnitedNettingReportRequest> generateUnitedNettingReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData);


/*! \brief Отчет по заказам. *Synchronous*
 *
 * Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)  {% note info \"\" %}  Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)  {% endnote %}  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
 * \param generateUnitedOrdersRequest  *Required*
 * \param format Формат отчета.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool generateUnitedOrdersReportSync(char * accessToken,
	std::shared_ptr<GenerateUnitedOrdersRequest> generateUnitedOrdersRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData);

/*! \brief Отчет по заказам. *Asynchronous*
 *
 * Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)  {% note info \"\" %}  Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)  {% endnote %}  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
 * \param generateUnitedOrdersRequest  *Required*
 * \param format Формат отчета.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool generateUnitedOrdersReportAsync(char * accessToken,
	std::shared_ptr<GenerateUnitedOrdersRequest> generateUnitedOrdersRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData);


/*! \brief Получение заданного отчета. *Synchronous*
 *
 * Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.  Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
 * \param reportId Идентификатор отчета, который вы получили после запуска генерации.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getReportInfoSync(char * accessToken,
	std::string reportId, 
	void(* handler)(GetReportInfoResponse, Error, void* )
	, void* userData);

/*! \brief Получение заданного отчета. *Asynchronous*
 *
 * Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.  Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
 * \param reportId Идентификатор отчета, который вы получили после запуска генерации.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getReportInfoAsync(char * accessToken,
	std::string reportId, 
	void(* handler)(GetReportInfoResponse, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.partner.market.yandex.ru";
	}
};
/** @}*/

}
}
#endif /* ReportsManager_H_ */
