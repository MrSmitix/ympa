/*
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Информация об индексе качества.
 */
@ApiModel(description = "Информация об индексе качества.")
@JsonPropertyOrder({
  QualityRatingDTO.JSON_PROPERTY_RATING,
  QualityRatingDTO.JSON_PROPERTY_CALCULATION_DATE,
  QualityRatingDTO.JSON_PROPERTY_COMPONENTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-09-09T22:24:17.175492804Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class QualityRatingDTO   {
  public static final String JSON_PROPERTY_RATING = "rating";
  @JsonProperty(JSON_PROPERTY_RATING)
  private Long rating;

  public static final String JSON_PROPERTY_CALCULATION_DATE = "calculationDate";
  @JsonProperty(JSON_PROPERTY_CALCULATION_DATE)
  private Date calculationDate;

  public static final String JSON_PROPERTY_COMPONENTS = "components";
  @JsonProperty(JSON_PROPERTY_COMPONENTS)
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
  @JsonProperty(value = "rating")
  @ApiModelProperty(required = true, value = "Значение индекса качества.")
  @NotNull  @Min(0L) @Max(100L)
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
   * Дата вычисления.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;. 
   * @return calculationDate
   **/
  @JsonProperty(value = "calculationDate")
  @ApiModelProperty(required = true, value = "Дата вычисления.  Формат даты: `ГГГГ‑ММ‑ДД`. ")
  @NotNull 
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
  @JsonProperty(value = "components")
  @ApiModelProperty(required = true, value = "Составляющие индекса качества.")
  @NotNull @Valid 
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

