/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


/**
 * Тип региона.  Возможные значения:  * `CITY_DISTRICT` — район города.  * `CITY` — крупный город.  * `CONTINENT` — континент.  * `COUNTRY_DISTRICT` — область.  * `COUNTRY` — страна.  * `REGION` — регион.  * `REPUBLIC_AREA` — район субъекта федерации.  * `REPUBLIC` — субъект федерации.  * `SUBWAY_STATION` — станция метро.  * `VILLAGE` — город.  * `OTHER` — неизвестный регион. 
 */
export type RegionType = 'OTHER' | 'CONTINENT' | 'REGION' | 'COUNTRY' | 'COUNTRY_DISTRICT' | 'REPUBLIC' | 'CITY' | 'VILLAGE' | 'CITY_DISTRICT' | 'SUBWAY_STATION' | 'REPUBLIC_AREA';

export const RegionType = {
    Other: 'OTHER' as RegionType,
    Continent: 'CONTINENT' as RegionType,
    Region: 'REGION' as RegionType,
    Country: 'COUNTRY' as RegionType,
    CountryDistrict: 'COUNTRY_DISTRICT' as RegionType,
    Republic: 'REPUBLIC' as RegionType,
    City: 'CITY' as RegionType,
    Village: 'VILLAGE' as RegionType,
    CityDistrict: 'CITY_DISTRICT' as RegionType,
    SubwayStation: 'SUBWAY_STATION' as RegionType,
    RepublicArea: 'REPUBLIC_AREA' as RegionType
};

