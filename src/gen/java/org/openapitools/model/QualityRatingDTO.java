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
 **/

@ApiModel(description = "Информация об индексе качества.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class QualityRatingDTO   {
  @JsonProperty("rating")
  private Long rating;

  @JsonProperty("calculationDate")
  private Date calculationDate;

  @JsonProperty("components")
  private List<QualityRatingComponentDTO> components = new ArrayList<>();

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
  public Long getRating() {
    return rating;
  }
  public void setRating(Long rating) {
    this.rating = rating;
  }

  /**
   * Дата вычисления.  Формат даты: `ГГГГ‑ММ‑ДД`. 
   **/
  public QualityRatingDTO calculationDate(Date calculationDate) {
    this.calculationDate = calculationDate;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Дата вычисления.  Формат даты: `ГГГГ‑ММ‑ДД`. ")
  @JsonProperty("calculationDate")
  public Date getCalculationDate() {
    return calculationDate;
  }
  public void setCalculationDate(Date calculationDate) {
    this.calculationDate = calculationDate;
  }

  /**
   * Составляющие индекса качества.
   **/
  public QualityRatingDTO components(List<QualityRatingComponentDTO> components) {
    this.components = components;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Составляющие индекса качества.")
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

