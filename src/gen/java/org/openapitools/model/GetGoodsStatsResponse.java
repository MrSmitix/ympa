package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ApiResponseStatusType;
import org.openapitools.model.GoodsStatsDTO;



/**
 * Ответ на запрос отчета по товарам.
 **/

@ApiModel(description = "Ответ на запрос отчета по товарам.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetGoodsStatsResponse   {
  @JsonProperty("status")
  private ApiResponseStatusType status;

  @JsonProperty("result")
  private GoodsStatsDTO result;

  /**
   **/
  public GetGoodsStatsResponse status(ApiResponseStatusType status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public ApiResponseStatusType getStatus() {
    return status;
  }
  public void setStatus(ApiResponseStatusType status) {
    this.status = status;
  }

  /**
   **/
  public GetGoodsStatsResponse result(GoodsStatsDTO result) {
    this.result = result;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("result")
  public GoodsStatsDTO getResult() {
    return result;
  }
  public void setResult(GoodsStatsDTO result) {
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
    GetGoodsStatsResponse getGoodsStatsResponse = (GetGoodsStatsResponse) o;
    return Objects.equals(status, getGoodsStatsResponse.status) &&
        Objects.equals(result, getGoodsStatsResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGoodsStatsResponse {\n");
    
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

