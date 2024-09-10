//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class CategoriesApi {
  CategoriesApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Лимит на установку кванта продажи и минимального количества товаров в заказе
  ///
  /// Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.  Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.  Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [GetCategoriesMaxSaleQuantumRequest] getCategoriesMaxSaleQuantumRequest (required):
  Future<Response> getCategoriesMaxSaleQuantumWithHttpInfo(GetCategoriesMaxSaleQuantumRequest getCategoriesMaxSaleQuantumRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/categories/max-sale-quantum';

    // ignore: prefer_final_locals
    Object? postBody = getCategoriesMaxSaleQuantumRequest;

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

  /// Лимит на установку кванта продажи и минимального количества товаров в заказе
  ///
  /// Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.  Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.  Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
  ///
  /// Parameters:
  ///
  /// * [GetCategoriesMaxSaleQuantumRequest] getCategoriesMaxSaleQuantumRequest (required):
  Future<GetCategoriesMaxSaleQuantumResponse?> getCategoriesMaxSaleQuantum(GetCategoriesMaxSaleQuantumRequest getCategoriesMaxSaleQuantumRequest,) async {
    final response = await getCategoriesMaxSaleQuantumWithHttpInfo(getCategoriesMaxSaleQuantumRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'GetCategoriesMaxSaleQuantumResponse',) as GetCategoriesMaxSaleQuantumResponse;
    
    }
    return null;
  }

  /// Дерево категорий
  ///
  /// Возвращает дерево категорий Маркета.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [GetCategoriesRequest] getCategoriesRequest:
  Future<Response> getCategoriesTreeWithHttpInfo({ GetCategoriesRequest? getCategoriesRequest, }) async {
    // ignore: prefer_const_declarations
    final path = r'/categories/tree';

    // ignore: prefer_final_locals
    Object? postBody = getCategoriesRequest;

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

  /// Дерево категорий
  ///
  /// Возвращает дерево категорий Маркета.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
  ///
  /// Parameters:
  ///
  /// * [GetCategoriesRequest] getCategoriesRequest:
  Future<GetCategoriesResponse?> getCategoriesTree({ GetCategoriesRequest? getCategoriesRequest, }) async {
    final response = await getCategoriesTreeWithHttpInfo( getCategoriesRequest: getCategoriesRequest, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'GetCategoriesResponse',) as GetCategoriesResponse;
    
    }
    return null;
  }
}
