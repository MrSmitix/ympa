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

// tests for OutletAddressDTO
void main() {
  // final instance = OutletAddressDTO();

  group('test OutletAddressDTO', () {
    // Идентификатор региона.  Идентификатор можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  {% note alert %}  При создании и редактировании точек продаж можно указывать только регионы типов `TOWN` (город), `CITY` (крупный город) и `REPUBLIC_AREA` (район субъекта федерации). Тип региона указан в выходных параметрах type запросов [GET regions](../../reference/regions/searchRegionsByName.md) и [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  {% endnote %} 
    // int regionId
    test('to test the property `regionId`', () async {
      // TODO
    });

    // Улица.
    // String street
    test('to test the property `street`', () async {
      // TODO
    });

    // Номер дома.
    // String number
    test('to test the property `number`', () async {
      // TODO
    });

    // Номер строения.
    // String building
    test('to test the property `building`', () async {
      // TODO
    });

    // Номер владения.
    // String estate
    test('to test the property `estate`', () async {
      // TODO
    });

    // Номер корпуса.
    // String block
    test('to test the property `block`', () async {
      // TODO
    });

    // Дополнительная информация.
    // String additional
    test('to test the property `additional`', () async {
      // TODO
    });

    // Порядковый номер километра дороги, на котором располагается точка продаж, если отсутствует улица.
    // int km
    test('to test the property `km`', () async {
      // TODO
    });

    // {% note warning \"\" %}  Этот параметр устарел. Не используйте его. Город или населенный пункт возвращается в параметре `regionId`.  {% endnote %} 
    // String city
    test('to test the property `city`', () async {
      // TODO
    });


  });

}
