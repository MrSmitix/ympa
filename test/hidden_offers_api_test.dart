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


/// tests for HiddenOffersApi
void main() {
  // final instance = HiddenOffersApi();

  group('tests for HiddenOffersApi', () {
    // Скрытие товаров и настройки скрытия
    //
    // Скрывает товары магазина на Маркете.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
    //
    //Future<EmptyApiResponse> addHiddenOffers(int campaignId, AddHiddenOffersRequest addHiddenOffersRequest) async
    test('test addHiddenOffers', () async {
      // TODO
    });

    // Возобновление показа товаров
    //
    // Возобновляет показ скрытых вами товаров магазина на Маркете.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
    //
    //Future<EmptyApiResponse> deleteHiddenOffers(int campaignId, DeleteHiddenOffersRequest deleteHiddenOffersRequest) async
    test('test deleteHiddenOffers', () async {
      // TODO
    });

    // Информация о скрытых вами товарах
    //
    // Возвращает список скрытых вами товаров для заданного магазина.  В списке будут товары, скрытые любым способом — по API, с помощью YML-фида, в кабинете и так далее.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
    //
    //Future<GetHiddenOffersResponse> getHiddenOffers(int campaignId, { List<String> offerId, String pageToken, int limit, int offset, int page, int pageSize }) async
    test('test getHiddenOffers', () async {
      // TODO
    });

  });
}
