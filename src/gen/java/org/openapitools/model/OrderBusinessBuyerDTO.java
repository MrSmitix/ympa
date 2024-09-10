package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация о покупателе. 
 */
@ApiModel(description="Информация о покупателе. ")

public class OrderBusinessBuyerDTO  {
  
 /**
  * ИНН.
  */
  @ApiModelProperty(value = "ИНН.")
  private String inn;

 /**
  * КПП.
  */
  @ApiModelProperty(value = "КПП.")
  private String kpp;

 /**
  * Наименование юридического лица.
  */
  @ApiModelProperty(value = "Наименование юридического лица.")
  private String organizationName;

 /**
  * Юридический адрес.
  */
  @ApiModelProperty(value = "Юридический адрес.")
  private String organizationJurAddress;
 /**
  * ИНН.
  * @return inn
  */
  @JsonProperty("inn")
  public String getInn() {
    return inn;
  }

  /**
   * Sets the <code>inn</code> property.
   */
 public void setInn(String inn) {
    this.inn = inn;
  }

  /**
   * Sets the <code>inn</code> property.
   */
  public OrderBusinessBuyerDTO inn(String inn) {
    this.inn = inn;
    return this;
  }

 /**
  * КПП.
  * @return kpp
  */
  @JsonProperty("kpp")
  public String getKpp() {
    return kpp;
  }

  /**
   * Sets the <code>kpp</code> property.
   */
 public void setKpp(String kpp) {
    this.kpp = kpp;
  }

  /**
   * Sets the <code>kpp</code> property.
   */
  public OrderBusinessBuyerDTO kpp(String kpp) {
    this.kpp = kpp;
    return this;
  }

 /**
  * Наименование юридического лица.
  * @return organizationName
  */
  @JsonProperty("organizationName")
  public String getOrganizationName() {
    return organizationName;
  }

  /**
   * Sets the <code>organizationName</code> property.
   */
 public void setOrganizationName(String organizationName) {
    this.organizationName = organizationName;
  }

  /**
   * Sets the <code>organizationName</code> property.
   */
  public OrderBusinessBuyerDTO organizationName(String organizationName) {
    this.organizationName = organizationName;
    return this;
  }

 /**
  * Юридический адрес.
  * @return organizationJurAddress
  */
  @JsonProperty("organizationJurAddress")
  public String getOrganizationJurAddress() {
    return organizationJurAddress;
  }

  /**
   * Sets the <code>organizationJurAddress</code> property.
   */
 public void setOrganizationJurAddress(String organizationJurAddress) {
    this.organizationJurAddress = organizationJurAddress;
  }

  /**
   * Sets the <code>organizationJurAddress</code> property.
   */
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

