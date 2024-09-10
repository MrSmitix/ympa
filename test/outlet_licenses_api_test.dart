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


/// tests for OutletLicensesApi
void main() {
  // final instance = OutletLicensesApi();

  group('tests for OutletLicensesApi', () {
    // Удаление лицензий для точек продаж
    //
    // Удаляет информацию о лицензиях для точек продаж.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
    //
    //Future<EmptyApiResponse> deleteOutletLicenses(int campaignId, { Set<int> ids }) async
    test('test deleteOutletLicenses', () async {
      // TODO
    });

    // Информация о лицензиях для точек продаж
    //
    // Возвращает информацию о лицензиях для точек продаж.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
    //
    //Future<GetOutletLicensesResponse> getOutletLicenses(int campaignId, { Set<int> outletIds, Set<int> ids }) async
    test('test getOutletLicenses', () async {
      // TODO
    });

    // Создание и изменение лицензий для точек продаж
    //
    // Передает информацию о новых и существующих лицензиях для точек продаж. Поддерживаются только лицензии на розничную продажу алкоголя.  Чтобы размещать алкогольную продукцию на Маркете, надо также прислать гарантийное письмо (если вы еще не делали этого раньше) и правильно оформить предложения в прайс-листе. Далее информация о лицензиях проходит проверку.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
    //
    //Future<EmptyApiResponse> updateOutletLicenses(int campaignId, UpdateOutletLicenseRequest updateOutletLicenseRequest) async
    test('test updateOutletLicenses', () async {
      // TODO
    });

  });
}
