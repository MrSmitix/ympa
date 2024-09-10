package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Данные, необходимые для генерации отчета. ")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GenerateBoostConsolidatedRequest   {
  
  private Long businessId;
  private Date dateFrom;
  private Date dateTo;

  /**
   * Идентификатор бизнеса.
   **/
  
  @ApiModelProperty(required = true, value = "Идентификатор бизнеса.")
  @JsonProperty("businessId")
  @NotNull
  public Long getBusinessId() {
    return businessId;
  }
  public void setBusinessId(Long businessId) {
    this.businessId = businessId;
  }

  /**
   * Начало периода, включительно.
   **/
  
  @ApiModelProperty(required = true, value = "Начало периода, включительно.")
  @JsonProperty("dateFrom")
  @NotNull
  public Date getDateFrom() {
    return dateFrom;
  }
  public void setDateFrom(Date dateFrom) {
    this.dateFrom = dateFrom;
  }

  /**
   * Конец периода, включительно.
   **/
  
  @ApiModelProperty(required = true, value = "Конец периода, включительно.")
  @JsonProperty("dateTo")
  @NotNull
  public Date getDateTo() {
    return dateTo;
  }
  public void setDateTo(Date dateTo) {
    this.dateTo = dateTo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateBoostConsolidatedRequest generateBoostConsolidatedRequest = (GenerateBoostConsolidatedRequest) o;
    return Objects.equals(this.businessId, generateBoostConsolidatedRequest.businessId) &&
        Objects.equals(this.dateFrom, generateBoostConsolidatedRequest.dateFrom) &&
        Objects.equals(this.dateTo, generateBoostConsolidatedRequest.dateTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessId, dateFrom, dateTo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateBoostConsolidatedRequest {\n");
    
    sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
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
