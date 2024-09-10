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

package org.openapitools.server.model;

import java.lang.reflect.Type;
import javax.json.bind.annotation.JsonbTypeDeserializer;
import javax.json.bind.annotation.JsonbTypeSerializer;
import javax.json.bind.serializer.DeserializationContext;
import javax.json.bind.serializer.JsonbDeserializer;
import javax.json.bind.serializer.JsonbSerializer;
import javax.json.bind.serializer.SerializationContext;
import javax.json.stream.JsonGenerator;
import javax.json.stream.JsonParser;
import javax.json.bind.annotation.JsonbProperty;

/**
  * Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
  */

public class GenerateReportDTO  {
  
 /**
  * Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
  */
  @JsonbProperty("reportId")
  private String reportId;

 /**
  * Ожидаемая продолжительность генерации в миллисекундах.
  */
  @JsonbProperty("estimatedGenerationTime")
  private Long estimatedGenerationTime;

  /**
   * Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
   * @return reportId
   **/
  public String getReportId() {
    return reportId;
  }

  /**
   * Set reportId
   */
  public void setReportId(String reportId) {
    this.reportId = reportId;
  }

  public GenerateReportDTO reportId(String reportId) {
    this.reportId = reportId;
    return this;
  }

  /**
   * Ожидаемая продолжительность генерации в миллисекундах.
   * @return estimatedGenerationTime
   **/
  public Long getEstimatedGenerationTime() {
    return estimatedGenerationTime;
  }

  /**
   * Set estimatedGenerationTime
   */
  public void setEstimatedGenerationTime(Long estimatedGenerationTime) {
    this.estimatedGenerationTime = estimatedGenerationTime;
  }

  public GenerateReportDTO estimatedGenerationTime(Long estimatedGenerationTime) {
    this.estimatedGenerationTime = estimatedGenerationTime;
    return this;
  }


  /**
   * Create a string representation of this pojo.
   */
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

