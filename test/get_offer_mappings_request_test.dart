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

// tests for GetOfferMappingsRequest
void main() {
  // final instance = GetOfferMappingsRequest();

  group('test GetOfferMappingsRequest', () {
    // Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте: * `page_token`; * `limit`; * `cardStatuses`; * `categoryIds`; * `vendorNames`; * `tags`; * `archived`.  {% endnote %}    
    // List<String> offerIds (default value: const [])
    test('to test the property `offerIds`', () async {
      // TODO
    });

    // Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) 
    // List<OfferCardStatusType> cardStatuses (default value: const [])
    test('to test the property `cardStatuses`', () async {
      // TODO
    });

    // Фильтр по категориям на Маркете.
    // List<int> categoryIds (default value: const [])
    test('to test the property `categoryIds`', () async {
      // TODO
    });

    // Фильтр по брендам.
    // List<String> vendorNames (default value: const [])
    test('to test the property `vendorNames`', () async {
      // TODO
    });

    // Фильтр по тегам.
    // List<String> tags (default value: const [])
    test('to test the property `tags`', () async {
      // TODO
    });

    // Фильтр по нахождению в архиве.  Передайте `true`, чтобы получить товары, находящиеся в архиве. Если фильтр не заполнен или передано `false`, в ответе возвращаются товары, не находящиеся в архиве. 
    // bool archived
    test('to test the property `archived`', () async {
      // TODO
    });


  });

}
