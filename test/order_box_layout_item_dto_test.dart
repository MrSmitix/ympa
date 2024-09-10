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

// tests for OrderBoxLayoutItemDTO
void main() {
  // final instance = OrderBoxLayoutItemDTO();

  group('test OrderBoxLayoutItemDTO', () {
    // Идентификатор товара в заказе.  {% cut \"Где его взять\" %}  Идентификатор приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`.  {% endcut %}   
    // int id
    test('to test the property `id`', () async {
      // TODO
    });

    // Количество единиц товара в коробке.  Используйте это поле, если в коробке поедут целые товары, не разделенные на части. Не используйте это поле одновременно с `partialCount`. 
    // int fullCount
    test('to test the property `fullCount`', () async {
      // TODO
    });

    // OrderBoxLayoutPartialCountDTO partialCount
    test('to test the property `partialCount`', () async {
      // TODO
    });

    // Переданные вами коды маркировки.
    // List<BriefOrderItemInstanceDTO> instances (default value: const [])
    test('to test the property `instances`', () async {
      // TODO
    });


  });

}
