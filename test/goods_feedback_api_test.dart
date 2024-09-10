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


/// tests for GoodsFeedbackApi
void main() {
  // final instance = GoodsFeedbackApi();

  group('tests for GoodsFeedbackApi', () {
    // Удаление комментария к отзыву
    //
    // Удаляет комментарий магазина.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
    //
    //Future<EmptyApiResponse> deleteGoodsFeedbackComment(int businessId, DeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest) async
    test('test deleteGoodsFeedbackComment', () async {
      // TODO
    });

    // Получение комментариев к отзыву
    //
    // Возвращает комментарии к отзыву.  Результаты возвращаются постранично, одна страница содержит не более 20 комментариев.  Комментарии расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
    //
    //Future<GetGoodsFeedbackCommentsResponse> getGoodsFeedbackComments(int businessId, GetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest, { String pageToken, int limit }) async
    test('test getGoodsFeedbackComments', () async {
      // TODO
    });

    // Получение отзывов о товарах продавца
    //
    // Возвращает все отзывы о товарах продавца по указанным фильтрам.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов.  Отзывы расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
    //
    //Future<GetGoodsFeedbackResponse> getGoodsFeedbacks(int businessId, { String pageToken, int limit, GetGoodsFeedbackRequest getGoodsFeedbackRequest }) async
    test('test getGoodsFeedbacks', () async {
      // TODO
    });

    // Отказ от ответа на отзывы
    //
    // Пропускает отзывы — они больше не будут возвращаться в методе получения всех отзывов [POST businesses/{businessId}/goods-feedback](../../reference/goods-feedback/getGoodsFeedbacks.md).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
    //
    //Future<EmptyApiResponse> skipGoodsFeedbacksReaction(int businessId, SkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest) async
    test('test skipGoodsFeedbacksReaction', () async {
      // TODO
    });

    // Добавление нового или изменение созданного комментария
    //
    // Добавляет новый комментарий магазина или изменяет комментарий, который магазин оставлял ранее.  Для создания комментария к отзыву передайте только идентификатор отзыва `feedbackId`.  Чтобы добавить комментарий к другому комментарию, передайте:  * `feedbackId` — идентификатор отзыва; * `comment.parentId` — идентификатор родительского комментария.  Чтобы изменить комментарий, передайте:  * `feedbackId`— идентификатор отзыва; * `comment.id` — идентификатор комментария, который нужно изменить.  Если передать одновременно `comment.parentId` и `comment.id`, будет изменен существующий комментарий.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
    //
    //Future<UpdateGoodsFeedbackCommentResponse> updateGoodsFeedbackComment(int businessId, UpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest) async
    test('test updateGoodsFeedbackComment', () async {
      // TODO
    });

  });
}
