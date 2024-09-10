package org.openapitools.server.model;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.FeedbackCommentAuthorDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Комментарий к отзыву на магазин.
 */
public class FeedbackCommentDTO   {

    private Long id;
    private Long parentId;
    private String body;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
    private FeedbackCommentAuthorDTO author;
    private List<@Valid FeedbackCommentDTO> children;

    /**
     * Default constructor.
     */
    public FeedbackCommentDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create FeedbackCommentDTO.
     *
     * @param id Идентификатор ответа.
     * @param parentId Идентификатор родительского ответа.
     * @param body Текст ответа.
     * @param createdAt Дата и время создания ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;. 
     * @param updatedAt Дата и время изменения ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;. 
     * @param author author
     * @param children Дочерние ответы.
     */
    public FeedbackCommentDTO(
        Long id, 
        Long parentId, 
        String body, 
        OffsetDateTime createdAt, 
        OffsetDateTime updatedAt, 
        FeedbackCommentAuthorDTO author, 
        List<@Valid FeedbackCommentDTO> children
    ) {
        this.id = id;
        this.parentId = parentId;
        this.body = body;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.author = author;
        this.children = children;
    }



    /**
     * Идентификатор ответа.
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Идентификатор родительского ответа.
     * @return parentId
     */
    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * Текст ответа.
     * @return body
     */
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    /**
     * Дата и время создания ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Дата и время изменения ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Get author
     * @return author
     */
    public FeedbackCommentAuthorDTO getAuthor() {
        return author;
    }

    public void setAuthor(FeedbackCommentAuthorDTO author) {
        this.author = author;
    }

    /**
     * Дочерние ответы.
     * @return children
     */
    public List<@Valid FeedbackCommentDTO> getChildren() {
        return children;
    }

    public void setChildren(List<@Valid FeedbackCommentDTO> children) {
        this.children = children;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FeedbackCommentDTO {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    children: ").append(toIndentedString(children)).append("\n");
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

