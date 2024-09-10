package apimodels;

import apimodels.LicenseType;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация о лицензии.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OutletLicenseDTO   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("outletId")
  
  private Long outletId;

  @JsonProperty("licenseType")
  @Valid

  private LicenseType licenseType;

  @JsonProperty("number")
  
  private String number;

  @JsonProperty("dateOfIssue")
  @Valid

  private OffsetDateTime dateOfIssue;

  @JsonProperty("dateOfExpiry")
  @Valid

  private OffsetDateTime dateOfExpiry;

  public OutletLicenseDTO id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Идентификатор лицензии.  Параметр указывается, только если нужно изменить информацию о существующей лицензии. Ее идентификатор можно узнать с помощью запроса [GET campaigns/{campaignId}/outlets/licenses](../../reference/outlets/getOutletLicenses.md). При передаче информации о новой лицензии указывать идентификатор не нужно.  Идентификатор лицензии присваивается Маркетом. Не путайте его с номером, указанным на лицензии: он передается в параметре `number`. 
   * @return id
  **/
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
  **/
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
  **/
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
  **/
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public OutletLicenseDTO dateOfIssue(OffsetDateTime dateOfIssue) {
    this.dateOfIssue = dateOfIssue;
    return this;
  }

   /**
   * Дата выдачи лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если лицензия для точки продаж в Москве выдана 13 ноября 2017 года, то параметр должен иметь значение `2017-11-13T00:00:00+03:00`.  Обязательный параметр.  Не может быть позже даты окончания срока действия, указанной в параметре `dateOfExpiry`. 
   * @return dateOfIssue
  **/
  public OffsetDateTime getDateOfIssue() {
    return dateOfIssue;
  }

  public void setDateOfIssue(OffsetDateTime dateOfIssue) {
    this.dateOfIssue = dateOfIssue;
  }

  public OutletLicenseDTO dateOfExpiry(OffsetDateTime dateOfExpiry) {
    this.dateOfExpiry = dateOfExpiry;
    return this;
  }

   /**
   * Дата окончания действия лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если действие лицензии для точки продаж в Москве заканчивается 20 ноября 2022 года, то параметр должен иметь значение `2022-11-20T00:00:00+03:00`.  Обязательный параметр.  Не может быть раньше даты выдачи, указанной в параметре `dateOfIssue`. 
   * @return dateOfExpiry
  **/
  public OffsetDateTime getDateOfExpiry() {
    return dateOfExpiry;
  }

  public void setDateOfExpiry(OffsetDateTime dateOfExpiry) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

