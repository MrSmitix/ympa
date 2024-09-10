package org.openapitools.server.model;

import java.time.OffsetDateTime;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация об акции «Бестселлеры Маркета».
 */
public class GetPromoBestsellerInfoDTO   {

    private Boolean bestseller;
    private OffsetDateTime entryDeadline;

    /**
     * Default constructor.
     */
    public GetPromoBestsellerInfoDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create GetPromoBestsellerInfoDTO.
     *
     * @param bestseller Является ли акция «Бестселлером Маркета». Подробнее об этой акции читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/bestsellers).
     * @param entryDeadline До какой даты можно добавить товар в акцию «Бестселлеры Маркета».  Параметр возвращается только для текущих и будущих акций «Бестселлеры Маркета». 
     */
    public GetPromoBestsellerInfoDTO(
        Boolean bestseller, 
        OffsetDateTime entryDeadline
    ) {
        this.bestseller = bestseller;
        this.entryDeadline = entryDeadline;
    }



    /**
     * Является ли акция «Бестселлером Маркета». Подробнее об этой акции читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/bestsellers).
     * @return bestseller
     */
    public Boolean getBestseller() {
        return bestseller;
    }

    public void setBestseller(Boolean bestseller) {
        this.bestseller = bestseller;
    }

    /**
     * До какой даты можно добавить товар в акцию «Бестселлеры Маркета».  Параметр возвращается только для текущих и будущих акций «Бестселлеры Маркета». 
     * @return entryDeadline
     */
    public OffsetDateTime getEntryDeadline() {
        return entryDeadline;
    }

    public void setEntryDeadline(OffsetDateTime entryDeadline) {
        this.entryDeadline = entryDeadline;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetPromoBestsellerInfoDTO {\n");
        
        sb.append("    bestseller: ").append(toIndentedString(bestseller)).append("\n");
        sb.append("    entryDeadline: ").append(toIndentedString(entryDeadline)).append("\n");
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

