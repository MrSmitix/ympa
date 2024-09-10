package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.EacVerificationStatusType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Результат выполнения запроса.
 */
public class EacVerificationResultDTO   {

    private EacVerificationStatusType verificationResult;
    private Integer attemptsLeft;

    /**
     * Default constructor.
     */
    public EacVerificationResultDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create EacVerificationResultDTO.
     *
     * @param verificationResult verificationResult
     * @param attemptsLeft Количество оставшихся попыток проверки кода.  Возвращается, если магазин отправил некорректный код.  Когда все попытки будут исчерпаны, код обновится. 
     */
    public EacVerificationResultDTO(
        EacVerificationStatusType verificationResult, 
        Integer attemptsLeft
    ) {
        this.verificationResult = verificationResult;
        this.attemptsLeft = attemptsLeft;
    }



    /**
     * Get verificationResult
     * @return verificationResult
     */
    public EacVerificationStatusType getVerificationResult() {
        return verificationResult;
    }

    public void setVerificationResult(EacVerificationStatusType verificationResult) {
        this.verificationResult = verificationResult;
    }

    /**
     * Количество оставшихся попыток проверки кода.  Возвращается, если магазин отправил некорректный код.  Когда все попытки будут исчерпаны, код обновится. 
     * @return attemptsLeft
     */
    public Integer getAttemptsLeft() {
        return attemptsLeft;
    }

    public void setAttemptsLeft(Integer attemptsLeft) {
        this.attemptsLeft = attemptsLeft;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        if (o == null) {
          return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

