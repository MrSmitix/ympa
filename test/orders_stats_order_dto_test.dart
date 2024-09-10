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

// tests for OrdersStatsOrderDTO
void main() {
  // final instance = OrdersStatsOrderDTO();

  group('test OrdersStatsOrderDTO', () {
    // Идентификатор заказа.
    // int id
    test('to test the property `id`', () async {
      // TODO
    });

    // Дата создания заказа.  Формат даты: `ГГГГ-ММ-ДД`. 
    // DateTime creationDate
    test('to test the property `creationDate`', () async {
      // TODO
    });

    // Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, `2017-11-21T00:00:00`. Часовой пояс — UTC+03:00 (Москва). 
    // DateTime statusUpdateDate
    test('to test the property `statusUpdateDate`', () async {
      // TODO
    });

    // OrderStatsStatusType status
    test('to test the property `status`', () async {
      // TODO
    });

    // Идентификатор заказа в информационной системе магазина.
    // String partnerOrderId
    test('to test the property `partnerOrderId`', () async {
      // TODO
    });

    // OrdersStatsOrderPaymentType paymentType
    test('to test the property `paymentType`', () async {
      // TODO
    });

    // Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. 
    // bool fake
    test('to test the property `fake`', () async {
      // TODO
    });

    // OrdersStatsDeliveryRegionDTO deliveryRegion
    test('to test the property `deliveryRegion`', () async {
      // TODO
    });

    // Список товаров в заказе после возможных изменений.
    // List<OrdersStatsItemDTO> items (default value: const [])
    test('to test the property `items`', () async {
      // TODO
    });

    // Список товаров в заказе до изменений.
    // List<OrdersStatsItemDTO> initialItems (default value: const [])
    test('to test the property `initialItems`', () async {
      // TODO
    });

    // Информация о денежных переводах по заказу.
    // List<OrdersStatsPaymentDTO> payments (default value: const [])
    test('to test the property `payments`', () async {
      // TODO
    });

    // Информация о комиссиях за заказ.
    // List<OrdersStatsCommissionDTO> commissions (default value: const [])
    test('to test the property `commissions`', () async {
      // TODO
    });


  });

}
