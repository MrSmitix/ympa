package org.openapitools.server.model;

import org.openapitools.server.model.FullOutletDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Ответ на запрос информации о точке продаж.
 */
public class GetOutletResponse   {

    private FullOutletDTO outlet;

    /**
     * Default constructor.
     */
    public GetOutletResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create GetOutletResponse.
     *
     * @param outlet outlet
     */
    public GetOutletResponse(
        FullOutletDTO outlet
    ) {
        this.outlet = outlet;
    }



    /**
     * Get outlet
     * @return outlet
     */
    public FullOutletDTO getOutlet() {
        return outlet;
    }

    public void setOutlet(FullOutletDTO outlet) {
        this.outlet = outlet;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetOutletResponse {\n");
        
        sb.append("    outlet: ").append(toIndentedString(outlet)).append("\n");
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

