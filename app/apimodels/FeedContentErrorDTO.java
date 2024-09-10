package apimodels;

import apimodels.FeedContentErrorType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация об ошибке в содержимом прайс-листа. Выводится, если параметр &#x60;content status&#x3D;ERROR&#x60;. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class FeedContentErrorDTO   {
  @JsonProperty("type")
  @Valid

  private FeedContentErrorType type;

  public FeedContentErrorDTO type(FeedContentErrorType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  public FeedContentErrorType getType() {
    return type;
  }

  public void setType(FeedContentErrorType type) {
    this.type = type;
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
    return Objects.equals(type, feedContentErrorDTO.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

