package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Адрес точки продаж. 
 */
@ApiModel(description="Адрес точки продаж. ")

public class OutletAddressDTO  {
  
 /**
  * Идентификатор региона.  Идентификатор можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  {% note alert %}  При создании и редактировании точек продаж можно указывать только регионы типов `TOWN` (город), `CITY` (крупный город) и `REPUBLIC_AREA` (район субъекта федерации). Тип региона указан в выходных параметрах type запросов [GET regions](../../reference/regions/searchRegionsByName.md) и [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  {% endnote %} 
  */
  @ApiModelProperty(required = true, value = "Идентификатор региона.  Идентификатор можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  {% note alert %}  При создании и редактировании точек продаж можно указывать только регионы типов `TOWN` (город), `CITY` (крупный город) и `REPUBLIC_AREA` (район субъекта федерации). Тип региона указан в выходных параметрах type запросов [GET regions](../../reference/regions/searchRegionsByName.md) и [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  {% endnote %} ")
  private Long regionId;

 /**
  * Улица.
  */
  @ApiModelProperty(value = "Улица.")
  private String street;

 /**
  * Номер дома.
  */
  @ApiModelProperty(value = "Номер дома.")
  private String number;

 /**
  * Номер строения.
  */
  @ApiModelProperty(value = "Номер строения.")
  private String building;

 /**
  * Номер владения.
  */
  @ApiModelProperty(value = "Номер владения.")
  private String estate;

 /**
  * Номер корпуса.
  */
  @ApiModelProperty(value = "Номер корпуса.")
  private String block;

 /**
  * Дополнительная информация.
  */
  @ApiModelProperty(value = "Дополнительная информация.")
  private String additional;

 /**
  * Порядковый номер километра дороги, на котором располагается точка продаж, если отсутствует улица.
  */
  @ApiModelProperty(value = "Порядковый номер километра дороги, на котором располагается точка продаж, если отсутствует улица.")
  private Integer km;

 /**
  * {% note warning \"\" %}  Этот параметр устарел. Не используйте его. Город или населенный пункт возвращается в параметре `regionId`.  {% endnote %} 
  */
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его. Город или населенный пункт возвращается в параметре `regionId`.  {% endnote %} ")
  private String city;
 /**
  * Идентификатор региона.  Идентификатор можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  {% note alert %}  При создании и редактировании точек продаж можно указывать только регионы типов &#x60;TOWN&#x60; (город), &#x60;CITY&#x60; (крупный город) и &#x60;REPUBLIC_AREA&#x60; (район субъекта федерации). Тип региона указан в выходных параметрах type запросов [GET regions](../../reference/regions/searchRegionsByName.md) и [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  {% endnote %} 
  * @return regionId
  */
  @JsonProperty("regionId")
  @NotNull
  public Long getRegionId() {
    return regionId;
  }

  /**
   * Sets the <code>regionId</code> property.
   */
 public void setRegionId(Long regionId) {
    this.regionId = regionId;
  }

  /**
   * Sets the <code>regionId</code> property.
   */
  public OutletAddressDTO regionId(Long regionId) {
    this.regionId = regionId;
    return this;
  }

 /**
  * Улица.
  * @return street
  */
  @JsonProperty("street")
 @Size(max=512)  public String getStreet() {
    return street;
  }

  /**
   * Sets the <code>street</code> property.
   */
 public void setStreet(String street) {
    this.street = street;
  }

  /**
   * Sets the <code>street</code> property.
   */
  public OutletAddressDTO street(String street) {
    this.street = street;
    return this;
  }

 /**
  * Номер дома.
  * @return number
  */
  @JsonProperty("number")
 @Size(max=256)  public String getNumber() {
    return number;
  }

  /**
   * Sets the <code>number</code> property.
   */
 public void setNumber(String number) {
    this.number = number;
  }

  /**
   * Sets the <code>number</code> property.
   */
  public OutletAddressDTO number(String number) {
    this.number = number;
    return this;
  }

 /**
  * Номер строения.
  * @return building
  */
  @JsonProperty("building")
 @Size(max=16)  public String getBuilding() {
    return building;
  }

  /**
   * Sets the <code>building</code> property.
   */
 public void setBuilding(String building) {
    this.building = building;
  }

  /**
   * Sets the <code>building</code> property.
   */
  public OutletAddressDTO building(String building) {
    this.building = building;
    return this;
  }

 /**
  * Номер владения.
  * @return estate
  */
  @JsonProperty("estate")
 @Size(max=16)  public String getEstate() {
    return estate;
  }

  /**
   * Sets the <code>estate</code> property.
   */
 public void setEstate(String estate) {
    this.estate = estate;
  }

  /**
   * Sets the <code>estate</code> property.
   */
  public OutletAddressDTO estate(String estate) {
    this.estate = estate;
    return this;
  }

 /**
  * Номер корпуса.
  * @return block
  */
  @JsonProperty("block")
 @Size(max=16)  public String getBlock() {
    return block;
  }

  /**
   * Sets the <code>block</code> property.
   */
 public void setBlock(String block) {
    this.block = block;
  }

  /**
   * Sets the <code>block</code> property.
   */
  public OutletAddressDTO block(String block) {
    this.block = block;
    return this;
  }

 /**
  * Дополнительная информация.
  * @return additional
  */
  @JsonProperty("additional")
  public String getAdditional() {
    return additional;
  }

  /**
   * Sets the <code>additional</code> property.
   */
 public void setAdditional(String additional) {
    this.additional = additional;
  }

  /**
   * Sets the <code>additional</code> property.
   */
  public OutletAddressDTO additional(String additional) {
    this.additional = additional;
    return this;
  }

 /**
  * Порядковый номер километра дороги, на котором располагается точка продаж, если отсутствует улица.
  * @return km
  */
  @JsonProperty("km")
  public Integer getKm() {
    return km;
  }

  /**
   * Sets the <code>km</code> property.
   */
 public void setKm(Integer km) {
    this.km = km;
  }

  /**
   * Sets the <code>km</code> property.
   */
  public OutletAddressDTO km(Integer km) {
    this.km = km;
    return this;
  }

 /**
  * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его. Город или населенный пункт возвращается в параметре &#x60;regionId&#x60;.  {% endnote %} 
  * @return city
  */
  @JsonProperty("city")
 @Size(max=200)  public String getCity() {
    return city;
  }

  /**
   * Sets the <code>city</code> property.
   */
 public void setCity(String city) {
    this.city = city;
  }

  /**
   * Sets the <code>city</code> property.
   */
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

