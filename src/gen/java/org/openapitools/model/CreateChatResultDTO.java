package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация о созданном чате.
 */
@ApiModel(description="Информация о созданном чате.")

public class CreateChatResultDTO  {
  
 /**
  * Идентификатор чата.
  */
  @ApiModelProperty(required = true, value = "Идентификатор чата.")
  private Long chatId;
 /**
  * Идентификатор чата.
  * @return chatId
  */
  @JsonProperty("chatId")
  @NotNull
  public Long getChatId() {
    return chatId;
  }

  /**
   * Sets the <code>chatId</code> property.
   */
 public void setChatId(Long chatId) {
    this.chatId = chatId;
  }

  /**
   * Sets the <code>chatId</code> property.
   */
  public CreateChatResultDTO chatId(Long chatId) {
    this.chatId = chatId;
    return this;
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
    return Objects.equals(this.chatId, createChatResultDTO.chatId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chatId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateChatResultDTO {\n");
    
    sb.append("    chatId: ").append(toIndentedString(chatId)).append("\n");
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

