/*
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.controller;

import io.micronaut.http.annotation.*;
import io.micronaut.core.annotation.Nullable;
import io.micronaut.core.convert.format.Format;
import io.micronaut.security.annotation.Secured;
import io.micronaut.security.rules.SecurityRule;
import reactor.core.publisher.Mono;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.exceptions.HttpStatusException;
import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import org.openapitools.model.GetBusinessSettingsResponse;
import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-09-09T22:20:41.711842593Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Controller
@Tag(name = "Businesses", description = "The Businesses API")
public class BusinessesController {
    /**
     * Настройки кабинета
     * Возвращает информацию о настройках кабинета, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| 
     *
     * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  (required)
     * @return GetBusinessSettingsResponse
     */
    @Operation(
        operationId = "getBusinessSettings",
        summary = "Настройки кабинета",
        tags = { "businesses", "dbs", "fbs", "fby", "express" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Настройки кабинета.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = GetBusinessSettingsResponse.class))
            }),
            @ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ApiClientDataErrorResponse.class))
            }),
            @ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ApiUnauthorizedErrorResponse.class))
            }),
            @ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ApiForbiddenErrorResponse.class))
            }),
            @ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ApiNotFoundErrorResponse.class))
            }),
            @ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ApiLimitErrorResponse.class))
            }),
            @ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ApiServerErrorResponse.class))
            })
        },
        parameters = {
            @Parameter(name = "businessId", description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true)
        },
        security = {
            @SecurityRequirement(name = "OAuth", scopes = { "market:partner-api" })
        }
    )
    @Post(uri="/businesses/{businessId}/settings")
    @Produces(value = {"application/json"})
    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<GetBusinessSettingsResponse> getBusinessSettings(
        @PathVariable(value="businessId") @NotNull Long businessId
    ) {
        // TODO implement getBusinessSettings();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }

}
