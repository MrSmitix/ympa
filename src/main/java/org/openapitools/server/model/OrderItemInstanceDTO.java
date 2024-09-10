package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Переданные вами для данной позиции коды маркировки или УИНы. Коды «Честного знака» возвращаются в двух вариантах — с криптохвостом и без. 
 */
public class OrderItemInstanceDTO   {

    private String cis;
    private String cisFull;
    private String uin;
    private String rnpt;
    private String gtd;

    /**
     * Default constructor.
     */
    public OrderItemInstanceDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OrderItemInstanceDTO.
     *
     * @param cis Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/) без криптохвоста.
     * @param cisFull Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/) с криптохвостом.
     * @param uin УИН ювелирного изделия (16-значный код) Производитель получает УИН, когда регистрирует изделие в системе контроля за оборотом драгоценных металлов и камней — ГИИС ДМДК. 
     * @param rnpt Регистрационный номер партии товара.  Представляет собой строку из четырех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ/ХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на партию товара. Далее — дата, номер декларации и номер маркированного товара в декларации. 
     * @param gtd Грузовая таможенная декларация.  Представляет собой строку из трех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на ввезенные товары. Далее — дата и номер декларации. 
     */
    public OrderItemInstanceDTO(
        String cis, 
        String cisFull, 
        String uin, 
        String rnpt, 
        String gtd
    ) {
        this.cis = cis;
        this.cisFull = cisFull;
        this.uin = uin;
        this.rnpt = rnpt;
        this.gtd = gtd;
    }



    /**
     * Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/) без криптохвоста.
     * @return cis
     */
    public String getCis() {
        return cis;
    }

    public void setCis(String cis) {
        this.cis = cis;
    }

    /**
     * Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/) с криптохвостом.
     * @return cisFull
     */
    public String getCisFull() {
        return cisFull;
    }

    public void setCisFull(String cisFull) {
        this.cisFull = cisFull;
    }

    /**
     * УИН ювелирного изделия (16-значный код) Производитель получает УИН, когда регистрирует изделие в системе контроля за оборотом драгоценных металлов и камней — ГИИС ДМДК. 
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
        sb.append("class OrderItemInstanceDTO {\n");
        
        sb.append("    cis: ").append(toIndentedString(cis)).append("\n");
        sb.append("    cisFull: ").append(toIndentedString(cisFull)).append("\n");
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

