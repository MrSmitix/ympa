package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.OfferProcessingNoteDTO;
import org.openapitools.server.model.OfferProcessingStatusType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о статусе публикации товара на Маркете.
 */
public class OfferProcessingStateDTO   {

    private OfferProcessingStatusType status;
    private List<@Valid OfferProcessingNoteDTO> notes;

    /**
     * Default constructor.
     */
    public OfferProcessingStateDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OfferProcessingStateDTO.
     *
     * @param status status
     * @param notes Причины, по которым товар не прошел модерацию.
     */
    public OfferProcessingStateDTO(
        OfferProcessingStatusType status, 
        List<@Valid OfferProcessingNoteDTO> notes
    ) {
        this.status = status;
        this.notes = notes;
    }



    /**
     * Get status
     * @return status
     */
    public OfferProcessingStatusType getStatus() {
        return status;
    }

    public void setStatus(OfferProcessingStatusType status) {
        this.status = status;
    }

    /**
     * Причины, по которым товар не прошел модерацию.
     * @return notes
     */
    public List<@Valid OfferProcessingNoteDTO> getNotes() {
        return notes;
    }

    public void setNotes(List<@Valid OfferProcessingNoteDTO> notes) {
        this.notes = notes;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OfferProcessingStateDTO {\n");
        
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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

