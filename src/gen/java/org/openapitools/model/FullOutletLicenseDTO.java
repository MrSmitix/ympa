package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.model.LicenseCheckStatusType;
import org.openapitools.model.LicenseType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Информация о лицензии.
 **/
@ApiModel(description = "Информация о лицензии.")
@JsonTypeName("FullOutletLicenseDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class FullOutletLicenseDTO   {
  private Long id;
  private Long outletId;
  private LicenseType licenseType;
  private String number;
  private Date dateOfIssue;
  private Date dateOfExpiry;
  private LicenseCheckStatusType checkStatus;
  private String checkComment;

  /**
   * Идентификатор лицензии.  Параметр указывается, только если нужно изменить информацию о существующей лицензии. Ее идентификатор можно узнать с помощью запроса [GET campaigns/{campaignId}/outlets/licenses](../../reference/outlets/getOutletLicenses.md). При передаче информации о новой лицензии указывать идентификатор не нужно.  Идентификатор лицензии присваивается Маркетом. Не путайте его с номером, указанным на лицензии: он передается в параметре &#x60;number&#x60;. 
   **/
  public FullOutletLicenseDTO id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор лицензии.  Параметр указывается, только если нужно изменить информацию о существующей лицензии. Ее идентификатор можно узнать с помощью запроса [GET campaigns/{campaignId}/outlets/licenses](../../reference/outlets/getOutletLicenses.md). При передаче информации о новой лицензии указывать идентификатор не нужно.  Идентификатор лицензии присваивается Маркетом. Не путайте его с номером, указанным на лицензии: он передается в параметре `number`. ")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Идентификатор точки продаж, для которой действительна лицензия.
   **/
  public FullOutletLicenseDTO outletId(Long outletId) {
    this.outletId = outletId;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор точки продаж, для которой действительна лицензия.")
  @JsonProperty("outletId")
  public Long getOutletId() {
    return outletId;
  }

  @JsonProperty("outletId")
  public void setOutletId(Long outletId) {
    this.outletId = outletId;
  }

  /**
   **/
  public FullOutletLicenseDTO licenseType(LicenseType licenseType) {
    this.licenseType = licenseType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("licenseType")
  public LicenseType getLicenseType() {
    return licenseType;
  }

  @JsonProperty("licenseType")
  public void setLicenseType(LicenseType licenseType) {
    this.licenseType = licenseType;
  }

  /**
   * Номер лицензии.
   **/
  public FullOutletLicenseDTO number(String number) {
    this.number = number;
    return this;
  }

  
  @ApiModelProperty(value = "Номер лицензии.")
  @JsonProperty("number")
  public String getNumber() {
    return number;
  }

  @JsonProperty("number")
  public void setNumber(String number) {
    this.number = number;
  }

  /**
   * Дата выдачи лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время &#x60;00:00:00&#x60; и часовой пояс, соответствующий региону точки продаж. Например, если лицензия для точки продаж в Москве выдана 13 ноября 2017 года, то параметр должен иметь значение &#x60;2017-11-13T00:00:00+03:00&#x60;.  Обязательный параметр.  Не может быть позже даты окончания срока действия, указанной в параметре &#x60;dateOfExpiry&#x60;. 
   **/
  public FullOutletLicenseDTO dateOfIssue(Date dateOfIssue) {
    this.dateOfIssue = dateOfIssue;
    return this;
  }

  
  @ApiModelProperty(value = "Дата выдачи лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если лицензия для точки продаж в Москве выдана 13 ноября 2017 года, то параметр должен иметь значение `2017-11-13T00:00:00+03:00`.  Обязательный параметр.  Не может быть позже даты окончания срока действия, указанной в параметре `dateOfExpiry`. ")
  @JsonProperty("dateOfIssue")
  public Date getDateOfIssue() {
    return dateOfIssue;
  }

  @JsonProperty("dateOfIssue")
  public void setDateOfIssue(Date dateOfIssue) {
    this.dateOfIssue = dateOfIssue;
  }

  /**
   * Дата окончания действия лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время &#x60;00:00:00&#x60; и часовой пояс, соответствующий региону точки продаж. Например, если действие лицензии для точки продаж в Москве заканчивается 20 ноября 2022 года, то параметр должен иметь значение &#x60;2022-11-20T00:00:00+03:00&#x60;.  Обязательный параметр.  Не может быть раньше даты выдачи, указанной в параметре &#x60;dateOfIssue&#x60;. 
   **/
  public FullOutletLicenseDTO dateOfExpiry(Date dateOfExpiry) {
    this.dateOfExpiry = dateOfExpiry;
    return this;
  }

  
  @ApiModelProperty(value = "Дата окончания действия лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если действие лицензии для точки продаж в Москве заканчивается 20 ноября 2022 года, то параметр должен иметь значение `2022-11-20T00:00:00+03:00`.  Обязательный параметр.  Не может быть раньше даты выдачи, указанной в параметре `dateOfIssue`. ")
  @JsonProperty("dateOfExpiry")
  public Date getDateOfExpiry() {
    return dateOfExpiry;
  }

  @JsonProperty("dateOfExpiry")
  public void setDateOfExpiry(Date dateOfExpiry) {
    this.dateOfExpiry = dateOfExpiry;
  }

  /**
   **/
  public FullOutletLicenseDTO checkStatus(LicenseCheckStatusType checkStatus) {
    this.checkStatus = checkStatus;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("checkStatus")
  public LicenseCheckStatusType getCheckStatus() {
    return checkStatus;
  }

  @JsonProperty("checkStatus")
  public void setCheckStatus(LicenseCheckStatusType checkStatus) {
    this.checkStatus = checkStatus;
  }

  /**
   * Причина, по которой лицензия не прошла проверку.  Параметр возвращается, только если параметр &#x60;checkStatus&#x60; имеет значение &#x60;FAIL&#x60;. 
   **/
  public FullOutletLicenseDTO checkComment(String checkComment) {
    this.checkComment = checkComment;
    return this;
  }

  
  @ApiModelProperty(value = "Причина, по которой лицензия не прошла проверку.  Параметр возвращается, только если параметр `checkStatus` имеет значение `FAIL`. ")
  @JsonProperty("checkComment")
  public String getCheckComment() {
    return checkComment;
  }

  @JsonProperty("checkComment")
  public void setCheckComment(String checkComment) {
    this.checkComment = checkComment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FullOutletLicenseDTO fullOutletLicenseDTO = (FullOutletLicenseDTO) o;
    return Objects.equals(this.id, fullOutletLicenseDTO.id) &&
        Objects.equals(this.outletId, fullOutletLicenseDTO.outletId) &&
        Objects.equals(this.licenseType, fullOutletLicenseDTO.licenseType) &&
        Objects.equals(this.number, fullOutletLicenseDTO.number) &&
        Objects.equals(this.dateOfIssue, fullOutletLicenseDTO.dateOfIssue) &&
        Objects.equals(this.dateOfExpiry, fullOutletLicenseDTO.dateOfExpiry) &&
        Objects.equals(this.checkStatus, fullOutletLicenseDTO.checkStatus) &&
        Objects.equals(this.checkComment, fullOutletLicenseDTO.checkComment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, outletId, licenseType, number, dateOfIssue, dateOfExpiry, checkStatus, checkComment);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

