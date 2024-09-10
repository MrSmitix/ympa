package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.PlacementType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. 
 */
@ApiModel(description = "Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. ")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GenerateUnitedNettingReportRequest   {
  @JsonProperty("businessId")
  private Long businessId;

  @JsonProperty("dateTimeFrom")
  private OffsetDateTime dateTimeFrom;

  @JsonProperty("dateTimeTo")
  private OffsetDateTime dateTimeTo;

  @JsonProperty("dateFrom")
  private LocalDate dateFrom;

  @JsonProperty("dateTo")
  private LocalDate dateTo;

  @JsonProperty("bankOrderId")
  private Long bankOrderId;

  @JsonProperty("bankOrderDateTime")
  private OffsetDateTime bankOrderDateTime;

  @JsonProperty("placementPrograms")
  
  private List<PlacementType> placementPrograms = null;

  @JsonProperty("inns")
  
  private List<String> inns = null;

  @JsonProperty("campaignIds")
  
  private List<Long> campaignIds = null;

  public GenerateUnitedNettingReportRequest businessId(Long businessId) {
    this.businessId = businessId;
    return this;
  }

  /**
   * Идентификатор бизнеса.
   * @return businessId
   */
  @ApiModelProperty(required = true, value = "Идентификатор бизнеса.")
  public Long getBusinessId() {
    return businessId;
  }

  public void setBusinessId(Long businessId) {
    this.businessId = businessId;
  }

  public GenerateUnitedNettingReportRequest dateTimeFrom(OffsetDateTime dateTimeFrom) {
    this.dateTimeFrom = dateTimeFrom;
    return this;
  }

  /**
   * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно. 
   * @return dateTimeFrom
   */
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно. ")
  public OffsetDateTime getDateTimeFrom() {
    return dateTimeFrom;
  }

  public void setDateTimeFrom(OffsetDateTime dateTimeFrom) {
    this.dateTimeFrom = dateTimeFrom;
  }

  public GenerateUnitedNettingReportRequest dateTimeTo(OffsetDateTime dateTimeTo) {
    this.dateTimeTo = dateTimeTo;
    return this;
  }

  /**
   * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год. 
   * @return dateTimeTo
   */
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год. ")
  public OffsetDateTime getDateTimeTo() {
    return dateTimeTo;
  }

  public void setDateTimeTo(OffsetDateTime dateTimeTo) {
    this.dateTimeTo = dateTimeTo;
  }

  public GenerateUnitedNettingReportRequest dateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

  /**
   * Начало периода, включительно.
   * @return dateFrom
   */
  @ApiModelProperty(value = "Начало периода, включительно.")
  public LocalDate getDateFrom() {
    return dateFrom;
  }

  public void setDateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
  }

  public GenerateUnitedNettingReportRequest dateTo(LocalDate dateTo) {
    this.dateTo = dateTo;
    return this;
  }

  /**
   * Конец периода, включительно. Максимальный период — 1 год.
   * @return dateTo
   */
  @ApiModelProperty(value = "Конец периода, включительно. Максимальный период — 1 год.")
  public LocalDate getDateTo() {
    return dateTo;
  }

  public void setDateTo(LocalDate dateTo) {
    this.dateTo = dateTo;
  }

  public GenerateUnitedNettingReportRequest bankOrderId(Long bankOrderId) {
    this.bankOrderId = bankOrderId;
    return this;
  }

  /**
   * Номер платежного поручения.
   * @return bankOrderId
   */
  @ApiModelProperty(value = "Номер платежного поручения.")
  public Long getBankOrderId() {
    return bankOrderId;
  }

  public void setBankOrderId(Long bankOrderId) {
    this.bankOrderId = bankOrderId;
  }

  public GenerateUnitedNettingReportRequest bankOrderDateTime(OffsetDateTime bankOrderDateTime) {
    this.bankOrderDateTime = bankOrderDateTime;
    return this;
  }

  /**
   * Дата платежного поручения.
   * @return bankOrderDateTime
   */
  @ApiModelProperty(value = "Дата платежного поручения.")
  public OffsetDateTime getBankOrderDateTime() {
    return bankOrderDateTime;
  }

  public void setBankOrderDateTime(OffsetDateTime bankOrderDateTime) {
    this.bankOrderDateTime = bankOrderDateTime;
  }

  public GenerateUnitedNettingReportRequest placementPrograms(List<PlacementType> placementPrograms) {
    this.placementPrograms = placementPrograms;
    return this;
  }

  public GenerateUnitedNettingReportRequest addPlacementProgramsItem(PlacementType placementProgramsItem) {
    if (this.placementPrograms == null) {
      this.placementPrograms = new ArrayList<>();
    }
    this.placementPrograms.add(placementProgramsItem);
    return this;
  }

  /**
   * Список моделей, которые нужны в отчете. 
   * @return placementPrograms
   */
  @ApiModelProperty(value = "Список моделей, которые нужны в отчете. ")
  public List<PlacementType> getPlacementPrograms() {
    return placementPrograms;
  }

  public void setPlacementPrograms(List<PlacementType> placementPrograms) {
    this.placementPrograms = placementPrograms;
  }

  public GenerateUnitedNettingReportRequest inns(List<String> inns) {
    this.inns = inns;
    return this;
  }

  public GenerateUnitedNettingReportRequest addInnsItem(String innsItem) {
    if (this.inns == null) {
      this.inns = new ArrayList<>();
    }
    this.inns.add(innsItem);
    return this;
  }

  /**
   * Список ИНН, которые нужны в отчете.
   * @return inns
   */
  @ApiModelProperty(value = "Список ИНН, которые нужны в отчете.")
  public List<String> getInns() {
    return inns;
  }

  public void setInns(List<String> inns) {
    this.inns = inns;
  }

  public GenerateUnitedNettingReportRequest campaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  public GenerateUnitedNettingReportRequest addCampaignIdsItem(Long campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<>();
    }
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

  /**
   * Список магазинов, которые нужны в отчете.
   * @return campaignIds
   */
  @ApiModelProperty(value = "Список магазинов, которые нужны в отчете.")
  public List<Long> getCampaignIds() {
    return campaignIds;
  }

  public void setCampaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateUnitedNettingReportRequest generateUnitedNettingReportRequest = (GenerateUnitedNettingReportRequest) o;
    return Objects.equals(this.businessId, generateUnitedNettingReportRequest.businessId) &&
        Objects.equals(this.dateTimeFrom, generateUnitedNettingReportRequest.dateTimeFrom) &&
        Objects.equals(this.dateTimeTo, generateUnitedNettingReportRequest.dateTimeTo) &&
        Objects.equals(this.dateFrom, generateUnitedNettingReportRequest.dateFrom) &&
        Objects.equals(this.dateTo, generateUnitedNettingReportRequest.dateTo) &&
        Objects.equals(this.bankOrderId, generateUnitedNettingReportRequest.bankOrderId) &&
        Objects.equals(this.bankOrderDateTime, generateUnitedNettingReportRequest.bankOrderDateTime) &&
        Objects.equals(this.placementPrograms, generateUnitedNettingReportRequest.placementPrograms) &&
        Objects.equals(this.inns, generateUnitedNettingReportRequest.inns) &&
        Objects.equals(this.campaignIds, generateUnitedNettingReportRequest.campaignIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessId, dateTimeFrom, dateTimeTo, dateFrom, dateTo, bankOrderId, bankOrderDateTime, placementPrograms, inns, campaignIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateUnitedNettingReportRequest {\n");
    
    sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
    sb.append("    dateTimeFrom: ").append(toIndentedString(dateTimeFrom)).append("\n");
    sb.append("    dateTimeTo: ").append(toIndentedString(dateTimeTo)).append("\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
    sb.append("    bankOrderId: ").append(toIndentedString(bankOrderId)).append("\n");
    sb.append("    bankOrderDateTime: ").append(toIndentedString(bankOrderDateTime)).append("\n");
    sb.append("    placementPrograms: ").append(toIndentedString(placementPrograms)).append("\n");
    sb.append("    inns: ").append(toIndentedString(inns)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
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

