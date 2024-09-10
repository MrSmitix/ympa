package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация о части товара в коробке.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrderBoxLayoutPartialCountDTO   {
  @JsonProperty("current")
  @NotNull
@Min(1)

  private Integer current;

  @JsonProperty("total")
  @NotNull
@Min(2)

  private Integer total;

  public OrderBoxLayoutPartialCountDTO current(Integer current) {
    this.current = current;
    return this;
  }

   /**
   * Номер части, начиная с 1.
   * minimum: 1
   * @return current
  **/
  public Integer getCurrent() {
    return current;
  }

  public void setCurrent(Integer current) {
    this.current = current;
  }

  public OrderBoxLayoutPartialCountDTO total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * На сколько всего частей разделен товар.
   * minimum: 2
   * @return total
  **/
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderBoxLayoutPartialCountDTO orderBoxLayoutPartialCountDTO = (OrderBoxLayoutPartialCountDTO) o;
    return Objects.equals(current, orderBoxLayoutPartialCountDTO.current) &&
        Objects.equals(total, orderBoxLayoutPartialCountDTO.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(current, total);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderBoxLayoutPartialCountDTO {\n");
    
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

