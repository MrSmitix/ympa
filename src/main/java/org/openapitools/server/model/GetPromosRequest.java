package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.MechanicsType;
import org.openapitools.server.model.PromoParticipationType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Фильтры для получения списка акций.
 */
public class GetPromosRequest   {

    private PromoParticipationType participation;
    private MechanicsType mechanics;

    /**
     * Default constructor.
     */
    public GetPromosRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create GetPromosRequest.
     *
     * @param participation participation
     * @param mechanics mechanics
     */
    public GetPromosRequest(
        PromoParticipationType participation, 
        MechanicsType mechanics
    ) {
        this.participation = participation;
        this.mechanics = mechanics;
    }



    /**
     * Get participation
     * @return participation
     */
    public PromoParticipationType getParticipation() {
        return participation;
    }

    public void setParticipation(PromoParticipationType participation) {
        this.participation = participation;
    }

    /**
     * Get mechanics
     * @return mechanics
     */
    public MechanicsType getMechanics() {
        return mechanics;
    }

    public void setMechanics(MechanicsType mechanics) {
        this.mechanics = mechanics;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetPromosRequest {\n");
        
        sb.append("    participation: ").append(toIndentedString(participation)).append("\n");
        sb.append("    mechanics: ").append(toIndentedString(mechanics)).append("\n");
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

