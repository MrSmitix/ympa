package org.openapitools.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация о покупателе. 
 **/
@ApiModel(description="Информация о покупателе. ")

public class OrderBusinessBuyerDTO  {
  
  @ApiModelProperty(value = "ИНН.")
 /**
   * ИНН.
  **/
  private String inn;

  @ApiModelProperty(value = "КПП.")
 /**
   * КПП.
  **/
  private String kpp;

  @ApiModelProperty(value = "Наименование юридического лица.")
 /**
   * Наименование юридического лица.
  **/
  private String organizationName;

  @ApiModelProperty(value = "Юридический адрес.")
 /**
   * Юридический адрес.
  **/
  private String organizationJurAddress;
 /**
   * ИНН.
   * @return inn
  **/
  @JsonProperty("inn")
  public String getInn() {
    return inn;
  }

  public void setInn(String inn) {
    this.inn = inn;
  }

  public OrderBusinessBuyerDTO inn(String inn) {
    this.inn = inn;
    return this;
  }

 /**
   * КПП.
   * @return kpp
  **/
  @JsonProperty("kpp")
  public String getKpp() {
    return kpp;
  }

  public void setKpp(String kpp) {
    this.kpp = kpp;
  }

  public OrderBusinessBuyerDTO kpp(String kpp) {
    this.kpp = kpp;
    return this;
  }

 /**
   * Наименование юридического лица.
   * @return organizationName
  **/
  @JsonProperty("organizationName")
  public String getOrganizationName() {
    return organizationName;
  }

  public void setOrganizationName(String organizationName) {
    this.organizationName = organizationName;
  }

  public OrderBusinessBuyerDTO organizationName(String organizationName) {
    this.organizationName = organizationName;
    return this;
  }

 /**
   * Юридический адрес.
   * @return organizationJurAddress
  **/
  @JsonProperty("organizationJurAddress")
  public String getOrganizationJurAddress() {
    return organizationJurAddress;
  }

  public void setOrganizationJurAddress(String organizationJurAddress) {
    this.organizationJurAddress = organizationJurAddress;
  }

  public OrderBusinessBuyerDTO organizationJurAddress(String organizationJurAddress) {
    this.organizationJurAddress = organizationJurAddress;
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
    OrderBusinessBuyerDTO orderBusinessBuyerDTO = (OrderBusinessBuyerDTO) o;
    return Objects.equals(this.inn, orderBusinessBuyerDTO.inn) &&
        Objects.equals(this.kpp, orderBusinessBuyerDTO.kpp) &&
        Objects.equals(this.organizationName, orderBusinessBuyerDTO.organizationName) &&
        Objects.equals(this.organizationJurAddress, orderBusinessBuyerDTO.organizationJurAddress);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

