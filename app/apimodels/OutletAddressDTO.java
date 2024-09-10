package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Адрес точки продаж. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OutletAddressDTO   {
  @JsonProperty("regionId")
  @NotNull

  private Long regionId;

  @JsonProperty("street")
  @Size(max=512)

  private String street;

  @JsonProperty("number")
  @Size(max=256)

  private String number;

  @JsonProperty("building")
  @Size(max=16)

  private String building;

  @JsonProperty("estate")
  @Size(max=16)

  private String estate;

  @JsonProperty("block")
  @Size(max=16)

  private String block;

  @JsonProperty("additional")
  
  private String additional;

  @JsonProperty("km")
  
  private Integer km;

  @JsonProperty("city")
  @Size(max=200)

  private String city;

  public OutletAddressDTO regionId(Long regionId) {
    this.regionId = regionId;
    return this;
  }

   /**
   * Идентификатор региона.  Идентификатор можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  {% note alert %}  При создании и редактировании точек продаж можно указывать только регионы типов `TOWN` (город), `CITY` (крупный город) и `REPUBLIC_AREA` (район субъекта федерации). Тип региона указан в выходных параметрах type запросов [GET regions](../../reference/regions/searchRegionsByName.md) и [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  {% endnote %} 
   * @return regionId
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

