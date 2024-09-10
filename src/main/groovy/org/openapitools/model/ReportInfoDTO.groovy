package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ReportStatusType;
import org.openapitools.model.ReportSubStatusType;

@Canonical
class ReportInfoDTO {
    
    ReportStatusType status
    
    ReportSubStatusType subStatus
    /* Дата и время запроса на генерацию. */
    Date generationRequestedAt
    /* Дата и время завершения генерации. */
    Date generationFinishedAt
    /* Ссылка на готовый отчет. */
    String _file
    /* Ожидаемая продолжительность генерации в миллисекундах. */
    Long estimatedGenerationTime
}
