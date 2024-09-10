package apimodels;

import apimodels.ReportStatusType;
import apimodels.ReportSubStatusType;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Статус генерации и ссылка на готовый отчет.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ReportInfoDTO   {
  @JsonProperty("status")
  @NotNull
@Valid

  private ReportStatusType status;

  @JsonProperty("subStatus")
  @Valid

  private ReportSubStatusType subStatus;

  @JsonProperty("generationRequestedAt")
  @NotNull
@Valid

  private OffsetDateTime generationRequestedAt;

  @JsonProperty("generationFinishedAt")
  @Valid

  private OffsetDateTime generationFinishedAt;

  @JsonProperty("file")
  
  private String _file;

  @JsonProperty("estimatedGenerationTime")
  
  private Long estimatedGenerationTime;

  public ReportInfoDTO status(ReportStatusType status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  public ReportStatusType getStatus() {
    return status;
  }

  public void setStatus(ReportStatusType status) {
    this.status = status;
  }

  public ReportInfoDTO subStatus(ReportSubStatusType subStatus) {
    this.subStatus = subStatus;
    return this;
  }

   /**
   * Get subStatus
   * @return subStatus
  **/
  public ReportSubStatusType getSubStatus() {
    return subStatus;
  }

  public void setSubStatus(ReportSubStatusType subStatus) {
    this.subStatus = subStatus;
  }

  public ReportInfoDTO generationRequestedAt(OffsetDateTime generationRequestedAt) {
    this.generationRequestedAt = generationRequestedAt;
    return this;
  }

   /**
   * Дата и время запроса на генерацию.
   * @return generationRequestedAt
  **/
  public OffsetDateTime getGenerationRequestedAt() {
    return generationRequestedAt;
  }

  public void setGenerationRequestedAt(OffsetDateTime generationRequestedAt) {
    this.generationRequestedAt = generationRequestedAt;
  }

  public ReportInfoDTO generationFinishedAt(OffsetDateTime generationFinishedAt) {
    this.generationFinishedAt = generationFinishedAt;
    return this;
  }

   /**
   * Дата и время завершения генерации.
   * @return generationFinishedAt
  **/
  public OffsetDateTime getGenerationFinishedAt() {
    return generationFinishedAt;
  }

  public void setGenerationFinishedAt(OffsetDateTime generationFinishedAt) {
    this.generationFinishedAt = generationFinishedAt;
  }

  public ReportInfoDTO _file(String _file) {
    this._file = _file;
    return this;
  }

   /**
   * Ссылка на готовый отчет.
   * @return _file
  **/
  public String getFile() {
    return _file;
  }

  public void setFile(String _file) {
    this._file = _file;
  }

  public ReportInfoDTO estimatedGenerationTime(Long estimatedGenerationTime) {
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
    ReportInfoDTO reportInfoDTO = (ReportInfoDTO) o;
    return Objects.equals(status, reportInfoDTO.status) &&
        Objects.equals(subStatus, reportInfoDTO.subStatus) &&
        Objects.equals(generationRequestedAt, reportInfoDTO.generationRequestedAt) &&
        Objects.equals(generationFinishedAt, reportInfoDTO.generationFinishedAt) &&
        Objects.equals(_file, reportInfoDTO._file) &&
        Objects.equals(estimatedGenerationTime, reportInfoDTO.estimatedGenerationTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, subStatus, generationRequestedAt, generationFinishedAt, _file, estimatedGenerationTime);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportInfoDTO {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subStatus: ").append(toIndentedString(subStatus)).append("\n");
    sb.append("    generationRequestedAt: ").append(toIndentedString(generationRequestedAt)).append("\n");
    sb.append("    generationFinishedAt: ").append(toIndentedString(generationFinishedAt)).append("\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
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

