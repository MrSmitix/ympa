package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Ответ на запрос списка логинов, связанных с магазином.
 */

@Schema(name = "GetCampaignLoginsResponse", description = "Ответ на запрос списка логинов, связанных с магазином.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetCampaignLoginsResponse {

  @Valid
  private List<String> logins = new ArrayList<>();

  public GetCampaignLoginsResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetCampaignLoginsResponse(List<String> logins) {
    this.logins = logins;
  }

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
  @NotNull 
  @Schema(name = "logins", description = "Список логинов.", requiredMode = Schema.RequiredMode.REQUIRED)
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

