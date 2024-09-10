//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class ReturnsApi {
  ReturnsApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Информация о невыкупе или возврате
  ///
  /// Получает информацию по одному невыкупу или возврату.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
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
  /// * [int] returnId (required):
  ///   Идентификатор возврата.
  Future<Response> getReturnWithHttpInfo(int campaignId, int orderId, int returnId,) async {
    // ignore: prefer_const_declarations
    final path = r'/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}'
      .replaceAll('{campaignId}', campaignId.toString())
      .replaceAll('{orderId}', orderId.toString())
      .replaceAll('{returnId}', returnId.toString());

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

  /// Информация о невыкупе или возврате
  ///
  /// Получает информацию по одному невыкупу или возврату.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
  ///
  /// Parameters:
  ///
  /// * [int] campaignId (required):
  ///   Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  ///
  /// * [int] orderId (required):
  ///   Идентификатор заказа.
  ///
  /// * [int] returnId (required):
  ///   Идентификатор возврата.
  Future<GetReturnResponse?> getReturn(int campaignId, int orderId, int returnId,) async {
    final response = await getReturnWithHttpInfo(campaignId, orderId, returnId,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'GetReturnResponse',) as GetReturnResponse;
    
    }
    return null;
  }

  /// Получение заявления на возврат
  ///
  /// Загружает заявление покупателя на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
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
  /// * [int] returnId (required):
  ///   Идентификатор возврата.
  Future<Response> getReturnApplicationWithHttpInfo(int campaignId, int orderId, int returnId,) async {
    // ignore: prefer_const_declarations
    final path = r'/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application'
      .replaceAll('{campaignId}', campaignId.toString())
      .replaceAll('{orderId}', orderId.toString())
      .replaceAll('{returnId}', returnId.toString());

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

  /// Получение заявления на возврат
  ///
  /// Загружает заявление покупателя на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
  ///
  /// Parameters:
  ///
  /// * [int] campaignId (required):
  ///   Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  ///
  /// * [int] orderId (required):
  ///   Идентификатор заказа.
  ///
  /// * [int] returnId (required):
  ///   Идентификатор возврата.
  Future<MultipartFile?> getReturnApplication(int campaignId, int orderId, int returnId,) async {
    final response = await getReturnApplicationWithHttpInfo(campaignId, orderId, returnId,);
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

  /// Получение фотографии возврата
  ///
  /// Получает фотографии, которые покупатель приложил к заявлению на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
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
  /// * [int] returnId (required):
  ///   Идентификатор возврата.
  ///
  /// * [int] itemId (required):
  ///   Идентификатор товара в возврате.
  ///
  /// * [String] imageHash (required):
  ///   Хеш ссылки изображения для загрузки.
  Future<Response> getReturnPhotoWithHttpInfo(int campaignId, int orderId, int returnId, int itemId, String imageHash,) async {
    // ignore: prefer_const_declarations
    final path = r'/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}'
      .replaceAll('{campaignId}', campaignId.toString())
      .replaceAll('{orderId}', orderId.toString())
      .replaceAll('{returnId}', returnId.toString())
      .replaceAll('{itemId}', itemId.toString())
      .replaceAll('{imageHash}', imageHash);

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

  /// Получение фотографии возврата
  ///
  /// Получает фотографии, которые покупатель приложил к заявлению на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
  ///
  /// Parameters:
  ///
  /// * [int] campaignId (required):
  ///   Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  ///
  /// * [int] orderId (required):
  ///   Идентификатор заказа.
  ///
  /// * [int] returnId (required):
  ///   Идентификатор возврата.
  ///
  /// * [int] itemId (required):
  ///   Идентификатор товара в возврате.
  ///
  /// * [String] imageHash (required):
  ///   Хеш ссылки изображения для загрузки.
  Future<MultipartFile?> getReturnPhoto(int campaignId, int orderId, int returnId, int itemId, String imageHash,) async {
    final response = await getReturnPhotoWithHttpInfo(campaignId, orderId, returnId, itemId, imageHash,);
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

  /// Список невыкупов и возвратов
  ///
  /// Получает список невыкупов и возвратов.  Чтобы получить информацию по одному возврату или невыкупу, выполните запрос [GET campaigns/{campaignId}/orders/{orderId}/returns/{returnId}](../../reference/orders/getReturn.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] campaignId (required):
  ///   Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  ///
  /// * [String] pageToken:
  ///   Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
  ///
  /// * [int] limit:
  ///   Количество значений на одной странице. 
  ///
  /// * [List<int>] orderIds:
  ///   Идентификаторы заказов — для фильтрации результатов.  Несколько идентификаторов перечисляются через запятую без пробела. Максимальное количество идентификаторов — 50. 
  ///
  /// * [List<RefundStatusType>] statuses:
  ///   Статусы возвратов или невыкупов — для фильтрации результатов.  Несколько статусов перечисляются через запятую. 
  ///
  /// * [ReturnType] type:
  ///   Тип заказа для фильтрации:  * `RETURN` — возврат.  * `UNREDEEMED` — невыкуп.  Если не указывать, в ответе будут и возвраты, и невыкупы. 
  ///
  /// * [DateTime] fromDate:
  ///   Начальная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: `ГГГГ-ММ-ДД`. 
  ///
  /// * [DateTime] toDate:
  ///   Конечная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: `ГГГГ-ММ-ДД`. 
  ///
  /// * [DateTime] fromDate2:
  ///   {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `fromDate`.  {% endnote %}  Начальная дата для фильтрации возвратов или невыкупов по дате обновления. 
  ///
  /// * [DateTime] toDate2:
  ///   {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `toDate`.  {% endnote %}  Конечная дата для фильтрации возвратов или невыкупов по дате обновления. 
  Future<Response> getReturnsWithHttpInfo(int campaignId, { String? pageToken, int? limit, List<int>? orderIds, List<RefundStatusType>? statuses, ReturnType? type, DateTime? fromDate, DateTime? toDate, DateTime? fromDate2, DateTime? toDate2, }) async {
    // ignore: prefer_const_declarations
    final path = r'/campaigns/{campaignId}/returns'
      .replaceAll('{campaignId}', campaignId.toString());

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (pageToken != null) {
      queryParams.addAll(_queryParams('', 'page_token', pageToken));
    }
    if (limit != null) {
      queryParams.addAll(_queryParams('', 'limit', limit));
    }
    if (orderIds != null) {
      queryParams.addAll(_queryParams('csv', 'orderIds', orderIds));
    }
    if (statuses != null) {
      queryParams.addAll(_queryParams('csv', 'statuses', statuses));
    }
    if (type != null) {
      queryParams.addAll(_queryParams('', 'type', type));
    }
    if (fromDate != null) {
      queryParams.addAll(_queryParams('', 'fromDate', fromDate));
    }
    if (toDate != null) {
      queryParams.addAll(_queryParams('', 'toDate', toDate));
    }
    if (fromDate2 != null) {
      queryParams.addAll(_queryParams('', 'from_date', fromDate2));
    }
    if (toDate2 != null) {
      queryParams.addAll(_queryParams('', 'to_date', toDate2));
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

  /// Список невыкупов и возвратов
  ///
  /// Получает список невыкупов и возвратов.  Чтобы получить информацию по одному возврату или невыкупу, выполните запрос [GET campaigns/{campaignId}/orders/{orderId}/returns/{returnId}](../../reference/orders/getReturn.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
  ///
  /// Parameters:
  ///
  /// * [int] campaignId (required):
  ///   Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  ///
  /// * [String] pageToken:
  ///   Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
  ///
  /// * [int] limit:
  ///   Количество значений на одной странице. 
  ///
  /// * [List<int>] orderIds:
  ///   Идентификаторы заказов — для фильтрации результатов.  Несколько идентификаторов перечисляются через запятую без пробела. Максимальное количество идентификаторов — 50. 
  ///
  /// * [List<RefundStatusType>] statuses:
  ///   Статусы возвратов или невыкупов — для фильтрации результатов.  Несколько статусов перечисляются через запятую. 
  ///
  /// * [ReturnType] type:
  ///   Тип заказа для фильтрации:  * `RETURN` — возврат.  * `UNREDEEMED` — невыкуп.  Если не указывать, в ответе будут и возвраты, и невыкупы. 
  ///
  /// * [DateTime] fromDate:
  ///   Начальная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: `ГГГГ-ММ-ДД`. 
  ///
  /// * [DateTime] toDate:
  ///   Конечная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: `ГГГГ-ММ-ДД`. 
  ///
  /// * [DateTime] fromDate2:
  ///   {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `fromDate`.  {% endnote %}  Начальная дата для фильтрации возвратов или невыкупов по дате обновления. 
  ///
  /// * [DateTime] toDate2:
  ///   {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `toDate`.  {% endnote %}  Конечная дата для фильтрации возвратов или невыкупов по дате обновления. 
  Future<GetReturnsResponse?> getReturns(int campaignId, { String? pageToken, int? limit, List<int>? orderIds, List<RefundStatusType>? statuses, ReturnType? type, DateTime? fromDate, DateTime? toDate, DateTime? fromDate2, DateTime? toDate2, }) async {
    final response = await getReturnsWithHttpInfo(campaignId,  pageToken: pageToken, limit: limit, orderIds: orderIds, statuses: statuses, type: type, fromDate: fromDate, toDate: toDate, fromDate2: fromDate2, toDate2: toDate2, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'GetReturnsResponse',) as GetReturnsResponse;
    
    }
    return null;
  }

  /// Принятие или изменение решения по возврату
  ///
  /// Выбирает решение по возврату от покупателя. После этого для подтверждения решения нужно выполнить запрос [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit](../../reference/orders/submitReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
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
  /// * [int] returnId (required):
  ///   Идентификатор возврата.
  ///
  /// * [SetReturnDecisionRequest] setReturnDecisionRequest (required):
  Future<Response> setReturnDecisionWithHttpInfo(int campaignId, int orderId, int returnId, SetReturnDecisionRequest setReturnDecisionRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision'
      .replaceAll('{campaignId}', campaignId.toString())
      .replaceAll('{orderId}', orderId.toString())
      .replaceAll('{returnId}', returnId.toString());

    // ignore: prefer_final_locals
    Object? postBody = setReturnDecisionRequest;

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

  /// Принятие или изменение решения по возврату
  ///
  /// Выбирает решение по возврату от покупателя. После этого для подтверждения решения нужно выполнить запрос [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit](../../reference/orders/submitReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
  ///
  /// Parameters:
  ///
  /// * [int] campaignId (required):
  ///   Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  ///
  /// * [int] orderId (required):
  ///   Идентификатор заказа.
  ///
  /// * [int] returnId (required):
  ///   Идентификатор возврата.
  ///
  /// * [SetReturnDecisionRequest] setReturnDecisionRequest (required):
  Future<EmptyApiResponse?> setReturnDecision(int campaignId, int orderId, int returnId, SetReturnDecisionRequest setReturnDecisionRequest,) async {
    final response = await setReturnDecisionWithHttpInfo(campaignId, orderId, returnId, setReturnDecisionRequest,);
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

  /// Подтверждение решения по возврату
  ///
  /// Подтверждает выбранное решение по возврату, отправленное в запросе [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision](../../reference/orders/setReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
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
  /// * [int] returnId (required):
  ///   Идентификатор возврата.
  Future<Response> submitReturnDecisionWithHttpInfo(int campaignId, int orderId, int returnId,) async {
    // ignore: prefer_const_declarations
    final path = r'/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit'
      .replaceAll('{campaignId}', campaignId.toString())
      .replaceAll('{orderId}', orderId.toString())
      .replaceAll('{returnId}', returnId.toString());

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>[];


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

  /// Подтверждение решения по возврату
  ///
  /// Подтверждает выбранное решение по возврату, отправленное в запросе [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision](../../reference/orders/setReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
  ///
  /// Parameters:
  ///
  /// * [int] campaignId (required):
  ///   Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  ///
  /// * [int] orderId (required):
  ///   Идентификатор заказа.
  ///
  /// * [int] returnId (required):
  ///   Идентификатор возврата.
  Future<EmptyApiResponse?> submitReturnDecision(int campaignId, int orderId, int returnId,) async {
    final response = await submitReturnDecisionWithHttpInfo(campaignId, orderId, returnId,);
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
}
