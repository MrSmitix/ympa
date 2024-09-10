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

// tests for GetWarehouseStocksRequest
void main() {
  // final instance = GetWarehouseStocksRequest();

  group('test GetWarehouseStocksRequest', () {
    // **Только для модели FBY**  Возвращать ли информацию по оборачиваемости.  Значение по умолчанию — `false`. Если информация нужна, передайте значение `true`. 
    // bool withTurnover (default value: false)
    test('to test the property `withTurnover`', () async {
      // TODO
    });

    // Фильтр по нахождению в архиве.  Передайте `true`, чтобы получить информацию об остатках товаров, которые находятся в архиве. Если фильтр не заполнен или передано `false`, в ответе возвращается информация о товарах, которые не находятся в архиве. 
    // bool archived
    test('to test the property `archived`', () async {
      // TODO
    });

    // Фильтр по вашим SKU товаров.  Возвращается информация об остатках всех переданных SKU, включая товары в архиве.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit` * `archived`  {% endnote %}    
    // Set<String> offerIds (default value: const {})
    test('to test the property `offerIds`', () async {
      // TODO
    });


  });

}
