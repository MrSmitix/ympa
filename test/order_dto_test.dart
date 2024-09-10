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

// tests for OrderDTO
void main() {
  // final instance = OrderDTO();

  group('test OrderDTO', () {
    // Идентификатор заказа.
    // int id
    test('to test the property `id`', () async {
      // TODO
    });

    // OrderStatusType status
    test('to test the property `status`', () async {
      // TODO
    });

    // OrderSubstatusType substatus
    test('to test the property `substatus`', () async {
      // TODO
    });

    // String creationDate
    test('to test the property `creationDate`', () async {
      // TODO
    });

    // String updatedAt
    test('to test the property `updatedAt`', () async {
      // TODO
    });

    // CurrencyType currency
    test('to test the property `currency`', () async {
      // TODO
    });

    // Платеж покупателя. 
    // num itemsTotal
    test('to test the property `itemsTotal`', () async {
      // TODO
    });

    // Стоимость доставки. 
    // num deliveryTotal
    test('to test the property `deliveryTotal`', () async {
      // TODO
    });

    // {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки. 
    // num buyerItemsTotal
    test('to test the property `buyerItemsTotal`', () async {
      // TODO
    });

    // {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки. 
    // num buyerTotal
    test('to test the property `buyerTotal`', () async {
      // TODO
    });

    // Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам. 
    // num buyerItemsTotalBeforeDiscount
    test('to test the property `buyerItemsTotalBeforeDiscount`', () async {
      // TODO
    });

    // {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (`buyerItemsTotalBeforeDiscount` + стоимость доставки). 
    // num buyerTotalBeforeDiscount
    test('to test the property `buyerTotalBeforeDiscount`', () async {
      // TODO
    });

    // OrderPaymentType paymentType
    test('to test the property `paymentType`', () async {
      // TODO
    });

    // OrderPaymentMethodType paymentMethod
    test('to test the property `paymentMethod`', () async {
      // TODO
    });

    // Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. 
    // bool fake
    test('to test the property `fake`', () async {
      // TODO
    });

    // Список товаров в заказе.
    // List<OrderItemDTO> items (default value: const [])
    test('to test the property `items`', () async {
      // TODO
    });

    // Список субсидий по типам.
    // List<OrderSubsidyDTO> subsidies (default value: const [])
    test('to test the property `subsidies`', () async {
      // TODO
    });

    // OrderDeliveryDTO delivery
    test('to test the property `delivery`', () async {
      // TODO
    });

    // OrderBuyerDTO buyer
    test('to test the property `buyer`', () async {
      // TODO
    });

    // Комментарий к заказу.
    // String notes
    test('to test the property `notes`', () async {
      // TODO
    });

    // OrderTaxSystemType taxSystem
    test('to test the property `taxSystem`', () async {
      // TODO
    });

    // **Только для модели DBS**  Запрошена ли отмена. 
    // bool cancelRequested
    test('to test the property `cancelRequested`', () async {
      // TODO
    });

    // String expiryDate
    test('to test the property `expiryDate`', () async {
      // TODO
    });


  });

}
