/**
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

package org.openapitools.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Информация о созданном чате.
 **/
@ApiModel(description = "Информация о созданном чате.")
public class CreateChatResultDTO {
  
  @SerializedName("chatId")
  private Long chatId = null;

  /**
   * Идентификатор чата.
   **/
  @ApiModelProperty(required = true, value = "Идентификатор чата.")
  public Long getChatId() {
    return chatId;
  }
  public void setChatId(Long chatId) {
    this.chatId = chatId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateChatResultDTO createChatResultDTO = (CreateChatResultDTO) o;
    return (this.chatId == null ? createChatResultDTO.chatId == null : this.chatId.equals(createChatResultDTO.chatId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.chatId == null ? 0: this.chatId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateChatResultDTO {\n");
    
    sb.append("  chatId: ").append(chatId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
