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



/**
 * Информация о покупателе. 
 */

@ApiModel(description = "Информация о покупателе. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderBusinessBuyerDTO   {
  
  private String inn;
  private String kpp;
  private String organizationName;
  private String organizationJurAddress;

  /**
   * ИНН.
   */
  public OrderBusinessBuyerDTO inn(String inn) {
    this.inn = inn;
    return this;
  }

  
  @ApiModelProperty(value = "ИНН.")
  @JsonProperty("inn")
  public String getInn() {
    return inn;
  }
  public void setInn(String inn) {
    this.inn = inn;
  }

  /**
   * КПП.
   */
  public OrderBusinessBuyerDTO kpp(String kpp) {
    this.kpp = kpp;
    return this;
  }

  
  @ApiModelProperty(value = "КПП.")
  @JsonProperty("kpp")
  public String getKpp() {
    return kpp;
  }
  public void setKpp(String kpp) {
    this.kpp = kpp;
  }

  /**
   * Наименование юридического лица.
   */
  public OrderBusinessBuyerDTO organizationName(String organizationName) {
    this.organizationName = organizationName;
    return this;
  }

  
  @ApiModelProperty(value = "Наименование юридического лица.")
  @JsonProperty("organizationName")
  public String getOrganizationName() {
    return organizationName;
  }
  public void setOrganizationName(String organizationName) {
    this.organizationName = organizationName;
  }

  /**
   * Юридический адрес.
   */
  public OrderBusinessBuyerDTO organizationJurAddress(String organizationJurAddress) {
    this.organizationJurAddress = organizationJurAddress;
    return this;
  }

  
  @ApiModelProperty(value = "Юридический адрес.")
  @JsonProperty("organizationJurAddress")
  public String getOrganizationJurAddress() {
    return organizationJurAddress;
  }
  public void setOrganizationJurAddress(String organizationJurAddress) {
    this.organizationJurAddress = organizationJurAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderBusinessBuyerDTO orderBusinessBuyerDTO = (OrderBusinessBuyerDTO) o;
    return Objects.equals(inn, orderBusinessBuyerDTO.inn) &&
        Objects.equals(kpp, orderBusinessBuyerDTO.kpp) &&
        Objects.equals(organizationName, orderBusinessBuyerDTO.organizationName) &&
        Objects.equals(organizationJurAddress, orderBusinessBuyerDTO.organizationJurAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inn, kpp, organizationName, organizationJurAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderBusinessBuyerDTO {\n");
    
    sb.append("    inn: ").append(toIndentedString(inn)).append("\n");
    sb.append("    kpp: ").append(toIndentedString(kpp)).append("\n");
    sb.append("    organizationName: ").append(toIndentedString(organizationName)).append("\n");
    sb.append("    organizationJurAddress: ").append(toIndentedString(organizationJurAddress)).append("\n");
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

