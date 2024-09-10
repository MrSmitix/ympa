package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Ответ на запрос списка логинов, связанных с магазином.
 **/
@ApiModel(description = "Ответ на запрос списка логинов, связанных с магазином.")
@JsonTypeName("GetCampaignLoginsResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetCampaignLoginsResponse   {
  private @Valid List<String> logins = new ArrayList<>();

  /**
   * Список логинов.
   **/
  public GetCampaignLoginsResponse logins(List<String> logins) {
    this.logins = logins;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список логинов.")
  @JsonProperty("logins")
  @NotNull public List<String> getLogins() {
    return logins;
  }

  @JsonProperty("logins")
  public void setLogins(List<String> logins) {
    this.logins = logins;
  }

  public GetCampaignLoginsResponse addLoginsItem(String loginsItem) {
    if (this.logins == null) {
      this.logins = new ArrayList<>();
    }

    this.logins.add(loginsItem);
    return this;
  }

  public GetCampaignLoginsResponse removeLoginsItem(String loginsItem) {
    if (loginsItem != null && this.logins != null) {
      this.logins.remove(loginsItem);
    }

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

