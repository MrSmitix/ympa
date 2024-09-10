package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
 **/

@ApiModel(description = "Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GenerateReportDTO   {
  @JsonProperty("reportId")
  private String reportId;

  @JsonProperty("estimatedGenerationTime")
  private Long estimatedGenerationTime;

  /**
   * Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
   **/
  public GenerateReportDTO reportId(String reportId) {
    this.reportId = reportId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.")
  @JsonProperty("reportId")
  public String getReportId() {
    return reportId;
  }
  public void setReportId(String reportId) {
    this.reportId = reportId;
  }

  /**
   * Ожидаемая продолжительность генерации в миллисекундах.
   **/
  public GenerateReportDTO estimatedGenerationTime(Long estimatedGenerationTime) {
    this.estimatedGenerationTime = estimatedGenerationTime;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Ожидаемая продолжительность генерации в миллисекундах.")
  @JsonProperty("estimatedGenerationTime")
  public Long getEstimatedGenerationTime() {
    return estimatedGenerationTime;
  }
  public void setEstimatedGenerationTime(Long estimatedGenerationTime) {
    this.estimatedGenerationTime = estimatedGenerationTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateReportDTO generateReportDTO = (GenerateReportDTO) o;
    return Objects.equals(reportId, generateReportDTO.reportId) &&
        Objects.equals(estimatedGenerationTime, generateReportDTO.estimatedGenerationTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportId, estimatedGenerationTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateReportDTO {\n");
    
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
    sb.append("    estimatedGenerationTime: ").append(toIndentedString(estimatedGenerationTime)).append("\n");
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

