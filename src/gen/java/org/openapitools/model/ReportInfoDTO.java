package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.util.Date;
import org.openapitools.model.ReportStatusType;
import org.openapitools.model.ReportSubStatusType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Статус генерации и ссылка на готовый отчет.
 **/
@ApiModel(description="Статус генерации и ссылка на готовый отчет.")

public class ReportInfoDTO  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private ReportStatusType status;

  @ApiModelProperty(value = "")
  @Valid
  private ReportSubStatusType subStatus;

  @ApiModelProperty(required = true, value = "Дата и время запроса на генерацию.")
 /**
   * Дата и время запроса на генерацию.
  **/
  private Date generationRequestedAt;

  @ApiModelProperty(value = "Дата и время завершения генерации.")
 /**
   * Дата и время завершения генерации.
  **/
  private Date generationFinishedAt;

  @ApiModelProperty(value = "Ссылка на готовый отчет.")
 /**
   * Ссылка на готовый отчет.
  **/
  private String _file;

  @ApiModelProperty(value = "Ожидаемая продолжительность генерации в миллисекундах.")
 /**
   * Ожидаемая продолжительность генерации в миллисекундах.
  **/
  private Long estimatedGenerationTime;
 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  @NotNull
  public ReportStatusType getStatus() {
    return status;
  }

  public void setStatus(ReportStatusType status) {
    this.status = status;
  }

  public ReportInfoDTO status(ReportStatusType status) {
    this.status = status;
    return this;
  }

 /**
   * Get subStatus
   * @return subStatus
  **/
  @JsonProperty("subStatus")
  public ReportSubStatusType getSubStatus() {
    return subStatus;
  }

  public void setSubStatus(ReportSubStatusType subStatus) {
    this.subStatus = subStatus;
  }

  public ReportInfoDTO subStatus(ReportSubStatusType subStatus) {
    this.subStatus = subStatus;
    return this;
  }

 /**
   * Дата и время запроса на генерацию.
   * @return generationRequestedAt
  **/
  @JsonProperty("generationRequestedAt")
  @NotNull
  public Date getGenerationRequestedAt() {
    return generationRequestedAt;
  }

  public void setGenerationRequestedAt(Date generationRequestedAt) {
    this.generationRequestedAt = generationRequestedAt;
  }

  public ReportInfoDTO generationRequestedAt(Date generationRequestedAt) {
    this.generationRequestedAt = generationRequestedAt;
    return this;
  }

 /**
   * Дата и время завершения генерации.
   * @return generationFinishedAt
  **/
  @JsonProperty("generationFinishedAt")
  public Date getGenerationFinishedAt() {
    return generationFinishedAt;
  }

  public void setGenerationFinishedAt(Date generationFinishedAt) {
    this.generationFinishedAt = generationFinishedAt;
  }

  public ReportInfoDTO generationFinishedAt(Date generationFinishedAt) {
    this.generationFinishedAt = generationFinishedAt;
    return this;
  }

 /**
   * Ссылка на готовый отчет.
   * @return _file
  **/
  @JsonProperty("file")
  public String getFile() {
    return _file;
  }

  public void setFile(String _file) {
    this._file = _file;
  }

  public ReportInfoDTO _file(String _file) {
    this._file = _file;
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

  public ReportInfoDTO estimatedGenerationTime(Long estimatedGenerationTime) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

