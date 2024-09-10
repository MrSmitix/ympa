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
import java.util.List;
import org.openapitools.model.ForwardScrollingPagerDTO;
import org.openapitools.model.ReturnDTO;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Возвраты.
 */
@ApiModel(description = "Возвраты.")
@JsonPropertyOrder({
  PagedReturnsDTO.JSON_PROPERTY_PAGING,
  PagedReturnsDTO.JSON_PROPERTY_RETURNS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-09-09T22:24:17.175492804Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class PagedReturnsDTO   {
  public static final String JSON_PROPERTY_PAGING = "paging";
  @JsonProperty(JSON_PROPERTY_PAGING)
  private ForwardScrollingPagerDTO paging;

  public static final String JSON_PROPERTY_RETURNS = "returns";
  @JsonProperty(JSON_PROPERTY_RETURNS)
  private List<@Valid ReturnDTO> returns = new ArrayList<>();

  public PagedReturnsDTO paging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

  /**
   * Get paging
   * @return paging
   **/
  @JsonProperty(value = "paging")
  @ApiModelProperty(value = "")
  @Valid 
  public ForwardScrollingPagerDTO getPaging() {
    return paging;
  }

  public void setPaging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
  }

  public PagedReturnsDTO returns(List<@Valid ReturnDTO> returns) {
    this.returns = returns;
    return this;
  }

  public PagedReturnsDTO addReturnsItem(ReturnDTO returnsItem) {
    if (this.returns == null) {
      this.returns = new ArrayList<>();
    }
    this.returns.add(returnsItem);
    return this;
  }

  /**
   * Список возвратов.
   * @return returns
   **/
  @JsonProperty(value = "returns")
  @ApiModelProperty(required = true, value = "Список возвратов.")
  @NotNull @Valid 
  public List<@Valid ReturnDTO> getReturns() {
    return returns;
  }

  public void setReturns(List<@Valid ReturnDTO> returns) {
    this.returns = returns;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagedReturnsDTO pagedReturnsDTO = (PagedReturnsDTO) o;
    return Objects.equals(this.paging, pagedReturnsDTO.paging) &&
        Objects.equals(this.returns, pagedReturnsDTO.returns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paging, returns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagedReturnsDTO {\n");
    
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
    sb.append("    returns: ").append(toIndentedString(returns)).append("\n");
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

