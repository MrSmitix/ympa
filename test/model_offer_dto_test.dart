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

// tests for ModelOfferDTO
void main() {
  // final instance = ModelOfferDTO();

  group('test ModelOfferDTO', () {
    // Скидка на предложение в процентах.
    // int discount
    test('to test the property `discount`', () async {
      // TODO
    });

    // Наименование предложения.
    // String name
    test('to test the property `name`', () async {
      // TODO
    });

    // Позиция предложения в выдаче Маркета на карточке модели.
    // int pos
    test('to test the property `pos`', () async {
      // TODO
    });

    // Цена предложения без скидки магазина.
    // num preDiscountPrice
    test('to test the property `preDiscountPrice`', () async {
      // TODO
    });

    // Цена предложения без скидки, которую получает покупатель при оплате через Yandex Pay.
    // num price
    test('to test the property `price`', () async {
      // TODO
    });

    // Идентификатор региона предложения (регион, откуда доставляется товар).  Сначала показываются предложения, доставляемые из региона, указанного в запросе в параметре `regionId`. Предложения, доставляемые из других регионов, показываются после них. 
    // int regionId
    test('to test the property `regionId`', () async {
      // TODO
    });

    // Стоимость доставки товара в регион:  * `0` — доставка осуществляется бесплатно. * `-1` — магазин не осуществляет доставку этого товара (самовывоз).  Если стоимость доставки неизвестна, параметр не выводится. 
    // num shippingCost
    test('to test the property `shippingCost`', () async {
      // TODO
    });

    // Название магазина (в том виде, в котором отображается на Маркете).
    // String shopName
    test('to test the property `shopName`', () async {
      // TODO
    });

    // Рейтинг магазина.  Возможные значения: * `-1` — у магазинов, недавно появившихся на Маркете, рейтинг появляется не сразу. До момента появления рейтинга для таких магазинов возвращается значение `-1`. * `1`. * `2`. * `3`. * `4`. * `5`. 
    // int shopRating
    test('to test the property `shopRating`', () async {
      // TODO
    });

    // {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
    // int inStock
    test('to test the property `inStock`', () async {
      // TODO
    });


  });

}
