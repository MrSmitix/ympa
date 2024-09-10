package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Ответ на запрос списка логинов, связанных с магазином.
 */
@ApiModel(description="Ответ на запрос списка логинов, связанных с магазином.")

public class GetCampaignLoginsResponse  {
  
 /**
  * Список логинов.
  */
  @ApiModelProperty(required = true, value = "Список логинов.")
  private List<String> logins = new ArrayList<>();
 /**
  * Список логинов.
  * @return logins
  */
  @JsonProperty("logins")
  @NotNull
  public List<String> getLogins() {
    return logins;
  }

  /**
   * Sets the <code>logins</code> property.
   */
 public void setLogins(List<String> logins) {
    this.logins = logins;
  }

  /**
   * Sets the <code>logins</code> property.
   */
  public GetCampaignLoginsResponse logins(List<String> logins) {
    this.logins = logins;
    return this;
  }

  /**
   * Adds a new item to the <code>logins</code> list.
   */
  public GetCampaignLoginsResponse addLoginsItem(String loginsItem) {
    this.logins.add(loginsItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

