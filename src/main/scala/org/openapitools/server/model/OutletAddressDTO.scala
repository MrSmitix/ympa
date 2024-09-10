package org.openapitools.server.model


/**
 * Адрес точки продаж. 
 *
 * @param regionId Идентификатор региона.  Идентификатор можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  {% note alert %}  При создании и редактировании точек продаж можно указывать только регионы типов `TOWN` (город), `CITY` (крупный город) и `REPUBLIC_AREA` (район субъекта федерации). Тип региона указан в выходных параметрах type запросов [GET regions](../../reference/regions/searchRegionsByName.md) и [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  {% endnote %}  for example: ''null''
 * @param street Улица. for example: ''null''
 * @param number Номер дома. for example: ''null''
 * @param building Номер строения. for example: ''null''
 * @param estate Номер владения. for example: ''null''
 * @param block Номер корпуса. for example: ''null''
 * @param additional Дополнительная информация. for example: ''null''
 * @param km Порядковый номер километра дороги, на котором располагается точка продаж, если отсутствует улица. for example: ''null''
 * @param city {% note warning \"\" %}  Этот параметр устарел. Не используйте его. Город или населенный пункт возвращается в параметре `regionId`.  {% endnote %}  for example: ''null''
*/
final case class OutletAddressDTO (
  regionId: Long,
  street: Option[String] = None,
  number: Option[String] = None,
  building: Option[String] = None,
  estate: Option[String] = None,
  block: Option[String] = None,
  additional: Option[String] = None,
  km: Option[Int] = None,
  city: Option[String] = None
)

