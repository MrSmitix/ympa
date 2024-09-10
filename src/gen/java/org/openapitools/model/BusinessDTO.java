package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Информация о кабинете.
 */
@ApiModel(description = "Информация о кабинете.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-09-09T22:21:22.142726883Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class BusinessDTO   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  public BusinessDTO id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Идентификатор кабинета.
   * @return id
  **/
  @ApiModelProperty(value = "Идентификатор кабинета.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public BusinessDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Название бизнеса.
   * @return name
  **/
  @ApiModelProperty(value = "Название бизнеса.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessDTO businessDTO = (BusinessDTO) o;
    return Objects.equals(this.id, businessDTO.id) &&
        Objects.equals(this.name, businessDTO.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

