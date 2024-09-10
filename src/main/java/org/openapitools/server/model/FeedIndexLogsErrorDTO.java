package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.FeedIndexLogsErrorType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация об ошибке, произошедшей во время индексации прайс-листа.  Выводится, если во время индексации произошли ошибки (`index-log-record status=ERROR`). 
 */
public class FeedIndexLogsErrorDTO   {

    private Integer httpStatusCode;
    private FeedIndexLogsErrorType type;
    private String description;

    /**
     * Default constructor.
     */
    public FeedIndexLogsErrorDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create FeedIndexLogsErrorDTO.
     *
     * @param httpStatusCode HTTP-код ошибки индексации прайс-листа.  Выводится, если &#x60;type&#x3D;DOWNLOAD_HTTP_ERROR&#x60;. 
     * @param type type
     * @param description Описание ошибки.  Выводится, если &#x60;type&#x3D;DOWNLOAD_ERROR&#x60;. 
     */
    public FeedIndexLogsErrorDTO(
        Integer httpStatusCode, 
        FeedIndexLogsErrorType type, 
        String description
    ) {
        this.httpStatusCode = httpStatusCode;
        this.type = type;
        this.description = description;
    }



    /**
     * HTTP-код ошибки индексации прайс-листа.  Выводится, если `type=DOWNLOAD_HTTP_ERROR`. 
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    /**
     * Get type
     * @return type
     */
    public FeedIndexLogsErrorType getType() {
        return type;
    }

    public void setType(FeedIndexLogsErrorType type) {
        this.type = type;
    }

    /**
     * Описание ошибки.  Выводится, если `type=DOWNLOAD_ERROR`. 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FeedIndexLogsErrorDTO {\n");
        
        sb.append("    httpStatusCode: ").append(toIndentedString(httpStatusCode)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

