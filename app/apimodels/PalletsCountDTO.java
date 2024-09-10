package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Количество палет в отгрузке.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PalletsCountDTO   {
  @JsonProperty("planned")
  
  private Integer planned;

  @JsonProperty("fact")
  
  private Integer fact;

  public PalletsCountDTO planned(Integer planned) {
    this.planned = planned;
    return this;
  }

   /**
   * Количество палет, которое заявил продавец.
   * @return planned
  **/
  public Integer getPlanned() {
    return planned;
  }

  public void setPlanned(Integer planned) {
    this.planned = planned;
  }

  public PalletsCountDTO fact(Integer fact) {
    this.fact = fact;
    return this;
  }

   /**
   * Количество палет, которое приняли в сортировочном центре.
   * @return fact
  **/
  public Integer getFact() {
    return fact;
  }

  public void setFact(Integer fact) {
    this.fact = fact;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PalletsCountDTO palletsCountDTO = (PalletsCountDTO) o;
    return Objects.equals(planned, palletsCountDTO.planned) &&
        Objects.equals(fact, palletsCountDTO.fact);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planned, fact);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PalletsCountDTO {\n");
    
    sb.append("    planned: ").append(toIndentedString(planned)).append("\n");
    sb.append("    fact: ").append(toIndentedString(fact)).append("\n");
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

