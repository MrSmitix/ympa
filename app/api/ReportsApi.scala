package api

import play.api.libs.json._
import model.ApiClientDataErrorResponse
import model.ApiForbiddenErrorResponse
import model.ApiLimitErrorResponse
import model.ApiNotFoundErrorResponse
import model.ApiServerErrorResponse
import model.ApiUnauthorizedErrorResponse
import model.GenerateBoostConsolidatedRequest
import model.GenerateCompetitorsPositionReportRequest
import model.GenerateGoodsFeedbackRequest
import model.GenerateGoodsMovementReportRequest
import model.GenerateGoodsRealizationReportRequest
import model.GenerateGoodsTurnoverRequest
import model.GenerateMassOrderLabelsRequest
import model.GeneratePricesReportRequest
import model.GenerateReportResponse
import model.GenerateShelfsStatisticsRequest
import model.GenerateShipmentListDocumentReportRequest
import model.GenerateShowsSalesReportRequest
import model.GenerateStocksOnWarehousesReportRequest
import model.GenerateUnitedMarketplaceServicesReportRequest
import model.GenerateUnitedNettingReportRequest
import model.GenerateUnitedOrdersRequest
import model.GetReportInfoResponse
import model.PageFormatType
import model.ReportFormatType

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
trait ReportsApi {
  /**
    * Отчет по бусту продаж
    * Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
    * @param format Формат отчета.
    */
  def generateBoostConsolidatedReport(generateBoostConsolidatedRequest: GenerateBoostConsolidatedRequest, format: Option[ReportFormatType]): GenerateReportResponse

  /**
    * Отчет «Конкурентная позиция»
    * Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  {% note info \&quot;Значение -1 в отчете\&quot; %}  Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.  {% endnote %}  |**⚙️ Лимит:** 10 запросов в час| |-| 
    * @param format Формат отчета.
    */
  def generateCompetitorsPositionReport(generateCompetitorsPositionReportRequest: GenerateCompetitorsPositionReportRequest, format: Option[ReportFormatType]): GenerateReportResponse

  /**
    * Отчет по отзывам о товарах
    * Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
    * @param format Формат отчета.
    */
  def generateGoodsFeedbackReport(generateGoodsFeedbackRequest: GenerateGoodsFeedbackRequest, format: Option[ReportFormatType]): GenerateReportResponse

  /**
    * Отчет по движению товаров
    * Запускает генерацию **отчета по движению товаров**. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#flow)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
    * @param format Формат отчета.
    */
  def generateGoodsMovementReport(generateGoodsMovementReportRequest: GenerateGoodsMovementReportRequest, format: Option[ReportFormatType]): GenerateReportResponse

  /**
    * Отчет по реализации
    * Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
    * @param format Формат отчета.
    */
  def generateGoodsRealizationReport(generateGoodsRealizationReportRequest: GenerateGoodsRealizationReportRequest, format: Option[ReportFormatType]): GenerateReportResponse

  /**
    * Отчет по оборачиваемости
    * Запускает генерацию **отчета по оборачиваемости** за заданную дату.  [Что это за отчет](https://yandex.ru/support/marketplace/analytics/turnover.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
    * @param format Формат отчета.
    */
  def generateGoodsTurnoverReport(generateGoodsTurnoverRequest: GenerateGoodsTurnoverRequest, format: Option[ReportFormatType]): GenerateReportResponse

  /**
    * Готовые ярлыки‑наклейки на все коробки в нескольких заказах
    * Запускает генерацию PDF-файла с ярлыками для переданных заказов. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  Узнать статус генерации и получить ссылку на готовый файл можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 1000 запросов в час| |-| 
    * @param format Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A7.
    */
  def generateMassOrderLabelsReport(generateMassOrderLabelsRequest: GenerateMassOrderLabelsRequest, format: Option[PageFormatType]): GenerateReportResponse

  /**
    * Отчет «Цены на рынке»
    * Запускает генерацию **отчета «Цены на рынке»**.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
    * @param format Формат отчета.
    */
  def generatePricesReport(generatePricesReportRequest: GeneratePricesReportRequest, format: Option[ReportFormatType]): GenerateReportResponse

  /**
    * Отчет по полкам
    * Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
    * @param format Формат отчета.
    */
  def generateShelfsStatisticsReport(generateShelfsStatisticsRequest: GenerateShelfsStatisticsRequest, format: Option[ReportFormatType]): GenerateReportResponse

  /**
    * Получение листа сборки
    * Запускает генерацию **листа сборки** для отгрузки.  Узнать статус генерации и получить ссылку на готовый документ можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
    */
  def generateShipmentListDocumentReport(generateShipmentListDocumentReportRequest: GenerateShipmentListDocumentReportRequest): GenerateReportResponse

  /**
    * Отчет «Аналитика продаж»
    * Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 10 запросов в час| |-| 
    * @param format Формат отчета.
    */
  def generateShowsSalesReport(generateShowsSalesReportRequest: GenerateShowsSalesReportRequest, format: Option[ReportFormatType]): GenerateReportResponse

  /**
    * Отчет по остаткам на складах
    * Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:  * Для модели FBY — об остатках на складах Маркета. * Для остальных моделей — об остатках на соответствующем складе магазина.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
    * @param format Формат отчета.
    */
  def generateStocksOnWarehousesReport(generateStocksOnWarehousesReportRequest: GenerateStocksOnWarehousesReportRequest, format: Option[ReportFormatType]): GenerateReportResponse

  /**
    * Отчет по стоимости услуг
    * Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**               |**Какие поля нужны**             | |-----------------------------|---------------------------------| |По дате начисления услуги    |&#x60;dateFrom&#x60; и &#x60;dateTo&#x60;            | |По дате формирования акта    |&#x60;year&#x60; и &#x60;month&#x60;                 |  Заказать отчеты обоих типов одним запросом нельзя.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
    * @param format Формат отчета.
    */
  def generateUnitedMarketplaceServicesReport(generateUnitedMarketplaceServicesReportRequest: GenerateUnitedMarketplaceServicesReportRequest, format: Option[ReportFormatType]): GenerateReportResponse

  /**
    * Отчет по платежам
    * Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**           |**Какие поля нужны**                   | |-------------------------|---------------------------------------| |О платежах за период     |&#x60;dateFrom&#x60; и &#x60;dateTo&#x60;                  | |О платежном поручении    |&#x60;bankOrderId&#x60; и &#x60;bankOrderDateTime&#x60;    |  Заказать отчеты обоих типов одним запросом нельзя.  |**⚙️ Лимит:** 100 запросов в час| |-| 
    * @param format Формат отчета.
    */
  def generateUnitedNettingReport(generateUnitedNettingReportRequest: GenerateUnitedNettingReportRequest, format: Option[ReportFormatType]): GenerateReportResponse

  /**
    * Отчет по заказам
    * Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)  {% note info \&quot;\&quot; %}  Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)  {% endnote %}  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
    * @param format Формат отчета.
    */
  def generateUnitedOrdersReport(generateUnitedOrdersRequest: GenerateUnitedOrdersRequest, format: Option[ReportFormatType]): GenerateReportResponse

  /**
    * Получение заданного отчета
    * Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.  Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
    * @param reportId Идентификатор отчета, который вы получили после запуска генерации. 
    */
  def getReportInfo(reportId: String): GetReportInfoResponse
}
