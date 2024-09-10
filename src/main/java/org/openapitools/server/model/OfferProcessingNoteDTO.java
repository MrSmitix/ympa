package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.OfferProcessingNoteType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Причины, по которым товар не прошел модерацию.
 */
public class OfferProcessingNoteDTO   {

    private OfferProcessingNoteType type;
    private String payload;

    /**
     * Default constructor.
     */
    public OfferProcessingNoteDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OfferProcessingNoteDTO.
     *
     * @param type type
     * @param payload Дополнительная информация о причине отклонения товара. 
     */
    public OfferProcessingNoteDTO(
        OfferProcessingNoteType type, 
        String payload
    ) {
        this.type = type;
        this.payload = payload;
    }



    /**
     * Get type
     * @return type
     */
    public OfferProcessingNoteType getType() {
        return type;
    }

    public void setType(OfferProcessingNoteType type) {
        this.type = type;
    }

    /**
     * Дополнительная информация о причине отклонения товара. 
     * @return payload
     */
    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OfferProcessingNoteDTO {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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

