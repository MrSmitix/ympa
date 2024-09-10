package org.openapitools.server.model;

import org.openapitools.server.model.RegionDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация об авторе отзыва.  Если отзыв оставлен анонимно, параметр не возвращается. 
 */
public class FeedbackAuthorDTO   {

    private String name;
    private RegionDTO region;

    /**
     * Default constructor.
     */
    public FeedbackAuthorDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create FeedbackAuthorDTO.
     *
     * @param name Имя автора отзыва.
     * @param region region
     */
    public FeedbackAuthorDTO(
        String name, 
        RegionDTO region
    ) {
        this.name = name;
        this.region = region;
    }



    /**
     * Имя автора отзыва.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get region
     * @return region
     */
    public RegionDTO getRegion() {
        return region;
    }

    public void setRegion(RegionDTO region) {
        this.region = region;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FeedbackAuthorDTO {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
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

