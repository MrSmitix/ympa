package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Запрос информации по индексу качества.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetQualityRatingRequest   {
  
  private LocalDate dateFrom;
  private LocalDate dateTo;
  private Set<Long> campaignIds = new LinkedHashSet<>();

  public GetQualityRatingRequest () {

  }

  public GetQualityRatingRequest (LocalDate dateFrom, LocalDate dateTo, Set<Long> campaignIds) {
    this.dateFrom = dateFrom;
    this.dateTo = dateTo;
    this.campaignIds = campaignIds;
  }

    
  @JsonProperty("dateFrom")
  public LocalDate getDateFrom() {
    return dateFrom;
  }
  public void setDateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
  }

    
  @JsonProperty("dateTo")
  public LocalDate getDateTo() {
    return dateTo;
  }
  public void setDateTo(LocalDate dateTo) {
    this.dateTo = dateTo;
  }

    
  @JsonProperty("campaignIds")
  public Set<Long> getCampaignIds() {
    return campaignIds;
  }
  public void setCampaignIds(Set<Long> campaignIds) {
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
    GetQualityRatingRequest getQualityRatingRequest = (GetQualityRatingRequest) o;
    return Objects.equals(dateFrom, getQualityRatingRequest.dateFrom) &&
        Objects.equals(dateTo, getQualityRatingRequest.dateTo) &&
        Objects.equals(campaignIds, getQualityRatingRequest.campaignIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateFrom, dateTo, campaignIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetQualityRatingRequest {\n");
    
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
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
