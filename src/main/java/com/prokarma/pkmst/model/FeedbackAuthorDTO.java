package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.RegionDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Информация об авторе отзыва.  Если отзыв оставлен анонимно, параметр не возвращается. 
 */
@ApiModel(description = "Информация об авторе отзыва.  Если отзыв оставлен анонимно, параметр не возвращается. ")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class FeedbackAuthorDTO   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("region")
  private RegionDTO region;

  public FeedbackAuthorDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Имя автора отзыва.
   * @return name
   */
  @ApiModelProperty(value = "Имя автора отзыва.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FeedbackAuthorDTO region(RegionDTO region) {
    this.region = region;
    return this;
  }

  /**
   * Get region
   * @return region
   */
  @ApiModelProperty(value = "")
  public RegionDTO getRegion() {
    return region;
  }

  public void setRegion(RegionDTO region) {
    this.region = region;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

