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

// tests for FeedbackDTO
void main() {
  // final instance = FeedbackDTO();

  group('test FeedbackDTO', () {
    // Идентификатор отзыва.
    // int id
    test('to test the property `id`', () async {
      // TODO
    });

    // Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
    // DateTime createdAt
    test('to test the property `createdAt`', () async {
      // TODO
    });

    // Комментарий автора отзыва.
    // String text
    test('to test the property `text`', () async {
      // TODO
    });

    // FeedbackStateType state
    test('to test the property `state`', () async {
      // TODO
    });

    // FeedbackAuthorDTO author
    test('to test the property `author`', () async {
      // TODO
    });

    // Достоинства магазина, описанные в отзыве.
    // String pro
    test('to test the property `pro`', () async {
      // TODO
    });

    // Недостатки магазина, описанные в отзыве.
    // String contra
    test('to test the property `contra`', () async {
      // TODO
    });

    // Переписка автора отзыва с магазином.
    // List<FeedbackCommentDTO> comments (default value: const [])
    test('to test the property `comments`', () async {
      // TODO
    });

    // FeedbackShopDTO shop
    test('to test the property `shop`', () async {
      // TODO
    });

    // Решена ли проблема автора отзыва:  * `true` — да. * `false` — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись. 
    // bool resolved
    test('to test the property `resolved`', () async {
      // TODO
    });

    // {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * `true` — да. * `false` — нет. 
    // bool verified
    test('to test the property `verified`', () async {
      // TODO
    });

    // Купил бы автор отзыва в магазине снова:  * `true` — да. * `false` — нет. 
    // bool recommend
    test('to test the property `recommend`', () async {
      // TODO
    });

    // FeedbackGradesDTO grades
    test('to test the property `grades`', () async {
      // TODO
    });

    // FeedbackOrderDTO order
    test('to test the property `order`', () async {
      // TODO
    });


  });

}
