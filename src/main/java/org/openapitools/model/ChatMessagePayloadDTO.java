package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация о приложенных к сообщению файлах.
 */

@Schema(name = "ChatMessagePayloadDTO", description = "Информация о приложенных к сообщению файлах.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ChatMessagePayloadDTO {

  private String name;

  private String url;

  private Integer size;

  public ChatMessagePayloadDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ChatMessagePayloadDTO(String name, String url, Integer size) {
    this.name = name;
    this.url = url;
    this.size = size;
  }

  public ChatMessagePayloadDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Имя файла.
   * @return name
   */
  @NotNull 
  @Schema(name = "name", description = "Имя файла.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ChatMessagePayloadDTO url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Ссылка для скачивания файла.
   * @return url
   */
  @NotNull 
  @Schema(name = "url", description = "Ссылка для скачивания файла.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public ChatMessagePayloadDTO size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * Размер файла в байтах.
   * @return size
   */
  @NotNull 
  @Schema(name = "size", description = "Размер файла в байтах.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatMessagePayloadDTO chatMessagePayloadDTO = (ChatMessagePayloadDTO) o;
    return Objects.equals(this.name, chatMessagePayloadDTO.name) &&
        Objects.equals(this.url, chatMessagePayloadDTO.url) &&
        Objects.equals(this.size, chatMessagePayloadDTO.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, url, size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatMessagePayloadDTO {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

