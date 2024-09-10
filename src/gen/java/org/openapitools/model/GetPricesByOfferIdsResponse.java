package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.ApiResponseStatusType;
import org.openapitools.model.OfferPriceByOfferIdsListResponseDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Ответ на запрос списка цен.
 **/
@ApiModel(description="Ответ на запрос списка цен.")

public class GetPricesByOfferIdsResponse  {
  
  @ApiModelProperty(value = "")
  private ApiResponseStatusType status;

  @ApiModelProperty(value = "")
  private OfferPriceByOfferIdsListResponseDTO result;
 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public ApiResponseStatusType getStatus() {
    return status;
  }

  public void setStatus(ApiResponseStatusType status) {
    this.status = status;
  }

  public GetPricesByOfferIdsResponse status(ApiResponseStatusType status) {
    this.status = status;
    return this;
  }

 /**
   * Get result
   * @return result
  **/
  @JsonProperty("result")
  public OfferPriceByOfferIdsListResponseDTO getResult() {
    return result;
  }

  public void setResult(OfferPriceByOfferIdsListResponseDTO result) {
    this.result = result;
  }

  public GetPricesByOfferIdsResponse result(OfferPriceByOfferIdsListResponseDTO result) {
    this.result = result;
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
    GetPricesByOfferIdsResponse getPricesByOfferIdsResponse = (GetPricesByOfferIdsResponse) o;
    return Objects.equals(this.status, getPricesByOfferIdsResponse.status) &&
        Objects.equals(this.result, getPricesByOfferIdsResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPricesByOfferIdsResponse {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

