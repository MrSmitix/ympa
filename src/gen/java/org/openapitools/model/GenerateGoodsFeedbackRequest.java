package org.openapitools.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Данные, необходимые для генерации отчета. 
 **/
@ApiModel(description="Данные, необходимые для генерации отчета. ")

public class GenerateGoodsFeedbackRequest  {
  
  @ApiModelProperty(required = true, value = "Идентификатор бизнеса.")
 /**
   * Идентификатор бизнеса.
  **/
  private Long businessId;
 /**
   * Идентификатор бизнеса.
   * @return businessId
  **/
  @JsonProperty("businessId")
  public Long getBusinessId() {
    return businessId;
  }

  public void setBusinessId(Long businessId) {
    this.businessId = businessId;
  }

  public GenerateGoodsFeedbackRequest businessId(Long businessId) {
    this.businessId = businessId;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateGoodsFeedbackRequest generateGoodsFeedbackRequest = (GenerateGoodsFeedbackRequest) o;
    return Objects.equals(this.businessId, generateGoodsFeedbackRequest.businessId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateGoodsFeedbackRequest {\n");
    
    sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
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

