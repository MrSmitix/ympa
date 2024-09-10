package org.openapitools.server.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.QualityRatingComponentDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация об индексе качества.
 */
public class QualityRatingDTO   {

    private Long rating;
    private LocalDate calculationDate;
    private List<@Valid QualityRatingComponentDTO> components = new ArrayList<>();

    /**
     * Default constructor.
     */
    public QualityRatingDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create QualityRatingDTO.
     *
     * @param rating Значение индекса качества.
     * @param calculationDate Дата вычисления.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;. 
     * @param components Составляющие индекса качества.
     */
    public QualityRatingDTO(
        Long rating, 
        LocalDate calculationDate, 
        List<@Valid QualityRatingComponentDTO> components
    ) {
        this.rating = rating;
        this.calculationDate = calculationDate;
        this.components = components;
    }



    /**
     * Значение индекса качества.
     * minimum: 0
     * maximum: 100
     * @return rating
     */
    public Long getRating() {
        return rating;
    }

    public void setRating(Long rating) {
        this.rating = rating;
    }

    /**
     * Дата вычисления.  Формат даты: `ГГГГ‑ММ‑ДД`. 
     * @return calculationDate
     */
    public LocalDate getCalculationDate() {
        return calculationDate;
    }

    public void setCalculationDate(LocalDate calculationDate) {
        this.calculationDate = calculationDate;
    }

    /**
     * Составляющие индекса качества.
     * @return components
     */
    public List<@Valid QualityRatingComponentDTO> getComponents() {
        return components;
    }

    public void setComponents(List<@Valid QualityRatingComponentDTO> components) {
        this.components = components;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QualityRatingDTO {\n");
        
        sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
        sb.append("    calculationDate: ").append(toIndentedString(calculationDate)).append("\n");
        sb.append("    components: ").append(toIndentedString(components)).append("\n");
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

