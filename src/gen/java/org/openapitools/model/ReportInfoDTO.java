package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.model.ReportStatusType;
import org.openapitools.model.ReportSubStatusType;

/**
 * Статус генерации и ссылка на готовый отчет.
 */
@ApiModel(description = "Статус генерации и ссылка на готовый отчет.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-09-09T22:21:22.142726883Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ReportInfoDTO   {
  @JsonProperty("status")
  private ReportStatusType status;

  @JsonProperty("subStatus")
  private ReportSubStatusType subStatus;

  @JsonProperty("generationRequestedAt")
  private Date generationRequestedAt;

  @JsonProperty("generationFinishedAt")
  private Date generationFinishedAt;

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
  @ApiModelProperty(required = true, value = "")
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
  @ApiModelProperty(value = "")
  public ReportSubStatusType getSubStatus() {
    return subStatus;
  }

  public void setSubStatus(ReportSubStatusType subStatus) {
    this.subStatus = subStatus;
  }

  public ReportInfoDTO generationRequestedAt(Date generationRequestedAt) {
    this.generationRequestedAt = generationRequestedAt;
    return this;
  }

   /**
   * Дата и время запроса на генерацию.
   * @return generationRequestedAt
  **/
  @ApiModelProperty(required = true, value = "Дата и время запроса на генерацию.")
  public Date getGenerationRequestedAt() {
    return generationRequestedAt;
  }

  public void setGenerationRequestedAt(Date generationRequestedAt) {
    this.generationRequestedAt = generationRequestedAt;
  }

  public ReportInfoDTO generationFinishedAt(Date generationFinishedAt) {
    this.generationFinishedAt = generationFinishedAt;
    return this;
  }

   /**
   * Дата и время завершения генерации.
   * @return generationFinishedAt
  **/
  @ApiModelProperty(value = "Дата и время завершения генерации.")
  public Date getGenerationFinishedAt() {
    return generationFinishedAt;
  }

  public void setGenerationFinishedAt(Date generationFinishedAt) {
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
  @ApiModelProperty(value = "Ссылка на готовый отчет.")
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
  @ApiModelProperty(value = "Ожидаемая продолжительность генерации в миллисекундах.")
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
    return Objects.equals(this.status, reportInfoDTO.status) &&
        Objects.equals(this.subStatus, reportInfoDTO.subStatus) &&
        Objects.equals(this.generationRequestedAt, reportInfoDTO.generationRequestedAt) &&
        Objects.equals(this.generationFinishedAt, reportInfoDTO.generationFinishedAt) &&
        Objects.equals(this._file, reportInfoDTO._file) &&
        Objects.equals(this.estimatedGenerationTime, reportInfoDTO.estimatedGenerationTime);
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

