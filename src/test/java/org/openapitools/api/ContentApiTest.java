package org.openapitools.api;

import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiLockedErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import org.openapitools.model.GetCategoryContentParametersResponse;
import org.openapitools.model.GetOfferCardsContentStatusRequest;
import org.openapitools.model.GetOfferCardsContentStatusResponse;
import org.openapitools.model.UpdateOfferContentRequest;
import org.openapitools.model.UpdateOfferContentResponse;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

/**
 * API tests for ContentApi
 */
@MicronautTest
public class ContentApiTest {

    @Inject
    ContentApi api;

    
    /**
     * Списки характеристик товаров по категориям
     *
     * Возвращает список характеристик с допустимыми значениями для заданной категории.  |**⚙️ Лимит:** 50 категорий в минуту | |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getCategoryContentParametersTest() {
        // given
        Long categoryId = 56L;

        // when
        GetCategoryContentParametersResponse body = api.getCategoryContentParameters(categoryId).block();

        // then
        // TODO implement the getCategoryContentParametersTest()
    }

    
    /**
     * Получение информации о заполненности карточек магазина
     *
     * Возвращает сведения о состоянии контента для заданных товаров:  * создана ли карточка товара и в каком она статусе; * заполненность карточки в процентах; * переданные характеристики товаров; * есть ли ошибки или предупреждения, связанные с контентом; * рекомендации по заполнению карточки.  |**⚙️ Лимит:** 600 запросов в минуту| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getOfferCardsContentStatusTest() {
        // given
        Long businessId = 56L;
        String pageToken = "eyBuZXh0SWQ6IDIzNDIgfQ==";
        Integer limit = 20;
        GetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest = new GetOfferCardsContentStatusRequest();

        // when
        GetOfferCardsContentStatusResponse body = api.getOfferCardsContentStatus(businessId, pageToken, limit, getOfferCardsContentStatusRequest).block();

        // then
        // TODO implement the getOfferCardsContentStatusTest()
    }

    
    /**
     * Редактирование категорийных характеристик товара
     *
     * Редактирует характеристики товара, которые специфичны для категории, к которой он относится.  {% note warning \&quot;Здесь только то, что относится к конкретной категории\&quot; %}  Если вам нужно изменить основные параметры товара (название, описание, изображения, видео, производитель, штрихкод), воспользуйтесь запросом [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  {% endnote %}  Чтобы удалить характеристики, которые заданы в параметрах с типом &#x60;string&#x60;, передайте пустое значение.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void updateOfferContentTest() {
        // given
        Long businessId = 56L;
        UpdateOfferContentRequest updateOfferContentRequest = new UpdateOfferContentRequest(Arrays.asList());

        // when
        UpdateOfferContentResponse body = api.updateOfferContent(businessId, updateOfferContentRequest).block();

        // then
        // TODO implement the updateOfferContentTest()
    }

    
}
