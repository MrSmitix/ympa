package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация о страницах результатов.
 */

@Schema(name = "ScrollingPagerDTO", description = "Информация о страницах результатов.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ScrollingPagerDTO {

  private String nextPageToken;

  private String prevPageToken;

  public ScrollingPagerDTO nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Идентификатор следующей страницы результатов.
   * @return nextPageToken
   */
  
  @Schema(name = "nextPageToken", description = "Идентификатор следующей страницы результатов.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nextPageToken")
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
   */
  
  @Schema(name = "prevPageToken", description = "Идентификатор предыдущей страницы результатов.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    return Objects.equals(this.nextPageToken, scrollingPagerDTO.nextPageToken) &&
        Objects.equals(this.prevPageToken, scrollingPagerDTO.prevPageToken);
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
