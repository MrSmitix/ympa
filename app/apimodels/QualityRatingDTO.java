package apimodels;

import apimodels.QualityRatingComponentDTO;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация об индексе качества.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class QualityRatingDTO   {
  @JsonProperty("rating")
  @NotNull
@DecimalMin("0")
@DecimalMax("100")

  private Long rating;

  @JsonProperty("calculationDate")
  @NotNull
@Valid

  private LocalDate calculationDate;

  @JsonProperty("components")
  @NotNull
@Valid

  private List<@Valid QualityRatingComponentDTO> components = new ArrayList<>();

  public QualityRatingDTO rating(Long rating) {
    this.rating = rating;
    return this;
  }

   /**
   * Значение индекса качества.
   * minimum: 0
   * maximum: 100
   * @return rating
  **/
  public Long getRating() {
    return rating;
  }

  public void setRating(Long rating) {
    this.rating = rating;
  }

  public QualityRatingDTO calculationDate(LocalDate calculationDate) {
    this.calculationDate = calculationDate;
    return this;
  }

   /**
   * Дата вычисления.  Формат даты: `ГГГГ‑ММ‑ДД`. 
   * @return calculationDate
  **/
  public LocalDate getCalculationDate() {
    return calculationDate;
  }

  public void setCalculationDate(LocalDate calculationDate) {
    this.calculationDate = calculationDate;
  }

  public QualityRatingDTO components(List<@Valid QualityRatingComponentDTO> components) {
    this.components = components;
    return this;
  }

  public QualityRatingDTO addComponentsItem(QualityRatingComponentDTO componentsItem) {
    if (this.components == null) {
      this.components = new ArrayList<>();
    }
    this.components.add(componentsItem);
    return this;
  }

   /**
   * Составляющие индекса качества.
   * @return components
  **/
  public List<@Valid QualityRatingComponentDTO> getComponents() {
    return components;
  }

  public void setComponents(List<@Valid QualityRatingComponentDTO> components) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

