package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр `delivery`) указал автор. 
 */
public class FeedbackFactorDTO   {

    private Long id;
    private String title;
    private String description;
    private Integer value;

    /**
     * Default constructor.
     */
    public FeedbackFactorDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create FeedbackFactorDTO.
     *
     * @param id Идентификатор параметра.
     * @param title Название параметра. Например, &#x60;Скорость обработки заказа&#x60;.
     * @param description Описание параметра. Например, &#x60;Как быстро с вами связались для подтверждения заказа?&#x60;.
     * @param value Оценка по параметру, указанная в отзыве: от &#x60;1&#x60; (низшая оценка) до &#x60;5&#x60; (высшая оценка). 
     */
    public FeedbackFactorDTO(
        Long id, 
        String title, 
        String description, 
        Integer value
    ) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.value = value;
    }



    /**
     * Идентификатор параметра.
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Название параметра. Например, `Скорость обработки заказа`.
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Описание параметра. Например, `Как быстро с вами связались для подтверждения заказа?`.
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Оценка по параметру, указанная в отзыве: от `1` (низшая оценка) до `5` (высшая оценка). 
     * @return value
     */
    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FeedbackFactorDTO {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

