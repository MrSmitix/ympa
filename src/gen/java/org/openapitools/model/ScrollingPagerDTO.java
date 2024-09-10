package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Информация о страницах результатов.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ScrollingPagerDTO   {
  
  private String nextPageToken;
  private String prevPageToken;

  /**
   * Идентификатор следующей страницы результатов.
   **/
  
  @ApiModelProperty(value = "Идентификатор следующей страницы результатов.")
  @JsonProperty("nextPageToken")
  public String getNextPageToken() {
    return nextPageToken;
  }
  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }

  /**
   * Идентификатор предыдущей страницы результатов.
   **/
  
  @ApiModelProperty(value = "Идентификатор предыдущей страницы результатов.")
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

