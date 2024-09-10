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

// tests for GetGoodsFeedbackRequest
void main() {
  // final instance = GetGoodsFeedbackRequest();

  group('test GetGoodsFeedbackRequest', () {
    // Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в `dateTimeTo` даты. 
    // DateTime dateTimeFrom
    test('to test the property `dateTimeFrom`', () async {
      // TODO
    });

    // Конец периода. Не включительно.  Если параметр не указан, используется текущая дата. 
    // DateTime dateTimeTo
    test('to test the property `dateTimeTo`', () async {
      // TODO
    });

    // FeedbackReactionStatusType reactionStatus
    test('to test the property `reactionStatus`', () async {
      // TODO
    });

    // Оценка товара.
    // Set<int> ratingValues (default value: const {})
    test('to test the property `ratingValues`', () async {
      // TODO
    });

    // Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md). 
    // Set<int> modelIds (default value: const {})
    test('to test the property `modelIds`', () async {
      // TODO
    });

    // Фильтр отзывов за баллы Плюса.
    // bool paid
    test('to test the property `paid`', () async {
      // TODO
    });


  });

}
