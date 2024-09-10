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

// tests for CampaignSettingsScheduleDTO
void main() {
  // final instance = CampaignSettingsScheduleDTO();

  group('test CampaignSettingsScheduleDTO', () {
    // Признак работы службы доставки в государственные праздники. Возможные значения. * `false` — служба доставки не работает в праздничные дни. * `true` — служба доставки работает в праздничные дни. 
    // bool availableOnHolidays
    test('to test the property `availableOnHolidays`', () async {
      // TODO
    });

    // Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете.
    // List<String> customHolidays (default value: const [])
    test('to test the property `customHolidays`', () async {
      // TODO
    });

    // Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете.
    // List<String> customWorkingDays (default value: const [])
    test('to test the property `customWorkingDays`', () async {
      // TODO
    });

    // CampaignSettingsTimePeriodDTO period
    test('to test the property `period`', () async {
      // TODO
    });

    // Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете.
    // List<String> totalHolidays (default value: const [])
    test('to test the property `totalHolidays`', () async {
      // TODO
    });

    // Список выходных дней недели и государственных праздников.
    // List<int> weeklyHolidays (default value: const [])
    test('to test the property `weeklyHolidays`', () async {
      // TODO
    });


  });

}
