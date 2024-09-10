package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.joda.time.LocalDate;
import org.openapitools.model.QualityRatingComponentDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Информация об индексе качества.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Информация об индексе качества.")
public class QualityRatingDTO   {
  
  private Long rating;

  private LocalDate calculationDate;

  private List<@Valid QualityRatingComponentDTO> components = new ArrayList<>();

  /**
   * Значение индекса качества.
   * minimum: 0
   * maximum: 100
   **/
  public QualityRatingDTO rating(Long rating) {
    this.rating = rating;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Значение индекса качества.")
  @JsonProperty("rating")
  @NotNull
 @Min(0L) @Max(100L)  public Long getRating() {
    return rating;
  }
  public void setRating(Long rating) {
    this.rating = rating;
  }


  /**
   * Дата вычисления.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;. 
   **/
  public QualityRatingDTO calculationDate(LocalDate calculationDate) {
    this.calculationDate = calculationDate;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Дата вычисления.  Формат даты: `ГГГГ‑ММ‑ДД`. ")
  @JsonProperty("calculationDate")
  @NotNull
  public LocalDate getCalculationDate() {
    return calculationDate;
  }
  public void setCalculationDate(LocalDate calculationDate) {
    this.calculationDate = calculationDate;
  }


  /**
   * Составляющие индекса качества.
   **/
  public QualityRatingDTO components(List<@Valid QualityRatingComponentDTO> components) {
    this.components = components;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Составляющие индекса качества.")
  @JsonProperty("components")
  @NotNull
  public List<@Valid QualityRatingComponentDTO> getComponents() {
    return components;
  }
  public void setComponents(List<@Valid QualityRatingComponentDTO> components) {
    this.components = components;
  }

  public QualityRatingDTO addComponentsItem(QualityRatingComponentDTO componentsItem) {
    if (this.components == null) {
      this.components = new ArrayList<>();
    }
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

