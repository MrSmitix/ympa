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

// tests for UpdateOfferMappingResultDTO
void main() {
  // final instance = UpdateOfferMappingResultDTO();

  group('test UpdateOfferMappingResultDTO', () {
    // Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
    // String offerId
    test('to test the property `offerId`', () async {
      // TODO
    });

    // Ошибки — информация в каталоге не обновится.
    // List<OfferMappingErrorDTO> errors (default value: const [])
    test('to test the property `errors`', () async {
      // TODO
    });

    // Предупреждения — информация в каталоге обновится.
    // List<OfferMappingErrorDTO> warnings (default value: const [])
    test('to test the property `warnings`', () async {
      // TODO
    });


  });

}
