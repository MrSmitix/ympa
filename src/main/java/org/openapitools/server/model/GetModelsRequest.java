package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Запрос информации о моделях.
 */
public class GetModelsRequest   {

    private List<@Min(0L)Long> models = new ArrayList<>();

    /**
     * Default constructor.
     */
    public GetModelsRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create GetModelsRequest.
     *
     * @param models Список моделей.
     */
    public GetModelsRequest(
        List<@Min(0L)Long> models
    ) {
        this.models = models;
    }



    /**
     * Список моделей.
     * @return models
     */
    public List<@Min(0L)Long> getModels() {
        return models;
    }

    public void setModels(List<@Min(0L)Long> models) {
        this.models = models;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetModelsRequest {\n");
        
        sb.append("    models: ").append(toIndentedString(models)).append("\n");
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

