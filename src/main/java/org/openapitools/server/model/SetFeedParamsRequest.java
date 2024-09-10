package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.FeedParameterDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Запрос на обновление изменение параметров прайс-листа.
 */
public class SetFeedParamsRequest   {

    private List<@Valid FeedParameterDTO> parameters = new ArrayList<>();

    /**
     * Default constructor.
     */
    public SetFeedParamsRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create SetFeedParamsRequest.
     *
     * @param parameters Параметры прайс-листа.  Обязательный параметр. 
     */
    public SetFeedParamsRequest(
        List<@Valid FeedParameterDTO> parameters
    ) {
        this.parameters = parameters;
    }



    /**
     * Параметры прайс-листа.  Обязательный параметр. 
     * @return parameters
     */
    public List<@Valid FeedParameterDTO> getParameters() {
        return parameters;
    }

    public void setParameters(List<@Valid FeedParameterDTO> parameters) {
        this.parameters = parameters;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetFeedParamsRequest {\n");
        
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

