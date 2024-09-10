/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI document version: LATEST
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FeedParameterDTO;



/**
 * Запрос на обновление изменение параметров прайс-листа.
 */

@ApiModel(description = "Запрос на обновление изменение параметров прайс-листа.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class SetFeedParamsRequest   {
  
  private List<FeedParameterDTO> parameters = new ArrayList<>();

  /**
   * Параметры прайс-листа.  Обязательный параметр. 
   */
  public SetFeedParamsRequest parameters(List<FeedParameterDTO> parameters) {
    this.parameters = parameters;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Параметры прайс-листа.  Обязательный параметр. ")
  @JsonProperty("parameters")
  public List<FeedParameterDTO> getParameters() {
    return parameters;
  }
  public void setParameters(List<FeedParameterDTO> parameters) {
    this.parameters = parameters;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetFeedParamsRequest setFeedParamsRequest = (SetFeedParamsRequest) o;
    return Objects.equals(parameters, setFeedParamsRequest.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetFeedParamsRequest {\n");
    
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

