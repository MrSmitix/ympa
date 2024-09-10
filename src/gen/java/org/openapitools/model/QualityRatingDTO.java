package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openapitools.model.QualityRatingComponentDTO;

/**
 * Информация об индексе качества.
 */
@ApiModel(description = "Информация об индексе качества.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-09-09T22:21:22.142726883Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class QualityRatingDTO   {
  @JsonProperty("rating")
  private Long rating;

  @JsonProperty("calculationDate")
  private Date calculationDate;

  @JsonProperty("components")
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
  @ApiModelProperty(required = true, value = "Значение индекса качества.")
  public Long getRating() {
    return rating;
  }

  public void setRating(Long rating) {
    this.rating = rating;
  }

  public QualityRatingDTO calculationDate(Date calculationDate) {
    this.calculationDate = calculationDate;
    return this;
  }

   /**
   * Дата вычисления.  Формат даты: `ГГГГ‑ММ‑ДД`. 
   * @return calculationDate
  **/
  @ApiModelProperty(required = true, value = "Дата вычисления.  Формат даты: `ГГГГ‑ММ‑ДД`. ")
  public Date getCalculationDate() {
    return calculationDate;
  }

  public void setCalculationDate(Date calculationDate) {
    this.calculationDate = calculationDate;
  }

  public QualityRatingDTO components(List<@Valid QualityRatingComponentDTO> components) {
    this.components = components;
    return this;
  }

  public QualityRatingDTO addComponentsItem(QualityRatingComponentDTO componentsItem) {
    this.components.add(componentsItem);
    return this;
  }

   /**
   * Составляющие индекса качества.
   * @return components
  **/
  @ApiModelProperty(required = true, value = "Составляющие индекса качества.")
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

