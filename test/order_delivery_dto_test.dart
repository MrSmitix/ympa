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

// tests for OrderDeliveryDTO
void main() {
  // final instance = OrderDeliveryDTO();

  group('test OrderDeliveryDTO', () {
    // Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md). 
    // String id
    test('to test the property `id`', () async {
      // TODO
    });

    // OrderDeliveryType type
    test('to test the property `type`', () async {
      // TODO
    });

    // Наименование службы доставки.
    // String serviceName
    test('to test the property `serviceName`', () async {
      // TODO
    });

    // {% note warning \"\" %}  Этот параметр устарел. Стоимость доставки смотрите в параметре `deliveryTotal`.  {% endnote %}  Стоимость доставки в валюте заказа. 
    // num price
    test('to test the property `price`', () async {
      // TODO
    });

    // OrderDeliveryPartnerType deliveryPartnerType
    test('to test the property `deliveryPartnerType`', () async {
      // TODO
    });

    // OrderCourierDTO courier
    test('to test the property `courier`', () async {
      // TODO
    });

    // OrderDeliveryDatesDTO dates
    test('to test the property `dates`', () async {
      // TODO
    });

    // RegionDTO region
    test('to test the property `region`', () async {
      // TODO
    });

    // OrderDeliveryAddressDTO address
    test('to test the property `address`', () async {
      // TODO
    });

    // OrderVatType vat
    test('to test the property `vat`', () async {
      // TODO
    });

    // Идентификатор службы доставки.
    // int deliveryServiceId
    test('to test the property `deliveryServiceId`', () async {
      // TODO
    });

    // OrderLiftType liftType
    test('to test the property `liftType`', () async {
      // TODO
    });

    // Стоимость подъема на этаж.
    // num liftPrice
    test('to test the property `liftPrice`', () async {
      // TODO
    });

    // Идентификатор пункта самовывоза, присвоенный магазином.
    // String outletCode
    test('to test the property `outletCode`', () async {
      // TODO
    });

    // Формат даты: `ДД-ММ-ГГГГ`. 
    // String outletStorageLimitDate
    test('to test the property `outletStorageLimitDate`', () async {
      // TODO
    });

    // OrderDeliveryDispatchType dispatchType
    test('to test the property `dispatchType`', () async {
      // TODO
    });

    // Информация для отслеживания перемещений посылки.
    // List<OrderTrackDTO> tracks (default value: const [])
    test('to test the property `tracks`', () async {
      // TODO
    });

    // Информация о посылках.
    // List<OrderShipmentDTO> shipments (default value: const [])
    test('to test the property `shipments`', () async {
      // TODO
    });

    // Приблизительная ли дата доставки.
    // bool estimated
    test('to test the property `estimated`', () async {
      // TODO
    });

    // OrderDeliveryEacType eacType
    test('to test the property `eacType`', () async {
      // TODO
    });

    // Код подтверждения ЭАПП (для типа `MERCHANT_TO_COURIER`). 
    // String eacCode
    test('to test the property `eacCode`', () async {
      // TODO
    });


  });

}
