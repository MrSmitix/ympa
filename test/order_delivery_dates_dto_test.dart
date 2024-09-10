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

// tests for OrderDeliveryDatesDTO
void main() {
  // final instance = OrderDeliveryDatesDTO();

  group('test OrderDeliveryDatesDTO', () {
    // Формат даты: `ДД-ММ-ГГГГ`. 
    // String fromDate
    test('to test the property `fromDate`', () async {
      // TODO
    });

    // Формат даты: `ДД-ММ-ГГГГ`. 
    // String toDate
    test('to test the property `toDate`', () async {
      // TODO
    });

    // Начало интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Минимальное значение: `00:00`. 
    // String fromTime
    test('to test the property `fromTime`', () async {
      // TODO
    });

    // Конец интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Максимальное значение: `23:59`. 
    // String toTime
    test('to test the property `toTime`', () async {
      // TODO
    });

    // Формат даты: `ДД-ММ-ГГГГ`. 
    // String realDeliveryDate
    test('to test the property `realDeliveryDate`', () async {
      // TODO
    });


  });

}
