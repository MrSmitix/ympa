package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.model.ReportStatusType;
import org.openapitools.model.ReportSubStatusType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Статус генерации и ссылка на готовый отчет.
 **/
@ApiModel(description = "Статус генерации и ссылка на готовый отчет.")
@JsonTypeName("ReportInfoDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ReportInfoDTO   {
  private ReportStatusType status;
  private ReportSubStatusType subStatus;
  private Date generationRequestedAt;
  private Date generationFinishedAt;
  private String _file;
  private Long estimatedGenerationTime;

  /**
   **/
  public ReportInfoDTO status(ReportStatusType status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("status")
  @NotNull public ReportStatusType getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(ReportStatusType status) {
    this.status = status;
  }

  /**
   **/
  public ReportInfoDTO subStatus(ReportSubStatusType subStatus) {
    this.subStatus = subStatus;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("subStatus")
  public ReportSubStatusType getSubStatus() {
    return subStatus;
  }

  @JsonProperty("subStatus")
  public void setSubStatus(ReportSubStatusType subStatus) {
    this.subStatus = subStatus;
  }

  /**
   * Дата и время запроса на генерацию.
   **/
  public ReportInfoDTO generationRequestedAt(Date generationRequestedAt) {
    this.generationRequestedAt = generationRequestedAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Дата и время запроса на генерацию.")
  @JsonProperty("generationRequestedAt")
  @NotNull public Date getGenerationRequestedAt() {
    return generationRequestedAt;
  }

  @JsonProperty("generationRequestedAt")
  public void setGenerationRequestedAt(Date generationRequestedAt) {
    this.generationRequestedAt = generationRequestedAt;
  }

  /**
   * Дата и время завершения генерации.
   **/
  public ReportInfoDTO generationFinishedAt(Date generationFinishedAt) {
    this.generationFinishedAt = generationFinishedAt;
    return this;
  }

  
  @ApiModelProperty(value = "Дата и время завершения генерации.")
  @JsonProperty("generationFinishedAt")
  public Date getGenerationFinishedAt() {
    return generationFinishedAt;
  }

  @JsonProperty("generationFinishedAt")
  public void setGenerationFinishedAt(Date generationFinishedAt) {
    this.generationFinishedAt = generationFinishedAt;
  }

  /**
   * Ссылка на готовый отчет.
   **/
  public ReportInfoDTO _file(String _file) {
    this._file = _file;
    return this;
  }

  
  @ApiModelProperty(value = "Ссылка на готовый отчет.")
  @JsonProperty("file")
  public String getFile() {
    return _file;
  }

  @JsonProperty("file")
  public void setFile(String _file) {
    this._file = _file;
  }

  /**
   * Ожидаемая продолжительность генерации в миллисекундах.
   **/
  public ReportInfoDTO estimatedGenerationTime(Long estimatedGenerationTime) {
    this.estimatedGenerationTime = estimatedGenerationTime;
    return this;
  }

  
  @ApiModelProperty(value = "Ожидаемая продолжительность генерации в миллисекундах.")
  @JsonProperty("estimatedGenerationTime")
  public Long getEstimatedGenerationTime() {
    return estimatedGenerationTime;
  }

  @JsonProperty("estimatedGenerationTime")
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

