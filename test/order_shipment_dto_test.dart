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

// tests for OrderShipmentDTO
void main() {
  // final instance = OrderShipmentDTO();

  group('test OrderShipmentDTO', () {
    // Идентификатор посылки, присвоенный Маркетом.
    // int id
    test('to test the property `id`', () async {
      // TODO
    });

    // Формат даты: `ДД-ММ-ГГГГ`. 
    // String shipmentDate
    test('to test the property `shipmentDate`', () async {
      // TODO
    });

    // **Только для модели Экспресс**  Время, к которому магазин должен упаковать заказ и перевести его в статус `READY_TO_SHIP`. После смены статуса за заказом приедет курьер.  Поле может появиться не сразу. Запрашивайте информацию о заказе в течении 5–10 минут, пока оно не вернется.  Формат времени: 24-часовой, `ЧЧ:ММ`.  Если заказ сделан организацией, параметр не возвращается до согласования даты доставки. 
    // String shipmentTime
    test('to test the property `shipmentTime`', () async {
      // TODO
    });

    // **Только для модели DBS**  Информация для отслеживания перемещений посылки. 
    // List<OrderTrackDTO> tracks (default value: const [])
    test('to test the property `tracks`', () async {
      // TODO
    });

    // Список грузовых мест.
    // List<OrderParcelBoxDTO> boxes (default value: const [])
    test('to test the property `boxes`', () async {
      // TODO
    });


  });

}
