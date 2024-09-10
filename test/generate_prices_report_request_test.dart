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

// tests for GeneratePricesReportRequest
void main() {
  // final instance = GeneratePricesReportRequest();

  group('test GeneratePricesReportRequest', () {
    // Идентификатор бизнеса.  В большинстве случаев обязателен. Не указывается, если задан `campaignId`. 
    // int businessId
    test('to test the property `businessId`', () async {
      // TODO
    });

    // Идентификатор кампании.  Как правило, не используется. Передавайте только если в кабинете есть магазины с уникальными ценами и вы хотите получить отчет для них. В этом случае передавать `businessId` не нужно. 
    // int campaignId
    test('to test the property `campaignId`', () async {
      // TODO
    });

    // Фильтр по категориям на Маркете.
    // List<int> categoryIds (default value: const [])
    test('to test the property `categoryIds`', () async {
      // TODO
    });

    // Фильтр по времени появления предложения — начало периода.  Формат даты: `ДД-ММ-ГГГГ`. 
    // DateTime creationDateFrom
    test('to test the property `creationDateFrom`', () async {
      // TODO
    });

    // Фильтр по времени появления предложения — окончание периода.  Формат даты: `ДД-ММ-ГГГГ`. 
    // DateTime creationDateTo
    test('to test the property `creationDateTo`', () async {
      // TODO
    });


  });

}
