package apimodels;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Ответ на запрос списка логинов, связанных с магазином.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GetCampaignLoginsResponse   {
  @JsonProperty("logins")
  @NotNull

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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

