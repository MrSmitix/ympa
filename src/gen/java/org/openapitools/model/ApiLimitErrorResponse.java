/*
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


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ApiErrorDTO;
import org.openapitools.model.ApiResponseStatusType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Превышено ограничение на доступ к ресурсу.
 */
@ApiModel(description = "Превышено ограничение на доступ к ресурсу.")
@JsonPropertyOrder({
  ApiLimitErrorResponse.JSON_PROPERTY_STATUS,
  ApiLimitErrorResponse.JSON_PROPERTY_ERRORS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-09-09T22:24:17.175492804Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ApiLimitErrorResponse   {
  public static final String JSON_PROPERTY_STATUS = "status";
  @JsonProperty(JSON_PROPERTY_STATUS)
  private ApiResponseStatusType status;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  @JsonProperty(JSON_PROPERTY_ERRORS)
  private List<@Valid ApiErrorDTO> errors;

  public ApiLimitErrorResponse status(ApiResponseStatusType status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @JsonProperty(value = "status")
  @ApiModelProperty(value = "")
  
  public ApiResponseStatusType getStatus() {
    return status;
  }

  public void setStatus(ApiResponseStatusType status) {
    this.status = status;
  }

  public ApiLimitErrorResponse errors(List<@Valid ApiErrorDTO> errors) {
    this.errors = errors;
    return this;
  }

  public ApiLimitErrorResponse addErrorsItem(ApiErrorDTO errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Список ошибок.
   * @return errors
   **/
  @JsonProperty(value = "errors")
  @ApiModelProperty(value = "Список ошибок.")
  @Valid 
  public List<@Valid ApiErrorDTO> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid ApiErrorDTO> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiLimitErrorResponse apiLimitErrorResponse = (ApiLimitErrorResponse) o;
    return Objects.equals(this.status, apiLimitErrorResponse.status) &&
        Objects.equals(this.errors, apiLimitErrorResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiLimitErrorResponse {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

