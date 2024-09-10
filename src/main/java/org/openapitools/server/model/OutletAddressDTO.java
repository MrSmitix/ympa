package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Адрес точки продаж. 
 */
public class OutletAddressDTO   {

    private Long regionId;
    private String street;
    private String number;
    private String building;
    private String estate;
    private String block;
    private String additional;
    private Integer km;
    private String city;

    /**
     * Default constructor.
     */
    public OutletAddressDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OutletAddressDTO.
     *
     * @param regionId Идентификатор региона.  Идентификатор можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  {% note alert %}  При создании и редактировании точек продаж можно указывать только регионы типов &#x60;TOWN&#x60; (город), &#x60;CITY&#x60; (крупный город) и &#x60;REPUBLIC_AREA&#x60; (район субъекта федерации). Тип региона указан в выходных параметрах type запросов [GET regions](../../reference/regions/searchRegionsByName.md) и [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  {% endnote %} 
     * @param street Улица.
     * @param number Номер дома.
     * @param building Номер строения.
     * @param estate Номер владения.
     * @param block Номер корпуса.
     * @param additional Дополнительная информация.
     * @param km Порядковый номер километра дороги, на котором располагается точка продаж, если отсутствует улица.
     * @param city {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его. Город или населенный пункт возвращается в параметре &#x60;regionId&#x60;.  {% endnote %} 
     */
    public OutletAddressDTO(
        Long regionId, 
        String street, 
        String number, 
        String building, 
        String estate, 
        String block, 
        String additional, 
        Integer km, 
        String city
    ) {
        this.regionId = regionId;
        this.street = street;
        this.number = number;
        this.building = building;
        this.estate = estate;
        this.block = block;
        this.additional = additional;
        this.km = km;
        this.city = city;
    }



    /**
     * Идентификатор региона.  Идентификатор можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  {% note alert %}  При создании и редактировании точек продаж можно указывать только регионы типов `TOWN` (город), `CITY` (крупный город) и `REPUBLIC_AREA` (район субъекта федерации). Тип региона указан в выходных параметрах type запросов [GET regions](../../reference/regions/searchRegionsByName.md) и [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  {% endnote %} 
     * @return regionId
     */
    public Long getRegionId() {
        return regionId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

    /**
     * Улица.
     * @return street
     */
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Номер дома.
     * @return number
     */
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * Номер строения.
     * @return building
     */
    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    /**
     * Номер владения.
     * @return estate
     */
    public String getEstate() {
        return estate;
    }

    public void setEstate(String estate) {
        this.estate = estate;
    }

    /**
     * Номер корпуса.
     * @return block
     */
    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    /**
     * Дополнительная информация.
     * @return additional
     */
    public String getAdditional() {
        return additional;
    }

    public void setAdditional(String additional) {
        this.additional = additional;
    }

    /**
     * Порядковый номер километра дороги, на котором располагается точка продаж, если отсутствует улица.
     * @return km
     */
    public Integer getKm() {
        return km;
    }

    public void setKm(Integer km) {
        this.km = km;
    }

    /**
     * {% note warning \"\" %}  Этот параметр устарел. Не используйте его. Город или населенный пункт возвращается в параметре `regionId`.  {% endnote %} 
     * @return city
     */
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OutletAddressDTO {\n");
        
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    street: ").append(toIndentedString(street)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    building: ").append(toIndentedString(building)).append("\n");
        sb.append("    estate: ").append(toIndentedString(estate)).append("\n");
        sb.append("    block: ").append(toIndentedString(block)).append("\n");
        sb.append("    additional: ").append(toIndentedString(additional)).append("\n");
        sb.append("    km: ").append(toIndentedString(km)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        if (o == null) {
          return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

