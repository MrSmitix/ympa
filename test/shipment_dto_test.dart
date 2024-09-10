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

// tests for ShipmentDTO
void main() {
  // final instance = ShipmentDTO();

  group('test ShipmentDTO', () {
    // Идентификатор отгрузки.
    // int id
    test('to test the property `id`', () async {
      // TODO
    });

    // Начало планового интервала отгрузки.
    // DateTime planIntervalFrom
    test('to test the property `planIntervalFrom`', () async {
      // TODO
    });

    // Конец планового интервала отгрузки.
    // DateTime planIntervalTo
    test('to test the property `planIntervalTo`', () async {
      // TODO
    });

    // ShipmentType shipmentType
    test('to test the property `shipmentType`', () async {
      // TODO
    });

    // PartnerShipmentWarehouseDTO warehouse
    test('to test the property `warehouse`', () async {
      // TODO
    });

    // PartnerShipmentWarehouseDTO warehouseTo
    test('to test the property `warehouseTo`', () async {
      // TODO
    });

    // Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра `id`.
    // String externalId
    test('to test the property `externalId`', () async {
      // TODO
    });

    // DeliveryServiceDTO deliveryService
    test('to test the property `deliveryService`', () async {
      // TODO
    });

    // PalletsCountDTO palletsCount
    test('to test the property `palletsCount`', () async {
      // TODO
    });

    // Идентификаторы заказов в отгрузке.
    // Set<int> orderIds (default value: const {})
    test('to test the property `orderIds`', () async {
      // TODO
    });

    // Количество заказов, которое Маркет запланировал к отгрузке.
    // int draftCount
    test('to test the property `draftCount`', () async {
      // TODO
    });

    // Количество заказов, которое Маркет подтвердил к отгрузке.
    // int plannedCount
    test('to test the property `plannedCount`', () async {
      // TODO
    });

    // Количество заказов, принятых в сортировочном центре или пункте приема.
    // int factCount
    test('to test the property `factCount`', () async {
      // TODO
    });

    // ShipmentStatusChangeDTO currentStatus
    test('to test the property `currentStatus`', () async {
      // TODO
    });

    // Доступные действия над отгрузкой.
    // Set<ShipmentActionType> availableActions (default value: const {})
    test('to test the property `availableActions`', () async {
      // TODO
    });


  });

}
