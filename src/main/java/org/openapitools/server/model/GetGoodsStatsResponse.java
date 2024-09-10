package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.ApiResponseStatusType;
import org.openapitools.server.model.GoodsStatsDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Ответ на запрос отчета по товарам.
 */
public class GetGoodsStatsResponse   {

    private ApiResponseStatusType status;
    private GoodsStatsDTO result;

    /**
     * Default constructor.
     */
    public GetGoodsStatsResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create GetGoodsStatsResponse.
     *
     * @param status status
     * @param result result
     */
    public GetGoodsStatsResponse(
        ApiResponseStatusType status, 
        GoodsStatsDTO result
    ) {
        this.status = status;
        this.result = result;
    }



    /**
     * Get status
     * @return status
     */
    public ApiResponseStatusType getStatus() {
        return status;
    }

    public void setStatus(ApiResponseStatusType status) {
        this.status = status;
    }

    /**
     * Get result
     * @return result
     */
    public GoodsStatsDTO getResult() {
        return result;
    }

    public void setResult(GoodsStatsDTO result) {
        this.result = result;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        if (o == null) {
          return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

