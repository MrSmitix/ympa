/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
 **/
@ApiModel(description = "Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.")
public class GenerateReportDTO {
  
  @SerializedName("reportId")
  private String reportId = null;
  @SerializedName("estimatedGenerationTime")
  private Long estimatedGenerationTime = null;

  /**
   * Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
   **/
  @ApiModelProperty(required = true, value = "Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.")
  public String getReportId() {
    return reportId;
  }
  public void setReportId(String reportId) {
    this.reportId = reportId;
  }

  /**
   * Ожидаемая продолжительность генерации в миллисекундах.
   **/
  @ApiModelProperty(required = true, value = "Ожидаемая продолжительность генерации в миллисекундах.")
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
    GenerateReportDTO generateReportDTO = (GenerateReportDTO) o;
    return (this.reportId == null ? generateReportDTO.reportId == null : this.reportId.equals(generateReportDTO.reportId)) &&
        (this.estimatedGenerationTime == null ? generateReportDTO.estimatedGenerationTime == null : this.estimatedGenerationTime.equals(generateReportDTO.estimatedGenerationTime));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.reportId == null ? 0: this.reportId.hashCode());
    result = 31 * result + (this.estimatedGenerationTime == null ? 0: this.estimatedGenerationTime.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateReportDTO {\n");
    
    sb.append("  reportId: ").append(reportId).append("\n");
    sb.append("  estimatedGenerationTime: ").append(estimatedGenerationTime).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
