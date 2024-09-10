package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
 */
@ApiModel(description = "Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GenerateReportDTO   {
  @JsonProperty("reportId")
  private String reportId;

  @JsonProperty("estimatedGenerationTime")
  private Long estimatedGenerationTime;

  public GenerateReportDTO reportId(String reportId) {
    this.reportId = reportId;
    return this;
  }

  /**
   * Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
   * @return reportId
   */
  @ApiModelProperty(required = true, value = "Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.")
  public String getReportId() {
    return reportId;
  }

  public void setReportId(String reportId) {
    this.reportId = reportId;
  }

  public GenerateReportDTO estimatedGenerationTime(Long estimatedGenerationTime) {
    this.estimatedGenerationTime = estimatedGenerationTime;
    return this;
  }

  /**
   * Ожидаемая продолжительность генерации в миллисекундах.
   * @return estimatedGenerationTime
   */
  @ApiModelProperty(required = true, value = "Ожидаемая продолжительность генерации в миллисекундах.")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

