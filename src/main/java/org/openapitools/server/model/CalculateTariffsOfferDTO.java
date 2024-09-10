package org.openapitools.server.model;

import java.math.BigDecimal;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Параметры товара, для которого нужно рассчитать стоимость услуг.
 */
public class CalculateTariffsOfferDTO   {

    private Long categoryId;
    private BigDecimal price;
    private BigDecimal length;
    private BigDecimal width;
    private BigDecimal height;
    private BigDecimal weight;
    private Integer quantity = 1;

    /**
     * Default constructor.
     */
    public CalculateTariffsOfferDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create CalculateTariffsOfferDTO.
     *
     * @param categoryId Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
     * @param price Цена на товар в рублях.
     * @param length Длина товара в сантиметрах.
     * @param width Ширина товара в сантиметрах.
     * @param height Высота товара в сантиметрах.
     * @param weight Вес товара в килограммах.
     * @param quantity Квант продажи — количество единиц товара в одном товарном предложении.
     */
    public CalculateTariffsOfferDTO(
        Long categoryId, 
        BigDecimal price, 
        BigDecimal length, 
        BigDecimal width, 
        BigDecimal height, 
        BigDecimal weight, 
        Integer quantity
    ) {
        this.categoryId = categoryId;
        this.price = price;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.quantity = quantity;
    }



    /**
     * Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
     * minimum: 0
     * @return categoryId
     */
    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * Цена на товар в рублях.
     * minimum: 0
     * @return price
     */
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * Длина товара в сантиметрах.
     * minimum: 0
     * @return length
     */
    public BigDecimal getLength() {
        return length;
    }

    public void setLength(BigDecimal length) {
        this.length = length;
    }

    /**
     * Ширина товара в сантиметрах.
     * minimum: 0
     * @return width
     */
    public BigDecimal getWidth() {
        return width;
    }

    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    /**
     * Высота товара в сантиметрах.
     * minimum: 0
     * @return height
     */
    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    /**
     * Вес товара в килограммах.
     * minimum: 0
     * @return weight
     */
    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    /**
     * Квант продажи — количество единиц товара в одном товарном предложении.
     * minimum: 1
     * @return quantity
     */
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CalculateTariffsOfferDTO {\n");
        
        sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
        sb.append("    price: ").append(toIndentedString(price)).append("\n");
        sb.append("    length: ").append(toIndentedString(length)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

