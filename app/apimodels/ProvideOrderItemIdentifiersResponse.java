package apimodels;

import apimodels.ApiResponseStatusType;
import apimodels.OrderItemsModificationResultDTO;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ProvideOrderItemIdentifiersResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ProvideOrderItemIdentifiersResponse   {
  @JsonProperty("status")
  @Valid

  private ApiResponseStatusType status;

  @JsonProperty("result")
  @Valid

  private OrderItemsModificationResultDTO result;

  public ProvideOrderItemIdentifiersResponse status(ApiResponseStatusType status) {
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

  public ProvideOrderItemIdentifiersResponse result(OrderItemsModificationResultDTO result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  public OrderItemsModificationResultDTO getResult() {
    return result;
  }

  public void setResult(OrderItemsModificationResultDTO result) {
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
    ProvideOrderItemIdentifiersResponse provideOrderItemIdentifiersResponse = (ProvideOrderItemIdentifiersResponse) o;
    return Objects.equals(status, provideOrderItemIdentifiersResponse.status) &&
        Objects.equals(result, provideOrderItemIdentifiersResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, result);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvideOrderItemIdentifiersResponse {\n");
    
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

