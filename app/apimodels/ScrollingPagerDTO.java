package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация о страницах результатов.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ScrollingPagerDTO   {
  @JsonProperty("nextPageToken")
  
  private String nextPageToken;

  @JsonProperty("prevPageToken")
  
  private String prevPageToken;

  public ScrollingPagerDTO nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

   /**
   * Идентификатор следующей страницы результатов.
   * @return nextPageToken
  **/
  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }

  public ScrollingPagerDTO prevPageToken(String prevPageToken) {
    this.prevPageToken = prevPageToken;
    return this;
  }

   /**
   * Идентификатор предыдущей страницы результатов.
   * @return prevPageToken
  **/
  public String getPrevPageToken() {
    return prevPageToken;
  }

  public void setPrevPageToken(String prevPageToken) {
    this.prevPageToken = prevPageToken;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScrollingPagerDTO scrollingPagerDTO = (ScrollingPagerDTO) o;
    return Objects.equals(nextPageToken, scrollingPagerDTO.nextPageToken) &&
        Objects.equals(prevPageToken, scrollingPagerDTO.prevPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, prevPageToken);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScrollingPagerDTO {\n");
    
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("    prevPageToken: ").append(toIndentedString(prevPageToken)).append("\n");
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

