package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



/**
 * Ответ на запрос списка логинов, связанных с магазином.
 **/

@ApiModel(description = "Ответ на запрос списка логинов, связанных с магазином.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetCampaignLoginsResponse   {
  @JsonProperty("logins")
  private List<String> logins = new ArrayList<>();

  /**
   * Список логинов.
   **/
  public GetCampaignLoginsResponse logins(List<String> logins) {
    this.logins = logins;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список логинов.")
  @JsonProperty("logins")
  public List<String> getLogins() {
    return logins;
  }
  public void setLogins(List<String> logins) {
    this.logins = logins;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCampaignLoginsResponse getCampaignLoginsResponse = (GetCampaignLoginsResponse) o;
    return Objects.equals(logins, getCampaignLoginsResponse.logins);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logins);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCampaignLoginsResponse {\n");
    
    sb.append("    logins: ").append(toIndentedString(logins)).append("\n");
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

