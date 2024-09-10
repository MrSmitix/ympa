//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class ChatsApi {
  ChatsApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Создание нового чата с покупателем
  ///
  /// Создает новый чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] businessId (required):
  ///   Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  ///
  /// * [CreateChatRequest] createChatRequest (required):
  ///   description
  Future<Response> createChatWithHttpInfo(int businessId, CreateChatRequest createChatRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/businesses/{businessId}/chats/new'
      .replaceAll('{businessId}', businessId.toString());

    // ignore: prefer_final_locals
    Object? postBody = createChatRequest;

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

  /// Создание нового чата с покупателем
  ///
  /// Создает новый чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
  ///
  /// Parameters:
  ///
  /// * [int] businessId (required):
  ///   Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  ///
  /// * [CreateChatRequest] createChatRequest (required):
  ///   description
  Future<CreateChatResponse?> createChat(int businessId, CreateChatRequest createChatRequest,) async {
    final response = await createChatWithHttpInfo(businessId, createChatRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'CreateChatResponse',) as CreateChatResponse;
    
    }
    return null;
  }

  /// Получение истории сообщений в чате
  ///
  /// Возвращает историю сообщений в чате с покупателем.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] businessId (required):
  ///   Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  ///
  /// * [int] chatId (required):
  ///   Идентификатор чата.
  ///
  /// * [GetChatHistoryRequest] getChatHistoryRequest (required):
  ///   description
  ///
  /// * [String] pageToken:
  ///   Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
  ///
  /// * [int] limit:
  ///   Количество значений на одной странице. 
  Future<Response> getChatHistoryWithHttpInfo(int businessId, int chatId, GetChatHistoryRequest getChatHistoryRequest, { String? pageToken, int? limit, }) async {
    // ignore: prefer_const_declarations
    final path = r'/businesses/{businessId}/chats/history'
      .replaceAll('{businessId}', businessId.toString());

    // ignore: prefer_final_locals
    Object? postBody = getChatHistoryRequest;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('', 'chatId', chatId));
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

  /// Получение истории сообщений в чате
  ///
  /// Возвращает историю сообщений в чате с покупателем.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
  ///
  /// Parameters:
  ///
  /// * [int] businessId (required):
  ///   Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  ///
  /// * [int] chatId (required):
  ///   Идентификатор чата.
  ///
  /// * [GetChatHistoryRequest] getChatHistoryRequest (required):
  ///   description
  ///
  /// * [String] pageToken:
  ///   Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
  ///
  /// * [int] limit:
  ///   Количество значений на одной странице. 
  Future<GetChatHistoryResponse?> getChatHistory(int businessId, int chatId, GetChatHistoryRequest getChatHistoryRequest, { String? pageToken, int? limit, }) async {
    final response = await getChatHistoryWithHttpInfo(businessId, chatId, getChatHistoryRequest,  pageToken: pageToken, limit: limit, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'GetChatHistoryResponse',) as GetChatHistoryResponse;
    
    }
    return null;
  }

  /// Получение доступных чатов
  ///
  /// Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] businessId (required):
  ///   Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  ///
  /// * [GetChatsRequest] getChatsRequest (required):
  ///   description
  ///
  /// * [String] pageToken:
  ///   Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
  ///
  /// * [int] limit:
  ///   Количество значений на одной странице. 
  Future<Response> getChatsWithHttpInfo(int businessId, GetChatsRequest getChatsRequest, { String? pageToken, int? limit, }) async {
    // ignore: prefer_const_declarations
    final path = r'/businesses/{businessId}/chats'
      .replaceAll('{businessId}', businessId.toString());

    // ignore: prefer_final_locals
    Object? postBody = getChatsRequest;

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

  /// Получение доступных чатов
  ///
  /// Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
  ///
  /// Parameters:
  ///
  /// * [int] businessId (required):
  ///   Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  ///
  /// * [GetChatsRequest] getChatsRequest (required):
  ///   description
  ///
  /// * [String] pageToken:
  ///   Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
  ///
  /// * [int] limit:
  ///   Количество значений на одной странице. 
  Future<GetChatsResponse?> getChats(int businessId, GetChatsRequest getChatsRequest, { String? pageToken, int? limit, }) async {
    final response = await getChatsWithHttpInfo(businessId, getChatsRequest,  pageToken: pageToken, limit: limit, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'GetChatsResponse',) as GetChatsResponse;
    
    }
    return null;
  }

  /// Отправка файла в чат
  ///
  /// Отправляет файл в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] businessId (required):
  ///   Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  ///
  /// * [int] chatId (required):
  ///   Идентификатор чата.
  ///
  /// * [MultipartFile] file (required):
  ///   Содержимое файла. Максимальный размер файла — 5 Мбайт.
  Future<Response> sendFileToChatWithHttpInfo(int businessId, int chatId, MultipartFile file,) async {
    // ignore: prefer_const_declarations
    final path = r'/businesses/{businessId}/chats/file/send'
      .replaceAll('{businessId}', businessId.toString());

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('', 'chatId', chatId));

    const contentTypes = <String>['multipart/form-data'];

    bool hasFields = false;
    final mp = MultipartRequest('POST', Uri.parse(path));
    if (file != null) {
      hasFields = true;
      mp.fields[r'file'] = file.field;
      mp.files.add(file);
    }
    if (hasFields) {
      postBody = mp;
    }

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

  /// Отправка файла в чат
  ///
  /// Отправляет файл в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
  ///
  /// Parameters:
  ///
  /// * [int] businessId (required):
  ///   Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  ///
  /// * [int] chatId (required):
  ///   Идентификатор чата.
  ///
  /// * [MultipartFile] file (required):
  ///   Содержимое файла. Максимальный размер файла — 5 Мбайт.
  Future<EmptyApiResponse?> sendFileToChat(int businessId, int chatId, MultipartFile file,) async {
    final response = await sendFileToChatWithHttpInfo(businessId, chatId, file,);
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

  /// Отправка сообщения в чат
  ///
  /// Отправляет сообщение в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] businessId (required):
  ///   Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  ///
  /// * [int] chatId (required):
  ///   Идентификатор чата.
  ///
  /// * [SendMessageToChatRequest] sendMessageToChatRequest (required):
  ///   description
  Future<Response> sendMessageToChatWithHttpInfo(int businessId, int chatId, SendMessageToChatRequest sendMessageToChatRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/businesses/{businessId}/chats/message'
      .replaceAll('{businessId}', businessId.toString());

    // ignore: prefer_final_locals
    Object? postBody = sendMessageToChatRequest;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('', 'chatId', chatId));

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

  /// Отправка сообщения в чат
  ///
  /// Отправляет сообщение в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
  ///
  /// Parameters:
  ///
  /// * [int] businessId (required):
  ///   Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  ///
  /// * [int] chatId (required):
  ///   Идентификатор чата.
  ///
  /// * [SendMessageToChatRequest] sendMessageToChatRequest (required):
  ///   description
  Future<EmptyApiResponse?> sendMessageToChat(int businessId, int chatId, SendMessageToChatRequest sendMessageToChatRequest,) async {
    final response = await sendMessageToChatWithHttpInfo(businessId, chatId, sendMessageToChatRequest,);
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
