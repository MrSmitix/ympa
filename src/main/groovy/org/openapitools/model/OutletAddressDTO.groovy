package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class OutletAddressDTO {
    /* Идентификатор региона.  Идентификатор можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  {% note alert %}  При создании и редактировании точек продаж можно указывать только регионы типов `TOWN` (город), `CITY` (крупный город) и `REPUBLIC_AREA` (район субъекта федерации). Тип региона указан в выходных параметрах type запросов [GET regions](../../reference/regions/searchRegionsByName.md) и [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  {% endnote %}  */
    Long regionId
    /* Улица. */
    String street
    /* Номер дома. */
    String number
    /* Номер строения. */
    String building
    /* Номер владения. */
    String estate
    /* Номер корпуса. */
    String block
    /* Дополнительная информация. */
    String additional
    /* Порядковый номер километра дороги, на котором располагается точка продаж, если отсутствует улица. */
    Integer km
    /* {% note warning \"\" %}  Этот параметр устарел. Не используйте его. Город или населенный пункт возвращается в параметре `regionId`.  {% endnote %}  */
    String city
}
