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

// tests for GetQuarantineOffersRequest
void main() {
  // final instance = GetQuarantineOffersRequest();

  group('test GetQuarantineOffersRequest', () {
    // Идентификаторы товаров, информация о которых нужна. <br><br> ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. 
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


  });

}
