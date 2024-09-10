//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

import 'package:openapi/api.dart';
import 'package:test/test.dart';


/// tests for ReportsApi
void main() {
  // final instance = ReportsApi();

  group('tests for ReportsApi', () {
    // Отчет по бусту продаж
    //
    // Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
    //
    //Future<GenerateReportResponse> generateBoostConsolidatedReport(GenerateBoostConsolidatedRequest generateBoostConsolidatedRequest, { ReportFormatType format }) async
    test('test generateBoostConsolidatedReport', () async {
      // TODO
    });

    // Отчет «Конкурентная позиция»
    //
    // Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  {% note info \"Значение -1 в отчете\" %}  Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.  {% endnote %}  |**⚙️ Лимит:** 10 запросов в час| |-| 
    //
    //Future<GenerateReportResponse> generateCompetitorsPositionReport(GenerateCompetitorsPositionReportRequest generateCompetitorsPositionReportRequest, { ReportFormatType format }) async
    test('test generateCompetitorsPositionReport', () async {
      // TODO
    });

    // Отчет по отзывам о товарах
    //
    // Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
    //
    //Future<GenerateReportResponse> generateGoodsFeedbackReport(GenerateGoodsFeedbackRequest generateGoodsFeedbackRequest, { ReportFormatType format }) async
    test('test generateGoodsFeedbackReport', () async {
      // TODO
    });

    // Отчет по движению товаров
    //
    // Запускает генерацию **отчета по движению товаров**. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#flow)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
    //
    //Future<GenerateReportResponse> generateGoodsMovementReport(GenerateGoodsMovementReportRequest generateGoodsMovementReportRequest, { ReportFormatType format }) async
    test('test generateGoodsMovementReport', () async {
      // TODO
    });

    // Отчет по реализации
    //
    // Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
    //
    //Future<GenerateReportResponse> generateGoodsRealizationReport(GenerateGoodsRealizationReportRequest generateGoodsRealizationReportRequest, { ReportFormatType format }) async
    test('test generateGoodsRealizationReport', () async {
      // TODO
    });

    // Отчет по оборачиваемости
    //
    // Запускает генерацию **отчета по оборачиваемости** за заданную дату.  [Что это за отчет](https://yandex.ru/support/marketplace/analytics/turnover.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
    //
    //Future<GenerateReportResponse> generateGoodsTurnoverReport(GenerateGoodsTurnoverRequest generateGoodsTurnoverRequest, { ReportFormatType format }) async
    test('test generateGoodsTurnoverReport', () async {
      // TODO
    });

    // Готовые ярлыки‑наклейки на все коробки в нескольких заказах
    //
    // Запускает генерацию PDF-файла с ярлыками для переданных заказов. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  Узнать статус генерации и получить ссылку на готовый файл можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 1000 запросов в час| |-| 
    //
    //Future<GenerateReportResponse> generateMassOrderLabelsReport(GenerateMassOrderLabelsRequest generateMassOrderLabelsRequest, { PageFormatType format }) async
    test('test generateMassOrderLabelsReport', () async {
      // TODO
    });

    // Отчет «Цены на рынке»
    //
    // Запускает генерацию **отчета «Цены на рынке»**.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
    //
    //Future<GenerateReportResponse> generatePricesReport(GeneratePricesReportRequest generatePricesReportRequest, { ReportFormatType format }) async
    test('test generatePricesReport', () async {
      // TODO
    });

    // Отчет по полкам
    //
    // Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
    //
    //Future<GenerateReportResponse> generateShelfsStatisticsReport(GenerateShelfsStatisticsRequest generateShelfsStatisticsRequest, { ReportFormatType format }) async
    test('test generateShelfsStatisticsReport', () async {
      // TODO
    });

    // Получение листа сборки
    //
    // Запускает генерацию **листа сборки** для отгрузки.  Узнать статус генерации и получить ссылку на готовый документ можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
    //
    //Future<GenerateReportResponse> generateShipmentListDocumentReport(GenerateShipmentListDocumentReportRequest generateShipmentListDocumentReportRequest) async
    test('test generateShipmentListDocumentReport', () async {
      // TODO
    });

    // Отчет «Аналитика продаж»
    //
    // Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 10 запросов в час| |-| 
    //
    //Future<GenerateReportResponse> generateShowsSalesReport(GenerateShowsSalesReportRequest generateShowsSalesReportRequest, { ReportFormatType format }) async
    test('test generateShowsSalesReport', () async {
      // TODO
    });

    // Отчет по остаткам на складах
    //
    // Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:  * Для модели FBY — об остатках на складах Маркета. * Для остальных моделей — об остатках на соответствующем складе магазина.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
    //
    //Future<GenerateReportResponse> generateStocksOnWarehousesReport(GenerateStocksOnWarehousesReportRequest generateStocksOnWarehousesReportRequest, { ReportFormatType format }) async
    test('test generateStocksOnWarehousesReport', () async {
      // TODO
    });

    // Отчет по стоимости услуг
    //
    // Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**               |**Какие поля нужны**             | |-----------------------------|---------------------------------| |По дате начисления услуги    |`dateFrom` и `dateTo`            | |По дате формирования акта    |`year` и `month`                 |  Заказать отчеты обоих типов одним запросом нельзя.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
    //
    //Future<GenerateReportResponse> generateUnitedMarketplaceServicesReport(GenerateUnitedMarketplaceServicesReportRequest generateUnitedMarketplaceServicesReportRequest, { ReportFormatType format }) async
    test('test generateUnitedMarketplaceServicesReport', () async {
      // TODO
    });

    // Отчет по платежам
    //
    // Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**           |**Какие поля нужны**                   | |-------------------------|---------------------------------------| |О платежах за период     |`dateFrom` и `dateTo`                  | |О платежном поручении    |`bankOrderId` и `bankOrderDateTime`    |  Заказать отчеты обоих типов одним запросом нельзя.  |**⚙️ Лимит:** 100 запросов в час| |-| 
    //
    //Future<GenerateReportResponse> generateUnitedNettingReport(GenerateUnitedNettingReportRequest generateUnitedNettingReportRequest, { ReportFormatType format }) async
    test('test generateUnitedNettingReport', () async {
      // TODO
    });

    // Отчет по заказам
    //
    // Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)  {% note info \"\" %}  Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)  {% endnote %}  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
    //
    //Future<GenerateReportResponse> generateUnitedOrdersReport(GenerateUnitedOrdersRequest generateUnitedOrdersRequest, { ReportFormatType format }) async
    test('test generateUnitedOrdersReport', () async {
      // TODO
    });

    // Получение заданного отчета
    //
    // Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.  Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
    //
    //Future<GetReportInfoResponse> getReportInfo(String reportId) async
    test('test getReportInfo', () async {
      // TODO
    });

  });
}
