package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
 */
public class GenerateReportDTO   {

    private String reportId;
    private Long estimatedGenerationTime;

    /**
     * Default constructor.
     */
    public GenerateReportDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create GenerateReportDTO.
     *
     * @param reportId Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
     * @param estimatedGenerationTime Ожидаемая продолжительность генерации в миллисекундах.
     */
    public GenerateReportDTO(
        String reportId, 
        Long estimatedGenerationTime
    ) {
        this.reportId = reportId;
        this.estimatedGenerationTime = estimatedGenerationTime;
    }



    /**
     * Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
     * @return reportId
     */
    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
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
    private static String toIndentedString(Object o) {
        if (o == null) {
          return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

