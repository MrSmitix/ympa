package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.model.LicenseType;



/**
 * Информация о лицензии.
 **/

@ApiModel(description = "Информация о лицензии.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OutletLicenseDTO   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("outletId")
  private Long outletId;

  @JsonProperty("licenseType")
  private LicenseType licenseType;

  @JsonProperty("number")
  private String number;

  @JsonProperty("dateOfIssue")
  private Date dateOfIssue;

  @JsonProperty("dateOfExpiry")
  private Date dateOfExpiry;

  /**
   * Идентификатор лицензии.  Параметр указывается, только если нужно изменить информацию о существующей лицензии. Ее идентификатор можно узнать с помощью запроса [GET campaigns/{campaignId}/outlets/licenses](../../reference/outlets/getOutletLicenses.md). При передаче информации о новой лицензии указывать идентификатор не нужно.  Идентификатор лицензии присваивается Маркетом. Не путайте его с номером, указанным на лицензии: он передается в параметре `number`. 
   **/
  public OutletLicenseDTO id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор лицензии.  Параметр указывается, только если нужно изменить информацию о существующей лицензии. Ее идентификатор можно узнать с помощью запроса [GET campaigns/{campaignId}/outlets/licenses](../../reference/outlets/getOutletLicenses.md). При передаче информации о новой лицензии указывать идентификатор не нужно.  Идентификатор лицензии присваивается Маркетом. Не путайте его с номером, указанным на лицензии: он передается в параметре `number`. ")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Идентификатор точки продаж, для которой действительна лицензия.
   **/
  public OutletLicenseDTO outletId(Long outletId) {
    this.outletId = outletId;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор точки продаж, для которой действительна лицензия.")
  @JsonProperty("outletId")
  public Long getOutletId() {
    return outletId;
  }
  public void setOutletId(Long outletId) {
    this.outletId = outletId;
  }

  /**
   **/
  public OutletLicenseDTO licenseType(LicenseType licenseType) {
    this.licenseType = licenseType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("licenseType")
  public LicenseType getLicenseType() {
    return licenseType;
  }
  public void setLicenseType(LicenseType licenseType) {
    this.licenseType = licenseType;
  }

  /**
   * Номер лицензии.
   **/
  public OutletLicenseDTO number(String number) {
    this.number = number;
    return this;
  }

  
  @ApiModelProperty(value = "Номер лицензии.")
  @JsonProperty("number")
  public String getNumber() {
    return number;
  }
  public void setNumber(String number) {
    this.number = number;
  }

  /**
   * Дата выдачи лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если лицензия для точки продаж в Москве выдана 13 ноября 2017 года, то параметр должен иметь значение `2017-11-13T00:00:00+03:00`.  Обязательный параметр.  Не может быть позже даты окончания срока действия, указанной в параметре `dateOfExpiry`. 
   **/
  public OutletLicenseDTO dateOfIssue(Date dateOfIssue) {
    this.dateOfIssue = dateOfIssue;
    return this;
  }

  
  @ApiModelProperty(value = "Дата выдачи лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если лицензия для точки продаж в Москве выдана 13 ноября 2017 года, то параметр должен иметь значение `2017-11-13T00:00:00+03:00`.  Обязательный параметр.  Не может быть позже даты окончания срока действия, указанной в параметре `dateOfExpiry`. ")
  @JsonProperty("dateOfIssue")
  public Date getDateOfIssue() {
    return dateOfIssue;
  }
  public void setDateOfIssue(Date dateOfIssue) {
    this.dateOfIssue = dateOfIssue;
  }

  /**
   * Дата окончания действия лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если действие лицензии для точки продаж в Москве заканчивается 20 ноября 2022 года, то параметр должен иметь значение `2022-11-20T00:00:00+03:00`.  Обязательный параметр.  Не может быть раньше даты выдачи, указанной в параметре `dateOfIssue`. 
   **/
  public OutletLicenseDTO dateOfExpiry(Date dateOfExpiry) {
    this.dateOfExpiry = dateOfExpiry;
    return this;
  }

  
  @ApiModelProperty(value = "Дата окончания действия лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если действие лицензии для точки продаж в Москве заканчивается 20 ноября 2022 года, то параметр должен иметь значение `2022-11-20T00:00:00+03:00`.  Обязательный параметр.  Не может быть раньше даты выдачи, указанной в параметре `dateOfIssue`. ")
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
    return Objects.equals(id, outletLicenseDTO.id) &&
        Objects.equals(outletId, outletLicenseDTO.outletId) &&
        Objects.equals(licenseType, outletLicenseDTO.licenseType) &&
        Objects.equals(number, outletLicenseDTO.number) &&
        Objects.equals(dateOfIssue, outletLicenseDTO.dateOfIssue) &&
        Objects.equals(dateOfExpiry, outletLicenseDTO.dateOfExpiry);
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

