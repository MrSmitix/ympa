package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class GenerateReportDTO {
    /* Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета. */
    String reportId
    /* Ожидаемая продолжительность генерации в миллисекундах. */
    Long estimatedGenerationTime
}
