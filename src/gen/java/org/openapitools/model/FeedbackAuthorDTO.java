package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.RegionDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация об авторе отзыва.  Если отзыв оставлен анонимно, параметр не возвращается. 
 **/
@ApiModel(description="Информация об авторе отзыва.  Если отзыв оставлен анонимно, параметр не возвращается. ")

public class FeedbackAuthorDTO  {
  
  @ApiModelProperty(value = "Имя автора отзыва.")
 /**
   * Имя автора отзыва.
  **/
  private String name;

  @ApiModelProperty(value = "")
  private RegionDTO region;
 /**
   * Имя автора отзыва.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FeedbackAuthorDTO name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get region
   * @return region
  **/
  @JsonProperty("region")
  public RegionDTO getRegion() {
    return region;
  }

  public void setRegion(RegionDTO region) {
    this.region = region;
  }

  public FeedbackAuthorDTO region(RegionDTO region) {
    this.region = region;
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
    FeedbackAuthorDTO feedbackAuthorDTO = (FeedbackAuthorDTO) o;
    return Objects.equals(this.name, feedbackAuthorDTO.name) &&
        Objects.equals(this.region, feedbackAuthorDTO.region);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, region);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedbackAuthorDTO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
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

