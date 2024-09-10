package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.joda.time.LocalDate;
import org.openapitools.model.QualityRatingComponentDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация об индексе качества.
 */
@ApiModel(description="Информация об индексе качества.")

public class QualityRatingDTO  {
  
 /**
  * Значение индекса качества.
  */
  @ApiModelProperty(required = true, value = "Значение индекса качества.")
  private Long rating;

 /**
  * Дата вычисления.  Формат даты: `ГГГГ‑ММ‑ДД`. 
  */
  @ApiModelProperty(required = true, value = "Дата вычисления.  Формат даты: `ГГГГ‑ММ‑ДД`. ")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private LocalDate calculationDate;

 /**
  * Составляющие индекса качества.
  */
  @ApiModelProperty(required = true, value = "Составляющие индекса качества.")
  @Valid
  private List<@Valid QualityRatingComponentDTO> components = new ArrayList<>();
 /**
  * Значение индекса качества.
  * minimum: 0
  * maximum: 100
  * @return rating
  */
  @JsonProperty("rating")
  @NotNull
 @Min(0L) @Max(100L)  public Long getRating() {
    return rating;
  }

  /**
   * Sets the <code>rating</code> property.
   */
 public void setRating(Long rating) {
    this.rating = rating;
  }

  /**
   * Sets the <code>rating</code> property.
   */
  public QualityRatingDTO rating(Long rating) {
    this.rating = rating;
    return this;
  }

 /**
  * Дата вычисления.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;. 
  * @return calculationDate
  */
  @JsonProperty("calculationDate")
  @NotNull
  public LocalDate getCalculationDate() {
    return calculationDate;
  }

  /**
   * Sets the <code>calculationDate</code> property.
   */
 public void setCalculationDate(LocalDate calculationDate) {
    this.calculationDate = calculationDate;
  }

  /**
   * Sets the <code>calculationDate</code> property.
   */
  public QualityRatingDTO calculationDate(LocalDate calculationDate) {
    this.calculationDate = calculationDate;
    return this;
  }

 /**
  * Составляющие индекса качества.
  * @return components
  */
  @JsonProperty("components")
  @NotNull
  public List<@Valid QualityRatingComponentDTO> getComponents() {
    return components;
  }

  /**
   * Sets the <code>components</code> property.
   */
 public void setComponents(List<@Valid QualityRatingComponentDTO> components) {
    this.components = components;
  }

  /**
   * Sets the <code>components</code> property.
   */
  public QualityRatingDTO components(List<@Valid QualityRatingComponentDTO> components) {
    this.components = components;
    return this;
  }

  /**
   * Adds a new item to the <code>components</code> list.
   */
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

