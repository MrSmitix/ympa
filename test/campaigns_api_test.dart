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


/// tests for CampaignsApi
void main() {
  // final instance = CampaignsApi();

  group('tests for CampaignsApi', () {
    // Информация о магазине
    //
    // Возвращает информацию о магазине. |**⚙️ Лимит:** 1000 запросов в час| |-| 
    //
    //Future<GetCampaignResponse> getCampaign(int campaignId) async
    test('test getCampaign', () async {
      // TODO
    });

    // Логины, связанные с магазином
    //
    // Возвращает список логинов, у которых есть доступ к магазину. |**⚙️ Лимит:** 1000 запросов в час| |-| 
    //
    //Future<GetCampaignLoginsResponse> getCampaignLogins(int campaignId) async
    test('test getCampaignLogins', () async {
      // TODO
    });

    // Регион магазина
    //
    // {% note warning \"\" %}  Этот метод устарел. Вместо него используйте [GET campaigns/{campaignId}/settings](../../reference/campaigns/getCampaignSettings.md).  {% endnote %}  Возвращает регион, в котором находится магазин. |**⚙️ Лимит:** 5 000 запросов в час| |-| 
    //
    //Future<GetCampaignRegionResponse> getCampaignRegion(int campaignId) async
    test('test getCampaignRegion', () async {
      // TODO
    });

    // Настройки магазина
    //
    // Возвращает информацию о настройках магазина, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| 
    //
    //Future<GetCampaignSettingsResponse> getCampaignSettings(int campaignId) async
    test('test getCampaignSettings', () async {
      // TODO
    });

    // Список магазинов пользователя
    //
    // Возвращает список магазинов, к которым имеет доступ пользователь — владелец авторизационного токена, использованного в запросе. Для агентских пользователей список состоит из подагентских магазинов. |**⚙️ Лимит:** 1000 запросов в час| |-| 
    //
    //Future<GetCampaignsResponse> getCampaigns({ int page, int pageSize }) async
    test('test getCampaigns', () async {
      // TODO
    });

    // Магазины, доступные логину
    //
    // Возвращает список магазинов, к которым у пользователя с указанным логином есть доступ. |**⚙️ Лимит:** 100 запросов в час| |-| 
    //
    //Future<GetCampaignsResponse> getCampaignsByLogin(String login, { int page, int pageSize }) async
    test('test getCampaignsByLogin', () async {
      // TODO
    });

  });
}
