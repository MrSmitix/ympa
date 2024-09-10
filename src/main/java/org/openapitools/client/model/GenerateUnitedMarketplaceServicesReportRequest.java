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
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.PlacementType;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.NoSuchElementException;



/**
  * Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. 
 **/

public class GenerateUnitedMarketplaceServicesReportRequest  {
  
 /**
   * Идентификатор бизнеса.
  **/
  private Long businessId;

 /**
   * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно. 
  **/
  private OffsetDateTime dateTimeFrom;

 /**
   * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год. 
  **/
  private OffsetDateTime dateTimeTo;

 /**
   * Начало периода, включительно.
  **/
  private LocalDate dateFrom;

 /**
   * Конец периода, включительно. Максимальный период — 1 год.
  **/
  private LocalDate dateTo;

 /**
   * Начальный год формирования акта.
  **/
  private Integer yearFrom;

 /**
   * Начальный номер месяца формирования акта.
  **/
  private Integer monthFrom;

 /**
   * Конечный год формирования акта.
  **/
  private Integer yearTo;

 /**
   * Конечный номер месяца формирования акта.
  **/
  private Integer monthTo;

 /**
   * Список моделей, которые нужны в отчете. 
  **/
  private List<PlacementType> placementPrograms = null;

 /**
   * Список ИНН, которые нужны в отчете.
  **/
  private List<String> inns = null;

 /**
   * Список магазинов, которые нужны в отчете.
  **/
  private List<Long> campaignIds = null;

 /**
   * Идентификатор бизнеса.
   * @return businessId
  **/
  public Long getBusinessId() {
    return businessId;
  }

  /**
    * Set businessId
  **/
  public void setBusinessId(Long businessId) {
    this.businessId = businessId;
  }

  public GenerateUnitedMarketplaceServicesReportRequest businessId(Long businessId) {
    this.businessId = businessId;
    return this;
  }

 /**
   * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно. 
   * @return dateTimeFrom
  **/
  public OffsetDateTime getDateTimeFrom() {
    return dateTimeFrom;
  }

  /**
    * Set dateTimeFrom
  **/
  public void setDateTimeFrom(OffsetDateTime dateTimeFrom) {
    this.dateTimeFrom = dateTimeFrom;
  }

  public GenerateUnitedMarketplaceServicesReportRequest dateTimeFrom(OffsetDateTime dateTimeFrom) {
    this.dateTimeFrom = dateTimeFrom;
    return this;
  }

 /**
   * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год. 
   * @return dateTimeTo
  **/
  public OffsetDateTime getDateTimeTo() {
    return dateTimeTo;
  }

  /**
    * Set dateTimeTo
  **/
  public void setDateTimeTo(OffsetDateTime dateTimeTo) {
    this.dateTimeTo = dateTimeTo;
  }

  public GenerateUnitedMarketplaceServicesReportRequest dateTimeTo(OffsetDateTime dateTimeTo) {
    this.dateTimeTo = dateTimeTo;
    return this;
  }

 /**
   * Начало периода, включительно.
   * @return dateFrom
  **/
  public LocalDate getDateFrom() {
    return dateFrom;
  }

  /**
    * Set dateFrom
  **/
  public void setDateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
  }

  public GenerateUnitedMarketplaceServicesReportRequest dateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

 /**
   * Конец периода, включительно. Максимальный период — 1 год.
   * @return dateTo
  **/
  public LocalDate getDateTo() {
    return dateTo;
  }

  /**
    * Set dateTo
  **/
  public void setDateTo(LocalDate dateTo) {
    this.dateTo = dateTo;
  }

  public GenerateUnitedMarketplaceServicesReportRequest dateTo(LocalDate dateTo) {
    this.dateTo = dateTo;
    return this;
  }

 /**
   * Начальный год формирования акта.
   * @return yearFrom
  **/
  public Integer getYearFrom() {
    return yearFrom;
  }

  /**
    * Set yearFrom
  **/
  public void setYearFrom(Integer yearFrom) {
    this.yearFrom = yearFrom;
  }

  public GenerateUnitedMarketplaceServicesReportRequest yearFrom(Integer yearFrom) {
    this.yearFrom = yearFrom;
    return this;
  }

 /**
   * Начальный номер месяца формирования акта.
   * minimum: 1
   * maximum: 12
   * @return monthFrom
  **/
  public Integer getMonthFrom() {
    return monthFrom;
  }

  /**
    * Set monthFrom
  **/
  public void setMonthFrom(Integer monthFrom) {
    this.monthFrom = monthFrom;
  }

  public GenerateUnitedMarketplaceServicesReportRequest monthFrom(Integer monthFrom) {
    this.monthFrom = monthFrom;
    return this;
  }

 /**
   * Конечный год формирования акта.
   * @return yearTo
  **/
  public Integer getYearTo() {
    return yearTo;
  }

  /**
    * Set yearTo
  **/
  public void setYearTo(Integer yearTo) {
    this.yearTo = yearTo;
  }

  public GenerateUnitedMarketplaceServicesReportRequest yearTo(Integer yearTo) {
    this.yearTo = yearTo;
    return this;
  }

 /**
   * Конечный номер месяца формирования акта.
   * minimum: 1
   * maximum: 12
   * @return monthTo
  **/
  public Integer getMonthTo() {
    return monthTo;
  }

  /**
    * Set monthTo
  **/
  public void setMonthTo(Integer monthTo) {
    this.monthTo = monthTo;
  }

  public GenerateUnitedMarketplaceServicesReportRequest monthTo(Integer monthTo) {
    this.monthTo = monthTo;
    return this;
  }

 /**
   * Список моделей, которые нужны в отчете. 
   * @return placementPrograms
  **/
  public List<PlacementType> getPlacementPrograms() {
    return placementPrograms;
  }

  /**
    * Set placementPrograms
  **/
  public void setPlacementPrograms(List<PlacementType> placementPrograms) {
    this.placementPrograms = placementPrograms;
  }

  public GenerateUnitedMarketplaceServicesReportRequest placementPrograms(List<PlacementType> placementPrograms) {
    this.placementPrograms = placementPrograms;
    return this;
  }

  public GenerateUnitedMarketplaceServicesReportRequest addPlacementProgramsItem(PlacementType placementProgramsItem) {
    this.placementPrograms.add(placementProgramsItem);
    return this;
  }

 /**
   * Список ИНН, которые нужны в отчете.
   * @return inns
  **/
  public List<String> getInns() {
    return inns;
  }

  /**
    * Set inns
  **/
  public void setInns(List<String> inns) {
    this.inns = inns;
  }

  public GenerateUnitedMarketplaceServicesReportRequest inns(List<String> inns) {
    this.inns = inns;
    return this;
  }

  public GenerateUnitedMarketplaceServicesReportRequest addInnsItem(String innsItem) {
    this.inns.add(innsItem);
    return this;
  }

 /**
   * Список магазинов, которые нужны в отчете.
   * @return campaignIds
  **/
  public List<Long> getCampaignIds() {
    return campaignIds;
  }

  /**
    * Set campaignIds
  **/
  public void setCampaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
  }

  public GenerateUnitedMarketplaceServicesReportRequest campaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  public GenerateUnitedMarketplaceServicesReportRequest addCampaignIdsItem(Long campaignIdsItem) {
    this.campaignIds.add(campaignIdsItem);
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

