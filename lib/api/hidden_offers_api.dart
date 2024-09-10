//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class HiddenOffersApi {
  HiddenOffersApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Скрытие товаров и настройки скрытия
  ///
  /// Скрывает товары магазина на Маркете.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] campaignId (required):
  ///   Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  ///
  /// * [AddHiddenOffersRequest] addHiddenOffersRequest (required):
  ///   Запрос на скрытие оферов.
  Future<Response> addHiddenOffersWithHttpInfo(int campaignId, AddHiddenOffersRequest addHiddenOffersRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/campaigns/{campaignId}/hidden-offers'
      .replaceAll('{campaignId}', campaignId.toString());

    // ignore: prefer_final_locals
    Object? postBody = addHiddenOffersRequest;

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

  /// Скрытие товаров и настройки скрытия
  ///
  /// Скрывает товары магазина на Маркете.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
  ///
  /// Parameters:
  ///
  /// * [int] campaignId (required):
  ///   Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  ///
  /// * [AddHiddenOffersRequest] addHiddenOffersRequest (required):
  ///   Запрос на скрытие оферов.
  Future<EmptyApiResponse?> addHiddenOffers(int campaignId, AddHiddenOffersRequest addHiddenOffersRequest,) async {
    final response = await addHiddenOffersWithHttpInfo(campaignId, addHiddenOffersRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'EmptyApiResponse',) as EmptyApiResponse;
    
    }
    return null;
  }

  /// Возобновление показа товаров
  ///
  /// Возобновляет показ скрытых вами товаров магазина на Маркете.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] campaignId (required):
  ///   Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  ///
  /// * [DeleteHiddenOffersRequest] deleteHiddenOffersRequest (required):
  ///   Запрос на возобновление показа оферов.
  Future<Response> deleteHiddenOffersWithHttpInfo(int campaignId, DeleteHiddenOffersRequest deleteHiddenOffersRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/campaigns/{campaignId}/hidden-offers/delete'
      .replaceAll('{campaignId}', campaignId.toString());

    // ignore: prefer_final_locals
    Object? postBody = deleteHiddenOffersRequest;

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

  /// Возобновление показа товаров
  ///
  /// Возобновляет показ скрытых вами товаров магазина на Маркете.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
  ///
  /// Parameters:
  ///
  /// * [int] campaignId (required):
  ///   Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  ///
  /// * [DeleteHiddenOffersRequest] deleteHiddenOffersRequest (required):
  ///   Запрос на возобновление показа оферов.
  Future<EmptyApiResponse?> deleteHiddenOffers(int campaignId, DeleteHiddenOffersRequest deleteHiddenOffersRequest,) async {
    final response = await deleteHiddenOffersWithHttpInfo(campaignId, deleteHiddenOffersRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'EmptyApiResponse',) as EmptyApiResponse;
    
    }
    return null;
  }

  /// Информация о скрытых вами товарах
  ///
  /// Возвращает список скрытых вами товаров для заданного магазина.  В списке будут товары, скрытые любым способом — по API, с помощью YML-фида, в кабинете и так далее.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] campaignId (required):
  ///   Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  ///
  /// * [List<String>] offerId:
  ///   Идентификатор скрытого предложения. 
  ///
  /// * [String] pageToken:
  ///   Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
  ///
  /// * [int] limit:
  ///   Количество значений на одной странице. 
  ///
  /// * [int] offset:
  ///   Позиция в списке, начиная с которой возвращаются результаты ответа.  Используется вместе с параметром `limit`.  Если задан `offset`, параметры `page_number` и `page_size` игнорируются.  `offset` игнорируется, если задан `page_token`. 
  ///
  /// * [int] page:
  ///   Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`. 
  ///
  /// * [int] pageSize:
  ///   Размер страницы.  Используется вместе с параметром `page_number`.  `page_size` игнорируется, если задан `page_token`, `limit` или `offset`. 
  Future<Response> getHiddenOffersWithHttpInfo(int campaignId, { List<String>? offerId, String? pageToken, int? limit, int? offset, int? page, int? pageSize, }) async {
    // ignore: prefer_const_declarations
    final path = r'/campaigns/{campaignId}/hidden-offers'
      .replaceAll('{campaignId}', campaignId.toString());

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (offerId != null) {
      queryParams.addAll(_queryParams('csv', 'offer_id', offerId));
    }
    if (pageToken != null) {
      queryParams.addAll(_queryParams('', 'page_token', pageToken));
    }
    if (limit != null) {
      queryParams.addAll(_queryParams('', 'limit', limit));
    }
    if (offset != null) {
      queryParams.addAll(_queryParams('', 'offset', offset));
    }
    if (page != null) {
      queryParams.addAll(_queryParams('', 'page', page));
    }
    if (pageSize != null) {
      queryParams.addAll(_queryParams('', 'pageSize', pageSize));
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

  /// Информация о скрытых вами товарах
  ///
  /// Возвращает список скрытых вами товаров для заданного магазина.  В списке будут товары, скрытые любым способом — по API, с помощью YML-фида, в кабинете и так далее.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
  ///
  /// Parameters:
  ///
  /// * [int] campaignId (required):
  ///   Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  ///
  /// * [List<String>] offerId:
  ///   Идентификатор скрытого предложения. 
  ///
  /// * [String] pageToken:
  ///   Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
  ///
  /// * [int] limit:
  ///   Количество значений на одной странице. 
  ///
  /// * [int] offset:
  ///   Позиция в списке, начиная с которой возвращаются результаты ответа.  Используется вместе с параметром `limit`.  Если задан `offset`, параметры `page_number` и `page_size` игнорируются.  `offset` игнорируется, если задан `page_token`. 
  ///
  /// * [int] page:
  ///   Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`. 
  ///
  /// * [int] pageSize:
  ///   Размер страницы.  Используется вместе с параметром `page_number`.  `page_size` игнорируется, если задан `page_token`, `limit` или `offset`. 
  Future<GetHiddenOffersResponse?> getHiddenOffers(int campaignId, { List<String>? offerId, String? pageToken, int? limit, int? offset, int? page, int? pageSize, }) async {
    final response = await getHiddenOffersWithHttpInfo(campaignId,  offerId: offerId, pageToken: pageToken, limit: limit, offset: offset, page: page, pageSize: pageSize, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'GetHiddenOffersResponse',) as GetHiddenOffersResponse;
    
    }
    return null;
  }
}
