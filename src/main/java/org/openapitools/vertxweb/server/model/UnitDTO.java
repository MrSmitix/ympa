package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Единица измерения.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UnitDTO   {
  
  private Long id;
  private String name;
  private String fullName;

  public UnitDTO () {

  }

  public UnitDTO (Long id, String name, String fullName) {
    this.id = id;
    this.name = name;
    this.fullName = fullName;
  }

    
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("fullName")
  public String getFullName() {
    return fullName;
  }
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnitDTO unitDTO = (UnitDTO) o;
    return Objects.equals(id, unitDTO.id) &&
        Objects.equals(name, unitDTO.name) &&
        Objects.equals(fullName, unitDTO.fullName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, fullName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnitDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
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
