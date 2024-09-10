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

@Schema(name = "GenerateUnitedMarketplaceServicesReportRequest", description = "Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. ")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GenerateUnitedMarketplaceServicesReportRequest {

  private Long businessId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date dateTimeFrom;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date dateTimeTo;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private Date dateFrom;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private Date dateTo;

  private Integer yearFrom;

  private Integer monthFrom;

  private Integer yearTo;

  private Integer monthTo;

  @Valid
  private JsonNullable<List<PlacementType>> placementPrograms = JsonNullable.<List<PlacementType>>undefined();

  @Valid
  private JsonNullable<List<String>> inns = JsonNullable.<List<String>>undefined();

  @Valid
  private JsonNullable<List<Long>> campaignIds = JsonNullable.<List<Long>>undefined();

  public GenerateUnitedMarketplaceServicesReportRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GenerateUnitedMarketplaceServicesReportRequest(Long businessId) {
    this.businessId = businessId;
  }

  public GenerateUnitedMarketplaceServicesReportRequest businessId(Long businessId) {
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

  public GenerateUnitedMarketplaceServicesReportRequest dateTimeFrom(Date dateTimeFrom) {
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

  public GenerateUnitedMarketplaceServicesReportRequest dateTimeTo(Date dateTimeTo) {
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

  public GenerateUnitedMarketplaceServicesReportRequest dateFrom(Date dateFrom) {
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

  public GenerateUnitedMarketplaceServicesReportRequest dateTo(Date dateTo) {
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

  public GenerateUnitedMarketplaceServicesReportRequest yearFrom(Integer yearFrom) {
    this.yearFrom = yearFrom;
    return this;
  }

  /**
   * Начальный год формирования акта.
   * @return yearFrom
   */
  
  @Schema(name = "yearFrom", description = "Начальный год формирования акта.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("yearFrom")
  public Integer getYearFrom() {
    return yearFrom;
  }

  public void setYearFrom(Integer yearFrom) {
    this.yearFrom = yearFrom;
  }

  public GenerateUnitedMarketplaceServicesReportRequest monthFrom(Integer monthFrom) {
    this.monthFrom = monthFrom;
    return this;
  }

  /**
   * Начальный номер месяца формирования акта.
   * minimum: 1
   * maximum: 12
   * @return monthFrom
   */
  @Min(1) @Max(12) 
  @Schema(name = "monthFrom", description = "Начальный номер месяца формирования акта.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("monthFrom")
  public Integer getMonthFrom() {
    return monthFrom;
  }

  public void setMonthFrom(Integer monthFrom) {
    this.monthFrom = monthFrom;
  }

  public GenerateUnitedMarketplaceServicesReportRequest yearTo(Integer yearTo) {
    this.yearTo = yearTo;
    return this;
  }

  /**
   * Конечный год формирования акта.
   * @return yearTo
   */
  
  @Schema(name = "yearTo", description = "Конечный год формирования акта.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("yearTo")
  public Integer getYearTo() {
    return yearTo;
  }

  public void setYearTo(Integer yearTo) {
    this.yearTo = yearTo;
  }

  public GenerateUnitedMarketplaceServicesReportRequest monthTo(Integer monthTo) {
    this.monthTo = monthTo;
    return this;
  }

  /**
   * Конечный номер месяца формирования акта.
   * minimum: 1
   * maximum: 12
   * @return monthTo
   */
  @Min(1) @Max(12) 
  @Schema(name = "monthTo", description = "Конечный номер месяца формирования акта.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("monthTo")
  public Integer getMonthTo() {
    return monthTo;
  }

  public void setMonthTo(Integer monthTo) {
    this.monthTo = monthTo;
  }

  public GenerateUnitedMarketplaceServicesReportRequest placementPrograms(List<PlacementType> placementPrograms) {
    this.placementPrograms = JsonNullable.of(placementPrograms);
    return this;
  }

  public GenerateUnitedMarketplaceServicesReportRequest addPlacementProgramsItem(PlacementType placementProgramsItem) {
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

  public GenerateUnitedMarketplaceServicesReportRequest inns(List<String> inns) {
    this.inns = JsonNullable.of(inns);
    return this;
  }

  public GenerateUnitedMarketplaceServicesReportRequest addInnsItem(String innsItem) {
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

  public GenerateUnitedMarketplaceServicesReportRequest campaignIds(List<Long> campaignIds) {
    this.campaignIds = JsonNullable.of(campaignIds);
    return this;
  }

  public GenerateUnitedMarketplaceServicesReportRequest addCampaignIdsItem(Long campaignIdsItem) {
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
    GenerateUnitedMarketplaceServicesReportRequest generateUnitedMarketplaceServicesReportRequest = (GenerateUnitedMarketplaceServicesReportRequest) o;
    return Objects.equals(this.businessId, generateUnitedMarketplaceServicesReportRequest.businessId) &&
        Objects.equals(this.dateTimeFrom, generateUnitedMarketplaceServicesReportRequest.dateTimeFrom) &&
        Objects.equals(this.dateTimeTo, generateUnitedMarketplaceServicesReportRequest.dateTimeTo) &&
        Objects.equals(this.dateFrom, generateUnitedMarketplaceServicesReportRequest.dateFrom) &&
        Objects.equals(this.dateTo, generateUnitedMarketplaceServicesReportRequest.dateTo) &&
        Objects.equals(this.yearFrom, generateUnitedMarketplaceServicesReportRequest.yearFrom) &&
        Objects.equals(this.monthFrom, generateUnitedMarketplaceServicesReportRequest.monthFrom) &&
        Objects.equals(this.yearTo, generateUnitedMarketplaceServicesReportRequest.yearTo) &&
        Objects.equals(this.monthTo, generateUnitedMarketplaceServicesReportRequest.monthTo) &&
        equalsNullable(this.placementPrograms, generateUnitedMarketplaceServicesReportRequest.placementPrograms) &&
        equalsNullable(this.inns, generateUnitedMarketplaceServicesReportRequest.inns) &&
        equalsNullable(this.campaignIds, generateUnitedMarketplaceServicesReportRequest.campaignIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessId, dateTimeFrom, dateTimeTo, dateFrom, dateTo, yearFrom, monthFrom, yearTo, monthTo, hashCodeNullable(placementPrograms), hashCodeNullable(inns), hashCodeNullable(campaignIds));
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
    sb.append("class GenerateUnitedMarketplaceServicesReportRequest {\n");
    sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
    sb.append("    dateTimeFrom: ").append(toIndentedString(dateTimeFrom)).append("\n");
    sb.append("    dateTimeTo: ").append(toIndentedString(dateTimeTo)).append("\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
    sb.append("    yearFrom: ").append(toIndentedString(yearFrom)).append("\n");
    sb.append("    monthFrom: ").append(toIndentedString(monthFrom)).append("\n");
    sb.append("    yearTo: ").append(toIndentedString(yearTo)).append("\n");
    sb.append("    monthTo: ").append(toIndentedString(monthTo)).append("\n");
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

