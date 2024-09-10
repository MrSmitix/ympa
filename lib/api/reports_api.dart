//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class ReportsApi {
  ReportsApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Отчет по бусту продаж
  ///
  /// Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [GenerateBoostConsolidatedRequest] generateBoostConsolidatedRequest (required):
  ///
  /// * [ReportFormatType] format:
  ///   Формат отчета.
  Future<Response> generateBoostConsolidatedReportWithHttpInfo(GenerateBoostConsolidatedRequest generateBoostConsolidatedRequest, { ReportFormatType? format, }) async {
    // ignore: prefer_const_declarations
    final path = r'/reports/boost-consolidated/generate';

    // ignore: prefer_final_locals
    Object? postBody = generateBoostConsolidatedRequest;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (format != null) {
      queryParams.addAll(_queryParams('', 'format', format));
    }

    const contentTypes = <String>['application/json'];


    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Отчет по бусту продаж
  ///
  /// Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
  ///
  /// Parameters:
  ///
  /// * [GenerateBoostConsolidatedRequest] generateBoostConsolidatedRequest (required):
  ///
  /// * [ReportFormatType] format:
  ///   Формат отчета.
  Future<GenerateReportResponse?> generateBoostConsolidatedReport(GenerateBoostConsolidatedRequest generateBoostConsolidatedRequest, { ReportFormatType? format, }) async {
    final response = await generateBoostConsolidatedReportWithHttpInfo(generateBoostConsolidatedRequest,  format: format, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'GenerateReportResponse',) as GenerateReportResponse;
    
    }
    return null;
  }

  /// Отчет «Конкурентная позиция»
  ///
  /// Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  {% note info \"Значение -1 в отчете\" %}  Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.  {% endnote %}  |**⚙️ Лимит:** 10 запросов в час| |-| 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [GenerateCompetitorsPositionReportRequest] generateCompetitorsPositionReportRequest (required):
  ///
  /// * [ReportFormatType] format:
  ///   Формат отчета.
  Future<Response> generateCompetitorsPositionReportWithHttpInfo(GenerateCompetitorsPositionReportRequest generateCompetitorsPositionReportRequest, { ReportFormatType? format, }) async {
    // ignore: prefer_const_declarations
    final path = r'/reports/competitors-position/generate';

    // ignore: prefer_final_locals
    Object? postBody = generateCompetitorsPositionReportRequest;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (format != null) {
      queryParams.addAll(_queryParams('', 'format', format));
    }

    const contentTypes = <String>['application/json'];


    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Отчет «Конкурентная позиция»
  ///
  /// Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  {% note info \"Значение -1 в отчете\" %}  Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.  {% endnote %}  |**⚙️ Лимит:** 10 запросов в час| |-| 
  ///
  /// Parameters:
  ///
  /// * [GenerateCompetitorsPositionReportRequest] generateCompetitorsPositionReportRequest (required):
  ///
  /// * [ReportFormatType] format:
  ///   Формат отчета.
  Future<GenerateReportResponse?> generateCompetitorsPositionReport(GenerateCompetitorsPositionReportRequest generateCompetitorsPositionReportRequest, { ReportFormatType? format, }) async {
    final response = await generateCompetitorsPositionReportWithHttpInfo(generateCompetitorsPositionReportRequest,  format: format, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'GenerateReportResponse',) as GenerateReportResponse;
    
    }
    return null;
  }

  /// Отчет по отзывам о товарах
  ///
  /// Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [GenerateGoodsFeedbackRequest] generateGoodsFeedbackRequest (required):
  ///
  /// * [ReportFormatType] format:
  ///   Формат отчета.
  Future<Response> generateGoodsFeedbackReportWithHttpInfo(GenerateGoodsFeedbackRequest generateGoodsFeedbackRequest, { ReportFormatType? format, }) async {
    // ignore: prefer_const_declarations
    final path = r'/reports/goods-feedback/generate';

    // ignore: prefer_final_locals
    Object? postBody = generateGoodsFeedbackRequest;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (format != null) {
      queryParams.addAll(_queryParams('', 'format', format));
    }

    const contentTypes = <String>['application/json'];


    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Отчет по отзывам о товарах
  ///
  /// Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
  ///
  /// Parameters:
  ///
  /// * [GenerateGoodsFeedbackRequest] generateGoodsFeedbackRequest (required):
  ///
  /// * [ReportFormatType] format:
  ///   Формат отчета.
  Future<GenerateReportResponse?> generateGoodsFeedbackReport(GenerateGoodsFeedbackRequest generateGoodsFeedbackRequest, { ReportFormatType? format, }) async {
    final response = await generateGoodsFeedbackReportWithHttpInfo(generateGoodsFeedbackRequest,  format: format, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'GenerateReportResponse',) as GenerateReportResponse;
    
    }
    return null;
  }

  /// Отчет по движению товаров
  ///
  /// Запускает генерацию **отчета по движению товаров**. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#flow)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [GenerateGoodsMovementReportRequest] generateGoodsMovementReportRequest (required):
  ///
  /// * [ReportFormatType] format:
  ///   Формат отчета.
  Future<Response> generateGoodsMovementReportWithHttpInfo(GenerateGoodsMovementReportRequest generateGoodsMovementReportRequest, { ReportFormatType? format, }) async {
    // ignore: prefer_const_declarations
    final path = r'/reports/goods-movement/generate';

    // ignore: prefer_final_locals
    Object? postBody = generateGoodsMovementReportRequest;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (format != null) {
      queryParams.addAll(_queryParams('', 'format', format));
    }

    const contentTypes = <String>['application/json'];


    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Отчет по движению товаров
  ///
  /// Запускает генерацию **отчета по движению товаров**. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#flow)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
  ///
  /// Parameters:
  ///
  /// * [GenerateGoodsMovementReportRequest] generateGoodsMovementReportRequest (required):
  ///
  /// * [ReportFormatType] format:
  ///   Формат отчета.
  Future<GenerateReportResponse?> generateGoodsMovementReport(GenerateGoodsMovementReportRequest generateGoodsMovementReportRequest, { ReportFormatType? format, }) async {
    final response = await generateGoodsMovementReportWithHttpInfo(generateGoodsMovementReportRequest,  format: format, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'GenerateReportResponse',) as GenerateReportResponse;
    
    }
    return null;
  }

  /// Отчет по реализации
  ///
  /// Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [GenerateGoodsRealizationReportRequest] generateGoodsRealizationReportRequest (required):
  ///
  /// * [ReportFormatType] format:
  ///   Формат отчета.
  Future<Response> generateGoodsRealizationReportWithHttpInfo(GenerateGoodsRealizationReportRequest generateGoodsRealizationReportRequest, { ReportFormatType? format, }) async {
    // ignore: prefer_const_declarations
    final path = r'/reports/goods-realization/generate';

    // ignore: prefer_final_locals
    Object? postBody = generateGoodsRealizationReportRequest;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (format != null) {
      queryParams.addAll(_queryParams('', 'format', format));
    }

    const contentTypes = <String>['application/json'];


    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Отчет по реализации
  ///
  /// Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
  ///
  /// Parameters:
  ///
  /// * [GenerateGoodsRealizationReportRequest] generateGoodsRealizationReportRequest (required):
  ///
  /// * [ReportFormatType] format:
  ///   Формат отчета.
  Future<GenerateReportResponse?> generateGoodsRealizationReport(GenerateGoodsRealizationReportRequest generateGoodsRealizationReportRequest, { ReportFormatType? format, }) async {
    final response = await generateGoodsRealizationReportWithHttpInfo(generateGoodsRealizationReportRequest,  format: format, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'GenerateReportResponse',) as GenerateReportResponse;
    
    }
    return null;
  }

  /// Отчет по оборачиваемости
  ///
  /// Запускает генерацию **отчета по оборачиваемости** за заданную дату.  [Что это за отчет](https://yandex.ru/support/marketplace/analytics/turnover.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [GenerateGoodsTurnoverRequest] generateGoodsTurnoverRequest (required):
  ///
  /// * [ReportFormatType] format:
  ///   Формат отчета.
  Future<Response> generateGoodsTurnoverReportWithHttpInfo(GenerateGoodsTurnoverRequest generateGoodsTurnoverRequest, { ReportFormatType? format, }) async {
    // ignore: prefer_const_declarations
    final path = r'/reports/goods-turnover/generate';

    // ignore: prefer_final_locals
    Object? postBody = generateGoodsTurnoverRequest;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (format != null) {
      queryParams.addAll(_queryParams('', 'format', format));
    }

    const contentTypes = <String>['application/json'];


    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Отчет по оборачиваемости
  ///
  /// Запускает генерацию **отчета по оборачиваемости** за заданную дату.  [Что это за отчет](https://yandex.ru/support/marketplace/analytics/turnover.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
  ///
  /// Parameters:
  ///
  /// * [GenerateGoodsTurnoverRequest] generateGoodsTurnoverRequest (required):
  ///
  /// * [ReportFormatType] format:
  ///   Формат отчета.
  Future<GenerateReportResponse?> generateGoodsTurnoverReport(GenerateGoodsTurnoverRequest generateGoodsTurnoverRequest, { ReportFormatType? format, }) async {
    final response = await generateGoodsTurnoverReportWithHttpInfo(generateGoodsTurnoverRequest,  format: format, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'GenerateReportResponse',) as GenerateReportResponse;
    
    }
    return null;
  }

  /// Готовые ярлыки‑наклейки на все коробки в нескольких заказах
  ///
  /// Запускает генерацию PDF-файла с ярлыками для переданных заказов. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  Узнать статус генерации и получить ссылку на готовый файл можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 1000 запросов в час| |-| 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [GenerateMassOrderLabelsRequest] generateMassOrderLabelsRequest (required):
  ///
  /// * [PageFormatType] format:
  ///   Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A7.
  Future<Response> generateMassOrderLabelsReportWithHttpInfo(GenerateMassOrderLabelsRequest generateMassOrderLabelsRequest, { PageFormatType? format, }) async {
    // ignore: prefer_const_declarations
    final path = r'/reports/documents/labels/generate';

    // ignore: prefer_final_locals
    Object? postBody = generateMassOrderLabelsRequest;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (format != null) {
      queryParams.addAll(_queryParams('', 'format', format));
    }

    const contentTypes = <String>['application/json'];


    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Готовые ярлыки‑наклейки на все коробки в нескольких заказах
  ///
  /// Запускает генерацию PDF-файла с ярлыками для переданных заказов. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  Узнать статус генерации и получить ссылку на готовый файл можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 1000 запросов в час| |-| 
  ///
  /// Parameters:
  ///
  /// * [GenerateMassOrderLabelsRequest] generateMassOrderLabelsRequest (required):
  ///
  /// * [PageFormatType] format:
  ///   Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A7.
  Future<GenerateReportResponse?> generateMassOrderLabelsReport(GenerateMassOrderLabelsRequest generateMassOrderLabelsRequest, { PageFormatType? format, }) async {
    final response = await generateMassOrderLabelsReportWithHttpInfo(generateMassOrderLabelsRequest,  format: format, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'GenerateReportResponse',) as GenerateReportResponse;
    
    }
    return null;
  }

  /// Отчет «Цены на рынке»
  ///
  /// Запускает генерацию **отчета «Цены на рынке»**.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [GeneratePricesReportRequest] generatePricesReportRequest (required):
  ///
  /// * [ReportFormatType] format:
  ///   Формат отчета.
  Future<Response> generatePricesReportWithHttpInfo(GeneratePricesReportRequest generatePricesReportRequest, { ReportFormatType? format, }) async {
    // ignore: prefer_const_declarations
    final path = r'/reports/prices/generate';

    // ignore: prefer_final_locals
    Object? postBody = generatePricesReportRequest;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (format != null) {
      queryParams.addAll(_queryParams('', 'format', format));
    }

    const contentTypes = <String>['application/json'];


    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Отчет «Цены на рынке»
  ///
  /// Запускает генерацию **отчета «Цены на рынке»**.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
  ///
  /// Parameters:
  ///
  /// * [GeneratePricesReportRequest] generatePricesReportRequest (required):
  ///
  /// * [ReportFormatType] format:
  ///   Формат отчета.
  Future<GenerateReportResponse?> generatePricesReport(GeneratePricesReportRequest generatePricesReportRequest, { ReportFormatType? format, }) async {
    final response = await generatePricesReportWithHttpInfo(generatePricesReportRequest,  format: format, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'GenerateReportResponse',) as GenerateReportResponse;
    
    }
    return null;
  }

  /// Отчет по полкам
  ///
  /// Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [GenerateShelfsStatisticsRequest] generateShelfsStatisticsRequest (required):
  ///
  /// * [ReportFormatType] format:
  ///   Формат отчета.
  Future<Response> generateShelfsStatisticsReportWithHttpInfo(GenerateShelfsStatisticsRequest generateShelfsStatisticsRequest, { ReportFormatType? format, }) async {
    // ignore: prefer_const_declarations
    final path = r'/reports/shelf-statistics/generate';

    // ignore: prefer_final_locals
    Object? postBody = generateShelfsStatisticsRequest;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (format != null) {
      queryParams.addAll(_queryParams('', 'format', format));
    }

    const contentTypes = <String>['application/json'];


    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Отчет по полкам
  ///
  /// Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
  ///
  /// Parameters:
  ///
  /// * [GenerateShelfsStatisticsRequest] generateShelfsStatisticsRequest (required):
  ///
  /// * [ReportFormatType] format:
  ///   Формат отчета.
  Future<GenerateReportResponse?> generateShelfsStatisticsReport(GenerateShelfsStatisticsRequest generateShelfsStatisticsRequest, { ReportFormatType? format, }) async {
    final response = await generateShelfsStatisticsReportWithHttpInfo(generateShelfsStatisticsRequest,  format: format, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'GenerateReportResponse',) as GenerateReportResponse;
    
    }
    return null;
  }

  /// Получение листа сборки
  ///
  /// Запускает генерацию **листа сборки** для отгрузки.  Узнать статус генерации и получить ссылку на готовый документ можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [GenerateShipmentListDocumentReportRequest] generateShipmentListDocumentReportRequest (required):
  Future<Response> generateShipmentListDocumentReportWithHttpInfo(GenerateShipmentListDocumentReportRequest generateShipmentListDocumentReportRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/reports/documents/shipment-list/generate';

    // ignore: prefer_final_locals
    Object? postBody = generateShipmentListDocumentReportRequest;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>['application/json'];


    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Получение листа сборки
  ///
  /// Запускает генерацию **листа сборки** для отгрузки.  Узнать статус генерации и получить ссылку на готовый документ можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
  ///
  /// Parameters:
  ///
  /// * [GenerateShipmentListDocumentReportRequest] generateShipmentListDocumentReportRequest (required):
  Future<GenerateReportResponse?> generateShipmentListDocumentReport(GenerateShipmentListDocumentReportRequest generateShipmentListDocumentReportRequest,) async {
    final response = await generateShipmentListDocumentReportWithHttpInfo(generateShipmentListDocumentReportRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'GenerateReportResponse',) as GenerateReportResponse;
    
    }
    return null;
  }

  /// Отчет «Аналитика продаж»
  ///
  /// Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 10 запросов в час| |-| 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [GenerateShowsSalesReportRequest] generateShowsSalesReportRequest (required):
  ///
  /// * [ReportFormatType] format:
  ///   Формат отчета.
  Future<Response> generateShowsSalesReportWithHttpInfo(GenerateShowsSalesReportRequest generateShowsSalesReportRequest, { ReportFormatType? format, }) async {
    // ignore: prefer_const_declarations
    final path = r'/reports/shows-sales/generate';

    // ignore: prefer_final_locals
    Object? postBody = generateShowsSalesReportRequest;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (format != null) {
      queryParams.addAll(_queryParams('', 'format', format));
    }

    const contentTypes = <String>['application/json'];


    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Отчет «Аналитика продаж»
  ///
  /// Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 10 запросов в час| |-| 
  ///
  /// Parameters:
  ///
  /// * [GenerateShowsSalesReportRequest] generateShowsSalesReportRequest (required):
  ///
  /// * [ReportFormatType] format:
  ///   Формат отчета.
  Future<GenerateReportResponse?> generateShowsSalesReport(GenerateShowsSalesReportRequest generateShowsSalesReportRequest, { ReportFormatType? format, }) async {
    final response = await generateShowsSalesReportWithHttpInfo(generateShowsSalesReportRequest,  format: format, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'GenerateReportResponse',) as GenerateReportResponse;
    
    }
    return null;
  }

  /// Отчет по остаткам на складах
  ///
  /// Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:  * Для модели FBY — об остатках на складах Маркета. * Для остальных моделей — об остатках на соответствующем складе магазина.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [GenerateStocksOnWarehousesReportRequest] generateStocksOnWarehousesReportRequest (required):
  ///
  /// * [ReportFormatType] format:
  ///   Формат отчета.
  Future<Response> generateStocksOnWarehousesReportWithHttpInfo(GenerateStocksOnWarehousesReportRequest generateStocksOnWarehousesReportRequest, { ReportFormatType? format, }) async {
    // ignore: prefer_const_declarations
    final path = r'/reports/stocks-on-warehouses/generate';

    // ignore: prefer_final_locals
    Object? postBody = generateStocksOnWarehousesReportRequest;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (format != null) {
      queryParams.addAll(_queryParams('', 'format', format));
    }

    const contentTypes = <String>['application/json'];


    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Отчет по остаткам на складах
  ///
  /// Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:  * Для модели FBY — об остатках на складах Маркета. * Для остальных моделей — об остатках на соответствующем складе магазина.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
  ///
  /// Parameters:
  ///
  /// * [GenerateStocksOnWarehousesReportRequest] generateStocksOnWarehousesReportRequest (required):
  ///
  /// * [ReportFormatType] format:
  ///   Формат отчета.
  Future<GenerateReportResponse?> generateStocksOnWarehousesReport(GenerateStocksOnWarehousesReportRequest generateStocksOnWarehousesReportRequest, { ReportFormatType? format, }) async {
    final response = await generateStocksOnWarehousesReportWithHttpInfo(generateStocksOnWarehousesReportRequest,  format: format, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'GenerateReportResponse',) as GenerateReportResponse;
    
    }
    return null;
  }

  /// Отчет по стоимости услуг
  ///
  /// Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**               |**Какие поля нужны**             | |-----------------------------|---------------------------------| |По дате начисления услуги    |`dateFrom` и `dateTo`            | |По дате формирования акта    |`year` и `month`                 |  Заказать отчеты обоих типов одним запросом нельзя.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [GenerateUnitedMarketplaceServicesReportRequest] generateUnitedMarketplaceServicesReportRequest (required):
  ///
  /// * [ReportFormatType] format:
  ///   Формат отчета.
  Future<Response> generateUnitedMarketplaceServicesReportWithHttpInfo(GenerateUnitedMarketplaceServicesReportRequest generateUnitedMarketplaceServicesReportRequest, { ReportFormatType? format, }) async {
    // ignore: prefer_const_declarations
    final path = r'/reports/united-marketplace-services/generate';

    // ignore: prefer_final_locals
    Object? postBody = generateUnitedMarketplaceServicesReportRequest;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (format != null) {
      queryParams.addAll(_queryParams('', 'format', format));
    }

    const contentTypes = <String>['application/json'];


    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Отчет по стоимости услуг
  ///
  /// Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**               |**Какие поля нужны**             | |-----------------------------|---------------------------------| |По дате начисления услуги    |`dateFrom` и `dateTo`            | |По дате формирования акта    |`year` и `month`                 |  Заказать отчеты обоих типов одним запросом нельзя.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
  ///
  /// Parameters:
  ///
  /// * [GenerateUnitedMarketplaceServicesReportRequest] generateUnitedMarketplaceServicesReportRequest (required):
  ///
  /// * [ReportFormatType] format:
  ///   Формат отчета.
  Future<GenerateReportResponse?> generateUnitedMarketplaceServicesReport(GenerateUnitedMarketplaceServicesReportRequest generateUnitedMarketplaceServicesReportRequest, { ReportFormatType? format, }) async {
    final response = await generateUnitedMarketplaceServicesReportWithHttpInfo(generateUnitedMarketplaceServicesReportRequest,  format: format, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'GenerateReportResponse',) as GenerateReportResponse;
    
    }
    return null;
  }

  /// Отчет по платежам
  ///
  /// Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**           |**Какие поля нужны**                   | |-------------------------|---------------------------------------| |О платежах за период     |`dateFrom` и `dateTo`                  | |О платежном поручении    |`bankOrderId` и `bankOrderDateTime`    |  Заказать отчеты обоих типов одним запросом нельзя.  |**⚙️ Лимит:** 100 запросов в час| |-| 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [GenerateUnitedNettingReportRequest] generateUnitedNettingReportRequest (required):
  ///
  /// * [ReportFormatType] format:
  ///   Формат отчета.
  Future<Response> generateUnitedNettingReportWithHttpInfo(GenerateUnitedNettingReportRequest generateUnitedNettingReportRequest, { ReportFormatType? format, }) async {
    // ignore: prefer_const_declarations
    final path = r'/reports/united-netting/generate';

    // ignore: prefer_final_locals
    Object? postBody = generateUnitedNettingReportRequest;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (format != null) {
      queryParams.addAll(_queryParams('', 'format', format));
    }

    const contentTypes = <String>['application/json'];


    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Отчет по платежам
  ///
  /// Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**           |**Какие поля нужны**                   | |-------------------------|---------------------------------------| |О платежах за период     |`dateFrom` и `dateTo`                  | |О платежном поручении    |`bankOrderId` и `bankOrderDateTime`    |  Заказать отчеты обоих типов одним запросом нельзя.  |**⚙️ Лимит:** 100 запросов в час| |-| 
  ///
  /// Parameters:
  ///
  /// * [GenerateUnitedNettingReportRequest] generateUnitedNettingReportRequest (required):
  ///
  /// * [ReportFormatType] format:
  ///   Формат отчета.
  Future<GenerateReportResponse?> generateUnitedNettingReport(GenerateUnitedNettingReportRequest generateUnitedNettingReportRequest, { ReportFormatType? format, }) async {
    final response = await generateUnitedNettingReportWithHttpInfo(generateUnitedNettingReportRequest,  format: format, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'GenerateReportResponse',) as GenerateReportResponse;
    
    }
    return null;
  }

  /// Отчет по заказам
  ///
  /// Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)  {% note info \"\" %}  Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)  {% endnote %}  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [GenerateUnitedOrdersRequest] generateUnitedOrdersRequest (required):
  ///
  /// * [ReportFormatType] format:
  ///   Формат отчета.
  Future<Response> generateUnitedOrdersReportWithHttpInfo(GenerateUnitedOrdersRequest generateUnitedOrdersRequest, { ReportFormatType? format, }) async {
    // ignore: prefer_const_declarations
    final path = r'/reports/united-orders/generate';

    // ignore: prefer_final_locals
    Object? postBody = generateUnitedOrdersRequest;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (format != null) {
      queryParams.addAll(_queryParams('', 'format', format));
    }

    const contentTypes = <String>['application/json'];


    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Отчет по заказам
  ///
  /// Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)  {% note info \"\" %}  Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)  {% endnote %}  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
  ///
  /// Parameters:
  ///
  /// * [GenerateUnitedOrdersRequest] generateUnitedOrdersRequest (required):
  ///
  /// * [ReportFormatType] format:
  ///   Формат отчета.
  Future<GenerateReportResponse?> generateUnitedOrdersReport(GenerateUnitedOrdersRequest generateUnitedOrdersRequest, { ReportFormatType? format, }) async {
    final response = await generateUnitedOrdersReportWithHttpInfo(generateUnitedOrdersRequest,  format: format, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'GenerateReportResponse',) as GenerateReportResponse;
    
    }
    return null;
  }

  /// Получение заданного отчета
  ///
  /// Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.  Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] reportId (required):
  ///   Идентификатор отчета, который вы получили после запуска генерации. 
  Future<Response> getReportInfoWithHttpInfo(String reportId,) async {
    // ignore: prefer_const_declarations
    final path = r'/reports/info/{reportId}'
      .replaceAll('{reportId}', reportId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Получение заданного отчета
  ///
  /// Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.  Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
  ///
  /// Parameters:
  ///
  /// * [String] reportId (required):
  ///   Идентификатор отчета, который вы получили после запуска генерации. 
  Future<GetReportInfoResponse?> getReportInfo(String reportId,) async {
    final response = await getReportInfoWithHttpInfo(reportId,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'GetReportInfoResponse',) as GetReportInfoResponse;
    
    }
    return null;
  }
}
