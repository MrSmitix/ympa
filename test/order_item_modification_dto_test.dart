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

// tests for OrderItemModificationDTO
void main() {
  // final instance = OrderItemModificationDTO();

  group('test OrderItemModificationDTO', () {
    // Идентификатор товара в рамках заказа.  Получить идентификатор можно с помощью ресурсов [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).  Обязательный параметр. 
    // int id
    test('to test the property `id`', () async {
      // TODO
    });

    // Новое количество товара.
    // int count
    test('to test the property `count`', () async {
      // TODO
    });

    // Информация о маркировке единиц товара.  Передавайте в запросе все единицы товара, который подлежит маркировке.  Обязательный параметр, если в заказе есть товары, подлежащие маркировке [в системе «Честный ЗНАК»](https://честныйзнак.рф/). 
    // List<BriefOrderItemInstanceDTO> instances (default value: const [])
    test('to test the property `instances`', () async {
      // TODO
    });


  });

}
