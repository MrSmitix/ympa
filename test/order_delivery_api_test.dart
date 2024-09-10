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


/// tests for OrderDeliveryApi
void main() {
  // final instance = OrderDeliveryApi();

  group('tests for OrderDeliveryApi', () {
    // Информация о покупателе — физическом лице
    //
    // Возвращает информацию о покупателе по идентификатору заказа.  {% note info \"\" %}  Чтобы получить информацию о покупателе, который является юридическим лицом, воспользуйтесь запросом [POST campaigns/{campaignId}/orders/{orderId}/business-buyer](../../reference/order-business-information/getOrderBusinessBuyerInfo.md).  {% endnote %}  Получить данные можно, только если заказ находится в статусе `PROCESSING`, `DELIVERY` или `PICKUP`.  Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).  |**⚙️ Лимит:** 3 000 запросов в час| |-| 
    //
    //Future<GetOrderBuyerInfoResponse> getOrderBuyerInfo(int campaignId, int orderId) async
    test('test getOrderBuyerInfo', () async {
      // TODO
    });

    // Изменение даты доставки заказа
    //
    // Метод изменяет дату доставки заказа в статусе `PROCESSING` или `DELIVERY`. Для заказов с другими статусами дату доставки изменить нельзя.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
    //
    //Future<EmptyApiResponse> setOrderDeliveryDate(int campaignId, int orderId, SetOrderDeliveryDateRequest setOrderDeliveryDateRequest) async
    test('test setOrderDeliveryDate', () async {
      // TODO
    });

    // Передача трек‑номера посылки
    //
    // {% note warning \"Этот запрос только для DBS\" %}  Вы можете использовать запрос, чтобы повысить лояльность покупателей. Если они могут узнать, на каком этапе доставки находятся их заказы, доверие покупателей к вашему магазину может возрасти.  {% endnote %}  Передает Маркету трек‑номер, по которому покупатель может отследить посылку со своим заказом через службу доставки.  Передать трек‑номер можно, только если заказ находится в статусе `PROCESSING`, `DELIVERY` или `PICKUP`.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
    //
    //Future<EmptyApiResponse> setOrderDeliveryTrackCode(int campaignId, int orderId, SetOrderDeliveryTrackCodeRequest setOrderDeliveryTrackCodeRequest) async
    test('test setOrderDeliveryTrackCode', () async {
      // TODO
    });

    // Продление срока хранения заказа
    //
    // Продлевает срок хранения заказа в пункте выдачи продавца.  Заказ должен быть в статусе `PICKUP`. Продлить срок можно только один раз, не больше чем на 30 дней.  Новый срок хранения можно получить в параметре `outletStorageLimitDate` запроса [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
    //
    //Future<EmptyApiResponse> updateOrderStorageLimit(int campaignId, int orderId, UpdateOrderStorageLimitRequest updateOrderStorageLimitRequest) async
    test('test updateOrderStorageLimit', () async {
      // TODO
    });

    // Передача кода подтверждения
    //
    // Отправляет Маркету код подтверждения для его проверки.  Код подтверждает передачу заказа или невыкупа:  * курьеру — курьер должен назвать магазину код; * магазину — магазин называет код курьеру.  Если магазин получает невыкупленный заказ, то ему нужно назвать курьеру код из кабинета или приложения.  Если у магазина настроена работа с кодами подтверждения, в запросах [POST order/status](../../pushapi/reference/postOrderStatus.md), [PUT campaigns/{campaignId}/orders/{orderId}/status](../../reference/orders/updateOrderStatus.md), [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md), [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) в параметре `delivery`, вложенном в `order` будет возвращаться параметр `eacType` с типом `Enum` — тип кода подтверждения для передачи заказа.  Возможные значения: `MERCHANT_TO_COURIER` — магазин называет код курьеру, `COURIER_TO_MERCHANT` — курьер называет код магазину.  Параметр `eacType` возвращается при статусах заказа `COURIER_FOUND`, `COURIER_ARRIVED_TO_SENDER` и `DELIVERY_SERVICE_UNDELIVERED`. Если заказ в других статусах, параметр может отсутствовать.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
    //
    //Future<VerifyOrderEacResponse> verifyOrderEac(int campaignId, int orderId, VerifyOrderEacRequest verifyOrderEacRequest) async
    test('test verifyOrderEac', () async {
      // TODO
    });

  });
}
