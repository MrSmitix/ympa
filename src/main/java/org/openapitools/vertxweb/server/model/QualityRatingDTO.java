package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.QualityRatingComponentDTO;

/**
 * Информация об индексе качества.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class QualityRatingDTO   {
  
  private Long rating;
  private LocalDate calculationDate;
  private List<QualityRatingComponentDTO> components = new ArrayList<>();

  public QualityRatingDTO () {

  }

  public QualityRatingDTO (Long rating, LocalDate calculationDate, List<QualityRatingComponentDTO> components) {
    this.rating = rating;
    this.calculationDate = calculationDate;
    this.components = components;
  }

    
  @JsonProperty("rating")
  public Long getRating() {
    return rating;
  }
  public void setRating(Long rating) {
    this.rating = rating;
  }

    
  @JsonProperty("calculationDate")
  public LocalDate getCalculationDate() {
    return calculationDate;
  }
  public void setCalculationDate(LocalDate calculationDate) {
    this.calculationDate = calculationDate;
  }

    
  @JsonProperty("components")
  public List<QualityRatingComponentDTO> getComponents() {
    return components;
  }
  public void setComponents(List<QualityRatingComponentDTO> components) {
    this.components = components;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QualityRatingDTO qualityRatingDTO = (QualityRatingDTO) o;
    return Objects.equals(rating, qualityRatingDTO.rating) &&
        Objects.equals(calculationDate, qualityRatingDTO.calculationDate) &&
        Objects.equals(components, qualityRatingDTO.components);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rating, calculationDate, components);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
