package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Данные, необходимые для генерации отчета. 
 **/

@ApiModel(description = "Данные, необходимые для генерации отчета. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GenerateGoodsFeedbackRequest   {
  @JsonProperty("businessId")
  private Long businessId;

  /**
   * Идентификатор бизнеса.
   **/
  public GenerateGoodsFeedbackRequest businessId(Long businessId) {
    this.businessId = businessId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор бизнеса.")
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

