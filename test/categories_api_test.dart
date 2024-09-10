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


/// tests for CategoriesApi
void main() {
  // final instance = CategoriesApi();

  group('tests for CategoriesApi', () {
    // Лимит на установку кванта продажи и минимального количества товаров в заказе
    //
    // Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.  Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.  Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
    //
    //Future<GetCategoriesMaxSaleQuantumResponse> getCategoriesMaxSaleQuantum(GetCategoriesMaxSaleQuantumRequest getCategoriesMaxSaleQuantumRequest) async
    test('test getCategoriesMaxSaleQuantum', () async {
      // TODO
    });

    // Дерево категорий
    //
    // Возвращает дерево категорий Маркета.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
    //
    //Future<GetCategoriesResponse> getCategoriesTree({ GetCategoriesRequest getCategoriesRequest }) async
    test('test getCategoriesTree', () async {
      // TODO
    });

  });
}
