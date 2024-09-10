package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Адрес точки продаж. 
 */
@ApiModel(description = "Адрес точки продаж. ")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OutletAddressDTO   {
  @JsonProperty("regionId")
  private Long regionId;

  @JsonProperty("street")
  private String street;

  @JsonProperty("number")
  private String number;

  @JsonProperty("building")
  private String building;

  @JsonProperty("estate")
  private String estate;

  @JsonProperty("block")
  private String block;

  @JsonProperty("additional")
  private String additional;

  @JsonProperty("km")
  private Integer km;

  @JsonProperty("city")
  private String city;

  public OutletAddressDTO regionId(Long regionId) {
    this.regionId = regionId;
    return this;
  }

  /**
   * Идентификатор региона.  Идентификатор можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  {% note alert %}  При создании и редактировании точек продаж можно указывать только регионы типов `TOWN` (город), `CITY` (крупный город) и `REPUBLIC_AREA` (район субъекта федерации). Тип региона указан в выходных параметрах type запросов [GET regions](../../reference/regions/searchRegionsByName.md) и [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  {% endnote %} 
   * @return regionId
   */
  @ApiModelProperty(required = true, value = "Идентификатор региона.  Идентификатор можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  {% note alert %}  При создании и редактировании точек продаж можно указывать только регионы типов `TOWN` (город), `CITY` (крупный город) и `REPUBLIC_AREA` (район субъекта федерации). Тип региона указан в выходных параметрах type запросов [GET regions](../../reference/regions/searchRegionsByName.md) и [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  {% endnote %} ")
  public Long getRegionId() {
    return regionId;
  }

  public void setRegionId(Long regionId) {
    this.regionId = regionId;
  }

  public OutletAddressDTO street(String street) {
    this.street = street;
    return this;
  }

  /**
   * Улица.
   * @return street
   */
  @ApiModelProperty(value = "Улица.")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public OutletAddressDTO number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Номер дома.
   * @return number
   */
  @ApiModelProperty(value = "Номер дома.")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public OutletAddressDTO building(String building) {
    this.building = building;
    return this;
  }

  /**
   * Номер строения.
   * @return building
   */
  @ApiModelProperty(value = "Номер строения.")
  public String getBuilding() {
    return building;
  }

  public void setBuilding(String building) {
    this.building = building;
  }

  public OutletAddressDTO estate(String estate) {
    this.estate = estate;
    return this;
  }

  /**
   * Номер владения.
   * @return estate
   */
  @ApiModelProperty(value = "Номер владения.")
  public String getEstate() {
    return estate;
  }

  public void setEstate(String estate) {
    this.estate = estate;
  }

  public OutletAddressDTO block(String block) {
    this.block = block;
    return this;
  }

  /**
   * Номер корпуса.
   * @return block
   */
  @ApiModelProperty(value = "Номер корпуса.")
  public String getBlock() {
    return block;
  }

  public void setBlock(String block) {
    this.block = block;
  }

  public OutletAddressDTO additional(String additional) {
    this.additional = additional;
    return this;
  }

  /**
   * Дополнительная информация.
   * @return additional
   */
  @ApiModelProperty(value = "Дополнительная информация.")
  public String getAdditional() {
    return additional;
  }

  public void setAdditional(String additional) {
    this.additional = additional;
  }

  public OutletAddressDTO km(Integer km) {
    this.km = km;
    return this;
  }

  /**
   * Порядковый номер километра дороги, на котором располагается точка продаж, если отсутствует улица.
   * @return km
   */
  @ApiModelProperty(value = "Порядковый номер километра дороги, на котором располагается точка продаж, если отсутствует улица.")
  public Integer getKm() {
    return km;
  }

  public void setKm(Integer km) {
    this.km = km;
  }

  public OutletAddressDTO city(String city) {
    this.city = city;
    return this;
  }

  /**
   * {% note warning \"\" %}  Этот параметр устарел. Не используйте его. Город или населенный пункт возвращается в параметре `regionId`.  {% endnote %} 
   * @return city
   */
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его. Город или населенный пункт возвращается в параметре `regionId`.  {% endnote %} ")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

