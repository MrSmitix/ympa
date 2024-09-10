package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Ссылка на следующую страницу. 
 */
@ApiModel(description = "Ссылка на следующую страницу. ")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ForwardScrollingPagerDTO   {
  @JsonProperty("nextPageToken")
  private String nextPageToken;

  public ForwardScrollingPagerDTO nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Идентификатор следующей страницы результатов.
   * @return nextPageToken
   */
  @ApiModelProperty(value = "Идентификатор следующей страницы результатов.")
  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

