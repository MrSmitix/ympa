package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ForwardScrollingPagerDTO;
import org.openapitools.model.ReturnDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Возвраты.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Возвраты.")
public class PagedReturnsDTO   {
  
  private ForwardScrollingPagerDTO paging;

  private List<@Valid ReturnDTO> returns = new ArrayList<>();

  /**
   **/
  public PagedReturnsDTO paging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("paging")
  public ForwardScrollingPagerDTO getPaging() {
    return paging;
  }
  public void setPaging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
  }


  /**
   * Список возвратов.
   **/
  public PagedReturnsDTO returns(List<@Valid ReturnDTO> returns) {
    this.returns = returns;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список возвратов.")
  @JsonProperty("returns")
  @NotNull
  public List<@Valid ReturnDTO> getReturns() {
    return returns;
  }
  public void setReturns(List<@Valid ReturnDTO> returns) {
    this.returns = returns;
  }

  public PagedReturnsDTO addReturnsItem(ReturnDTO returnsItem) {
    if (this.returns == null) {
      this.returns = new ArrayList<>();
    }
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

