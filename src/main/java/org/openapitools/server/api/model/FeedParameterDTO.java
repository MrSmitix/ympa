package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Параметр прайс-листа.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeedParameterDTO   {
  
  private Boolean deleted;
  private String name;
  private List<Integer> values;

  public FeedParameterDTO () {

  }

  public FeedParameterDTO (Boolean deleted, String name, List<Integer> values) {
    this.deleted = deleted;
    this.name = name;
    this.values = values;
  }

    
  @JsonProperty("deleted")
  public Boolean getDeleted() {
    return deleted;
  }
  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("values")
  public List<Integer> getValues() {
    return values;
  }
  public void setValues(List<Integer> values) {
    this.values = values;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedParameterDTO feedParameterDTO = (FeedParameterDTO) o;
    return Objects.equals(deleted, feedParameterDTO.deleted) &&
        Objects.equals(name, feedParameterDTO.name) &&
        Objects.equals(values, feedParameterDTO.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleted, name, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedParameterDTO {\n");
    
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
