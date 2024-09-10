package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Данные, необходимые для генерации отчета. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GenerateGoodsFeedbackRequest   {
  
  private Long businessId;

  public GenerateGoodsFeedbackRequest () {

  }

  public GenerateGoodsFeedbackRequest (Long businessId) {
    this.businessId = businessId;
  }

    
  @JsonProperty("businessId")
  public Long getBusinessId() {
    return businessId;
  }
  public void setBusinessId(Long businessId) {
    this.businessId = businessId;
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
    return Objects.equals(businessId, generateGoodsFeedbackRequest.businessId);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
