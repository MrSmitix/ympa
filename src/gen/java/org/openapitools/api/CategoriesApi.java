package org.openapitools.api;

import org.openapitools.api.CategoriesApiService;
import org.openapitools.api.factories.CategoriesApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import org.openapitools.model.GetCategoriesMaxSaleQuantumRequest;
import org.openapitools.model.GetCategoriesMaxSaleQuantumResponse;
import org.openapitools.model.GetCategoriesRequest;
import org.openapitools.model.GetCategoriesResponse;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/categories")


@io.swagger.annotations.Api(description = "the categories API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-09-09T22:24:17.175492804Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CategoriesApi  {
   private final CategoriesApiService delegate;

   public CategoriesApi(@Context ServletConfig servletContext) {
      CategoriesApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("CategoriesApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (CategoriesApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = CategoriesApiServiceFactory.getCategoriesApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/max-sale-quantum")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Лимит на установку кванта продажи и минимального количества товаров в заказе", notes = "Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.  Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.  Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).  |**⚙️ Лимит:** 1 000 запросов в час| |-| ", response = GetCategoriesMaxSaleQuantumResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "OAuth", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров")
        })
    }, tags={ "categories","fby","fbs","dbs","express", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Лимит на установку кванта и минимального количества товаров.", response = GetCategoriesMaxSaleQuantumResponse.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = ApiNotFoundErrorResponse.class),
        @io.swagger.annotations.ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @io.swagger.annotations.ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class)
    })
    public Response getCategoriesMaxSaleQuantum(@ApiParam(value = "", required = true) @NotNull @Valid  GetCategoriesMaxSaleQuantumRequest getCategoriesMaxSaleQuantumRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getCategoriesMaxSaleQuantum(getCategoriesMaxSaleQuantumRequest, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/tree")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Дерево категорий", notes = "Возвращает дерево категорий Маркета.  |**⚙️ Лимит:** 1 000 запросов в час| |-| ", response = GetCategoriesResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "OAuth", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров")
        })
    }, tags={ "categories","fby","fbs","dbs","express", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Категории Маркета.", response = GetCategoriesResponse.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = ApiNotFoundErrorResponse.class),
        @io.swagger.annotations.ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @io.swagger.annotations.ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class)
    })
    public Response getCategoriesTree(@ApiParam(value = "") @Valid  GetCategoriesRequest getCategoriesRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getCategoriesTree(getCategoriesRequest, securityContext);
    }
}
