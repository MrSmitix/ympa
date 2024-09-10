package apimodels;

import apimodels.QualityRatingAffectedOrderDTO;
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
 * Информация о заказах, которые повлияли на индекс качества.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class QualityRatingDetailsDTO   {
  @JsonProperty("affectedOrders")
  @NotNull
@Valid

  private List<@Valid QualityRatingAffectedOrderDTO> affectedOrders = new ArrayList<>();

  public QualityRatingDetailsDTO affectedOrders(List<@Valid QualityRatingAffectedOrderDTO> affectedOrders) {
    this.affectedOrders = affectedOrders;
    return this;
  }

  public QualityRatingDetailsDTO addAffectedOrdersItem(QualityRatingAffectedOrderDTO affectedOrdersItem) {
    if (this.affectedOrders == null) {
      this.affectedOrders = new ArrayList<>();
    }
    this.affectedOrders.add(affectedOrdersItem);
    return this;
  }

   /**
   * Список заказов, которые повлияли на индекс качества.
   * @return affectedOrders
  **/
  public List<@Valid QualityRatingAffectedOrderDTO> getAffectedOrders() {
    return affectedOrders;
  }

  public void setAffectedOrders(List<@Valid QualityRatingAffectedOrderDTO> affectedOrders) {
    this.affectedOrders = affectedOrders;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QualityRatingDetailsDTO qualityRatingDetailsDTO = (QualityRatingDetailsDTO) o;
    return Objects.equals(affectedOrders, qualityRatingDetailsDTO.affectedOrders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(affectedOrders);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QualityRatingDetailsDTO {\n");
    
    sb.append("    affectedOrders: ").append(toIndentedString(affectedOrders)).append("\n");
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

