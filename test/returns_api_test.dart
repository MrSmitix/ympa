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


/// tests for ReturnsApi
void main() {
  // final instance = ReturnsApi();

  group('tests for ReturnsApi', () {
    // Информация о невыкупе или возврате
    //
    // Получает информацию по одному невыкупу или возврату.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
    //
    //Future<GetReturnResponse> getReturn(int campaignId, int orderId, int returnId) async
    test('test getReturn', () async {
      // TODO
    });

    // Получение заявления на возврат
    //
    // Загружает заявление покупателя на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
    //
    //Future<MultipartFile> getReturnApplication(int campaignId, int orderId, int returnId) async
    test('test getReturnApplication', () async {
      // TODO
    });

    // Получение фотографии возврата
    //
    // Получает фотографии, которые покупатель приложил к заявлению на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
    //
    //Future<MultipartFile> getReturnPhoto(int campaignId, int orderId, int returnId, int itemId, String imageHash) async
    test('test getReturnPhoto', () async {
      // TODO
    });

    // Список невыкупов и возвратов
    //
    // Получает список невыкупов и возвратов.  Чтобы получить информацию по одному возврату или невыкупу, выполните запрос [GET campaigns/{campaignId}/orders/{orderId}/returns/{returnId}](../../reference/orders/getReturn.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
    //
    //Future<GetReturnsResponse> getReturns(int campaignId, { String pageToken, int limit, List<int> orderIds, List<RefundStatusType> statuses, ReturnType type, DateTime fromDate, DateTime toDate, DateTime fromDate2, DateTime toDate2 }) async
    test('test getReturns', () async {
      // TODO
    });

    // Принятие или изменение решения по возврату
    //
    // Выбирает решение по возврату от покупателя. После этого для подтверждения решения нужно выполнить запрос [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit](../../reference/orders/submitReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
    //
    //Future<EmptyApiResponse> setReturnDecision(int campaignId, int orderId, int returnId, SetReturnDecisionRequest setReturnDecisionRequest) async
    test('test setReturnDecision', () async {
      // TODO
    });

    // Подтверждение решения по возврату
    //
    // Подтверждает выбранное решение по возврату, отправленное в запросе [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision](../../reference/orders/setReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
    //
    //Future<EmptyApiResponse> submitReturnDecision(int campaignId, int orderId, int returnId) async
    test('test submitReturnDecision', () async {
      // TODO
    });

  });
}
