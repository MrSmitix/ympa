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
import io.micronaut.http.multipart.CompletedFileUpload;
import org.openapitools.model.GetOrderLabelsDataResponse;
import org.openapitools.model.PageFormatType;
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
@Tag(name = "OrderLabels", description = "The OrderLabels API")
public class OrderLabelsController {
    /**
     * Готовый ярлык‑наклейка для коробки в заказе
     * Формирует ярлык‑наклейку для коробки в заказе и возвращает ярлык в PDF‑файле.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     *
     * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  (required)
     * @param orderId Идентификатор заказа. (required)
     * @param shipmentId Идентификатор грузоместа. (required)
     * @param boxId Идентификатор коробки. (required)
     * @param _format Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6. (optional)
     * @return CompletedFileUpload
     */
    @Operation(
        operationId = "generateOrderLabel",
        summary = "Готовый ярлык‑наклейка для коробки в заказе",
        tags = { "order-labels", "fbs", "dbs", "express" },
        responses = {
            @ApiResponse(responseCode = "200", description = "PDF‑файл с ярлыками для коробки. Файл содержит одну страницу с ярлыком.", content = {
                @Content(mediaType = "application/pdf", schema = @Schema(implementation = CompletedFileUpload.class)),
                @Content(mediaType = "application/json", schema = @Schema(implementation = CompletedFileUpload.class))
            }),
            @ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = {
                @Content(mediaType = "application/pdf", schema = @Schema(implementation = ApiClientDataErrorResponse.class)),
                @Content(mediaType = "application/json", schema = @Schema(implementation = ApiClientDataErrorResponse.class))
            }),
            @ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = {
                @Content(mediaType = "application/pdf", schema = @Schema(implementation = ApiUnauthorizedErrorResponse.class)),
                @Content(mediaType = "application/json", schema = @Schema(implementation = ApiUnauthorizedErrorResponse.class))
            }),
            @ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = {
                @Content(mediaType = "application/pdf", schema = @Schema(implementation = ApiForbiddenErrorResponse.class)),
                @Content(mediaType = "application/json", schema = @Schema(implementation = ApiForbiddenErrorResponse.class))
            }),
            @ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = {
                @Content(mediaType = "application/pdf", schema = @Schema(implementation = ApiNotFoundErrorResponse.class)),
                @Content(mediaType = "application/json", schema = @Schema(implementation = ApiNotFoundErrorResponse.class))
            }),
            @ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = {
                @Content(mediaType = "application/pdf", schema = @Schema(implementation = ApiLimitErrorResponse.class)),
                @Content(mediaType = "application/json", schema = @Schema(implementation = ApiLimitErrorResponse.class))
            }),
            @ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = {
                @Content(mediaType = "application/pdf", schema = @Schema(implementation = ApiServerErrorResponse.class)),
                @Content(mediaType = "application/json", schema = @Schema(implementation = ApiServerErrorResponse.class))
            })
        },
        parameters = {
            @Parameter(name = "campaignId", description = "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true),
            @Parameter(name = "orderId", description = "Идентификатор заказа.", required = true),
            @Parameter(name = "shipmentId", description = "Идентификатор грузоместа.", required = true),
            @Parameter(name = "boxId", description = "Идентификатор коробки.", required = true),
            @Parameter(name = "_format", description = "Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6.")
        },
        security = {
            @SecurityRequirement(name = "OAuth", scopes = { "market:partner-api" })
        }
    )
    @Get(uri="/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label")
    @Produces(value = {"application/pdf", "application/json"})
    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<CompletedFileUpload> generateOrderLabel(
        @PathVariable(value="campaignId") @NotNull Long campaignId, 
        @PathVariable(value="orderId") @NotNull Long orderId, 
        @PathVariable(value="shipmentId") @NotNull Long shipmentId, 
        @PathVariable(value="boxId") @NotNull Long boxId, 
        @QueryValue(value="format") @Nullable PageFormatType _format
    ) {
        // TODO implement generateOrderLabel();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }


    /**
     * Готовые ярлыки‑наклейки на все коробки в одном заказе
     * Возвращает PDF-файл с ярлыками, которые нужно наклеить на коробки перед отгрузкой. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  На вход нужно передать идентификатор заказа и один необязательный параметр, который управляет версткой PDF-файла.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     *
     * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  (required)
     * @param orderId Идентификатор заказа. (required)
     * @param _format Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6. (optional)
     * @return CompletedFileUpload
     */
    @Operation(
        operationId = "generateOrderLabels",
        summary = "Готовые ярлыки‑наклейки на все коробки в одном заказе",
        tags = { "order-labels", "fbs", "dbs", "express" },
        responses = {
            @ApiResponse(responseCode = "200", description = "PDF‑файл с ярлыками на все коробки.", content = {
                @Content(mediaType = "application/pdf", schema = @Schema(implementation = CompletedFileUpload.class)),
                @Content(mediaType = "application/json", schema = @Schema(implementation = CompletedFileUpload.class))
            }),
            @ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = {
                @Content(mediaType = "application/pdf", schema = @Schema(implementation = ApiClientDataErrorResponse.class)),
                @Content(mediaType = "application/json", schema = @Schema(implementation = ApiClientDataErrorResponse.class))
            }),
            @ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = {
                @Content(mediaType = "application/pdf", schema = @Schema(implementation = ApiUnauthorizedErrorResponse.class)),
                @Content(mediaType = "application/json", schema = @Schema(implementation = ApiUnauthorizedErrorResponse.class))
            }),
            @ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = {
                @Content(mediaType = "application/pdf", schema = @Schema(implementation = ApiForbiddenErrorResponse.class)),
                @Content(mediaType = "application/json", schema = @Schema(implementation = ApiForbiddenErrorResponse.class))
            }),
            @ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = {
                @Content(mediaType = "application/pdf", schema = @Schema(implementation = ApiNotFoundErrorResponse.class)),
                @Content(mediaType = "application/json", schema = @Schema(implementation = ApiNotFoundErrorResponse.class))
            }),
            @ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = {
                @Content(mediaType = "application/pdf", schema = @Schema(implementation = ApiLimitErrorResponse.class)),
                @Content(mediaType = "application/json", schema = @Schema(implementation = ApiLimitErrorResponse.class))
            }),
            @ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = {
                @Content(mediaType = "application/pdf", schema = @Schema(implementation = ApiServerErrorResponse.class)),
                @Content(mediaType = "application/json", schema = @Schema(implementation = ApiServerErrorResponse.class))
            })
        },
        parameters = {
            @Parameter(name = "campaignId", description = "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true),
            @Parameter(name = "orderId", description = "Идентификатор заказа.", required = true),
            @Parameter(name = "_format", description = "Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6.")
        },
        security = {
            @SecurityRequirement(name = "OAuth", scopes = { "market:partner-api" })
        }
    )
    @Get(uri="/campaigns/{campaignId}/orders/{orderId}/delivery/labels")
    @Produces(value = {"application/pdf", "application/json"})
    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<CompletedFileUpload> generateOrderLabels(
        @PathVariable(value="campaignId") @NotNull Long campaignId, 
        @PathVariable(value="orderId") @NotNull Long orderId, 
        @QueryValue(value="format") @Nullable PageFormatType _format
    ) {
        // TODO implement generateOrderLabels();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }


    /**
     * Данные для самостоятельного изготовления ярлыков
     * Возвращает информацию на ярлыках, которые клеятся на коробки в заказе.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     *
     * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  (required)
     * @param orderId Идентификатор заказа. (required)
     * @return GetOrderLabelsDataResponse
     */
    @Operation(
        operationId = "getOrderLabelsData",
        summary = "Данные для самостоятельного изготовления ярлыков",
        tags = { "order-labels", "fbs", "dbs", "express" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Информация для печати ярлыков.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = GetOrderLabelsDataResponse.class))
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
            @Parameter(name = "campaignId", description = "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true),
            @Parameter(name = "orderId", description = "Идентификатор заказа.", required = true)
        },
        security = {
            @SecurityRequirement(name = "OAuth", scopes = { "market:partner-api" })
        }
    )
    @Get(uri="/campaigns/{campaignId}/orders/{orderId}/delivery/labels/data")
    @Produces(value = {"application/json"})
    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<GetOrderLabelsDataResponse> getOrderLabelsData(
        @PathVariable(value="campaignId") @NotNull Long campaignId, 
        @PathVariable(value="orderId") @NotNull Long orderId
    ) {
        // TODO implement getOrderLabelsData();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }

}
