package apimodels;

import apimodels.FeedDownloadErrorType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация об ошибке при загрузке прайс-листа. Выводится, если параметр &#x60;download status&#x3D;ERROR&#x60;. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class FeedDownloadErrorDTO   {
  @JsonProperty("httpStatusCode")
  
  private Integer httpStatusCode;

  @JsonProperty("type")
  @Valid

  private FeedDownloadErrorType type;

  @JsonProperty("description")
  
  private String description;

  public FeedDownloadErrorDTO httpStatusCode(Integer httpStatusCode) {
    this.httpStatusCode = httpStatusCode;
    return this;
  }

   /**
   * HTTP-код ошибки индексации прайс-листа. Выводится, если `type=DOWNLOAD_HTTP_ERROR`. 
   * @return httpStatusCode
  **/
  public Integer getHttpStatusCode() {
    return httpStatusCode;
  }

  public void setHttpStatusCode(Integer httpStatusCode) {
    this.httpStatusCode = httpStatusCode;
  }

  public FeedDownloadErrorDTO type(FeedDownloadErrorType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  public FeedDownloadErrorType getType() {
    return type;
  }

  public void setType(FeedDownloadErrorType type) {
    this.type = type;
  }

  public FeedDownloadErrorDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Описание ошибки. Выводится, если `type=DOWNLOAD_ERROR`. 
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
    FeedDownloadErrorDTO feedDownloadErrorDTO = (FeedDownloadErrorDTO) o;
    return Objects.equals(httpStatusCode, feedDownloadErrorDTO.httpStatusCode) &&
        Objects.equals(type, feedDownloadErrorDTO.type) &&
        Objects.equals(description, feedDownloadErrorDTO.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(httpStatusCode, type, description);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedDownloadErrorDTO {\n");
    
    sb.append("    httpStatusCode: ").append(toIndentedString(httpStatusCode)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

