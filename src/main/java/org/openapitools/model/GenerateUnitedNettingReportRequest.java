package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PlacementType;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. 
 */

@Schema(name = "GenerateUnitedNettingReportRequest", description = "Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. ")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GenerateUnitedNettingReportRequest {

  private Long businessId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date dateTimeFrom;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date dateTimeTo;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private Date dateFrom;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private Date dateTo;

  private Long bankOrderId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date bankOrderDateTime;

  @Valid
  private JsonNullable<List<PlacementType>> placementPrograms = JsonNullable.<List<PlacementType>>undefined();

  @Valid
  private JsonNullable<List<String>> inns = JsonNullable.<List<String>>undefined();

  @Valid
  private JsonNullable<List<Long>> campaignIds = JsonNullable.<List<Long>>undefined();

  public GenerateUnitedNettingReportRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GenerateUnitedNettingReportRequest(Long businessId) {
    this.businessId = businessId;
  }

  public GenerateUnitedNettingReportRequest businessId(Long businessId) {
    this.businessId = businessId;
    return this;
  }

  /**
   * Идентификатор бизнеса.
   * @return businessId
   */
  @NotNull 
  @Schema(name = "businessId", description = "Идентификатор бизнеса.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("businessId")
  public Long getBusinessId() {
    return businessId;
  }

  public void setBusinessId(Long businessId) {
    this.businessId = businessId;
  }

  public GenerateUnitedNettingReportRequest dateTimeFrom(Date dateTimeFrom) {
    this.dateTimeFrom = dateTimeFrom;
    return this;
  }

  /**
   * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно. 
   * @return dateTimeFrom
   */
  @Valid 
  @Schema(name = "dateTimeFrom", description = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dateTimeFrom")
  public Date getDateTimeFrom() {
    return dateTimeFrom;
  }

  public void setDateTimeFrom(Date dateTimeFrom) {
    this.dateTimeFrom = dateTimeFrom;
  }

  public GenerateUnitedNettingReportRequest dateTimeTo(Date dateTimeTo) {
    this.dateTimeTo = dateTimeTo;
    return this;
  }

  /**
   * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год. 
   * @return dateTimeTo
   */
  @Valid 
  @Schema(name = "dateTimeTo", description = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dateTimeTo")
  public Date getDateTimeTo() {
    return dateTimeTo;
  }

  public void setDateTimeTo(Date dateTimeTo) {
    this.dateTimeTo = dateTimeTo;
  }

  public GenerateUnitedNettingReportRequest dateFrom(Date dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

  /**
   * Начало периода, включительно.
   * @return dateFrom
   */
  @Valid 
  @Schema(name = "dateFrom", description = "Начало периода, включительно.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dateFrom")
  public Date getDateFrom() {
    return dateFrom;
  }

  public void setDateFrom(Date dateFrom) {
    this.dateFrom = dateFrom;
  }

  public GenerateUnitedNettingReportRequest dateTo(Date dateTo) {
    this.dateTo = dateTo;
    return this;
  }

  /**
   * Конец периода, включительно. Максимальный период — 1 год.
   * @return dateTo
   */
  @Valid 
  @Schema(name = "dateTo", description = "Конец периода, включительно. Максимальный период — 1 год.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dateTo")
  public Date getDateTo() {
    return dateTo;
  }

  public void setDateTo(Date dateTo) {
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
  
  @Schema(name = "bankOrderId", description = "Номер платежного поручения.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bankOrderId")
  public Long getBankOrderId() {
    return bankOrderId;
  }

  public void setBankOrderId(Long bankOrderId) {
    this.bankOrderId = bankOrderId;
  }

  public GenerateUnitedNettingReportRequest bankOrderDateTime(Date bankOrderDateTime) {
    this.bankOrderDateTime = bankOrderDateTime;
    return this;
  }

  /**
   * Дата платежного поручения.
   * @return bankOrderDateTime
   */
  @Valid 
  @Schema(name = "bankOrderDateTime", description = "Дата платежного поручения.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bankOrderDateTime")
  public Date getBankOrderDateTime() {
    return bankOrderDateTime;
  }

  public void setBankOrderDateTime(Date bankOrderDateTime) {
    this.bankOrderDateTime = bankOrderDateTime;
  }

  public GenerateUnitedNettingReportRequest placementPrograms(List<PlacementType> placementPrograms) {
    this.placementPrograms = JsonNullable.of(placementPrograms);
    return this;
  }

  public GenerateUnitedNettingReportRequest addPlacementProgramsItem(PlacementType placementProgramsItem) {
    if (this.placementPrograms == null || !this.placementPrograms.isPresent()) {
      this.placementPrograms = JsonNullable.of(new ArrayList<>());
    }
    this.placementPrograms.get().add(placementProgramsItem);
    return this;
  }

  /**
   * Список моделей, которые нужны в отчете. 
   * @return placementPrograms
   */
  @Valid 
  @Schema(name = "placementPrograms", description = "Список моделей, которые нужны в отчете. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("placementPrograms")
  public JsonNullable<List<PlacementType>> getPlacementPrograms() {
    return placementPrograms;
  }

  public void setPlacementPrograms(JsonNullable<List<PlacementType>> placementPrograms) {
    this.placementPrograms = placementPrograms;
  }

  public GenerateUnitedNettingReportRequest inns(List<String> inns) {
    this.inns = JsonNullable.of(inns);
    return this;
  }

  public GenerateUnitedNettingReportRequest addInnsItem(String innsItem) {
    if (this.inns == null || !this.inns.isPresent()) {
      this.inns = JsonNullable.of(new ArrayList<>());
    }
    this.inns.get().add(innsItem);
    return this;
  }

  /**
   * Список ИНН, которые нужны в отчете.
   * @return inns
   */
  
  @Schema(name = "inns", description = "Список ИНН, которые нужны в отчете.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("inns")
  public JsonNullable<List<String>> getInns() {
    return inns;
  }

  public void setInns(JsonNullable<List<String>> inns) {
    this.inns = inns;
  }

  public GenerateUnitedNettingReportRequest campaignIds(List<Long> campaignIds) {
    this.campaignIds = JsonNullable.of(campaignIds);
    return this;
  }

  public GenerateUnitedNettingReportRequest addCampaignIdsItem(Long campaignIdsItem) {
    if (this.campaignIds == null || !this.campaignIds.isPresent()) {
      this.campaignIds = JsonNullable.of(new ArrayList<>());
    }
    this.campaignIds.get().add(campaignIdsItem);
    return this;
  }

  /**
   * Список магазинов, которые нужны в отчете.
   * @return campaignIds
   */
  
  @Schema(name = "campaignIds", description = "Список магазинов, которые нужны в отчете.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("campaignIds")
  public JsonNullable<List<Long>> getCampaignIds() {
    return campaignIds;
  }

  public void setCampaignIds(JsonNullable<List<Long>> campaignIds) {
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
        equalsNullable(this.placementPrograms, generateUnitedNettingReportRequest.placementPrograms) &&
        equalsNullable(this.inns, generateUnitedNettingReportRequest.inns) &&
        equalsNullable(this.campaignIds, generateUnitedNettingReportRequest.campaignIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessId, dateTimeFrom, dateTimeTo, dateFrom, dateTo, bankOrderId, bankOrderDateTime, hashCodeNullable(placementPrograms), hashCodeNullable(inns), hashCodeNullable(campaignIds));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

