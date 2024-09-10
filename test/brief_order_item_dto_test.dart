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

// tests for BriefOrderItemDTO
void main() {
  // final instance = BriefOrderItemDTO();

  group('test BriefOrderItemDTO', () {
    // Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. 
    // int id
    test('to test the property `id`', () async {
      // TODO
    });

    // OrderVatType vat
    test('to test the property `vat`', () async {
      // TODO
    });

    // Количество единиц товара.
    // int count
    test('to test the property `count`', () async {
      // TODO
    });

    // Цена на товар. Указана в той валюте, которая была задана в каталоге. Разделитель целой и дробной части — точка. 
    // num price
    test('to test the property `price`', () async {
      // TODO
    });

    // Название товара.
    // String offerName
    test('to test the property `offerName`', () async {
      // TODO
    });

    // Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
    // String offerId
    test('to test the property `offerId`', () async {
      // TODO
    });

    // Переданные вами коды маркировки.
    // List<OrderItemInstanceDTO> instances (default value: const [])
    test('to test the property `instances`', () async {
      // TODO
    });


  });

}
