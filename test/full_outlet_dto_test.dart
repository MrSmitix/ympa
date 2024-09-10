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

// tests for FullOutletDTO
void main() {
  // final instance = FullOutletDTO();

  group('test FullOutletDTO', () {
    // Название точки продаж. 
    // String name
    test('to test the property `name`', () async {
      // TODO
    });

    // OutletType type
    test('to test the property `type`', () async {
      // TODO
    });

    // Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, `20.4522144, 54.7104264`.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в `address`. 
    // String coords
    test('to test the property `coords`', () async {
      // TODO
    });

    // Признак основной точки продаж.  Возможные значения:  * `false` — неосновная точка продаж. * `true` — основная точка продаж. 
    // bool isMain
    test('to test the property `isMain`', () async {
      // TODO
    });

    // Идентификатор точки продаж, присвоенный магазином.
    // String shopOutletCode
    test('to test the property `shopOutletCode`', () async {
      // TODO
    });

    // OutletVisibilityType visibility
    test('to test the property `visibility`', () async {
      // TODO
    });

    // OutletAddressDTO address
    test('to test the property `address`', () async {
      // TODO
    });

    // Номера телефонов точки продаж. Передавайте в формате: `+7 (999) 999-99-99`. 
    // List<String> phones (default value: const [])
    test('to test the property `phones`', () async {
      // TODO
    });

    // OutletWorkingScheduleDTO workingSchedule
    test('to test the property `workingSchedule`', () async {
      // TODO
    });

    // Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр `type=DEPOT` или `type=MIXED`. 
    // List<OutletDeliveryRuleDTO> deliveryRules (default value: const [])
    test('to test the property `deliveryRules`', () async {
      // TODO
    });

    // Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях.
    // int storagePeriod
    test('to test the property `storagePeriod`', () async {
      // TODO
    });

    // Идентификатор точки продаж, присвоенный Маркетом.
    // int id
    test('to test the property `id`', () async {
      // TODO
    });

    // OutletStatusType status
    test('to test the property `status`', () async {
      // TODO
    });

    // RegionDTO region
    test('to test the property `region`', () async {
      // TODO
    });

    // Идентификатор точки продаж, заданный магазином.
    // String shopOutletId
    test('to test the property `shopOutletId`', () async {
      // TODO
    });

    // Рабочее время.
    // String workingTime
    test('to test the property `workingTime`', () async {
      // TODO
    });

    // Статус модерации.
    // String moderationReason
    test('to test the property `moderationReason`', () async {
      // TODO
    });


  });

}
