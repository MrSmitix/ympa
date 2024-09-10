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


/// tests for ChatsApi
void main() {
  // final instance = ChatsApi();

  group('tests for ChatsApi', () {
    // Создание нового чата с покупателем
    //
    // Создает новый чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
    //
    //Future<CreateChatResponse> createChat(int businessId, CreateChatRequest createChatRequest) async
    test('test createChat', () async {
      // TODO
    });

    // Получение истории сообщений в чате
    //
    // Возвращает историю сообщений в чате с покупателем.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
    //
    //Future<GetChatHistoryResponse> getChatHistory(int businessId, int chatId, GetChatHistoryRequest getChatHistoryRequest, { String pageToken, int limit }) async
    test('test getChatHistory', () async {
      // TODO
    });

    // Получение доступных чатов
    //
    // Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
    //
    //Future<GetChatsResponse> getChats(int businessId, GetChatsRequest getChatsRequest, { String pageToken, int limit }) async
    test('test getChats', () async {
      // TODO
    });

    // Отправка файла в чат
    //
    // Отправляет файл в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
    //
    //Future<EmptyApiResponse> sendFileToChat(int businessId, int chatId, MultipartFile file) async
    test('test sendFileToChat', () async {
      // TODO
    });

    // Отправка сообщения в чат
    //
    // Отправляет сообщение в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
    //
    //Future<EmptyApiResponse> sendMessageToChat(int businessId, int chatId, SendMessageToChatRequest sendMessageToChatRequest) async
    test('test sendMessageToChat', () async {
      // TODO
    });

  });
}
