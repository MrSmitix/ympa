package apimodels;

import apimodels.EacVerificationStatusType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Результат выполнения запроса.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class EacVerificationResultDTO   {
  @JsonProperty("verificationResult")
  @Valid

  private EacVerificationStatusType verificationResult;

  @JsonProperty("attemptsLeft")
  
  private Integer attemptsLeft;

  public EacVerificationResultDTO verificationResult(EacVerificationStatusType verificationResult) {
    this.verificationResult = verificationResult;
    return this;
  }

   /**
   * Get verificationResult
   * @return verificationResult
  **/
  public EacVerificationStatusType getVerificationResult() {
    return verificationResult;
  }

  public void setVerificationResult(EacVerificationStatusType verificationResult) {
    this.verificationResult = verificationResult;
  }

  public EacVerificationResultDTO attemptsLeft(Integer attemptsLeft) {
    this.attemptsLeft = attemptsLeft;
    return this;
  }

   /**
   * Количество оставшихся попыток проверки кода.  Возвращается, если магазин отправил некорректный код.  Когда все попытки будут исчерпаны, код обновится. 
   * @return attemptsLeft
  **/
  public Integer getAttemptsLeft() {
    return attemptsLeft;
  }

  public void setAttemptsLeft(Integer attemptsLeft) {
    this.attemptsLeft = attemptsLeft;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EacVerificationResultDTO eacVerificationResultDTO = (EacVerificationResultDTO) o;
    return Objects.equals(verificationResult, eacVerificationResultDTO.verificationResult) &&
        Objects.equals(attemptsLeft, eacVerificationResultDTO.attemptsLeft);
  }

  @Override
  public int hashCode() {
    return Objects.hash(verificationResult, attemptsLeft);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EacVerificationResultDTO {\n");
    
    sb.append("    verificationResult: ").append(toIndentedString(verificationResult)).append("\n");
    sb.append("    attemptsLeft: ").append(toIndentedString(attemptsLeft)).append("\n");
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

