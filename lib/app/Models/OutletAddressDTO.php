<?php
/**
 * OutletAddressDTO
 */
namespace app\Models;

/**
 * OutletAddressDTO
 * @description Адрес точки продаж.
 */
class OutletAddressDTO {

    /** @var int $regionId Идентификатор региона.  Идентификатор можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  {% note alert %}  При создании и редактировании точек продаж можно указывать только регионы типов &#x60;TOWN&#x60; (город), &#x60;CITY&#x60; (крупный город) и &#x60;REPUBLIC_AREA&#x60; (район субъекта федерации). Тип региона указан в выходных параметрах type запросов [GET regions](../../reference/regions/searchRegionsByName.md) и [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  {% endnote %}*/
    public $regionId = 0;

    /** @var string $street Улица.*/
    public $street = "";

    /** @var string $number Номер дома.*/
    public $number = "";

    /** @var string $building Номер строения.*/
    public $building = "";

    /** @var string $estate Номер владения.*/
    public $estate = "";

    /** @var string $block Номер корпуса.*/
    public $block = "";

    /** @var string $additional Дополнительная информация.*/
    public $additional = "";

    /** @var int $km Порядковый номер километра дороги, на котором располагается точка продаж, если отсутствует улица.*/
    public $km = 0;

    /** @var string $city {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его. Город или населенный пункт возвращается в параметре &#x60;regionId&#x60;.  {% endnote %}*/
    public $city = "";

}
