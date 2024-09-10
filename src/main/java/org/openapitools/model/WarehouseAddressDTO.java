/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI document version: LATEST
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.GpsDTO;



/**
 * Адрес склада.
 */

@ApiModel(description = "Адрес склада.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class WarehouseAddressDTO   {
  
  private String city;
  private String street;
  private String number;
  private String building;
  private String block;
  private GpsDTO gps;

  /**
   * Город.
   */
  public WarehouseAddressDTO city(String city) {
    this.city = city;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Город.")
  @JsonProperty("city")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  /**
   * Улица.
   */
  public WarehouseAddressDTO street(String street) {
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
   */
  public WarehouseAddressDTO number(String number) {
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
   */
  public WarehouseAddressDTO building(String building) {
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
   * Номер корпуса.
   */
  public WarehouseAddressDTO block(String block) {
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
   */
  public WarehouseAddressDTO gps(GpsDTO gps) {
    this.gps = gps;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("gps")
  public GpsDTO getGps() {
    return gps;
  }
  public void setGps(GpsDTO gps) {
    this.gps = gps;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WarehouseAddressDTO warehouseAddressDTO = (WarehouseAddressDTO) o;
    return Objects.equals(city, warehouseAddressDTO.city) &&
        Objects.equals(street, warehouseAddressDTO.street) &&
        Objects.equals(number, warehouseAddressDTO.number) &&
        Objects.equals(building, warehouseAddressDTO.building) &&
        Objects.equals(block, warehouseAddressDTO.block) &&
        Objects.equals(gps, warehouseAddressDTO.gps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, street, number, building, block, gps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WarehouseAddressDTO {\n");
    
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    building: ").append(toIndentedString(building)).append("\n");
    sb.append("    block: ").append(toIndentedString(block)).append("\n");
    sb.append("    gps: ").append(toIndentedString(gps)).append("\n");
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

