/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI document version: LATEST
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OfferContentDTO;



/**
 * Запрос на установку новых значений для параметров.
 */

@ApiModel(description = "Запрос на установку новых значений для параметров.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdateOfferContentRequest   {
  
  private List<OfferContentDTO> offersContent = new ArrayList<>();

  /**
   * Список товаров с указанными характеристиками.
   */
  public UpdateOfferContentRequest offersContent(List<OfferContentDTO> offersContent) {
    this.offersContent = offersContent;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список товаров с указанными характеристиками.")
  @JsonProperty("offersContent")
  public List<OfferContentDTO> getOffersContent() {
    return offersContent;
  }
  public void setOffersContent(List<OfferContentDTO> offersContent) {
    this.offersContent = offersContent;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateOfferContentRequest updateOfferContentRequest = (UpdateOfferContentRequest) o;
    return Objects.equals(offersContent, updateOfferContentRequest.offersContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offersContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOfferContentRequest {\n");
    
    sb.append("    offersContent: ").append(toIndentedString(offersContent)).append("\n");
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

