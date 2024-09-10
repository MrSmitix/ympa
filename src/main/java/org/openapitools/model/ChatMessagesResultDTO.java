package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ChatMessageDTO;
import org.openapitools.model.ForwardScrollingPagerDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация о сообщениях.
 */

@Schema(name = "ChatMessagesResultDTO", description = "Информация о сообщениях.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ChatMessagesResultDTO {

  private Long orderId;

  @Valid
  private List<@Valid ChatMessageDTO> messages = new ArrayList<>();

  private ForwardScrollingPagerDTO paging;

  public ChatMessagesResultDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ChatMessagesResultDTO(Long orderId, List<@Valid ChatMessageDTO> messages) {
    this.orderId = orderId;
    this.messages = messages;
  }

  public ChatMessagesResultDTO orderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Идентификатор заказа.
   * @return orderId
   */
  @NotNull 
  @Schema(name = "orderId", description = "Идентификатор заказа.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("orderId")
  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  public ChatMessagesResultDTO messages(List<@Valid ChatMessageDTO> messages) {
    this.messages = messages;
    return this;
  }

  public ChatMessagesResultDTO addMessagesItem(ChatMessageDTO messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<>();
    }
    this.messages.add(messagesItem);
    return this;
  }

  /**
   * Информация о сообщениях.
   * @return messages
   */
  @NotNull @Valid 
  @Schema(name = "messages", description = "Информация о сообщениях.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("messages")
  public List<@Valid ChatMessageDTO> getMessages() {
    return messages;
  }

  public void setMessages(List<@Valid ChatMessageDTO> messages) {
    this.messages = messages;
  }

  public ChatMessagesResultDTO paging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

  /**
   * Get paging
   * @return paging
   */
  @Valid 
  @Schema(name = "paging", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paging")
  public ForwardScrollingPagerDTO getPaging() {
    return paging;
  }

  public void setPaging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatMessagesResultDTO chatMessagesResultDTO = (ChatMessagesResultDTO) o;
    return Objects.equals(this.orderId, chatMessagesResultDTO.orderId) &&
        Objects.equals(this.messages, chatMessagesResultDTO.messages) &&
        Objects.equals(this.paging, chatMessagesResultDTO.paging);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, messages, paging);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatMessagesResultDTO {\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

