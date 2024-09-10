package org.openapitools.server.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.FeedbackFactorDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация об оценках, которые поставил автор отзыва магазину, и об оценках полезности отзыва от других пользователей Маркета.
 */
public class FeedbackGradesDTO   {

    private BigDecimal average;
    private Long agreeCount;
    private Long rejectCount;
    private List<@Valid FeedbackFactorDTO> factors = new ArrayList<>();

    /**
     * Default constructor.
     */
    public FeedbackGradesDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create FeedbackGradesDTO.
     *
     * @param average Общая оценка, указанная в отзыве: от &#x60;1&#x60; («Ужасный магазин») до &#x60;5&#x60; («Отличный магазин»).
     * @param agreeCount Количество пользователей, считающих отзыв полезным.
     * @param rejectCount Количество пользователей, считающих отзыв бесполезным.
     * @param factors Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр &#x60;delivery&#x60;) указал автор. 
     */
    public FeedbackGradesDTO(
        BigDecimal average, 
        Long agreeCount, 
        Long rejectCount, 
        List<@Valid FeedbackFactorDTO> factors
    ) {
        this.average = average;
        this.agreeCount = agreeCount;
        this.rejectCount = rejectCount;
        this.factors = factors;
    }



    /**
     * Общая оценка, указанная в отзыве: от `1` («Ужасный магазин») до `5` («Отличный магазин»).
     * @return average
     */
    public BigDecimal getAverage() {
        return average;
    }

    public void setAverage(BigDecimal average) {
        this.average = average;
    }

    /**
     * Количество пользователей, считающих отзыв полезным.
     * @return agreeCount
     */
    public Long getAgreeCount() {
        return agreeCount;
    }

    public void setAgreeCount(Long agreeCount) {
        this.agreeCount = agreeCount;
    }

    /**
     * Количество пользователей, считающих отзыв бесполезным.
     * @return rejectCount
     */
    public Long getRejectCount() {
        return rejectCount;
    }

    public void setRejectCount(Long rejectCount) {
        this.rejectCount = rejectCount;
    }

    /**
     * Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр `delivery`) указал автор. 
     * @return factors
     */
    public List<@Valid FeedbackFactorDTO> getFactors() {
        return factors;
    }

    public void setFactors(List<@Valid FeedbackFactorDTO> factors) {
        this.factors = factors;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FeedbackGradesDTO {\n");
        
        sb.append("    average: ").append(toIndentedString(average)).append("\n");
        sb.append("    agreeCount: ").append(toIndentedString(agreeCount)).append("\n");
        sb.append("    rejectCount: ").append(toIndentedString(rejectCount)).append("\n");
        sb.append("    factors: ").append(toIndentedString(factors)).append("\n");
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

