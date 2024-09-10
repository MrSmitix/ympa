package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.CategoryApiService;
import org.openapitools.api.factories.CategoryApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import org.openapitools.model.GetCategoryContentParametersResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/category/{categoryId}/parameters")


@io.swagger.annotations.Api(description = "the category API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-09-09T22:21:22.142726883Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CategoryApi  {
   private final CategoryApiService delegate = CategoryApiServiceFactory.getCategoryApi();

    @POST
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Списки характеристик товаров по категориям", notes = "Возвращает список характеристик с допустимыми значениями для заданной категории.  |**⚙️ Лимит:** 50 категорий в минуту | |-| ", response = GetCategoryContentParametersResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "OAuth", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров")
        })
    }, tags={ "content","dbs","fby","fbs","express", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Список характеристик товаров из заданной категории.", response = GetCategoryContentParametersResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = GetCategoryContentParametersResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = GetCategoryContentParametersResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = GetCategoryContentParametersResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = GetCategoryContentParametersResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = GetCategoryContentParametersResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = GetCategoryContentParametersResponse.class) })
    public Response getCategoryContentParameters(@ApiParam(value = "Идентификатор категории на Маркете.  Чтобы узнать идентификатор категории, к которой относится интересующий вас товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). ",required=true) @PathParam("categoryId") Long categoryId
)
    throws NotFoundException {
        return delegate.getCategoryContentParameters(categoryId);
    }
}
