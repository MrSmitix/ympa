//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class OrderLabelsApi {
  OrderLabelsApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Готовый ярлык‑наклейка для коробки в заказе
  ///
  /// Формирует ярлык‑наклейку для коробки в заказе и возвращает ярлык в PDF‑файле.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] campaignId (required):
  ///   Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  ///
  /// * [int] orderId (required):
  ///   Идентификатор заказа.
  ///
  /// * [int] shipmentId (required):
  ///   Идентификатор грузоместа.
  ///
  /// * [int] boxId (required):
  ///   Идентификатор коробки.
  ///
  /// * [PageFormatType] format:
  ///   Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6.
  Future<Response> generateOrderLabelWithHttpInfo(int campaignId, int orderId, int shipmentId, int boxId, { PageFormatType? format, }) async {
    // ignore: prefer_const_declarations
    final path = r'/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label'
      .replaceAll('{campaignId}', campaignId.toString())
      .replaceAll('{orderId}', orderId.toString())
      .replaceAll('{shipmentId}', shipmentId.toString())
      .replaceAll('{boxId}', boxId.toString());

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (format != null) {
      queryParams.addAll(_queryParams('', 'format', format));
    }

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

  /// Готовый ярлык‑наклейка для коробки в заказе
  ///
  /// Формирует ярлык‑наклейку для коробки в заказе и возвращает ярлык в PDF‑файле.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
  ///
  /// Parameters:
  ///
  /// * [int] campaignId (required):
  ///   Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  ///
  /// * [int] orderId (required):
  ///   Идентификатор заказа.
  ///
  /// * [int] shipmentId (required):
  ///   Идентификатор грузоместа.
  ///
  /// * [int] boxId (required):
  ///   Идентификатор коробки.
  ///
  /// * [PageFormatType] format:
  ///   Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6.
  Future<MultipartFile?> generateOrderLabel(int campaignId, int orderId, int shipmentId, int boxId, { PageFormatType? format, }) async {
    final response = await generateOrderLabelWithHttpInfo(campaignId, orderId, shipmentId, boxId,  format: format, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'MultipartFile',) as MultipartFile;
    
    }
    return null;
  }

  /// Готовые ярлыки‑наклейки на все коробки в одном заказе
  ///
  /// Возвращает PDF-файл с ярлыками, которые нужно наклеить на коробки перед отгрузкой. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  На вход нужно передать идентификатор заказа и один необязательный параметр, который управляет версткой PDF-файла.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] campaignId (required):
  ///   Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  ///
  /// * [int] orderId (required):
  ///   Идентификатор заказа.
  ///
  /// * [PageFormatType] format:
  ///   Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6.
  Future<Response> generateOrderLabelsWithHttpInfo(int campaignId, int orderId, { PageFormatType? format, }) async {
    // ignore: prefer_const_declarations
    final path = r'/campaigns/{campaignId}/orders/{orderId}/delivery/labels'
      .replaceAll('{campaignId}', campaignId.toString())
      .replaceAll('{orderId}', orderId.toString());

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (format != null) {
      queryParams.addAll(_queryParams('', 'format', format));
    }

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

  /// Готовые ярлыки‑наклейки на все коробки в одном заказе
  ///
  /// Возвращает PDF-файл с ярлыками, которые нужно наклеить на коробки перед отгрузкой. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  На вход нужно передать идентификатор заказа и один необязательный параметр, который управляет версткой PDF-файла.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
  ///
  /// Parameters:
  ///
  /// * [int] campaignId (required):
  ///   Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  ///
  /// * [int] orderId (required):
  ///   Идентификатор заказа.
  ///
  /// * [PageFormatType] format:
  ///   Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6.
  Future<MultipartFile?> generateOrderLabels(int campaignId, int orderId, { PageFormatType? format, }) async {
    final response = await generateOrderLabelsWithHttpInfo(campaignId, orderId,  format: format, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'MultipartFile',) as MultipartFile;
    
    }
    return null;
  }

  /// Данные для самостоятельного изготовления ярлыков
  ///
  /// Возвращает информацию на ярлыках, которые клеятся на коробки в заказе.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] campaignId (required):
  ///   Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  ///
  /// * [int] orderId (required):
  ///   Идентификатор заказа.
  Future<Response> getOrderLabelsDataWithHttpInfo(int campaignId, int orderId,) async {
    // ignore: prefer_const_declarations
    final path = r'/campaigns/{campaignId}/orders/{orderId}/delivery/labels/data'
      .replaceAll('{campaignId}', campaignId.toString())
      .replaceAll('{orderId}', orderId.toString());

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

  /// Данные для самостоятельного изготовления ярлыков
  ///
  /// Возвращает информацию на ярлыках, которые клеятся на коробки в заказе.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
  ///
  /// Parameters:
  ///
  /// * [int] campaignId (required):
  ///   Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  ///
  /// * [int] orderId (required):
  ///   Идентификатор заказа.
  Future<GetOrderLabelsDataResponse?> getOrderLabelsData(int campaignId, int orderId,) async {
    final response = await getOrderLabelsDataWithHttpInfo(campaignId, orderId,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'GetOrderLabelsDataResponse',) as GetOrderLabelsDataResponse;
    
    }
    return null;
  }
}
