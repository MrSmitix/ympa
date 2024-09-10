package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.LicenseCheckStatusType;
import com.prokarma.pkmst.model.LicenseType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Информация о лицензии.
 */
@ApiModel(description = "Информация о лицензии.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class FullOutletLicenseDTO   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("outletId")
  private Long outletId;

  @JsonProperty("licenseType")
  private LicenseType licenseType;

  @JsonProperty("number")
  private String number;

  @JsonProperty("dateOfIssue")
  private OffsetDateTime dateOfIssue;

  @JsonProperty("dateOfExpiry")
  private OffsetDateTime dateOfExpiry;

  @JsonProperty("checkStatus")
  private LicenseCheckStatusType checkStatus;

  @JsonProperty("checkComment")
  private String checkComment;

  public FullOutletLicenseDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор лицензии.  Параметр указывается, только если нужно изменить информацию о существующей лицензии. Ее идентификатор можно узнать с помощью запроса [GET campaigns/{campaignId}/outlets/licenses](../../reference/outlets/getOutletLicenses.md). При передаче информации о новой лицензии указывать идентификатор не нужно.  Идентификатор лицензии присваивается Маркетом. Не путайте его с номером, указанным на лицензии: он передается в параметре `number`. 
   * @return id
   */
  @ApiModelProperty(value = "Идентификатор лицензии.  Параметр указывается, только если нужно изменить информацию о существующей лицензии. Ее идентификатор можно узнать с помощью запроса [GET campaigns/{campaignId}/outlets/licenses](../../reference/outlets/getOutletLicenses.md). При передаче информации о новой лицензии указывать идентификатор не нужно.  Идентификатор лицензии присваивается Маркетом. Не путайте его с номером, указанным на лицензии: он передается в параметре `number`. ")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public FullOutletLicenseDTO outletId(Long outletId) {
    this.outletId = outletId;
    return this;
  }

  /**
   * Идентификатор точки продаж, для которой действительна лицензия.
   * @return outletId
   */
  @ApiModelProperty(value = "Идентификатор точки продаж, для которой действительна лицензия.")
  public Long getOutletId() {
    return outletId;
  }

  public void setOutletId(Long outletId) {
    this.outletId = outletId;
  }

  public FullOutletLicenseDTO licenseType(LicenseType licenseType) {
    this.licenseType = licenseType;
    return this;
  }

  /**
   * Get licenseType
   * @return licenseType
   */
  @ApiModelProperty(value = "")
  public LicenseType getLicenseType() {
    return licenseType;
  }

  public void setLicenseType(LicenseType licenseType) {
    this.licenseType = licenseType;
  }

  public FullOutletLicenseDTO number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Номер лицензии.
   * @return number
   */
  @ApiModelProperty(value = "Номер лицензии.")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public FullOutletLicenseDTO dateOfIssue(OffsetDateTime dateOfIssue) {
    this.dateOfIssue = dateOfIssue;
    return this;
  }

  /**
   * Дата выдачи лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если лицензия для точки продаж в Москве выдана 13 ноября 2017 года, то параметр должен иметь значение `2017-11-13T00:00:00+03:00`.  Обязательный параметр.  Не может быть позже даты окончания срока действия, указанной в параметре `dateOfExpiry`. 
   * @return dateOfIssue
   */
  @ApiModelProperty(value = "Дата выдачи лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если лицензия для точки продаж в Москве выдана 13 ноября 2017 года, то параметр должен иметь значение `2017-11-13T00:00:00+03:00`.  Обязательный параметр.  Не может быть позже даты окончания срока действия, указанной в параметре `dateOfExpiry`. ")
  public OffsetDateTime getDateOfIssue() {
    return dateOfIssue;
  }

  public void setDateOfIssue(OffsetDateTime dateOfIssue) {
    this.dateOfIssue = dateOfIssue;
  }

  public FullOutletLicenseDTO dateOfExpiry(OffsetDateTime dateOfExpiry) {
    this.dateOfExpiry = dateOfExpiry;
    return this;
  }

  /**
   * Дата окончания действия лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если действие лицензии для точки продаж в Москве заканчивается 20 ноября 2022 года, то параметр должен иметь значение `2022-11-20T00:00:00+03:00`.  Обязательный параметр.  Не может быть раньше даты выдачи, указанной в параметре `dateOfIssue`. 
   * @return dateOfExpiry
   */
  @ApiModelProperty(value = "Дата окончания действия лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если действие лицензии для точки продаж в Москве заканчивается 20 ноября 2022 года, то параметр должен иметь значение `2022-11-20T00:00:00+03:00`.  Обязательный параметр.  Не может быть раньше даты выдачи, указанной в параметре `dateOfIssue`. ")
  public OffsetDateTime getDateOfExpiry() {
    return dateOfExpiry;
  }

  public void setDateOfExpiry(OffsetDateTime dateOfExpiry) {
    this.dateOfExpiry = dateOfExpiry;
  }

  public FullOutletLicenseDTO checkStatus(LicenseCheckStatusType checkStatus) {
    this.checkStatus = checkStatus;
    return this;
  }

  /**
   * Get checkStatus
   * @return checkStatus
   */
  @ApiModelProperty(value = "")
  public LicenseCheckStatusType getCheckStatus() {
    return checkStatus;
  }

  public void setCheckStatus(LicenseCheckStatusType checkStatus) {
    this.checkStatus = checkStatus;
  }

  public FullOutletLicenseDTO checkComment(String checkComment) {
    this.checkComment = checkComment;
    return this;
  }

  /**
   * Причина, по которой лицензия не прошла проверку.  Параметр возвращается, только если параметр `checkStatus` имеет значение `FAIL`. 
   * @return checkComment
   */
  @ApiModelProperty(value = "Причина, по которой лицензия не прошла проверку.  Параметр возвращается, только если параметр `checkStatus` имеет значение `FAIL`. ")
  public String getCheckComment() {
    return checkComment;
  }

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

