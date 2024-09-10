/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI document version: LATEST
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.model.GoodsFeedbackDescriptionDTO;
import org.openapitools.model.GoodsFeedbackIdentifiersDTO;
import org.openapitools.model.GoodsFeedbackMediaDTO;
import org.openapitools.model.GoodsFeedbackStatisticsDTO;



/**
 * Отзыв о товаре.
 */

@ApiModel(description = "Отзыв о товаре.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GoodsFeedbackDTO   {
  
  private Long feedbackId;
  private Date createdAt;
  private Boolean needReaction;
  private GoodsFeedbackIdentifiersDTO identifiers;
  private String author;
  private GoodsFeedbackDescriptionDTO description;
  private GoodsFeedbackMediaDTO media;
  private GoodsFeedbackStatisticsDTO statistics;

  /**
   * Идентификатор отзыва. 
   */
  public GoodsFeedbackDTO feedbackId(Long feedbackId) {
    this.feedbackId = feedbackId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор отзыва. ")
  @JsonProperty("feedbackId")
  public Long getFeedbackId() {
    return feedbackId;
  }
  public void setFeedbackId(Long feedbackId) {
    this.feedbackId = feedbackId;
  }

  /**
   * Дата и время создания отзыва.
   */
  public GoodsFeedbackDTO createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Дата и время создания отзыва.")
  @JsonProperty("createdAt")
  public Date getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Нужен ли ответ на отзыв.
   */
  public GoodsFeedbackDTO needReaction(Boolean needReaction) {
    this.needReaction = needReaction;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Нужен ли ответ на отзыв.")
  @JsonProperty("needReaction")
  public Boolean getNeedReaction() {
    return needReaction;
  }
  public void setNeedReaction(Boolean needReaction) {
    this.needReaction = needReaction;
  }

  /**
   */
  public GoodsFeedbackDTO identifiers(GoodsFeedbackIdentifiersDTO identifiers) {
    this.identifiers = identifiers;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("identifiers")
  public GoodsFeedbackIdentifiersDTO getIdentifiers() {
    return identifiers;
  }
  public void setIdentifiers(GoodsFeedbackIdentifiersDTO identifiers) {
    this.identifiers = identifiers;
  }

  /**
   * Имя автора отзыва.
   */
  public GoodsFeedbackDTO author(String author) {
    this.author = author;
    return this;
  }

  
  @ApiModelProperty(value = "Имя автора отзыва.")
  @JsonProperty("author")
  public String getAuthor() {
    return author;
  }
  public void setAuthor(String author) {
    this.author = author;
  }

  /**
   */
  public GoodsFeedbackDTO description(GoodsFeedbackDescriptionDTO description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public GoodsFeedbackDescriptionDTO getDescription() {
    return description;
  }
  public void setDescription(GoodsFeedbackDescriptionDTO description) {
    this.description = description;
  }

  /**
   */
  public GoodsFeedbackDTO media(GoodsFeedbackMediaDTO media) {
    this.media = media;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("media")
  public GoodsFeedbackMediaDTO getMedia() {
    return media;
  }
  public void setMedia(GoodsFeedbackMediaDTO media) {
    this.media = media;
  }

  /**
   */
  public GoodsFeedbackDTO statistics(GoodsFeedbackStatisticsDTO statistics) {
    this.statistics = statistics;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("statistics")
  public GoodsFeedbackStatisticsDTO getStatistics() {
    return statistics;
  }
  public void setStatistics(GoodsFeedbackStatisticsDTO statistics) {
    this.statistics = statistics;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoodsFeedbackDTO goodsFeedbackDTO = (GoodsFeedbackDTO) o;
    return Objects.equals(feedbackId, goodsFeedbackDTO.feedbackId) &&
        Objects.equals(createdAt, goodsFeedbackDTO.createdAt) &&
        Objects.equals(needReaction, goodsFeedbackDTO.needReaction) &&
        Objects.equals(identifiers, goodsFeedbackDTO.identifiers) &&
        Objects.equals(author, goodsFeedbackDTO.author) &&
        Objects.equals(description, goodsFeedbackDTO.description) &&
        Objects.equals(media, goodsFeedbackDTO.media) &&
        Objects.equals(statistics, goodsFeedbackDTO.statistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedbackId, createdAt, needReaction, identifiers, author, description, media, statistics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoodsFeedbackDTO {\n");
    
    sb.append("    feedbackId: ").append(toIndentedString(feedbackId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    needReaction: ").append(toIndentedString(needReaction)).append("\n");
    sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
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

