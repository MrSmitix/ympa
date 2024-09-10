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
import java.time.OffsetDateTime;
import org.openapitools.client.model.LicenseCheckStatusType;
import org.openapitools.client.model.LicenseType;



/**
  * Информация о лицензии.
 **/

public class FullOutletLicenseDTO  {
  
 /**
   * Идентификатор лицензии.  Параметр указывается, только если нужно изменить информацию о существующей лицензии. Ее идентификатор можно узнать с помощью запроса [GET campaigns/{campaignId}/outlets/licenses](../../reference/outlets/getOutletLicenses.md). При передаче информации о новой лицензии указывать идентификатор не нужно.  Идентификатор лицензии присваивается Маркетом. Не путайте его с номером, указанным на лицензии: он передается в параметре `number`. 
  **/
  private Long id;

 /**
   * Идентификатор точки продаж, для которой действительна лицензия.
  **/
  private Long outletId;

  private LicenseType licenseType;

 /**
   * Номер лицензии.
  **/
  private String number;

 /**
   * Дата выдачи лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если лицензия для точки продаж в Москве выдана 13 ноября 2017 года, то параметр должен иметь значение `2017-11-13T00:00:00+03:00`.  Обязательный параметр.  Не может быть позже даты окончания срока действия, указанной в параметре `dateOfExpiry`. 
  **/
  private OffsetDateTime dateOfIssue;

 /**
   * Дата окончания действия лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если действие лицензии для точки продаж в Москве заканчивается 20 ноября 2022 года, то параметр должен иметь значение `2022-11-20T00:00:00+03:00`.  Обязательный параметр.  Не может быть раньше даты выдачи, указанной в параметре `dateOfIssue`. 
  **/
  private OffsetDateTime dateOfExpiry;

  private LicenseCheckStatusType checkStatus;

 /**
   * Причина, по которой лицензия не прошла проверку.  Параметр возвращается, только если параметр `checkStatus` имеет значение `FAIL`. 
  **/
  private String checkComment;

 /**
   * Идентификатор лицензии.  Параметр указывается, только если нужно изменить информацию о существующей лицензии. Ее идентификатор можно узнать с помощью запроса [GET campaigns/{campaignId}/outlets/licenses](../../reference/outlets/getOutletLicenses.md). При передаче информации о новой лицензии указывать идентификатор не нужно.  Идентификатор лицензии присваивается Маркетом. Не путайте его с номером, указанным на лицензии: он передается в параметре &#x60;number&#x60;. 
   * @return id
  **/
  public Long getId() {
    return id;
  }

  /**
    * Set id
  **/
  public void setId(Long id) {
    this.id = id;
  }

  public FullOutletLicenseDTO id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Идентификатор точки продаж, для которой действительна лицензия.
   * @return outletId
  **/
  public Long getOutletId() {
    return outletId;
  }

  /**
    * Set outletId
  **/
  public void setOutletId(Long outletId) {
    this.outletId = outletId;
  }

  public FullOutletLicenseDTO outletId(Long outletId) {
    this.outletId = outletId;
    return this;
  }

 /**
   * Get licenseType
   * @return licenseType
  **/
  public LicenseType getLicenseType() {
    return licenseType;
  }

  /**
    * Set licenseType
  **/
  public void setLicenseType(LicenseType licenseType) {
    this.licenseType = licenseType;
  }

  public FullOutletLicenseDTO licenseType(LicenseType licenseType) {
    this.licenseType = licenseType;
    return this;
  }

 /**
   * Номер лицензии.
   * @return number
  **/
  public String getNumber() {
    return number;
  }

  /**
    * Set number
  **/
  public void setNumber(String number) {
    this.number = number;
  }

  public FullOutletLicenseDTO number(String number) {
    this.number = number;
    return this;
  }

 /**
   * Дата выдачи лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время &#x60;00:00:00&#x60; и часовой пояс, соответствующий региону точки продаж. Например, если лицензия для точки продаж в Москве выдана 13 ноября 2017 года, то параметр должен иметь значение &#x60;2017-11-13T00:00:00+03:00&#x60;.  Обязательный параметр.  Не может быть позже даты окончания срока действия, указанной в параметре &#x60;dateOfExpiry&#x60;. 
   * @return dateOfIssue
  **/
  public OffsetDateTime getDateOfIssue() {
    return dateOfIssue;
  }

  /**
    * Set dateOfIssue
  **/
  public void setDateOfIssue(OffsetDateTime dateOfIssue) {
    this.dateOfIssue = dateOfIssue;
  }

  public FullOutletLicenseDTO dateOfIssue(OffsetDateTime dateOfIssue) {
    this.dateOfIssue = dateOfIssue;
    return this;
  }

 /**
   * Дата окончания действия лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время &#x60;00:00:00&#x60; и часовой пояс, соответствующий региону точки продаж. Например, если действие лицензии для точки продаж в Москве заканчивается 20 ноября 2022 года, то параметр должен иметь значение &#x60;2022-11-20T00:00:00+03:00&#x60;.  Обязательный параметр.  Не может быть раньше даты выдачи, указанной в параметре &#x60;dateOfIssue&#x60;. 
   * @return dateOfExpiry
  **/
  public OffsetDateTime getDateOfExpiry() {
    return dateOfExpiry;
  }

  /**
    * Set dateOfExpiry
  **/
  public void setDateOfExpiry(OffsetDateTime dateOfExpiry) {
    this.dateOfExpiry = dateOfExpiry;
  }

  public FullOutletLicenseDTO dateOfExpiry(OffsetDateTime dateOfExpiry) {
    this.dateOfExpiry = dateOfExpiry;
    return this;
  }

 /**
   * Get checkStatus
   * @return checkStatus
  **/
  public LicenseCheckStatusType getCheckStatus() {
    return checkStatus;
  }

  /**
    * Set checkStatus
  **/
  public void setCheckStatus(LicenseCheckStatusType checkStatus) {
    this.checkStatus = checkStatus;
  }

  public FullOutletLicenseDTO checkStatus(LicenseCheckStatusType checkStatus) {
    this.checkStatus = checkStatus;
    return this;
  }

 /**
   * Причина, по которой лицензия не прошла проверку.  Параметр возвращается, только если параметр &#x60;checkStatus&#x60; имеет значение &#x60;FAIL&#x60;. 
   * @return checkComment
  **/
  public String getCheckComment() {
    return checkComment;
  }

  /**
    * Set checkComment
  **/
  public void setCheckComment(String checkComment) {
    this.checkComment = checkComment;
  }

  public FullOutletLicenseDTO checkComment(String checkComment) {
    this.checkComment = checkComment;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FullOutletLicenseDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    outletId: ").append(toIndentedString(outletId)).append("\n");
    sb.append("    licenseType: ").append(toIndentedString(licenseType)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    dateOfIssue: ").append(toIndentedString(dateOfIssue)).append("\n");
    sb.append("    dateOfExpiry: ").append(toIndentedString(dateOfExpiry)).append("\n");
    sb.append("    checkStatus: ").append(toIndentedString(checkStatus)).append("\n");
    sb.append("    checkComment: ").append(toIndentedString(checkComment)).append("\n");
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

