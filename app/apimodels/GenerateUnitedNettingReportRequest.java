package apimodels;

import apimodels.PlacementType;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GenerateUnitedNettingReportRequest   {
  @JsonProperty("businessId")
  @NotNull

  private Long businessId;

  @JsonProperty("dateTimeFrom")
  @Valid

  private OffsetDateTime dateTimeFrom;

  @JsonProperty("dateTimeTo")
  @Valid

  private OffsetDateTime dateTimeTo;

  @JsonProperty("dateFrom")
  @Valid

  private LocalDate dateFrom;

  @JsonProperty("dateTo")
  @Valid

  private LocalDate dateTo;

  @JsonProperty("bankOrderId")
  
  private Long bankOrderId;

  @JsonProperty("bankOrderDateTime")
  @Valid

  private OffsetDateTime bankOrderDateTime;

  @JsonProperty("placementPrograms")
  @Valid

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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
    return Objects.equals(businessId, generateUnitedNettingReportRequest.businessId) &&
        Objects.equals(dateTimeFrom, generateUnitedNettingReportRequest.dateTimeFrom) &&
        Objects.equals(dateTimeTo, generateUnitedNettingReportRequest.dateTimeTo) &&
        Objects.equals(dateFrom, generateUnitedNettingReportRequest.dateFrom) &&
        Objects.equals(dateTo, generateUnitedNettingReportRequest.dateTo) &&
        Objects.equals(bankOrderId, generateUnitedNettingReportRequest.bankOrderId) &&
        Objects.equals(bankOrderDateTime, generateUnitedNettingReportRequest.bankOrderDateTime) &&
        Objects.equals(placementPrograms, generateUnitedNettingReportRequest.placementPrograms) &&
        Objects.equals(inns, generateUnitedNettingReportRequest.inns) &&
        Objects.equals(campaignIds, generateUnitedNettingReportRequest.campaignIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessId, dateTimeFrom, dateTimeTo, dateFrom, dateTo, bankOrderId, bankOrderDateTime, placementPrograms, inns, campaignIds);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

