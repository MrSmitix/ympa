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

// tests for OrdersStatsItemDTO
void main() {
  // final instance = OrdersStatsItemDTO();

  group('test OrdersStatsItemDTO', () {
    // Название товара.
    // String offerName
    test('to test the property `offerName`', () async {
      // TODO
    });

    // SKU на Маркете.
    // int marketSku
    test('to test the property `marketSku`', () async {
      // TODO
    });

    // Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
    // String shopSku
    test('to test the property `shopSku`', () async {
      // TODO
    });

    // Количество единиц товара с учетом удаленных единиц.  Если из заказа удалены все единицы товара, он попадет только в список `initialItems`. 
    // int count
    test('to test the property `count`', () async {
      // TODO
    });

    // Цена или скидки на товар.
    // List<OrdersStatsPriceDTO> prices (default value: const [])
    test('to test the property `prices`', () async {
      // TODO
    });

    // OrdersStatsWarehouseDTO warehouse
    test('to test the property `warehouse`', () async {
      // TODO
    });

    // Информация об удалении товара из заказа.
    // List<OrdersStatsDetailsDTO> details (default value: const [])
    test('to test the property `details`', () async {
      // TODO
    });

    // Список кодов идентификации товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).
    // List<String> cisList (default value: const [])
    test('to test the property `cisList`', () async {
      // TODO
    });

    // Первоначальное количество единиц товара.
    // int initialCount
    test('to test the property `initialCount`', () async {
      // TODO
    });

    // Списанная ставка ближайшего конкурента.  Указывается в процентах от стоимости товара и умножается на 100. Например, ставка 5% обозначается как 500. 
    // int bidFee
    test('to test the property `bidFee`', () async {
      // TODO
    });

    // Порог для скидок с Маркетом на момент оформления заказа. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указан в рублях. Точность — два знака после запятой. 
    // num cofinanceThreshold
    test('to test the property `cofinanceThreshold`', () async {
      // TODO
    });

    // Скидка с Маркетом. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указана в рублях. Точность — два знака после запятой. 
    // num cofinanceValue
    test('to test the property `cofinanceValue`', () async {
      // TODO
    });


  });

}
