package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GenerateReportDTO   {
  @JsonProperty("reportId")
  @NotNull

  private String reportId;

  @JsonProperty("estimatedGenerationTime")
  @NotNull

  private Long estimatedGenerationTime;

  public GenerateReportDTO reportId(String reportId) {
    this.reportId = reportId;
    return this;
  }

   /**
   * Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
   * @return reportId
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

