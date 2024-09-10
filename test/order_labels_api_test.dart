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


/// tests for OrderLabelsApi
void main() {
  // final instance = OrderLabelsApi();

  group('tests for OrderLabelsApi', () {
    // Готовый ярлык‑наклейка для коробки в заказе
    //
    // Формирует ярлык‑наклейку для коробки в заказе и возвращает ярлык в PDF‑файле.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
    //
    //Future<MultipartFile> generateOrderLabel(int campaignId, int orderId, int shipmentId, int boxId, { PageFormatType format }) async
    test('test generateOrderLabel', () async {
      // TODO
    });

    // Готовые ярлыки‑наклейки на все коробки в одном заказе
    //
    // Возвращает PDF-файл с ярлыками, которые нужно наклеить на коробки перед отгрузкой. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  На вход нужно передать идентификатор заказа и один необязательный параметр, который управляет версткой PDF-файла.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
    //
    //Future<MultipartFile> generateOrderLabels(int campaignId, int orderId, { PageFormatType format }) async
    test('test generateOrderLabels', () async {
      // TODO
    });

    // Данные для самостоятельного изготовления ярлыков
    //
    // Возвращает информацию на ярлыках, которые клеятся на коробки в заказе.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
    //
    //Future<GetOrderLabelsDataResponse> getOrderLabelsData(int campaignId, int orderId) async
    test('test getOrderLabelsData', () async {
      // TODO
    });

  });
}
