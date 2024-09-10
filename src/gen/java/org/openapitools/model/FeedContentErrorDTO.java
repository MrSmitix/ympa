package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.FeedContentErrorType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация об ошибке в содержимом прайс-листа. Выводится, если параметр `content status=ERROR`. 
 **/
@ApiModel(description="Информация об ошибке в содержимом прайс-листа. Выводится, если параметр `content status=ERROR`. ")

public class FeedContentErrorDTO  {
  
  @ApiModelProperty(value = "")
  private FeedContentErrorType type;
 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public FeedContentErrorType getType() {
    return type;
  }

  public void setType(FeedContentErrorType type) {
    this.type = type;
  }

  public FeedContentErrorDTO type(FeedContentErrorType type) {
    this.type = type;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedContentErrorDTO feedContentErrorDTO = (FeedContentErrorDTO) o;
    return Objects.equals(this.type, feedContentErrorDTO.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedContentErrorDTO {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

