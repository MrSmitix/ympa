package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Значение характеристики.
 **/

@ApiModel(description = "Значение характеристики.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ParameterValueOptionDTO   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("value")
  private String value;

  @JsonProperty("description")
  private String description;

  /**
   * Идентификатор значения.
   **/
  public ParameterValueOptionDTO id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор значения.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Значение.
   **/
  public ParameterValueOptionDTO value(String value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Значение.")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * Описание значения.
   **/
  public ParameterValueOptionDTO description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "Описание значения.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParameterValueOptionDTO parameterValueOptionDTO = (ParameterValueOptionDTO) o;
    return Objects.equals(id, parameterValueOptionDTO.id) &&
        Objects.equals(value, parameterValueOptionDTO.value) &&
        Objects.equals(description, parameterValueOptionDTO.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, value, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParameterValueOptionDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

