package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.OrderBuyerType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о покупателе и его номере телефона.
 */
public class OrderBuyerInfoDTO   {

    private String id;
    private String lastName;
    private String firstName;
    private String middleName;
    private OrderBuyerType type;
    private String phone;

    /**
     * Default constructor.
     */
    public OrderBuyerInfoDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OrderBuyerInfoDTO.
     *
     * @param id Идентификатор покупателя.
     * @param lastName Фамилия покупателя.
     * @param firstName Имя покупателя.
     * @param middleName Отчество покупателя.
     * @param type type
     * @param phone Подменный номер телефона покупателя. Подробнее о таких номерах читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/orders/dbs/call#fake-number).  Формат номера: &#x60;+&lt;код_страны&gt;&lt;код_региона&gt;&lt;номер_телефона&gt;&#x60;. 
     */
    public OrderBuyerInfoDTO(
        String id, 
        String lastName, 
        String firstName, 
        String middleName, 
        OrderBuyerType type, 
        String phone
    ) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.type = type;
        this.phone = phone;
    }



    /**
     * Идентификатор покупателя.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Фамилия покупателя.
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Имя покупателя.
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Отчество покупателя.
     * @return middleName
     */
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * Get type
     * @return type
     */
    public OrderBuyerType getType() {
        return type;
    }

    public void setType(OrderBuyerType type) {
        this.type = type;
    }

    /**
     * Подменный номер телефона покупателя. Подробнее о таких номерах читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/orders/dbs/call#fake-number).  Формат номера: `+<код_страны><код_региона><номер_телефона>`. 
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderBuyerInfoDTO {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
        sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
        sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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

