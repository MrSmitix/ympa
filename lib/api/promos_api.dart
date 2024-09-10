//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class PromosApi {
  PromosApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Удаление товаров из акции
  ///
  /// Убирает товары из акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] businessId (required):
  ///   Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  ///
  /// * [DeletePromoOffersRequest] deletePromoOffersRequest (required):
  Future<Response> deletePromoOffersWithHttpInfo(int businessId, DeletePromoOffersRequest deletePromoOffersRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/businesses/{businessId}/promos/offers/delete'
      .replaceAll('{businessId}', businessId.toString());

    // ignore: prefer_final_locals
    Object? postBody = deletePromoOffersRequest;

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

  /// Удаление товаров из акции
  ///
  /// Убирает товары из акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
  ///
  /// Parameters:
  ///
  /// * [int] businessId (required):
  ///   Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  ///
  /// * [DeletePromoOffersRequest] deletePromoOffersRequest (required):
  Future<DeletePromoOffersResponse?> deletePromoOffers(int businessId, DeletePromoOffersRequest deletePromoOffersRequest,) async {
    final response = await deletePromoOffersWithHttpInfo(businessId, deletePromoOffersRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'DeletePromoOffersResponse',) as DeletePromoOffersResponse;
    
    }
    return null;
  }

  /// Получение списка товаров, которые участвуют или могут участвовать в акции
  ///
  /// Возвращает список товаров, которые участвуют или могут участвовать в акции.  {% note warning %}  В параметре `limit` не передавайте значение больше 500.  {% endnote %}  |**⚙️ Лимит:** 10000 запросов в час| |-| 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] businessId (required):
  ///   Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  ///
  /// * [GetPromoOffersRequest] getPromoOffersRequest (required):
  ///
  /// * [String] pageToken:
  ///   Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
  ///
  /// * [int] limit:
  ///   Количество значений на одной странице. 
  Future<Response> getPromoOffersWithHttpInfo(int businessId, GetPromoOffersRequest getPromoOffersRequest, { String? pageToken, int? limit, }) async {
    // ignore: prefer_const_declarations
    final path = r'/businesses/{businessId}/promos/offers'
      .replaceAll('{businessId}', businessId.toString());

    // ignore: prefer_final_locals
    Object? postBody = getPromoOffersRequest;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (pageToken != null) {
      queryParams.addAll(_queryParams('', 'page_token', pageToken));
    }
    if (limit != null) {
      queryParams.addAll(_queryParams('', 'limit', limit));
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

  /// Получение списка товаров, которые участвуют или могут участвовать в акции
  ///
  /// Возвращает список товаров, которые участвуют или могут участвовать в акции.  {% note warning %}  В параметре `limit` не передавайте значение больше 500.  {% endnote %}  |**⚙️ Лимит:** 10000 запросов в час| |-| 
  ///
  /// Parameters:
  ///
  /// * [int] businessId (required):
  ///   Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  ///
  /// * [GetPromoOffersRequest] getPromoOffersRequest (required):
  ///
  /// * [String] pageToken:
  ///   Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
  ///
  /// * [int] limit:
  ///   Количество значений на одной странице. 
  Future<GetPromoOffersResponse?> getPromoOffers(int businessId, GetPromoOffersRequest getPromoOffersRequest, { String? pageToken, int? limit, }) async {
    final response = await getPromoOffersWithHttpInfo(businessId, getPromoOffersRequest,  pageToken: pageToken, limit: limit, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'GetPromoOffersResponse',) as GetPromoOffersResponse;
    
    }
    return null;
  }

  /// Получение списка акций
  ///
  /// Возвращает информацию об акциях Маркета.  По умолчанию возвращаются акции, в которых продавец участвует или может принять участие.  Чтобы получить текущие или завершенные акции, передайте параметр `participation`.  Типы акций, которые возвращаются в ответе:  * прямая скидка; * флеш-акция; * скидка по промокоду.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] businessId (required):
  ///   Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  ///
  /// * [GetPromosRequest] getPromosRequest:
  Future<Response> getPromosWithHttpInfo(int businessId, { GetPromosRequest? getPromosRequest, }) async {
    // ignore: prefer_const_declarations
    final path = r'/businesses/{businessId}/promos'
      .replaceAll('{businessId}', businessId.toString());

    // ignore: prefer_final_locals
    Object? postBody = getPromosRequest;

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

  /// Получение списка акций
  ///
  /// Возвращает информацию об акциях Маркета.  По умолчанию возвращаются акции, в которых продавец участвует или может принять участие.  Чтобы получить текущие или завершенные акции, передайте параметр `participation`.  Типы акций, которые возвращаются в ответе:  * прямая скидка; * флеш-акция; * скидка по промокоду.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
  ///
  /// Parameters:
  ///
  /// * [int] businessId (required):
  ///   Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  ///
  /// * [GetPromosRequest] getPromosRequest:
  Future<GetPromosResponse?> getPromos(int businessId, { GetPromosRequest? getPromosRequest, }) async {
    final response = await getPromosWithHttpInfo(businessId,  getPromosRequest: getPromosRequest, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'GetPromosResponse',) as GetPromosResponse;
    
    }
    return null;
  }

  /// Добавление товаров в акцию или изменение их цен
  ///
  /// Добавляет товары в акцию или изменяет цены на товары, которые участвуют в акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] businessId (required):
  ///   Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  ///
  /// * [UpdatePromoOffersRequest] updatePromoOffersRequest (required):
  Future<Response> updatePromoOffersWithHttpInfo(int businessId, UpdatePromoOffersRequest updatePromoOffersRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/businesses/{businessId}/promos/offers/update'
      .replaceAll('{businessId}', businessId.toString());

    // ignore: prefer_final_locals
    Object? postBody = updatePromoOffersRequest;

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

  /// Добавление товаров в акцию или изменение их цен
  ///
  /// Добавляет товары в акцию или изменяет цены на товары, которые участвуют в акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
  ///
  /// Parameters:
  ///
  /// * [int] businessId (required):
  ///   Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  ///
  /// * [UpdatePromoOffersRequest] updatePromoOffersRequest (required):
  Future<UpdatePromoOffersResponse?> updatePromoOffers(int businessId, UpdatePromoOffersRequest updatePromoOffersRequest,) async {
    final response = await updatePromoOffersWithHttpInfo(businessId, updatePromoOffersRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'UpdatePromoOffersResponse',) as UpdatePromoOffersResponse;
    
    }
    return null;
  }
}
