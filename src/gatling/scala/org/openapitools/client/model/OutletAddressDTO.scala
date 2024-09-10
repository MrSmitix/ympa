
package org.openapitools.client.model


case class OutletAddressDTO (
    /* Идентификатор региона.  Идентификатор можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  {% note alert %}  При создании и редактировании точек продаж можно указывать только регионы типов `TOWN` (город), `CITY` (крупный город) и `REPUBLIC_AREA` (район субъекта федерации). Тип региона указан в выходных параметрах type запросов [GET regions](../../reference/regions/searchRegionsByName.md) и [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  {% endnote %}  */
    _regionId: Long,
    /* Улица. */
    _street: Option[String],
    /* Номер дома. */
    _number: Option[String],
    /* Номер строения. */
    _building: Option[String],
    /* Номер владения. */
    _estate: Option[String],
    /* Номер корпуса. */
    _block: Option[String],
    /* Дополнительная информация. */
    _additional: Option[String],
    /* Порядковый номер километра дороги, на котором располагается точка продаж, если отсутствует улица. */
    _km: Option[Integer],
    /* {% note warning \"\" %}  Этот параметр устарел. Не используйте его. Город или населенный пункт возвращается в параметре `regionId`.  {% endnote %}  */
    _city: Option[String]
)
object OutletAddressDTO {
    def toStringBody(var_regionId: Object, var_street: Object, var_number: Object, var_building: Object, var_estate: Object, var_block: Object, var_additional: Object, var_km: Object, var_city: Object) =
        s"""
        | {
        | "regionId":$var_regionId,"street":$var_street,"number":$var_number,"building":$var_building,"estate":$var_estate,"block":$var_block,"additional":$var_additional,"km":$var_km,"city":$var_city
        | }
        """.stripMargin
}
