package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ForwardScrollingPagerDTO;
import org.openapitools.model.ReturnDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Возвраты.
 */
@ApiModel(description="Возвраты.")

public class PagedReturnsDTO  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ForwardScrollingPagerDTO paging;

 /**
  * Список возвратов.
  */
  @ApiModelProperty(required = true, value = "Список возвратов.")
  @Valid
  private List<@Valid ReturnDTO> returns = new ArrayList<>();
 /**
  * Get paging
  * @return paging
  */
  @JsonProperty("paging")
  public ForwardScrollingPagerDTO getPaging() {
    return paging;
  }

  /**
   * Sets the <code>paging</code> property.
   */
 public void setPaging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
  }

  /**
   * Sets the <code>paging</code> property.
   */
  public PagedReturnsDTO paging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

 /**
  * Список возвратов.
  * @return returns
  */
  @JsonProperty("returns")
  @NotNull
  public List<@Valid ReturnDTO> getReturns() {
    return returns;
  }

  /**
   * Sets the <code>returns</code> property.
   */
 public void setReturns(List<@Valid ReturnDTO> returns) {
    this.returns = returns;
  }

  /**
   * Sets the <code>returns</code> property.
   */
  public PagedReturnsDTO returns(List<@Valid ReturnDTO> returns) {
    this.returns = returns;
    return this;
  }

  /**
   * Adds a new item to the <code>returns</code> list.
   */
  public PagedReturnsDTO addReturnsItem(ReturnDTO returnsItem) {
    this.returns.add(returnsItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

