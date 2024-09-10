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
import org.openapitools.model.CreateChatRequest;
import org.openapitools.model.CreateChatResponse;
import org.openapitools.model.EmptyApiResponse;
import org.openapitools.model.GetChatHistoryRequest;
import org.openapitools.model.GetChatHistoryResponse;
import org.openapitools.model.GetChatsRequest;
import org.openapitools.model.GetChatsResponse;
import org.openapitools.model.SendMessageToChatRequest;
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
@Tag(name = "Chats", description = "The Chats API")
public class ChatsController {
    /**
     * Создание нового чата с покупателем
     * Создает новый чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
     *
     * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  (required)
     * @param createChatRequest description (required)
     * @return CreateChatResponse
     */
    @Operation(
        operationId = "createChat",
        summary = "Создание нового чата с покупателем",
        tags = { "chats", "dbs", "fbs", "fby", "express" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Все получилось: чат создан. ", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = CreateChatResponse.class))
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
            @Parameter(name = "businessId", description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true),
            @Parameter(name = "createChatRequest", description = "description", required = true)
        },
        security = {
            @SecurityRequirement(name = "OAuth", scopes = { "market:partner-api" })
        }
    )
    @Post(uri="/businesses/{businessId}/chats/new")
    @Produces(value = {"application/json"})
    @Consumes(value = {"application/json"})
    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<CreateChatResponse> createChat(
        @PathVariable(value="businessId") @NotNull Long businessId, 
        @Body @NotNull @Valid CreateChatRequest createChatRequest
    ) {
        // TODO implement createChat();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }


    /**
     * Получение истории сообщений в чате
     * Возвращает историю сообщений в чате с покупателем.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
     *
     * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  (required)
     * @param chatId Идентификатор чата. (required)
     * @param getChatHistoryRequest description (required)
     * @param pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  (optional)
     * @param limit Количество значений на одной странице.  (optional)
     * @return GetChatHistoryResponse
     */
    @Operation(
        operationId = "getChatHistory",
        summary = "Получение истории сообщений в чате",
        tags = { "chats", "dbs", "fbs", "fby", "express" },
        responses = {
            @ApiResponse(responseCode = "200", description = "История сообщений успешно получена. ", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = GetChatHistoryResponse.class))
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
            @Parameter(name = "businessId", description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true),
            @Parameter(name = "chatId", description = "Идентификатор чата.", required = true),
            @Parameter(name = "getChatHistoryRequest", description = "description", required = true),
            @Parameter(name = "pageToken", description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. "),
            @Parameter(name = "limit", description = "Количество значений на одной странице. ")
        },
        security = {
            @SecurityRequirement(name = "OAuth", scopes = { "market:partner-api" })
        }
    )
    @Post(uri="/businesses/{businessId}/chats/history")
    @Produces(value = {"application/json"})
    @Consumes(value = {"application/json"})
    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<GetChatHistoryResponse> getChatHistory(
        @PathVariable(value="businessId") @NotNull Long businessId, 
        @QueryValue(value="chatId") @NotNull Long chatId, 
        @Body @NotNull @Valid GetChatHistoryRequest getChatHistoryRequest, 
        @QueryValue(value="page_token") @Nullable String pageToken, 
        @QueryValue(value="limit") @Nullable Integer limit
    ) {
        // TODO implement getChatHistory();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }


    /**
     * Получение доступных чатов
     * Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
     *
     * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  (required)
     * @param getChatsRequest description (required)
     * @param pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  (optional)
     * @param limit Количество значений на одной странице.  (optional)
     * @return GetChatsResponse
     */
    @Operation(
        operationId = "getChats",
        summary = "Получение доступных чатов",
        tags = { "chats", "dbs", "fbs", "fby", "express" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Список чатов. ", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = GetChatsResponse.class))
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
            @Parameter(name = "businessId", description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true),
            @Parameter(name = "getChatsRequest", description = "description", required = true),
            @Parameter(name = "pageToken", description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. "),
            @Parameter(name = "limit", description = "Количество значений на одной странице. ")
        },
        security = {
            @SecurityRequirement(name = "OAuth", scopes = { "market:partner-api" })
        }
    )
    @Post(uri="/businesses/{businessId}/chats")
    @Produces(value = {"application/json"})
    @Consumes(value = {"application/json"})
    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<GetChatsResponse> getChats(
        @PathVariable(value="businessId") @NotNull Long businessId, 
        @Body @NotNull @Valid GetChatsRequest getChatsRequest, 
        @QueryValue(value="page_token") @Nullable String pageToken, 
        @QueryValue(value="limit") @Nullable Integer limit
    ) {
        // TODO implement getChats();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }


    /**
     * Отправка файла в чат
     * Отправляет файл в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
     *
     * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  (required)
     * @param chatId Идентификатор чата. (required)
     * @param _file Содержимое файла. Максимальный размер файла — 5 Мбайт. (required)
     * @return EmptyApiResponse
     */
    @Operation(
        operationId = "sendFileToChat",
        summary = "Отправка файла в чат",
        tags = { "chats", "dbs", "fbs", "fby", "express" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Пустой ответ. Означает, что файл отправлен.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = EmptyApiResponse.class))
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
            @Parameter(name = "businessId", description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true),
            @Parameter(name = "chatId", description = "Идентификатор чата.", required = true),
            @Parameter(name = "_file", description = "Содержимое файла. Максимальный размер файла — 5 Мбайт.", required = true)
        },
        security = {
            @SecurityRequirement(name = "OAuth", scopes = { "market:partner-api" })
        }
    )
    @Post(uri="/businesses/{businessId}/chats/file/send")
    @Produces(value = {"application/json"})
    @Consumes(value = {"multipart/form-data"})
    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<EmptyApiResponse> sendFileToChat(
        @PathVariable(value="businessId") @NotNull Long businessId, 
        @QueryValue(value="chatId") @NotNull Long chatId, 
        @NotNull CompletedFileUpload _file
    ) {
        // TODO implement sendFileToChat();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }


    /**
     * Отправка сообщения в чат
     * Отправляет сообщение в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
     *
     * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  (required)
     * @param chatId Идентификатор чата. (required)
     * @param sendMessageToChatRequest description (required)
     * @return EmptyApiResponse
     */
    @Operation(
        operationId = "sendMessageToChat",
        summary = "Отправка сообщения в чат",
        tags = { "chats", "dbs", "fbs", "fby", "express" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Пустой ответ. Означает, что сообщение отправлено.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = EmptyApiResponse.class))
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
            @Parameter(name = "businessId", description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true),
            @Parameter(name = "chatId", description = "Идентификатор чата.", required = true),
            @Parameter(name = "sendMessageToChatRequest", description = "description", required = true)
        },
        security = {
            @SecurityRequirement(name = "OAuth", scopes = { "market:partner-api" })
        }
    )
    @Post(uri="/businesses/{businessId}/chats/message")
    @Produces(value = {"application/json"})
    @Consumes(value = {"application/json"})
    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<EmptyApiResponse> sendMessageToChat(
        @PathVariable(value="businessId") @NotNull Long businessId, 
        @QueryValue(value="chatId") @NotNull Long chatId, 
        @Body @NotNull @Valid SendMessageToChatRequest sendMessageToChatRequest
    ) {
        // TODO implement sendMessageToChat();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }

}
