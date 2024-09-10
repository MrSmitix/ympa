package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openapitools.model.QualityRatingComponentDTO;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация об индексе качества.
 */

@Schema(name = "QualityRatingDTO", description = "Информация об индексе качества.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class QualityRatingDTO {

  private Long rating;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private Date calculationDate;

  @Valid
  private List<@Valid QualityRatingComponentDTO> components = new ArrayList<>();

  public QualityRatingDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public QualityRatingDTO(Long rating, Date calculationDate, List<@Valid QualityRatingComponentDTO> components) {
    this.rating = rating;
    this.calculationDate = calculationDate;
    this.components = components;
  }

  public QualityRatingDTO rating(Long rating) {
    this.rating = rating;
    return this;
  }

  /**
   * Значение индекса качества.
   * minimum: 0
   * maximum: 100
   * @return rating
   */
  @NotNull @Min(0L) @Max(100L) 
  @Schema(name = "rating", description = "Значение индекса качества.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rating")
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
   */
  @NotNull @Valid 
  @Schema(name = "calculationDate", description = "Дата вычисления.  Формат даты: `ГГГГ‑ММ‑ДД`. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("calculationDate")
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
   */
  @NotNull @Valid 
  @Schema(name = "components", description = "Составляющие индекса качества.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("components")
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

