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

// tests for GenerateStocksOnWarehousesReportRequest
void main() {
  // final instance = GenerateStocksOnWarehousesReportRequest();

  group('test GenerateStocksOnWarehousesReportRequest', () {
    // Идентификатор магазина.
    // int campaignId
    test('to test the property `campaignId`', () async {
      // TODO
    });

    // Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md).
    // List<int> warehouseIds (default value: const [])
    test('to test the property `warehouseIds`', () async {
      // TODO
    });

    // Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день.
    // DateTime reportDate
    test('to test the property `reportDate`', () async {
      // TODO
    });

    // Фильтр по категориям на Маркете (кроме модели FBY).
    // List<int> categoryIds (default value: const [])
    test('to test the property `categoryIds`', () async {
      // TODO
    });

    // Фильтр по наличию остатков (кроме модели FBY).
    // bool hasStocks
    test('to test the property `hasStocks`', () async {
      // TODO
    });


  });

}
