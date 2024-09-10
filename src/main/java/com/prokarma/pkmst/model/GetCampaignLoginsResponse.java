package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Ответ на запрос списка логинов, связанных с магазином.
 */
@ApiModel(description = "Ответ на запрос списка логинов, связанных с магазином.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetCampaignLoginsResponse   {
  @JsonProperty("logins")
  
  private List<String> logins = new ArrayList<>();

  public GetCampaignLoginsResponse logins(List<String> logins) {
    this.logins = logins;
    return this;
  }

  public GetCampaignLoginsResponse addLoginsItem(String loginsItem) {
    if (this.logins == null) {
      this.logins = new ArrayList<>();
    }
    this.logins.add(loginsItem);
    return this;
  }

  /**
   * Список логинов.
   * @return logins
   */
  @ApiModelProperty(required = true, value = "Список логинов.")
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
    return Objects.equals(this.logins, getCampaignLoginsResponse.logins);
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

