
package org.openapitools.client.model


case class OrderDeliveryDTO (
    /* Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md).  */
    _id: Option[String],
    _type: Option[OrderDeliveryType],
    /* Наименование службы доставки. */
    _serviceName: Option[String],
    /* {% note warning \"\" %}  Этот параметр устарел. Стоимость доставки смотрите в параметре `deliveryTotal`.  {% endnote %}  Стоимость доставки в валюте заказа.  */
    _price: Option[Number],
    _deliveryPartnerType: Option[OrderDeliveryPartnerType],
    _courier: Option[OrderCourierDTO],
    _dates: Option[OrderDeliveryDatesDTO],
    _region: Option[RegionDTO],
    _address: Option[OrderDeliveryAddressDTO],
    _vat: Option[OrderVatType],
    /* Идентификатор службы доставки. */
    _deliveryServiceId: Option[Long],
    _liftType: Option[OrderLiftType],
    /* Стоимость подъема на этаж. */
    _liftPrice: Option[Number],
    /* Идентификатор пункта самовывоза, присвоенный магазином. */
    _outletCode: Option[String],
    /* Формат даты: `ДД-ММ-ГГГГ`.  */
    _outletStorageLimitDate: Option[String],
    _dispatchType: Option[OrderDeliveryDispatchType],
    /* Информация для отслеживания перемещений посылки. */
    _tracks: Option[List[OrderTrackDTO]],
    /* Информация о посылках. */
    _shipments: Option[List[OrderShipmentDTO]],
    /* Приблизительная ли дата доставки. */
    _estimated: Option[Boolean],
    _eacType: Option[OrderDeliveryEacType],
    /* Код подтверждения ЭАПП (для типа `MERCHANT_TO_COURIER`).  */
    _eacCode: Option[String]
)
object OrderDeliveryDTO {
    def toStringBody(var_id: Object, var_type: Object, var_serviceName: Object, var_price: Object, var_deliveryPartnerType: Object, var_courier: Object, var_dates: Object, var_region: Object, var_address: Object, var_vat: Object, var_deliveryServiceId: Object, var_liftType: Object, var_liftPrice: Object, var_outletCode: Object, var_outletStorageLimitDate: Object, var_dispatchType: Object, var_tracks: Object, var_shipments: Object, var_estimated: Object, var_eacType: Object, var_eacCode: Object) =
        s"""
        | {
        | "id":$var_id,"type":$var_type,"serviceName":$var_serviceName,"price":$var_price,"deliveryPartnerType":$var_deliveryPartnerType,"courier":$var_courier,"dates":$var_dates,"region":$var_region,"address":$var_address,"vat":$var_vat,"deliveryServiceId":$var_deliveryServiceId,"liftType":$var_liftType,"liftPrice":$var_liftPrice,"outletCode":$var_outletCode,"outletStorageLimitDate":$var_outletStorageLimitDate,"dispatchType":$var_dispatchType,"tracks":$var_tracks,"shipments":$var_shipments,"estimated":$var_estimated,"eacType":$var_eacType,"eacCode":$var_eacCode
        | }
        """.stripMargin
}
