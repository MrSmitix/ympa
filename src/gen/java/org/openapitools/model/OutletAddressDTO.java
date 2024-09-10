package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Адрес точки продаж. 
 **/
@ApiModel(description="Адрес точки продаж. ")

public class OutletAddressDTO  {
  
  @ApiModelProperty(required = true, value = "Идентификатор региона.  Идентификатор можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  {% note alert %}  При создании и редактировании точек продаж можно указывать только регионы типов `TOWN` (город), `CITY` (крупный город) и `REPUBLIC_AREA` (район субъекта федерации). Тип региона указан в выходных параметрах type запросов [GET regions](../../reference/regions/searchRegionsByName.md) и [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  {% endnote %} ")
 /**
   * Идентификатор региона.  Идентификатор можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  {% note alert %}  При создании и редактировании точек продаж можно указывать только регионы типов `TOWN` (город), `CITY` (крупный город) и `REPUBLIC_AREA` (район субъекта федерации). Тип региона указан в выходных параметрах type запросов [GET regions](../../reference/regions/searchRegionsByName.md) и [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  {% endnote %} 
  **/
  private Long regionId;

  @ApiModelProperty(value = "Улица.")
 /**
   * Улица.
  **/
  private String street;

  @ApiModelProperty(value = "Номер дома.")
 /**
   * Номер дома.
  **/
  private String number;

  @ApiModelProperty(value = "Номер строения.")
 /**
   * Номер строения.
  **/
  private String building;

  @ApiModelProperty(value = "Номер владения.")
 /**
   * Номер владения.
  **/
  private String estate;

  @ApiModelProperty(value = "Номер корпуса.")
 /**
   * Номер корпуса.
  **/
  private String block;

  @ApiModelProperty(value = "Дополнительная информация.")
 /**
   * Дополнительная информация.
  **/
  private String additional;

  @ApiModelProperty(value = "Порядковый номер километра дороги, на котором располагается точка продаж, если отсутствует улица.")
 /**
   * Порядковый номер километра дороги, на котором располагается точка продаж, если отсутствует улица.
  **/
  private Integer km;

  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его. Город или населенный пункт возвращается в параметре `regionId`.  {% endnote %} ")
 /**
   * {% note warning \"\" %}  Этот параметр устарел. Не используйте его. Город или населенный пункт возвращается в параметре `regionId`.  {% endnote %} 
  **/
  private String city;
 /**
   * Идентификатор региона.  Идентификатор можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  {% note alert %}  При создании и редактировании точек продаж можно указывать только регионы типов &#x60;TOWN&#x60; (город), &#x60;CITY&#x60; (крупный город) и &#x60;REPUBLIC_AREA&#x60; (район субъекта федерации). Тип региона указан в выходных параметрах type запросов [GET regions](../../reference/regions/searchRegionsByName.md) и [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  {% endnote %} 
   * @return regionId
  **/
  @JsonProperty("regionId")
  @NotNull
  public Long getRegionId() {
    return regionId;
  }

  public void setRegionId(Long regionId) {
    this.regionId = regionId;
  }

  public OutletAddressDTO regionId(Long regionId) {
    this.regionId = regionId;
    return this;
  }

 /**
   * Улица.
   * @return street
  **/
  @JsonProperty("street")
 @Size(max=512)  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public OutletAddressDTO street(String street) {
    this.street = street;
    return this;
  }

 /**
   * Номер дома.
   * @return number
  **/
  @JsonProperty("number")
 @Size(max=256)  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public OutletAddressDTO number(String number) {
    this.number = number;
    return this;
  }

 /**
   * Номер строения.
   * @return building
  **/
  @JsonProperty("building")
 @Size(max=16)  public String getBuilding() {
    return building;
  }

  public void setBuilding(String building) {
    this.building = building;
  }

  public OutletAddressDTO building(String building) {
    this.building = building;
    return this;
  }

 /**
   * Номер владения.
   * @return estate
  **/
  @JsonProperty("estate")
 @Size(max=16)  public String getEstate() {
    return estate;
  }

  public void setEstate(String estate) {
    this.estate = estate;
  }

  public OutletAddressDTO estate(String estate) {
    this.estate = estate;
    return this;
  }

 /**
   * Номер корпуса.
   * @return block
  **/
  @JsonProperty("block")
 @Size(max=16)  public String getBlock() {
    return block;
  }

  public void setBlock(String block) {
    this.block = block;
  }

  public OutletAddressDTO block(String block) {
    this.block = block;
    return this;
  }

 /**
   * Дополнительная информация.
   * @return additional
  **/
  @JsonProperty("additional")
  public String getAdditional() {
    return additional;
  }

  public void setAdditional(String additional) {
    this.additional = additional;
  }

  public OutletAddressDTO additional(String additional) {
    this.additional = additional;
    return this;
  }

 /**
   * Порядковый номер километра дороги, на котором располагается точка продаж, если отсутствует улица.
   * @return km
  **/
  @JsonProperty("km")
  public Integer getKm() {
    return km;
  }

  public void setKm(Integer km) {
    this.km = km;
  }

  public OutletAddressDTO km(Integer km) {
    this.km = km;
    return this;
  }

 /**
   * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его. Город или населенный пункт возвращается в параметре &#x60;regionId&#x60;.  {% endnote %} 
   * @return city
  **/
  @JsonProperty("city")
 @Size(max=200)  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public OutletAddressDTO city(String city) {
    this.city = city;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutletAddressDTO outletAddressDTO = (OutletAddressDTO) o;
    return Objects.equals(this.regionId, outletAddressDTO.regionId) &&
        Objects.equals(this.street, outletAddressDTO.street) &&
        Objects.equals(this.number, outletAddressDTO.number) &&
        Objects.equals(this.building, outletAddressDTO.building) &&
        Objects.equals(this.estate, outletAddressDTO.estate) &&
        Objects.equals(this.block, outletAddressDTO.block) &&
        Objects.equals(this.additional, outletAddressDTO.additional) &&
        Objects.equals(this.km, outletAddressDTO.km) &&
        Objects.equals(this.city, outletAddressDTO.city);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regionId, street, number, building, estate, block, additional, km, city);
  }

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

