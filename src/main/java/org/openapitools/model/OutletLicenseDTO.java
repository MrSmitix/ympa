package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Date;
import org.openapitools.model.LicenseType;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация о лицензии.
 */

@Schema(name = "OutletLicenseDTO", description = "Информация о лицензии.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OutletLicenseDTO {

  private Long id;

  private Long outletId;

  private LicenseType licenseType;

  private String number;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date dateOfIssue;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date dateOfExpiry;

  public OutletLicenseDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор лицензии.  Параметр указывается, только если нужно изменить информацию о существующей лицензии. Ее идентификатор можно узнать с помощью запроса [GET campaigns/{campaignId}/outlets/licenses](../../reference/outlets/getOutletLicenses.md). При передаче информации о новой лицензии указывать идентификатор не нужно.  Идентификатор лицензии присваивается Маркетом. Не путайте его с номером, указанным на лицензии: он передается в параметре `number`. 
   * @return id
   */
  
  @Schema(name = "id", description = "Идентификатор лицензии.  Параметр указывается, только если нужно изменить информацию о существующей лицензии. Ее идентификатор можно узнать с помощью запроса [GET campaigns/{campaignId}/outlets/licenses](../../reference/outlets/getOutletLicenses.md). При передаче информации о новой лицензии указывать идентификатор не нужно.  Идентификатор лицензии присваивается Маркетом. Не путайте его с номером, указанным на лицензии: он передается в параметре `number`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public OutletLicenseDTO outletId(Long outletId) {
    this.outletId = outletId;
    return this;
  }

  /**
   * Идентификатор точки продаж, для которой действительна лицензия.
   * @return outletId
   */
  
  @Schema(name = "outletId", description = "Идентификатор точки продаж, для которой действительна лицензия.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("outletId")
  public Long getOutletId() {
    return outletId;
  }

  public void setOutletId(Long outletId) {
    this.outletId = outletId;
  }

  public OutletLicenseDTO licenseType(LicenseType licenseType) {
    this.licenseType = licenseType;
    return this;
  }

  /**
   * Get licenseType
   * @return licenseType
   */
  @Valid 
  @Schema(name = "licenseType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("licenseType")
  public LicenseType getLicenseType() {
    return licenseType;
  }

  public void setLicenseType(LicenseType licenseType) {
    this.licenseType = licenseType;
  }

  public OutletLicenseDTO number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Номер лицензии.
   * @return number
   */
  
  @Schema(name = "number", description = "Номер лицензии.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("number")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public OutletLicenseDTO dateOfIssue(Date dateOfIssue) {
    this.dateOfIssue = dateOfIssue;
    return this;
  }

  /**
   * Дата выдачи лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если лицензия для точки продаж в Москве выдана 13 ноября 2017 года, то параметр должен иметь значение `2017-11-13T00:00:00+03:00`.  Обязательный параметр.  Не может быть позже даты окончания срока действия, указанной в параметре `dateOfExpiry`. 
   * @return dateOfIssue
   */
  @Valid 
  @Schema(name = "dateOfIssue", description = "Дата выдачи лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если лицензия для точки продаж в Москве выдана 13 ноября 2017 года, то параметр должен иметь значение `2017-11-13T00:00:00+03:00`.  Обязательный параметр.  Не может быть позже даты окончания срока действия, указанной в параметре `dateOfExpiry`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dateOfIssue")
  public Date getDateOfIssue() {
    return dateOfIssue;
  }

  public void setDateOfIssue(Date dateOfIssue) {
    this.dateOfIssue = dateOfIssue;
  }

  public OutletLicenseDTO dateOfExpiry(Date dateOfExpiry) {
    this.dateOfExpiry = dateOfExpiry;
    return this;
  }

  /**
   * Дата окончания действия лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если действие лицензии для точки продаж в Москве заканчивается 20 ноября 2022 года, то параметр должен иметь значение `2022-11-20T00:00:00+03:00`.  Обязательный параметр.  Не может быть раньше даты выдачи, указанной в параметре `dateOfIssue`. 
   * @return dateOfExpiry
   */
  @Valid 
  @Schema(name = "dateOfExpiry", description = "Дата окончания действия лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если действие лицензии для точки продаж в Москве заканчивается 20 ноября 2022 года, то параметр должен иметь значение `2022-11-20T00:00:00+03:00`.  Обязательный параметр.  Не может быть раньше даты выдачи, указанной в параметре `dateOfIssue`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dateOfExpiry")
  public Date getDateOfExpiry() {
    return dateOfExpiry;
  }

  public void setDateOfExpiry(Date dateOfExpiry) {
    this.dateOfExpiry = dateOfExpiry;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutletLicenseDTO outletLicenseDTO = (OutletLicenseDTO) o;
    return Objects.equals(this.id, outletLicenseDTO.id) &&
        Objects.equals(this.outletId, outletLicenseDTO.outletId) &&
        Objects.equals(this.licenseType, outletLicenseDTO.licenseType) &&
        Objects.equals(this.number, outletLicenseDTO.number) &&
        Objects.equals(this.dateOfIssue, outletLicenseDTO.dateOfIssue) &&
        Objects.equals(this.dateOfExpiry, outletLicenseDTO.dateOfExpiry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, outletId, licenseType, number, dateOfIssue, dateOfExpiry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutletLicenseDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    outletId: ").append(toIndentedString(outletId)).append("\n");
    sb.append("    licenseType: ").append(toIndentedString(licenseType)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    dateOfIssue: ").append(toIndentedString(dateOfIssue)).append("\n");
    sb.append("    dateOfExpiry: ").append(toIndentedString(dateOfExpiry)).append("\n");
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

