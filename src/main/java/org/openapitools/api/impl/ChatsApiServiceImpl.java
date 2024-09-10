package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import org.openapitools.model.CreateChatRequest;
import org.openapitools.model.CreateChatResponse;
import org.openapitools.model.EmptyApiResponse;
import java.io.File;
import org.openapitools.model.GetChatHistoryRequest;
import org.openapitools.model.GetChatHistoryResponse;
import org.openapitools.model.GetChatsRequest;
import org.openapitools.model.GetChatsResponse;
import org.openapitools.model.SendMessageToChatRequest;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

/**
 * Партнерский API Маркета
 *
 * <p>API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 */
public class ChatsApiServiceImpl implements ChatsApi {
    /**
     * Создание нового чата с покупателем
     *
     * Создает новый чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
     *
     */
    @Override
    public CreateChatResponse createChat(Long businessId, CreateChatRequest createChatRequest) {
        // TODO: Implement...
        return null;
    }

    /**
     * Получение истории сообщений в чате
     *
     * Возвращает историю сообщений в чате с покупателем.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
     *
     */
    @Override
    public GetChatHistoryResponse getChatHistory(Long businessId, Long chatId, GetChatHistoryRequest getChatHistoryRequest, String pageToken, Integer limit) {
        // TODO: Implement...
        return null;
    }

    /**
     * Получение доступных чатов
     *
     * Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
     *
     */
    @Override
    public GetChatsResponse getChats(Long businessId, GetChatsRequest getChatsRequest, String pageToken, Integer limit) {
        // TODO: Implement...
        return null;
    }

    /**
     * Отправка файла в чат
     *
     * Отправляет файл в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
     *
     */
    @Override
    public EmptyApiResponse sendFileToChat(Long businessId, Long chatId,  Attachment _fileDetail) {
        // TODO: Implement...
        return null;
    }

    /**
     * Отправка сообщения в чат
     *
     * Отправляет сообщение в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
     *
     */
    @Override
    public EmptyApiResponse sendMessageToChat(Long businessId, Long chatId, SendMessageToChatRequest sendMessageToChatRequest) {
        // TODO: Implement...
        return null;
    }

}
