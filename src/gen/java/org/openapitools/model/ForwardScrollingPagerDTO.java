package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Ссылка на следующую страницу. 
 **/
@ApiModel(description="Ссылка на следующую страницу. ")

public class ForwardScrollingPagerDTO  {
  
  @ApiModelProperty(value = "Идентификатор следующей страницы результатов.")
 /**
   * Идентификатор следующей страницы результатов.
  **/
  private String nextPageToken;
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

  public ForwardScrollingPagerDTO nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
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
    ForwardScrollingPagerDTO forwardScrollingPagerDTO = (ForwardScrollingPagerDTO) o;
    return Objects.equals(this.nextPageToken, forwardScrollingPagerDTO.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForwardScrollingPagerDTO {\n");
    
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
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

