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

// tests for ParcelBoxLabelDTO
void main() {
  // final instance = ParcelBoxLabelDTO();

  group('test ParcelBoxLabelDTO', () {
    // Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md). 
    // String url
    test('to test the property `url`', () async {
      // TODO
    });

    // Юридическое название магазина.
    // String supplierName
    test('to test the property `supplierName`', () async {
      // TODO
    });

    // Юридическое название службы доставки.
    // String deliveryServiceName
    test('to test the property `deliveryServiceName`', () async {
      // TODO
    });

    // Идентификатор заказа в системе Маркета.
    // int orderId
    test('to test the property `orderId`', () async {
      // TODO
    });

    // Идентификатор заказа в информационной системе магазина.  Совпадает с `orderId`, если Маркету неизвестен номер заказа в системе магазина. 
    // String orderNum
    test('to test the property `orderNum`', () async {
      // TODO
    });

    // Фамилия и инициалы получателя заказа.
    // String recipientName
    test('to test the property `recipientName`', () async {
      // TODO
    });

    // Идентификатор коробки.
    // int boxId
    test('to test the property `boxId`', () async {
      // TODO
    });

    // Идентификатор коробки в информационной системе магазина.  Возвращается в формате: `номер заказа на Маркете-номер коробки`. Например, `7206821‑1`, `7206821‑2` и т. д. 
    // String fulfilmentId
    test('to test the property `fulfilmentId`', () async {
      // TODO
    });

    // Номер коробки в заказе. Возвращается в формате: `номер места/общее количество мест`. 
    // String place
    test('to test the property `place`', () async {
      // TODO
    });

    // {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Общая масса всех товаров в заказе. Возвращается в формате: `weight кг`. 
    // String weight
    test('to test the property `weight`', () async {
      // TODO
    });

    // Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
    // String deliveryServiceId
    test('to test the property `deliveryServiceId`', () async {
      // TODO
    });

    // Адрес получателя.
    // String deliveryAddress
    test('to test the property `deliveryAddress`', () async {
      // TODO
    });

    // Дата отгрузки в формате `dd.MM.yyyy`.
    // String shipmentDate
    test('to test the property `shipmentDate`', () async {
      // TODO
    });


  });

}
