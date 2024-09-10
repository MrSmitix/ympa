package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.openapitools.server.model.ReportStatusType;
import org.openapitools.server.model.ReportSubStatusType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Статус генерации и ссылка на готовый отчет.
 */
public class ReportInfoDTO   {

    private ReportStatusType status;
    private ReportSubStatusType subStatus;
    private OffsetDateTime generationRequestedAt;
    private OffsetDateTime generationFinishedAt;
    private String _file;
    private Long estimatedGenerationTime;

    /**
     * Default constructor.
     */
    public ReportInfoDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create ReportInfoDTO.
     *
     * @param status status
     * @param subStatus subStatus
     * @param generationRequestedAt Дата и время запроса на генерацию.
     * @param generationFinishedAt Дата и время завершения генерации.
     * @param _file Ссылка на готовый отчет.
     * @param estimatedGenerationTime Ожидаемая продолжительность генерации в миллисекундах.
     */
    public ReportInfoDTO(
        ReportStatusType status, 
        ReportSubStatusType subStatus, 
        OffsetDateTime generationRequestedAt, 
        OffsetDateTime generationFinishedAt, 
        String _file, 
        Long estimatedGenerationTime
    ) {
        this.status = status;
        this.subStatus = subStatus;
        this.generationRequestedAt = generationRequestedAt;
        this.generationFinishedAt = generationFinishedAt;
        this._file = _file;
        this.estimatedGenerationTime = estimatedGenerationTime;
    }



    /**
     * Get status
     * @return status
     */
    public ReportStatusType getStatus() {
        return status;
    }

    public void setStatus(ReportStatusType status) {
        this.status = status;
    }

    /**
     * Get subStatus
     * @return subStatus
     */
    public ReportSubStatusType getSubStatus() {
        return subStatus;
    }

    public void setSubStatus(ReportSubStatusType subStatus) {
        this.subStatus = subStatus;
    }

    /**
     * Дата и время запроса на генерацию.
     * @return generationRequestedAt
     */
    public OffsetDateTime getGenerationRequestedAt() {
        return generationRequestedAt;
    }

    public void setGenerationRequestedAt(OffsetDateTime generationRequestedAt) {
        this.generationRequestedAt = generationRequestedAt;
    }

    /**
     * Дата и время завершения генерации.
     * @return generationFinishedAt
     */
    public OffsetDateTime getGenerationFinishedAt() {
        return generationFinishedAt;
    }

    public void setGenerationFinishedAt(OffsetDateTime generationFinishedAt) {
        this.generationFinishedAt = generationFinishedAt;
    }

    /**
     * Ссылка на готовый отчет.
     * @return _file
     */
    public String getFile() {
        return _file;
    }

    public void setFile(String _file) {
        this._file = _file;
    }

    /**
     * Ожидаемая продолжительность генерации в миллисекундах.
     * @return estimatedGenerationTime
     */
    public Long getEstimatedGenerationTime() {
        return estimatedGenerationTime;
    }

    public void setEstimatedGenerationTime(Long estimatedGenerationTime) {
        this.estimatedGenerationTime = estimatedGenerationTime;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

