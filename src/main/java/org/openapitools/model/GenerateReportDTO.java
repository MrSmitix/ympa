package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
 */

@Schema(name = "GenerateReportDTO", description = "Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GenerateReportDTO {

  private String reportId;

  private Long estimatedGenerationTime;

  public GenerateReportDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GenerateReportDTO(String reportId, Long estimatedGenerationTime) {
    this.reportId = reportId;
    this.estimatedGenerationTime = estimatedGenerationTime;
  }

  public GenerateReportDTO reportId(String reportId) {
    this.reportId = reportId;
    return this;
  }

  /**
   * Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
   * @return reportId
   */
  @NotNull 
  @Schema(name = "reportId", description = "Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("reportId")
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
  @NotNull 
  @Schema(name = "estimatedGenerationTime", description = "Ожидаемая продолжительность генерации в миллисекундах.", requiredMode = Schema.RequiredMode.REQUIRED)
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

