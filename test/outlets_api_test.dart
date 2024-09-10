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


/// tests for OutletsApi
void main() {
  // final instance = OutletsApi();

  group('tests for OutletsApi', () {
    // Создание точки продаж
    //
    // Создает точку продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
    //
    //Future<CreateOutletResponse> createOutlet(int campaignId, ChangeOutletRequest changeOutletRequest) async
    test('test createOutlet', () async {
      // TODO
    });

    // Удаление точки продаж
    //
    // Удаляет точку продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
    //
    //Future<EmptyApiResponse> deleteOutlet(int campaignId, int outletId) async
    test('test deleteOutlet', () async {
      // TODO
    });

    // Информация об одной точке продаж
    //
    // Возвращает информацию о точках продаж магазина.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
    //
    //Future<GetOutletResponse> getOutlet(int campaignId, int outletId) async
    test('test getOutlet', () async {
      // TODO
    });

    // Информация о нескольких точках продаж
    //
    // Возвращает список точек продаж магазина.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
    //
    //Future<GetOutletsResponse> getOutlets(int campaignId, { String pageToken, int regionId, String shopOutletCode, int regionId2 }) async
    test('test getOutlets', () async {
      // TODO
    });

    // Изменение информации о точке продаж
    //
    // Изменяет информацию о точке продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
    //
    //Future<EmptyApiResponse> updateOutlet(int campaignId, int outletId, ChangeOutletRequest changeOutletRequest) async
    test('test updateOutlet', () async {
      // TODO
    });

  });
}
