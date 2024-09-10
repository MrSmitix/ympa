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

// tests for OfferDTO
void main() {
  // final instance = OfferDTO();

  group('test OfferDTO', () {
    // Цена предложения.  До версии 2.0 партнерского API у параметра был тип String. 
    // num price
    test('to test the property `price`', () async {
      // TODO
    });

    // Идентификатор прайс-листа, содержащего предложение.  Параметр доступен начиная с версии 2.0 партнерского API. 
    // int feedId
    test('to test the property `feedId`', () async {
      // TODO
    });

    // Идентификатор предложения из прайс-листа.  Параметр выводится, если в прайс-листе задан уникальный идентификатор. Если в прайс-листе содержится несколько предложений с одинаковыми идентификаторами, параметр `id` указывается только для первого из них, для остальных параметры `id` и `feedId` не выводятся.  Параметр доступен начиная с версии 2.0 партнерского API. 
    // String id
    test('to test the property `id`', () async {
      // TODO
    });

    // Идентификатор категории предложения, указанный магазином в прайс-листе.  Параметр выводится только для предложений, у которых указана категория в прайс-листе.  Параметр доступен начиная с версии 2.0 партнерского API. 
    // String shopCategoryId
    test('to test the property `shopCategoryId`', () async {
      // TODO
    });

    // Идентификатор категории предложения в дереве категорий Маркета. Параметр доступен начиная с версии 2.0 партнерского API. 
    // int marketCategoryId
    test('to test the property `marketCategoryId`', () async {
      // TODO
    });

    // Цена предложения без скидки.
    // num preDiscountPrice
    test('to test the property `preDiscountPrice`', () async {
      // TODO
    });

    // Скидка на предложение в процентах.
    // int discount
    test('to test the property `discount`', () async {
      // TODO
    });

    // Является ли предложение уцененным:  * `true` — да. * `false` — нет.  Параметр доступен начиная с версии 2.58 партнерского API. 
    // bool cutPrice
    test('to test the property `cutPrice`', () async {
      // TODO
    });

    // URL-адрес предложения на сайте магазина.
    // String url
    test('to test the property `url`', () async {
      // TODO
    });

    // Идентификатор модели Маркета, с которой соотнесено предложение.  Если предложение не соотнесено ни с какой карточкой модели, то параметр `modelid` содержит значение `0`.  {% note info %}  Идентификатор модели присутствует в URL карточки модели в виде значения параметра `product`. Например: `https://market.yandex.ru/product/13584121`.  {% endnote %} 
    // int modelId
    test('to test the property `modelId`', () async {
      // TODO
    });

    // Наименование предложения.
    // String name
    test('to test the property `name`', () async {
      // TODO
    });

    // CurrencyType currency
    test('to test the property `currency`', () async {
      // TODO
    });

    // {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик. 
    // num bid
    test('to test the property `bid`', () async {
      // TODO
    });

    // {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик. 
    // num cbid
    test('to test the property `cbid`', () async {
      // TODO
    });

    // {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Процент комиссии на товар при продаже по CPA. 
    // num fee
    test('to test the property `fee`', () async {
      // TODO
    });

    // Признак блокировки предложения. Возможные значения: * `false` — предложение активно, параметр не выводится. * `true` — предложение заблокировано. Параметр выводится, если предложение заблокировано и не попадает в выдачу Маркета. Это может произойти из-за отключения магазина. 
    // bool blocked
    test('to test the property `blocked`', () async {
      // TODO
    });


  });

}
