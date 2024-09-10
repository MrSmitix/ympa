package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Значение характеристики.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ParameterValueOptionDTO   {
  @JsonProperty("id")
  @NotNull

  private Long id;

  @JsonProperty("value")
  @NotNull

  private String value;

  @JsonProperty("description")
  
  private String description;

  public ParameterValueOptionDTO id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Идентификатор значения.
   * @return id
  **/
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ParameterValueOptionDTO value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Значение.
   * @return value
  **/
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public ParameterValueOptionDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Описание значения.
   * @return description
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

