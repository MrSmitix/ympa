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

// tests for OrderItemDTO
void main() {
  // final instance = OrderItemDTO();

  group('test OrderItemDTO', () {
    // Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. 
    // int id
    test('to test the property `id`', () async {
      // TODO
    });

    // Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
    // String offerId
    test('to test the property `offerId`', () async {
      // TODO
    });

    // Название товара.
    // String offerName
    test('to test the property `offerName`', () async {
      // TODO
    });

    // Цена на товар в валюте заказа без учета вознаграждения партнеру за скидки по промокодам, купонам и акциям (параметр `subsidies`). 
    // num price
    test('to test the property `price`', () async {
      // TODO
    });

    // Цена на товар в валюте покупателя. В цене уже учтены скидки по:  * акциям; * купонам; * промокодам. 
    // num buyerPrice
    test('to test the property `buyerPrice`', () async {
      // TODO
    });

    // Стоимость товара в валюте покупателя до применения скидок по:  * акциям; * купонам; * промокодам. 
    // num buyerPriceBeforeDiscount
    test('to test the property `buyerPriceBeforeDiscount`', () async {
      // TODO
    });

    // {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость товара в валюте магазина до применения скидок. 
    // num priceBeforeDiscount
    test('to test the property `priceBeforeDiscount`', () async {
      // TODO
    });

    // Количество единиц товара.
    // int count
    test('to test the property `count`', () async {
      // TODO
    });

    // OrderVatType vat
    test('to test the property `vat`', () async {
      // TODO
    });

    // Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
    // String shopSku
    test('to test the property `shopSku`', () async {
      // TODO
    });

    // {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `subsidies`.  {% endnote %}  Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам; * по купонам; * по баллам Плюса; * по акциям.  Передается в валюте заказа. 
    // num subsidy
    test('to test the property `subsidy`', () async {
      // TODO
    });

    // {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Идентификатор склада в системе партнера, на который сформирован заказ. 
    // String partnerWarehouseId
    test('to test the property `partnerWarehouseId`', () async {
      // TODO
    });

    // Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.
    // List<OrderItemPromoDTO> promos (default value: const [])
    test('to test the property `promos`', () async {
      // TODO
    });

    // Информация о маркировке единиц товара.  Возвращаются данные для маркировки, переданные в запросе [PUT campaigns/{campaignId}/orders/{orderId}/cis](../../reference/orders/provideOrderItemCis.md).  Если магазин еще не передавал коды для этого заказа, `instances` отсутствует. 
    // List<OrderItemInstanceDTO> instances (default value: const [])
    test('to test the property `instances`', () async {
      // TODO
    });

    // Информация об удалении товара из заказа. 
    // List<OrderItemDetailDTO> details (default value: const [])
    test('to test the property `details`', () async {
      // TODO
    });

    // Список субсидий по типам.
    // List<OrderItemSubsidyDTO> subsidies (default value: const [])
    test('to test the property `subsidies`', () async {
      // TODO
    });

    // Список необходимых маркировок товара.
    // List<OrderItemInstanceType> requiredInstanceTypes (default value: const [])
    test('to test the property `requiredInstanceTypes`', () async {
      // TODO
    });


  });

}
