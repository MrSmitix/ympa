
package org.openapitools.client.model


case class OrderDeliveryAddressDTO (
    /* Страна.  Обязательный параметр.  */
    _country: Option[String],
    /* Почтовый индекс.  Указывается, если выбрана доставка почтой (`delivery type=POST`).  */
    _postcode: Option[String],
    /* Город или населенный пункт.  Обязательный параметр.  */
    _city: Option[String],
    /* Район. */
    _district: Option[String],
    /* Станция метро. */
    _subway: Option[String],
    /* Улица.  Обязательный параметр.  */
    _street: Option[String],
    /* Дом или владение.  Обязательный параметр.  */
    _house: Option[String],
    /* Корпус или строение. */
    _block: Option[String],
    /* Подъезд. */
    _entrance: Option[String],
    /* Код домофона. */
    _entryphone: Option[String],
    /* Этаж. */
    _floor: Option[String],
    /* Квартира или офис. */
    _apartment: Option[String],
    /* Телефон получателя заказа.  Обязательный параметр.  */
    _phone: Option[String],
    /* Фамилия, имя и отчество получателя заказа.  Обязательный параметр.  */
    _recipient: Option[String],
    _gps: Option[GpsDTO]
)
object OrderDeliveryAddressDTO {
    def toStringBody(var_country: Object, var_postcode: Object, var_city: Object, var_district: Object, var_subway: Object, var_street: Object, var_house: Object, var_block: Object, var_entrance: Object, var_entryphone: Object, var_floor: Object, var_apartment: Object, var_phone: Object, var_recipient: Object, var_gps: Object) =
        s"""
        | {
        | "country":$var_country,"postcode":$var_postcode,"city":$var_city,"district":$var_district,"subway":$var_subway,"street":$var_street,"house":$var_house,"block":$var_block,"entrance":$var_entrance,"entryphone":$var_entryphone,"floor":$var_floor,"apartment":$var_apartment,"phone":$var_phone,"recipient":$var_recipient,"gps":$var_gps
        | }
        """.stripMargin
}
