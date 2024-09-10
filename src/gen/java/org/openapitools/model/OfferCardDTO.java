package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.GetMappingDTO;
import org.openapitools.model.OfferCardRecommendationDTO;
import org.openapitools.model.OfferCardStatusType;
import org.openapitools.model.OfferErrorDTO;
import org.openapitools.model.ParameterValueDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Информация о состоянии карточки товара.  Если поле `mapping` отсутствует в ответе, Маркет еще не успел обработать информацию о товаре. Чтобы определить категорию такого товара, повторите запрос через несколько минут. ")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferCardDTO   {
  
  private String offerId;
  private GetMappingDTO mapping;
  private List<@Valid ParameterValueDTO> parameterValues;
  private OfferCardStatusType cardStatus;
  private Integer contentRating;
  private List<@Valid OfferCardRecommendationDTO> recommendations;
  private List<@Valid OfferErrorDTO> errors;
  private List<@Valid OfferErrorDTO> warnings;

  /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   **/
  
  @ApiModelProperty(required = true, value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
  @JsonProperty("offerId")
  @NotNull
 @Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$") @Size(min=1,max=255)  public String getOfferId() {
    return offerId;
  }
  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("mapping")
  @Valid
  public GetMappingDTO getMapping() {
    return mapping;
  }
  public void setMapping(GetMappingDTO mapping) {
    this.mapping = mapping;
  }

  /**
   * Список характеристик с их значениями. 
   **/
  
  @ApiModelProperty(value = "Список характеристик с их значениями. ")
  @JsonProperty("parameterValues")
  @Valid
  public List<@Valid ParameterValueDTO> getParameterValues() {
    return parameterValues;
  }
  public void setParameterValues(List<@Valid ParameterValueDTO> parameterValues) {
    this.parameterValues = parameterValues;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cardStatus")
  @Valid
  public OfferCardStatusType getCardStatus() {
    return cardStatus;
  }
  public void setCardStatus(OfferCardStatusType cardStatus) {
    this.cardStatus = cardStatus;
  }

  /**
   * Процент заполненности карточки.
   **/
  
  @ApiModelProperty(value = "Процент заполненности карточки.")
  @JsonProperty("contentRating")
  public Integer getContentRating() {
    return contentRating;
  }
  public void setContentRating(Integer contentRating) {
    this.contentRating = contentRating;
  }

  /**
   * Список рекомендаций к заполнению карточки.  Рекомендации Маркета помогают заполнять карточку так, чтобы покупателям было проще найти ваш товар и решиться на покупку. 
   **/
  
  @ApiModelProperty(value = "Список рекомендаций к заполнению карточки.  Рекомендации Маркета помогают заполнять карточку так, чтобы покупателям было проще найти ваш товар и решиться на покупку. ")
  @JsonProperty("recommendations")
  @Valid
  public List<@Valid OfferCardRecommendationDTO> getRecommendations() {
    return recommendations;
  }
  public void setRecommendations(List<@Valid OfferCardRecommendationDTO> recommendations) {
    this.recommendations = recommendations;
  }

  /**
   * Ошибки в контенте, препятствующие размещению товара на витрине.
   **/
  
  @ApiModelProperty(value = "Ошибки в контенте, препятствующие размещению товара на витрине.")
  @JsonProperty("errors")
  @Valid
  public List<@Valid OfferErrorDTO> getErrors() {
    return errors;
  }
  public void setErrors(List<@Valid OfferErrorDTO> errors) {
    this.errors = errors;
  }

  /**
   * Связанные с контентом предупреждения, не препятствующие размещению товара на витрине.
   **/
  
  @ApiModelProperty(value = "Связанные с контентом предупреждения, не препятствующие размещению товара на витрине.")
  @JsonProperty("warnings")
  @Valid
  public List<@Valid OfferErrorDTO> getWarnings() {
    return warnings;
  }
  public void setWarnings(List<@Valid OfferErrorDTO> warnings) {
    this.warnings = warnings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferCardDTO offerCardDTO = (OfferCardDTO) o;
    return Objects.equals(this.offerId, offerCardDTO.offerId) &&
        Objects.equals(this.mapping, offerCardDTO.mapping) &&
        Objects.equals(this.parameterValues, offerCardDTO.parameterValues) &&
        Objects.equals(this.cardStatus, offerCardDTO.cardStatus) &&
        Objects.equals(this.contentRating, offerCardDTO.contentRating) &&
        Objects.equals(this.recommendations, offerCardDTO.recommendations) &&
        Objects.equals(this.errors, offerCardDTO.errors) &&
        Objects.equals(this.warnings, offerCardDTO.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, mapping, parameterValues, cardStatus, contentRating, recommendations, errors, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferCardDTO {\n");
    
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    mapping: ").append(toIndentedString(mapping)).append("\n");
    sb.append("    parameterValues: ").append(toIndentedString(parameterValues)).append("\n");
    sb.append("    cardStatus: ").append(toIndentedString(cardStatus)).append("\n");
    sb.append("    contentRating: ").append(toIndentedString(contentRating)).append("\n");
    sb.append("    recommendations: ").append(toIndentedString(recommendations)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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

