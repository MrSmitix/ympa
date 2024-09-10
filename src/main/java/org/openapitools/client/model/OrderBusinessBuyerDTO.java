/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;



/**
  * Информация о покупателе. 
 **/

public class OrderBusinessBuyerDTO  {
  
 /**
   * ИНН.
  **/
  private String inn;

 /**
   * КПП.
  **/
  private String kpp;

 /**
   * Наименование юридического лица.
  **/
  private String organizationName;

 /**
   * Юридический адрес.
  **/
  private String organizationJurAddress;

 /**
   * ИНН.
   * @return inn
  **/
  public String getInn() {
    return inn;
  }

  /**
    * Set inn
  **/
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
  public String getKpp() {
    return kpp;
  }

  /**
    * Set kpp
  **/
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
  public String getOrganizationName() {
    return organizationName;
  }

  /**
    * Set organizationName
  **/
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
  public String getOrganizationJurAddress() {
    return organizationJurAddress;
  }

  /**
    * Set organizationJurAddress
  **/
  public void setOrganizationJurAddress(String organizationJurAddress) {
    this.organizationJurAddress = organizationJurAddress;
  }

  public OrderBusinessBuyerDTO organizationJurAddress(String organizationJurAddress) {
    this.organizationJurAddress = organizationJurAddress;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
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
