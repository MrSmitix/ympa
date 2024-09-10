package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.EnrichedModelDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Список моделей товаров.
 */
public class EnrichedModelsDTO   {

    private List<@Valid EnrichedModelDTO> models = new ArrayList<>();

    /**
     * Default constructor.
     */
    public EnrichedModelsDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create EnrichedModelsDTO.
     *
     * @param models Список моделей товаров.
     */
    public EnrichedModelsDTO(
        List<@Valid EnrichedModelDTO> models
    ) {
        this.models = models;
    }



    /**
     * Список моделей товаров.
     * @return models
     */
    public List<@Valid EnrichedModelDTO> getModels() {
        return models;
    }

    public void setModels(List<@Valid EnrichedModelDTO> models) {
        this.models = models;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnrichedModelsDTO {\n");
        
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

