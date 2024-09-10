package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.openapitools.vertxweb.server.model.ReportStatusType;
import org.openapitools.vertxweb.server.model.ReportSubStatusType;

/**
 * Статус генерации и ссылка на готовый отчет.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReportInfoDTO   {
  
  private ReportStatusType status;
  private ReportSubStatusType subStatus;
  private OffsetDateTime generationRequestedAt;
  private OffsetDateTime generationFinishedAt;
  private String _file;
  private Long estimatedGenerationTime;

  public ReportInfoDTO () {

  }

  public ReportInfoDTO (ReportStatusType status, ReportSubStatusType subStatus, OffsetDateTime generationRequestedAt, OffsetDateTime generationFinishedAt, String _file, Long estimatedGenerationTime) {
    this.status = status;
    this.subStatus = subStatus;
    this.generationRequestedAt = generationRequestedAt;
    this.generationFinishedAt = generationFinishedAt;
    this._file = _file;
    this.estimatedGenerationTime = estimatedGenerationTime;
  }

    
  @JsonProperty("status")
  public ReportStatusType getStatus() {
    return status;
  }
  public void setStatus(ReportStatusType status) {
    this.status = status;
  }

    
  @JsonProperty("subStatus")
  public ReportSubStatusType getSubStatus() {
    return subStatus;
  }
  public void setSubStatus(ReportSubStatusType subStatus) {
    this.subStatus = subStatus;
  }

    
  @JsonProperty("generationRequestedAt")
  public OffsetDateTime getGenerationRequestedAt() {
    return generationRequestedAt;
  }
  public void setGenerationRequestedAt(OffsetDateTime generationRequestedAt) {
    this.generationRequestedAt = generationRequestedAt;
  }

    
  @JsonProperty("generationFinishedAt")
  public OffsetDateTime getGenerationFinishedAt() {
    return generationFinishedAt;
  }
  public void setGenerationFinishedAt(OffsetDateTime generationFinishedAt) {
    this.generationFinishedAt = generationFinishedAt;
  }

    
  @JsonProperty("file")
  public String getFile() {
    return _file;
  }
  public void setFile(String _file) {
    this._file = _file;
  }

    
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
