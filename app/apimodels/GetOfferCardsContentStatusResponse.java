package apimodels;

import apimodels.ApiResponseStatusType;
import apimodels.OfferCardsContentStatusDTO;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Ответ со списком состояний товаров и пагинацией.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GetOfferCardsContentStatusResponse   {
  @JsonProperty("status")
  @Valid

  private ApiResponseStatusType status;

  @JsonProperty("result")
  @Valid

  private OfferCardsContentStatusDTO result;

  public GetOfferCardsContentStatusResponse status(ApiResponseStatusType status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  public ApiResponseStatusType getStatus() {
    return status;
  }

  public void setStatus(ApiResponseStatusType status) {
    this.status = status;
  }

  public GetOfferCardsContentStatusResponse result(OfferCardsContentStatusDTO result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  public OfferCardsContentStatusDTO getResult() {
    return result;
  }

  public void setResult(OfferCardsContentStatusDTO result) {
    this.result = result;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOfferCardsContentStatusResponse getOfferCardsContentStatusResponse = (GetOfferCardsContentStatusResponse) o;
    return Objects.equals(status, getOfferCardsContentStatusResponse.status) &&
        Objects.equals(result, getOfferCardsContentStatusResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, result);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOfferCardsContentStatusResponse {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

