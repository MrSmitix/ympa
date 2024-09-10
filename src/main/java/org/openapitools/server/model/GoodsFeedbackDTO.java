package org.openapitools.server.model;

import java.time.OffsetDateTime;
import org.openapitools.server.model.GoodsFeedbackDescriptionDTO;
import org.openapitools.server.model.GoodsFeedbackIdentifiersDTO;
import org.openapitools.server.model.GoodsFeedbackMediaDTO;
import org.openapitools.server.model.GoodsFeedbackStatisticsDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Отзыв о товаре.
 */
public class GoodsFeedbackDTO   {

    private Long feedbackId;
    private OffsetDateTime createdAt;
    private Boolean needReaction;
    private GoodsFeedbackIdentifiersDTO identifiers;
    private String author;
    private GoodsFeedbackDescriptionDTO description;
    private GoodsFeedbackMediaDTO media;
    private GoodsFeedbackStatisticsDTO statistics;

    /**
     * Default constructor.
     */
    public GoodsFeedbackDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create GoodsFeedbackDTO.
     *
     * @param feedbackId Идентификатор отзыва. 
     * @param createdAt Дата и время создания отзыва.
     * @param needReaction Нужен ли ответ на отзыв.
     * @param identifiers identifiers
     * @param author Имя автора отзыва.
     * @param description description
     * @param media media
     * @param statistics statistics
     */
    public GoodsFeedbackDTO(
        Long feedbackId, 
        OffsetDateTime createdAt, 
        Boolean needReaction, 
        GoodsFeedbackIdentifiersDTO identifiers, 
        String author, 
        GoodsFeedbackDescriptionDTO description, 
        GoodsFeedbackMediaDTO media, 
        GoodsFeedbackStatisticsDTO statistics
    ) {
        this.feedbackId = feedbackId;
        this.createdAt = createdAt;
        this.needReaction = needReaction;
        this.identifiers = identifiers;
        this.author = author;
        this.description = description;
        this.media = media;
        this.statistics = statistics;
    }



    /**
     * Идентификатор отзыва. 
     * @return feedbackId
     */
    public Long getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(Long feedbackId) {
        this.feedbackId = feedbackId;
    }

    /**
     * Дата и время создания отзыва.
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Нужен ли ответ на отзыв.
     * @return needReaction
     */
    public Boolean getNeedReaction() {
        return needReaction;
    }

    public void setNeedReaction(Boolean needReaction) {
        this.needReaction = needReaction;
    }

    /**
     * Get identifiers
     * @return identifiers
     */
    public GoodsFeedbackIdentifiersDTO getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(GoodsFeedbackIdentifiersDTO identifiers) {
        this.identifiers = identifiers;
    }

    /**
     * Имя автора отзыва.
     * @return author
     */
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Get description
     * @return description
     */
    public GoodsFeedbackDescriptionDTO getDescription() {
        return description;
    }

    public void setDescription(GoodsFeedbackDescriptionDTO description) {
        this.description = description;
    }

    /**
     * Get media
     * @return media
     */
    public GoodsFeedbackMediaDTO getMedia() {
        return media;
    }

    public void setMedia(GoodsFeedbackMediaDTO media) {
        this.media = media;
    }

    /**
     * Get statistics
     * @return statistics
     */
    public GoodsFeedbackStatisticsDTO getStatistics() {
        return statistics;
    }

    public void setStatistics(GoodsFeedbackStatisticsDTO statistics) {
        this.statistics = statistics;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        if (o == null) {
          return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

