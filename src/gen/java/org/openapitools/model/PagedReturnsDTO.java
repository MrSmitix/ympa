package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ForwardScrollingPagerDTO;
import org.openapitools.model.ReturnDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Возвраты.
 **/
@ApiModel(description = "Возвраты.")
@JsonTypeName("PagedReturnsDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class PagedReturnsDTO   {
  private ForwardScrollingPagerDTO paging;
  private @Valid List<@Valid ReturnDTO> returns = new ArrayList<>();

  /**
   **/
  public PagedReturnsDTO paging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("paging")
  @Valid public ForwardScrollingPagerDTO getPaging() {
    return paging;
  }

  @JsonProperty("paging")
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
  @NotNull @Valid public List<@Valid ReturnDTO> getReturns() {
    return returns;
  }

  @JsonProperty("returns")
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

  public PagedReturnsDTO removeReturnsItem(ReturnDTO returnsItem) {
    if (returnsItem != null && this.returns != null) {
      this.returns.remove(returnsItem);
    }

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

