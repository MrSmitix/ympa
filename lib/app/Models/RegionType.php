<?php
/**
 * RegionType
 */
namespace app\Models;

/**
 * RegionType
 * @description Тип региона.  Возможные значения:  * `CITY_DISTRICT` — район города.  * `CITY` — крупный город.  * `CONTINENT` — континент.  * `COUNTRY_DISTRICT` — область.  * `COUNTRY` — страна.  * `REGION` — регион.  * `REPUBLIC_AREA` — район субъекта федерации.  * `REPUBLIC` — субъект федерации.  * `SUBWAY_STATION` — станция метро.  * `VILLAGE` — город.  * `OTHER` — неизвестный регион.
 */
class RegionType
{
    /**
     * Possible values of this enum
     */
    const OTHER = 'OTHER';

    const CONTINENT = 'CONTINENT';

    const REGION = 'REGION';

    const COUNTRY = 'COUNTRY';

    const COUNTRY_DISTRICT = 'COUNTRY_DISTRICT';

    const REPUBLIC = 'REPUBLIC';

    const CITY = 'CITY';

    const VILLAGE = 'VILLAGE';

    const CITY_DISTRICT = 'CITY_DISTRICT';

    const SUBWAY_STATION = 'SUBWAY_STATION';

    const REPUBLIC_AREA = 'REPUBLIC_AREA';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::OTHER,
            self::CONTINENT,
            self::REGION,
            self::COUNTRY,
            self::COUNTRY_DISTRICT,
            self::REPUBLIC,
            self::CITY,
            self::VILLAGE,
            self::CITY_DISTRICT,
            self::SUBWAY_STATION,
            self::REPUBLIC_AREA
        ];
    }
}
