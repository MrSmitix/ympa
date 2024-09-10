package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Идентификатор единицы товара.  Заполните только одно поле в зависимости от того, в какой системе маркирован товар.  Подробно о работе с маркируемыми товарами рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/cz.html). 
 */
public class BriefOrderItemInstanceDTO   {

    private String cis;
    private String uin;
    private String rnpt;
    private String gtd;

    /**
     * Default constructor.
     */
    public BriefOrderItemInstanceDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create BriefOrderItemInstanceDTO.
     *
     * @param cis Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).  {% note warning %}  Не экранируйте косую черту в коде символа-разделителя &#x60;\\u001d&#x60;!  ✅ &#x60;01030410947874432155Qbag!\\u001d93Zjqw&#x60;  ❌ &#x60;01030410947874432155Qbag!\\\\u001d93Zjqw&#x60;  Косые черты и кавычки в других местах экранируйте по правилам JSON: &#x60;\\\\&#x60; и &#x60;\\\&quot;&#x60;  {% endnote %} 
     * @param uin Уникальный идентификационный номер ювелирного изделия.  Представляет собой число из 16 цифр. 
     * @param rnpt Регистрационный номер партии товара.  Представляет собой строку из четырех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ/ХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на партию товара. Далее — дата, номер декларации и номер маркированного товара в декларации. 
     * @param gtd Грузовая таможенная декларация.  Представляет собой строку из трех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на ввезенные товары. Далее — дата и номер декларации. 
     */
    public BriefOrderItemInstanceDTO(
        String cis, 
        String uin, 
        String rnpt, 
        String gtd
    ) {
        this.cis = cis;
        this.uin = uin;
        this.rnpt = rnpt;
        this.gtd = gtd;
    }



    /**
     * Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).  {% note warning %}  Не экранируйте косую черту в коде символа-разделителя `\\u001d`!  ✅ `01030410947874432155Qbag!\\u001d93Zjqw`  ❌ `01030410947874432155Qbag!\\\\u001d93Zjqw`  Косые черты и кавычки в других местах экранируйте по правилам JSON: `\\\\` и `\\\"`  {% endnote %} 
     * @return cis
     */
    public String getCis() {
        return cis;
    }

    public void setCis(String cis) {
        this.cis = cis;
    }

    /**
     * Уникальный идентификационный номер ювелирного изделия.  Представляет собой число из 16 цифр. 
     * @return uin
     */
    public String getUin() {
        return uin;
    }

    public void setUin(String uin) {
        this.uin = uin;
    }

    /**
     * Регистрационный номер партии товара.  Представляет собой строку из четырех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ/ХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на партию товара. Далее — дата, номер декларации и номер маркированного товара в декларации. 
     * @return rnpt
     */
    public String getRnpt() {
        return rnpt;
    }

    public void setRnpt(String rnpt) {
        this.rnpt = rnpt;
    }

    /**
     * Грузовая таможенная декларация.  Представляет собой строку из трех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на ввезенные товары. Далее — дата и номер декларации. 
     * @return gtd
     */
    public String getGtd() {
        return gtd;
    }

    public void setGtd(String gtd) {
        this.gtd = gtd;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BriefOrderItemInstanceDTO {\n");
        
        sb.append("    cis: ").append(toIndentedString(cis)).append("\n");
        sb.append("    uin: ").append(toIndentedString(uin)).append("\n");
        sb.append("    rnpt: ").append(toIndentedString(rnpt)).append("\n");
        sb.append("    gtd: ").append(toIndentedString(gtd)).append("\n");
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

