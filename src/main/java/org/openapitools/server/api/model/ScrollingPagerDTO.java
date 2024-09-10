package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Информация о страницах результатов.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ScrollingPagerDTO   {
  
  private String nextPageToken;
  private String prevPageToken;

  public ScrollingPagerDTO () {

  }

  public ScrollingPagerDTO (String nextPageToken, String prevPageToken) {
    this.nextPageToken = nextPageToken;
    this.prevPageToken = prevPageToken;
  }

    
  @JsonProperty("nextPageToken")
  public String getNextPageToken() {
    return nextPageToken;
  }
  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }

    
  @JsonProperty("prevPageToken")
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
