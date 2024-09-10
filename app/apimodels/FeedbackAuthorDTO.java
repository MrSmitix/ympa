package apimodels;

import apimodels.RegionDTO;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация об авторе отзыва.  Если отзыв оставлен анонимно, параметр не возвращается. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class FeedbackAuthorDTO   {
  @JsonProperty("name")
  
  private String name;

  @JsonProperty("region")
  @Valid

  private RegionDTO region;

  public FeedbackAuthorDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Имя автора отзыва.
   * @return name
  **/
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
  **/
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
    return Objects.equals(name, feedbackAuthorDTO.name) &&
        Objects.equals(region, feedbackAuthorDTO.region);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, region);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

