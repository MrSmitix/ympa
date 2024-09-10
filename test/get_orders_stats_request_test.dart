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

// tests for GetOrdersStatsRequest
void main() {
  // final instance = GetOrdersStatsRequest();

  group('test GetOrdersStatsRequest', () {
    // Начальная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`. 
    // DateTime dateFrom
    test('to test the property `dateFrom`', () async {
      // TODO
    });

    // Конечная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`. 
    // DateTime dateTo
    test('to test the property `dateTo`', () async {
      // TODO
    });

    // Начальная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`. 
    // DateTime updateFrom
    test('to test the property `updateFrom`', () async {
      // TODO
    });

    // Конечная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`. 
    // DateTime updateTo
    test('to test the property `updateTo`', () async {
      // TODO
    });

    // Список идентификаторов заказов.
    // List<int> orders (default value: const [])
    test('to test the property `orders`', () async {
      // TODO
    });

    // Список статусов заказов.
    // List<OrderStatsStatusType> statuses (default value: const [])
    test('to test the property `statuses`', () async {
      // TODO
    });

    // Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * `true` — да. * `false` — нет. Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям. 
    // bool hasCis
    test('to test the property `hasCis`', () async {
      // TODO
    });


  });

}
