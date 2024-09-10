//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class GoodsFeedbackApi {
  GoodsFeedbackApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Удаление комментария к отзыву
  ///
  /// Удаляет комментарий магазина.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] businessId (required):
  ///   Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  ///
  /// * [DeleteGoodsFeedbackCommentRequest] deleteGoodsFeedbackCommentRequest (required):
  Future<Response> deleteGoodsFeedbackCommentWithHttpInfo(int businessId, DeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/businesses/{businessId}/goods-feedback/comments/delete'
      .replaceAll('{businessId}', businessId.toString());

    // ignore: prefer_final_locals
    Object? postBody = deleteGoodsFeedbackCommentRequest;

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

  /// Удаление комментария к отзыву
  ///
  /// Удаляет комментарий магазина.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
  ///
  /// Parameters:
  ///
  /// * [int] businessId (required):
  ///   Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  ///
  /// * [DeleteGoodsFeedbackCommentRequest] deleteGoodsFeedbackCommentRequest (required):
  Future<EmptyApiResponse?> deleteGoodsFeedbackComment(int businessId, DeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest,) async {
    final response = await deleteGoodsFeedbackCommentWithHttpInfo(businessId, deleteGoodsFeedbackCommentRequest,);
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

  /// Получение комментариев к отзыву
  ///
  /// Возвращает комментарии к отзыву.  Результаты возвращаются постранично, одна страница содержит не более 20 комментариев.  Комментарии расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] businessId (required):
  ///   Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  ///
  /// * [GetGoodsFeedbackCommentsRequest] getGoodsFeedbackCommentsRequest (required):
  ///
  /// * [String] pageToken:
  ///   Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
  ///
  /// * [int] limit:
  ///   Количество значений на одной странице. 
  Future<Response> getGoodsFeedbackCommentsWithHttpInfo(int businessId, GetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest, { String? pageToken, int? limit, }) async {
    // ignore: prefer_const_declarations
    final path = r'/businesses/{businessId}/goods-feedback/comments'
      .replaceAll('{businessId}', businessId.toString());

    // ignore: prefer_final_locals
    Object? postBody = getGoodsFeedbackCommentsRequest;

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

  /// Получение комментариев к отзыву
  ///
  /// Возвращает комментарии к отзыву.  Результаты возвращаются постранично, одна страница содержит не более 20 комментариев.  Комментарии расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
  ///
  /// Parameters:
  ///
  /// * [int] businessId (required):
  ///   Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  ///
  /// * [GetGoodsFeedbackCommentsRequest] getGoodsFeedbackCommentsRequest (required):
  ///
  /// * [String] pageToken:
  ///   Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
  ///
  /// * [int] limit:
  ///   Количество значений на одной странице. 
  Future<GetGoodsFeedbackCommentsResponse?> getGoodsFeedbackComments(int businessId, GetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest, { String? pageToken, int? limit, }) async {
    final response = await getGoodsFeedbackCommentsWithHttpInfo(businessId, getGoodsFeedbackCommentsRequest,  pageToken: pageToken, limit: limit, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'GetGoodsFeedbackCommentsResponse',) as GetGoodsFeedbackCommentsResponse;
    
    }
    return null;
  }

  /// Получение отзывов о товарах продавца
  ///
  /// Возвращает все отзывы о товарах продавца по указанным фильтрам.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов.  Отзывы расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] businessId (required):
  ///   Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  ///
  /// * [String] pageToken:
  ///   Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
  ///
  /// * [int] limit:
  ///   Количество значений на одной странице. 
  ///
  /// * [GetGoodsFeedbackRequest] getGoodsFeedbackRequest:
  Future<Response> getGoodsFeedbacksWithHttpInfo(int businessId, { String? pageToken, int? limit, GetGoodsFeedbackRequest? getGoodsFeedbackRequest, }) async {
    // ignore: prefer_const_declarations
    final path = r'/businesses/{businessId}/goods-feedback'
      .replaceAll('{businessId}', businessId.toString());

    // ignore: prefer_final_locals
    Object? postBody = getGoodsFeedbackRequest;

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

  /// Получение отзывов о товарах продавца
  ///
  /// Возвращает все отзывы о товарах продавца по указанным фильтрам.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов.  Отзывы расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
  ///
  /// Parameters:
  ///
  /// * [int] businessId (required):
  ///   Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  ///
  /// * [String] pageToken:
  ///   Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
  ///
  /// * [int] limit:
  ///   Количество значений на одной странице. 
  ///
  /// * [GetGoodsFeedbackRequest] getGoodsFeedbackRequest:
  Future<GetGoodsFeedbackResponse?> getGoodsFeedbacks(int businessId, { String? pageToken, int? limit, GetGoodsFeedbackRequest? getGoodsFeedbackRequest, }) async {
    final response = await getGoodsFeedbacksWithHttpInfo(businessId,  pageToken: pageToken, limit: limit, getGoodsFeedbackRequest: getGoodsFeedbackRequest, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'GetGoodsFeedbackResponse',) as GetGoodsFeedbackResponse;
    
    }
    return null;
  }

  /// Отказ от ответа на отзывы
  ///
  /// Пропускает отзывы — они больше не будут возвращаться в методе получения всех отзывов [POST businesses/{businessId}/goods-feedback](../../reference/goods-feedback/getGoodsFeedbacks.md).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] businessId (required):
  ///   Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  ///
  /// * [SkipGoodsFeedbackReactionRequest] skipGoodsFeedbackReactionRequest (required):
  Future<Response> skipGoodsFeedbacksReactionWithHttpInfo(int businessId, SkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/businesses/{businessId}/goods-feedback/skip-reaction'
      .replaceAll('{businessId}', businessId.toString());

    // ignore: prefer_final_locals
    Object? postBody = skipGoodsFeedbackReactionRequest;

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

  /// Отказ от ответа на отзывы
  ///
  /// Пропускает отзывы — они больше не будут возвращаться в методе получения всех отзывов [POST businesses/{businessId}/goods-feedback](../../reference/goods-feedback/getGoodsFeedbacks.md).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
  ///
  /// Parameters:
  ///
  /// * [int] businessId (required):
  ///   Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  ///
  /// * [SkipGoodsFeedbackReactionRequest] skipGoodsFeedbackReactionRequest (required):
  Future<EmptyApiResponse?> skipGoodsFeedbacksReaction(int businessId, SkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest,) async {
    final response = await skipGoodsFeedbacksReactionWithHttpInfo(businessId, skipGoodsFeedbackReactionRequest,);
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

  /// Добавление нового или изменение созданного комментария
  ///
  /// Добавляет новый комментарий магазина или изменяет комментарий, который магазин оставлял ранее.  Для создания комментария к отзыву передайте только идентификатор отзыва `feedbackId`.  Чтобы добавить комментарий к другому комментарию, передайте:  * `feedbackId` — идентификатор отзыва; * `comment.parentId` — идентификатор родительского комментария.  Чтобы изменить комментарий, передайте:  * `feedbackId`— идентификатор отзыва; * `comment.id` — идентификатор комментария, который нужно изменить.  Если передать одновременно `comment.parentId` и `comment.id`, будет изменен существующий комментарий.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] businessId (required):
  ///   Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  ///
  /// * [UpdateGoodsFeedbackCommentRequest] updateGoodsFeedbackCommentRequest (required):
  Future<Response> updateGoodsFeedbackCommentWithHttpInfo(int businessId, UpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/businesses/{businessId}/goods-feedback/comments/update'
      .replaceAll('{businessId}', businessId.toString());

    // ignore: prefer_final_locals
    Object? postBody = updateGoodsFeedbackCommentRequest;

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

  /// Добавление нового или изменение созданного комментария
  ///
  /// Добавляет новый комментарий магазина или изменяет комментарий, который магазин оставлял ранее.  Для создания комментария к отзыву передайте только идентификатор отзыва `feedbackId`.  Чтобы добавить комментарий к другому комментарию, передайте:  * `feedbackId` — идентификатор отзыва; * `comment.parentId` — идентификатор родительского комментария.  Чтобы изменить комментарий, передайте:  * `feedbackId`— идентификатор отзыва; * `comment.id` — идентификатор комментария, который нужно изменить.  Если передать одновременно `comment.parentId` и `comment.id`, будет изменен существующий комментарий.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
  ///
  /// Parameters:
  ///
  /// * [int] businessId (required):
  ///   Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  ///
  /// * [UpdateGoodsFeedbackCommentRequest] updateGoodsFeedbackCommentRequest (required):
  Future<UpdateGoodsFeedbackCommentResponse?> updateGoodsFeedbackComment(int businessId, UpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest,) async {
    final response = await updateGoodsFeedbackCommentWithHttpInfo(businessId, updateGoodsFeedbackCommentRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'UpdateGoodsFeedbackCommentResponse',) as UpdateGoodsFeedbackCommentResponse;
    
    }
    return null;
  }
}
