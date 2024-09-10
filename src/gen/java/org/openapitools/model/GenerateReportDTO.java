package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
 */
@ApiModel(description="Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.")

public class GenerateReportDTO  {
  
 /**
  * Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
  */
  @ApiModelProperty(required = true, value = "Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.")
  private String reportId;

 /**
  * Ожидаемая продолжительность генерации в миллисекундах.
  */
  @ApiModelProperty(required = true, value = "Ожидаемая продолжительность генерации в миллисекундах.")
  private Long estimatedGenerationTime;
 /**
  * Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
  * @return reportId
  */
  @JsonProperty("reportId")
  @NotNull
  public String getReportId() {
    return reportId;
  }

  /**
   * Sets the <code>reportId</code> property.
   */
 public void setReportId(String reportId) {
    this.reportId = reportId;
  }

  /**
   * Sets the <code>reportId</code> property.
   */
  public GenerateReportDTO reportId(String reportId) {
    this.reportId = reportId;
    return this;
  }

 /**
  * Ожидаемая продолжительность генерации в миллисекундах.
  * @return estimatedGenerationTime
  */
  @JsonProperty("estimatedGenerationTime")
  @NotNull
  public Long getEstimatedGenerationTime() {
    return estimatedGenerationTime;
  }

  /**
   * Sets the <code>estimatedGenerationTime</code> property.
   */
 public void setEstimatedGenerationTime(Long estimatedGenerationTime) {
    this.estimatedGenerationTime = estimatedGenerationTime;
  }

  /**
   * Sets the <code>estimatedGenerationTime</code> property.
   */
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

