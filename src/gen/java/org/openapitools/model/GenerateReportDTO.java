package org.openapitools.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
 **/
@ApiModel(description="Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.")

public class GenerateReportDTO  {
  
  @ApiModelProperty(required = true, value = "Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.")
 /**
   * Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
  **/
  private String reportId;

  @ApiModelProperty(required = true, value = "Ожидаемая продолжительность генерации в миллисекундах.")
 /**
   * Ожидаемая продолжительность генерации в миллисекундах.
  **/
  private Long estimatedGenerationTime;
 /**
   * Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
   * @return reportId
  **/
  @JsonProperty("reportId")
  public String getReportId() {
    return reportId;
  }

  public void setReportId(String reportId) {
    this.reportId = reportId;
  }

  public GenerateReportDTO reportId(String reportId) {
    this.reportId = reportId;
    return this;
  }

 /**
   * Ожидаемая продолжительность генерации в миллисекундах.
   * @return estimatedGenerationTime
  **/
  @JsonProperty("estimatedGenerationTime")
  public Long getEstimatedGenerationTime() {
    return estimatedGenerationTime;
  }

  public void setEstimatedGenerationTime(Long estimatedGenerationTime) {
    this.estimatedGenerationTime = estimatedGenerationTime;
  }

  public GenerateReportDTO estimatedGenerationTime(Long estimatedGenerationTime) {
    this.estimatedGenerationTime = estimatedGenerationTime;
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
    GenerateReportDTO generateReportDTO = (GenerateReportDTO) o;
    return Objects.equals(this.reportId, generateReportDTO.reportId) &&
        Objects.equals(this.estimatedGenerationTime, generateReportDTO.estimatedGenerationTime);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

