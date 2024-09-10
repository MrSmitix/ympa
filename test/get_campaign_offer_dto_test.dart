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

// tests for GetCampaignOfferDTO
void main() {
  // final instance = GetCampaignOfferDTO();

  group('test GetCampaignOfferDTO', () {
    // Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
    // String offerId
    test('to test the property `offerId`', () async {
      // TODO
    });

    // QuantumDTO quantum
    test('to test the property `quantum`', () async {
      // TODO
    });

    // Есть ли товар в продаже. 
    // bool available
    test('to test the property `available`', () async {
      // TODO
    });

    // GetPriceWithDiscountDTO basicPrice
    test('to test the property `basicPrice`', () async {
      // TODO
    });

    // GetPriceWithVatDTO campaignPrice
    test('to test the property `campaignPrice`', () async {
      // TODO
    });

    // OfferCampaignStatusType status
    test('to test the property `status`', () async {
      // TODO
    });

    // Ошибки, препятствующие размещению товара на витрине. 
    // List<OfferErrorDTO> errors (default value: const [])
    test('to test the property `errors`', () async {
      // TODO
    });

    // Предупреждения, не препятствующие размещению товара на витрине. 
    // List<OfferErrorDTO> warnings (default value: const [])
    test('to test the property `warnings`', () async {
      // TODO
    });


  });

}
