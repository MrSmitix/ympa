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


/// tests for PromosApi
void main() {
  // final instance = PromosApi();

  group('tests for PromosApi', () {
    // Удаление товаров из акции
    //
    // Убирает товары из акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
    //
    //Future<DeletePromoOffersResponse> deletePromoOffers(int businessId, DeletePromoOffersRequest deletePromoOffersRequest) async
    test('test deletePromoOffers', () async {
      // TODO
    });

    // Получение списка товаров, которые участвуют или могут участвовать в акции
    //
    // Возвращает список товаров, которые участвуют или могут участвовать в акции.  {% note warning %}  В параметре `limit` не передавайте значение больше 500.  {% endnote %}  |**⚙️ Лимит:** 10000 запросов в час| |-| 
    //
    //Future<GetPromoOffersResponse> getPromoOffers(int businessId, GetPromoOffersRequest getPromoOffersRequest, { String pageToken, int limit }) async
    test('test getPromoOffers', () async {
      // TODO
    });

    // Получение списка акций
    //
    // Возвращает информацию об акциях Маркета.  По умолчанию возвращаются акции, в которых продавец участвует или может принять участие.  Чтобы получить текущие или завершенные акции, передайте параметр `participation`.  Типы акций, которые возвращаются в ответе:  * прямая скидка; * флеш-акция; * скидка по промокоду.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
    //
    //Future<GetPromosResponse> getPromos(int businessId, { GetPromosRequest getPromosRequest }) async
    test('test getPromos', () async {
      // TODO
    });

    // Добавление товаров в акцию или изменение их цен
    //
    // Добавляет товары в акцию или изменяет цены на товары, которые участвуют в акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
    //
    //Future<UpdatePromoOffersResponse> updatePromoOffers(int businessId, UpdatePromoOffersRequest updatePromoOffersRequest) async
    test('test updatePromoOffers', () async {
      // TODO
    });

  });
}
