package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация о страницах результатов.
 **/
@ApiModel(description="Информация о страницах результатов.")

public class ScrollingPagerDTO  {
  
  @ApiModelProperty(value = "Идентификатор следующей страницы результатов.")
 /**
   * Идентификатор следующей страницы результатов.
  **/
  private String nextPageToken;

  @ApiModelProperty(value = "Идентификатор предыдущей страницы результатов.")
 /**
   * Идентификатор предыдущей страницы результатов.
  **/
  private String prevPageToken;
 /**
   * Идентификатор следующей страницы результатов.
   * @return nextPageToken
  **/
  @JsonProperty("nextPageToken")
  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }

  public ScrollingPagerDTO nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

 /**
   * Идентификатор предыдущей страницы результатов.
   * @return prevPageToken
  **/
  @JsonProperty("prevPageToken")
  public String getPrevPageToken() {
    return prevPageToken;
  }

  public void setPrevPageToken(String prevPageToken) {
    this.prevPageToken = prevPageToken;
  }

  public ScrollingPagerDTO prevPageToken(String prevPageToken) {
    this.prevPageToken = prevPageToken;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

