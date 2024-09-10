/**
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

package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openapitools.server.model.QualityRatingComponentDTO;
import java.lang.reflect.Type;
import javax.json.bind.annotation.JsonbTypeDeserializer;
import javax.json.bind.annotation.JsonbTypeSerializer;
import javax.json.bind.serializer.DeserializationContext;
import javax.json.bind.serializer.JsonbDeserializer;
import javax.json.bind.serializer.JsonbSerializer;
import javax.json.bind.serializer.SerializationContext;
import javax.json.stream.JsonGenerator;
import javax.json.stream.JsonParser;
import javax.json.bind.annotation.JsonbProperty;

/**
  * Информация об индексе качества.
  */

public class QualityRatingDTO  {
  
 /**
  * Значение индекса качества.
  */
  @JsonbProperty("rating")
  private Long rating;

 /**
  * Дата вычисления.  Формат даты: `ГГГГ‑ММ‑ДД`. 
  */
  @JsonbProperty("calculationDate")
  private Date calculationDate;

 /**
  * Составляющие индекса качества.
  */
  @JsonbProperty("components")
  private List<QualityRatingComponentDTO> components = new ArrayList<>();

  /**
   * Значение индекса качества.
   * minimum: 0
   * maximum: 100
   * @return rating
   **/
  public Long getRating() {
    return rating;
  }

  /**
   * Set rating
   */
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
  public Date getCalculationDate() {
    return calculationDate;
  }

  /**
   * Set calculationDate
   */
  public void setCalculationDate(Date calculationDate) {
    this.calculationDate = calculationDate;
  }

  public QualityRatingDTO calculationDate(Date calculationDate) {
    this.calculationDate = calculationDate;
    return this;
  }

  /**
   * Составляющие индекса качества.
   * @return components
   **/
  public List<QualityRatingComponentDTO> getComponents() {
    return components;
  }

  /**
   * Set components
   */
  public void setComponents(List<QualityRatingComponentDTO> components) {
    this.components = components;
  }

  public QualityRatingDTO components(List<QualityRatingComponentDTO> components) {
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
   * Create a string representation of this pojo.
   */
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

