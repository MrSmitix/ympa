package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Date;
import org.openapitools.model.ReportStatusType;
import org.openapitools.model.ReportSubStatusType;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Статус генерации и ссылка на готовый отчет.
 */

@Schema(name = "ReportInfoDTO", description = "Статус генерации и ссылка на готовый отчет.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ReportInfoDTO {

  private ReportStatusType status;

  private ReportSubStatusType subStatus;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date generationRequestedAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date generationFinishedAt;

  private String file;

  private Long estimatedGenerationTime;

  public ReportInfoDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ReportInfoDTO(ReportStatusType status, Date generationRequestedAt) {
    this.status = status;
    this.generationRequestedAt = generationRequestedAt;
  }

  public ReportInfoDTO status(ReportStatusType status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @NotNull @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
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
   */
  @Valid 
  @Schema(name = "subStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subStatus")
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
   */
  @NotNull @Valid 
  @Schema(name = "generationRequestedAt", description = "Дата и время запроса на генерацию.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("generationRequestedAt")
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
   */
  @Valid 
  @Schema(name = "generationFinishedAt", description = "Дата и время завершения генерации.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("generationFinishedAt")
  public Date getGenerationFinishedAt() {
    return generationFinishedAt;
  }

  public void setGenerationFinishedAt(Date generationFinishedAt) {
    this.generationFinishedAt = generationFinishedAt;
  }

  public ReportInfoDTO file(String file) {
    this.file = file;
    return this;
  }

  /**
   * Ссылка на готовый отчет.
   * @return file
   */
  
  @Schema(name = "file", description = "Ссылка на готовый отчет.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("file")
  public String getFile() {
    return file;
  }

  public void setFile(String file) {
    this.file = file;
  }

  public ReportInfoDTO estimatedGenerationTime(Long estimatedGenerationTime) {
    this.estimatedGenerationTime = estimatedGenerationTime;
    return this;
  }

  /**
   * Ожидаемая продолжительность генерации в миллисекундах.
   * @return estimatedGenerationTime
   */
  
  @Schema(name = "estimatedGenerationTime", description = "Ожидаемая продолжительность генерации в миллисекундах.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    return Objects.equals(this.status, reportInfoDTO.status) &&
        Objects.equals(this.subStatus, reportInfoDTO.subStatus) &&
        Objects.equals(this.generationRequestedAt, reportInfoDTO.generationRequestedAt) &&
        Objects.equals(this.generationFinishedAt, reportInfoDTO.generationFinishedAt) &&
        Objects.equals(this.file, reportInfoDTO.file) &&
        Objects.equals(this.estimatedGenerationTime, reportInfoDTO.estimatedGenerationTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, subStatus, generationRequestedAt, generationFinishedAt, file, estimatedGenerationTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportInfoDTO {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subStatus: ").append(toIndentedString(subStatus)).append("\n");
    sb.append("    generationRequestedAt: ").append(toIndentedString(generationRequestedAt)).append("\n");
    sb.append("    generationFinishedAt: ").append(toIndentedString(generationFinishedAt)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
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

