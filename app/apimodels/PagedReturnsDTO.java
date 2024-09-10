package apimodels;

import apimodels.ForwardScrollingPagerDTO;
import apimodels.ReturnDTO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Возвраты.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PagedReturnsDTO   {
  @JsonProperty("paging")
  @Valid

  private ForwardScrollingPagerDTO paging;

  @JsonProperty("returns")
  @NotNull
@Valid

  private List<@Valid ReturnDTO> returns = new ArrayList<>();

  public PagedReturnsDTO paging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

   /**
   * Get paging
   * @return paging
  **/
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
    return Objects.equals(paging, pagedReturnsDTO.paging) &&
        Objects.equals(returns, pagedReturnsDTO.returns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paging, returns);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

