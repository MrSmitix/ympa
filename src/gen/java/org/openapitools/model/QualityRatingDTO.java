package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.joda.time.LocalDate;
import org.openapitools.model.QualityRatingComponentDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация об индексе качества.
 **/
@ApiModel(description="Информация об индексе качества.")

public class QualityRatingDTO  {
  
  @ApiModelProperty(required = true, value = "Значение индекса качества.")
 /**
   * Значение индекса качества.
  **/
  private Long rating;

  @ApiModelProperty(required = true, value = "Дата вычисления.  Формат даты: `ГГГГ‑ММ‑ДД`. ")
 /**
   * Дата вычисления.  Формат даты: `ГГГГ‑ММ‑ДД`. 
  **/
  private LocalDate calculationDate;

  @ApiModelProperty(required = true, value = "Составляющие индекса качества.")
 /**
   * Составляющие индекса качества.
  **/
  private List<QualityRatingComponentDTO> components = new ArrayList<>();
 /**
   * Значение индекса качества.
   * minimum: 0
   * maximum: 100
   * @return rating
  **/
  @JsonProperty("rating")
  public Long getRating() {
    return rating;
  }

  public void setRating(Long rating) {
    this.rating = rating;
  }

  public QualityRatingDTO rating(Long rating) {
    this.rating = rating;
    return this;
  }

 /**
   * Дата вычисления.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;. 
   * @return calculationDate
  **/
  @JsonProperty("calculationDate")
  public LocalDate getCalculationDate() {
    return calculationDate;
  }

  public void setCalculationDate(LocalDate calculationDate) {
    this.calculationDate = calculationDate;
  }

  public QualityRatingDTO calculationDate(LocalDate calculationDate) {
    this.calculationDate = calculationDate;
    return this;
  }

 /**
   * Составляющие индекса качества.
   * @return components
  **/
  @JsonProperty("components")
  public List<QualityRatingComponentDTO> getComponents() {
    return components;
  }

  public void setComponents(List<QualityRatingComponentDTO> components) {
    this.components = components;
  }

  public QualityRatingDTO components(List<QualityRatingComponentDTO> components) {
    this.components = components;
    return this;
  }

  public QualityRatingDTO addComponentsItem(QualityRatingComponentDTO componentsItem) {
    this.components.add(componentsItem);
    return this;
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
    return Objects.equals(this.rating, qualityRatingDTO.rating) &&
        Objects.equals(this.calculationDate, qualityRatingDTO.calculationDate) &&
        Objects.equals(this.components, qualityRatingDTO.components);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

