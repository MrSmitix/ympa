package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Адрес точки продаж. 
 **/

@ApiModel(description = "Адрес точки продаж. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
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

  /**
   * Идентификатор региона.  Идентификатор можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  {% note alert %}  При создании и редактировании точек продаж можно указывать только регионы типов `TOWN` (город), `CITY` (крупный город) и `REPUBLIC_AREA` (район субъекта федерации). Тип региона указан в выходных параметрах type запросов [GET regions](../../reference/regions/searchRegionsByName.md) и [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  {% endnote %} 
   **/
  public OutletAddressDTO regionId(Long regionId) {
    this.regionId = regionId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор региона.  Идентификатор можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  {% note alert %}  При создании и редактировании точек продаж можно указывать только регионы типов `TOWN` (город), `CITY` (крупный город) и `REPUBLIC_AREA` (район субъекта федерации). Тип региона указан в выходных параметрах type запросов [GET regions](../../reference/regions/searchRegionsByName.md) и [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  {% endnote %} ")
  @JsonProperty("regionId")
  public Long getRegionId() {
    return regionId;
  }
  public void setRegionId(Long regionId) {
    this.regionId = regionId;
  }

  /**
   * Улица.
   **/
  public OutletAddressDTO street(String street) {
    this.street = street;
    return this;
  }

  
  @ApiModelProperty(value = "Улица.")
  @JsonProperty("street")
  public String getStreet() {
    return street;
  }
  public void setStreet(String street) {
    this.street = street;
  }

  /**
   * Номер дома.
   **/
  public OutletAddressDTO number(String number) {
    this.number = number;
    return this;
  }

  
  @ApiModelProperty(value = "Номер дома.")
  @JsonProperty("number")
  public String getNumber() {
    return number;
  }
  public void setNumber(String number) {
    this.number = number;
  }

  /**
   * Номер строения.
   **/
  public OutletAddressDTO building(String building) {
    this.building = building;
    return this;
  }

  
  @ApiModelProperty(value = "Номер строения.")
  @JsonProperty("building")
  public String getBuilding() {
    return building;
  }
  public void setBuilding(String building) {
    this.building = building;
  }

  /**
   * Номер владения.
   **/
  public OutletAddressDTO estate(String estate) {
    this.estate = estate;
    return this;
  }

  
  @ApiModelProperty(value = "Номер владения.")
  @JsonProperty("estate")
  public String getEstate() {
    return estate;
  }
  public void setEstate(String estate) {
    this.estate = estate;
  }

  /**
   * Номер корпуса.
   **/
  public OutletAddressDTO block(String block) {
    this.block = block;
    return this;
  }

  
  @ApiModelProperty(value = "Номер корпуса.")
  @JsonProperty("block")
  public String getBlock() {
    return block;
  }
  public void setBlock(String block) {
    this.block = block;
  }

  /**
   * Дополнительная информация.
   **/
  public OutletAddressDTO additional(String additional) {
    this.additional = additional;
    return this;
  }

  
  @ApiModelProperty(value = "Дополнительная информация.")
  @JsonProperty("additional")
  public String getAdditional() {
    return additional;
  }
  public void setAdditional(String additional) {
    this.additional = additional;
  }

  /**
   * Порядковый номер километра дороги, на котором располагается точка продаж, если отсутствует улица.
   **/
  public OutletAddressDTO km(Integer km) {
    this.km = km;
    return this;
  }

  
  @ApiModelProperty(value = "Порядковый номер километра дороги, на котором располагается точка продаж, если отсутствует улица.")
  @JsonProperty("km")
  public Integer getKm() {
    return km;
  }
  public void setKm(Integer km) {
    this.km = km;
  }

  /**
   * {% note warning \"\" %}  Этот параметр устарел. Не используйте его. Город или населенный пункт возвращается в параметре `regionId`.  {% endnote %} 
   **/
  public OutletAddressDTO city(String city) {
    this.city = city;
    return this;
  }

  
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его. Город или населенный пункт возвращается в параметре `regionId`.  {% endnote %} ")
  @JsonProperty("city")
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
    return Objects.equals(regionId, outletAddressDTO.regionId) &&
        Objects.equals(street, outletAddressDTO.street) &&
        Objects.equals(number, outletAddressDTO.number) &&
        Objects.equals(building, outletAddressDTO.building) &&
        Objects.equals(estate, outletAddressDTO.estate) &&
        Objects.equals(block, outletAddressDTO.block) &&
        Objects.equals(additional, outletAddressDTO.additional) &&
        Objects.equals(km, outletAddressDTO.km) &&
        Objects.equals(city, outletAddressDTO.city);
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

