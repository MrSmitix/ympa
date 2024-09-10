package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Адрес точки продаж. 
 */

@Schema(name = "OutletAddressDTO", description = "Адрес точки продаж. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OutletAddressDTO {

  private Long regionId;

  private String street;

  private String number;

  private String building;

  private String estate;

  private String block;

  private String additional;

  private Integer km;

  private String city;

  public OutletAddressDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OutletAddressDTO(Long regionId) {
    this.regionId = regionId;
  }

  public OutletAddressDTO regionId(Long regionId) {
    this.regionId = regionId;
    return this;
  }

  /**
   * Идентификатор региона.  Идентификатор можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  {% note alert %}  При создании и редактировании точек продаж можно указывать только регионы типов `TOWN` (город), `CITY` (крупный город) и `REPUBLIC_AREA` (район субъекта федерации). Тип региона указан в выходных параметрах type запросов [GET regions](../../reference/regions/searchRegionsByName.md) и [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  {% endnote %} 
   * @return regionId
   */
  @NotNull 
  @Schema(name = "regionId", description = "Идентификатор региона.  Идентификатор можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  {% note alert %}  При создании и редактировании точек продаж можно указывать только регионы типов `TOWN` (город), `CITY` (крупный город) и `REPUBLIC_AREA` (район субъекта федерации). Тип региона указан в выходных параметрах type запросов [GET regions](../../reference/regions/searchRegionsByName.md) и [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  {% endnote %} ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("regionId")
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
  @Size(max = 512) 
  @Schema(name = "street", description = "Улица.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("street")
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
  @Size(max = 256) 
  @Schema(name = "number", description = "Номер дома.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("number")
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
  @Size(max = 16) 
  @Schema(name = "building", description = "Номер строения.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("building")
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
  @Size(max = 16) 
  @Schema(name = "estate", description = "Номер владения.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("estate")
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
  @Size(max = 16) 
  @Schema(name = "block", description = "Номер корпуса.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("block")
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
  
  @Schema(name = "additional", description = "Дополнительная информация.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("additional")
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
  
  @Schema(name = "km", description = "Порядковый номер километра дороги, на котором располагается точка продаж, если отсутствует улица.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("km")
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
  @Size(max = 200) 
  @Schema(name = "city", description = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его. Город или населенный пункт возвращается в параметре `regionId`.  {% endnote %} ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

