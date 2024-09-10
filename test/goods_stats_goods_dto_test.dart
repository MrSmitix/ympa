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

// tests for GoodsStatsGoodsDTO
void main() {
  // final instance = GoodsStatsGoodsDTO();

  group('test GoodsStatsGoodsDTO', () {
    // Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
    // String shopSku
    test('to test the property `shopSku`', () async {
      // TODO
    });

    // SKU на Маркете.
    // int marketSku
    test('to test the property `marketSku`', () async {
      // TODO
    });

    // Название товара.
    // String name
    test('to test the property `name`', () async {
      // TODO
    });

    // Цена на товар в валюте, которая установлена [в кабинете продавца на Маркете](https://partner.market.yandex.ru/).
    // num price
    test('to test the property `price`', () async {
      // TODO
    });

    // Идентификатор категории товара на Маркете.
    // int categoryId
    test('to test the property `categoryId`', () async {
      // TODO
    });

    // Название категории товара на Маркете.
    // String categoryName
    test('to test the property `categoryName`', () async {
      // TODO
    });

    // GoodsStatsWeightDimensionsDTO weightDimensions
    test('to test the property `weightDimensions`', () async {
      // TODO
    });

    // Информация о складах, на которых хранится товар.  Параметр не приходит, если товара нет ни на одном складе. 
    // List<GoodsStatsWarehouseDTO> warehouses (default value: const [])
    test('to test the property `warehouses`', () async {
      // TODO
    });

    // Информация о тарифах, по которым нужно заплатить за услуги Маркета.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). 
    // List<TariffDTO> tariffs (default value: const [])
    test('to test the property `tariffs`', () async {
      // TODO
    });

    // Ссылки (URL) изображений товара в хорошем качестве.
    // List<String> pictures (default value: const [])
    test('to test the property `pictures`', () async {
      // TODO
    });


  });

}
