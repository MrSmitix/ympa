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

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FeedbackAuthorDTO;
import org.openapitools.model.FeedbackCommentDTO;
import org.openapitools.model.FeedbackGradesDTO;
import org.openapitools.model.FeedbackOrderDTO;
import org.openapitools.model.FeedbackShopDTO;
import org.openapitools.model.FeedbackStateType;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Отзыв пользователя Яндекс Маркета об указанном магазине.
 */
@JsonPropertyOrder({
  FeedbackDTO.JSON_PROPERTY_ID,
  FeedbackDTO.JSON_PROPERTY_CREATED_AT,
  FeedbackDTO.JSON_PROPERTY_TEXT,
  FeedbackDTO.JSON_PROPERTY_STATE,
  FeedbackDTO.JSON_PROPERTY_AUTHOR,
  FeedbackDTO.JSON_PROPERTY_PRO,
  FeedbackDTO.JSON_PROPERTY_CONTRA,
  FeedbackDTO.JSON_PROPERTY_COMMENTS,
  FeedbackDTO.JSON_PROPERTY_SHOP,
  FeedbackDTO.JSON_PROPERTY_RESOLVED,
  FeedbackDTO.JSON_PROPERTY_VERIFIED,
  FeedbackDTO.JSON_PROPERTY_RECOMMEND,
  FeedbackDTO.JSON_PROPERTY_GRADES,
  FeedbackDTO.JSON_PROPERTY_ORDER
})
@JsonTypeName("FeedbackDTO")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-09-09T21:59:28.310012434Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class FeedbackDTO {
    public static final String JSON_PROPERTY_ID = "id";
    private Long id;

    public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
    private OffsetDateTime createdAt;

    public static final String JSON_PROPERTY_TEXT = "text";
    private String text;

    public static final String JSON_PROPERTY_STATE = "state";
    private FeedbackStateType state;

    public static final String JSON_PROPERTY_AUTHOR = "author";
    private FeedbackAuthorDTO author;

    public static final String JSON_PROPERTY_PRO = "pro";
    private String pro;

    public static final String JSON_PROPERTY_CONTRA = "contra";
    private String contra;

    public static final String JSON_PROPERTY_COMMENTS = "comments";
    private List<@Valid FeedbackCommentDTO> comments = new ArrayList<>();

    public static final String JSON_PROPERTY_SHOP = "shop";
    private FeedbackShopDTO shop;

    public static final String JSON_PROPERTY_RESOLVED = "resolved";
    private Boolean resolved;

    public static final String JSON_PROPERTY_VERIFIED = "verified";
    private Boolean verified;

    public static final String JSON_PROPERTY_RECOMMEND = "recommend";
    private Boolean recommend;

    public static final String JSON_PROPERTY_GRADES = "grades";
    private FeedbackGradesDTO grades;

    public static final String JSON_PROPERTY_ORDER = "order";
    private FeedbackOrderDTO order;

    public FeedbackDTO(List<@Valid FeedbackCommentDTO> comments) {
        this.comments = comments;
    }

    public FeedbackDTO id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Идентификатор отзыва.
     * @return id
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Long getId() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setId(Long id) {
        this.id = id;
    }

    public FeedbackDTO createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;. 
     * @return createdAt
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_CREATED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    @JsonProperty(JSON_PROPERTY_CREATED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public FeedbackDTO text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Комментарий автора отзыва.
     * @return text
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_TEXT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getText() {
        return text;
    }

    @JsonProperty(JSON_PROPERTY_TEXT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setText(String text) {
        this.text = text;
    }

    public FeedbackDTO state(FeedbackStateType state) {
        this.state = state;
        return this;
    }

    /**
     * Get state
     * @return state
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_STATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public FeedbackStateType getState() {
        return state;
    }

    @JsonProperty(JSON_PROPERTY_STATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setState(FeedbackStateType state) {
        this.state = state;
    }

    public FeedbackDTO author(FeedbackAuthorDTO author) {
        this.author = author;
        return this;
    }

    /**
     * Get author
     * @return author
     */
    @Valid
    @Nullable
    @JsonProperty(JSON_PROPERTY_AUTHOR)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public FeedbackAuthorDTO getAuthor() {
        return author;
    }

    @JsonProperty(JSON_PROPERTY_AUTHOR)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAuthor(FeedbackAuthorDTO author) {
        this.author = author;
    }

    public FeedbackDTO pro(String pro) {
        this.pro = pro;
        return this;
    }

    /**
     * Достоинства магазина, описанные в отзыве.
     * @return pro
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_PRO)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getPro() {
        return pro;
    }

    @JsonProperty(JSON_PROPERTY_PRO)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPro(String pro) {
        this.pro = pro;
    }

    public FeedbackDTO contra(String contra) {
        this.contra = contra;
        return this;
    }

    /**
     * Недостатки магазина, описанные в отзыве.
     * @return contra
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_CONTRA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getContra() {
        return contra;
    }

    @JsonProperty(JSON_PROPERTY_CONTRA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setContra(String contra) {
        this.contra = contra;
    }

    public FeedbackDTO comments(List<@Valid FeedbackCommentDTO> comments) {
        this.comments = comments;
        return this;
    }

    public FeedbackDTO addCommentsItem(FeedbackCommentDTO commentsItem) {
        this.comments.add(commentsItem);
        return this;
    }

    /**
     * Переписка автора отзыва с магазином.
     * @return comments
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_COMMENTS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<@Valid FeedbackCommentDTO> getComments() {
        return comments;
    }

    @JsonProperty(JSON_PROPERTY_COMMENTS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setComments(List<@Valid FeedbackCommentDTO> comments) {
        this.comments = comments;
    }

    public FeedbackDTO shop(FeedbackShopDTO shop) {
        this.shop = shop;
        return this;
    }

    /**
     * Get shop
     * @return shop
     */
    @Valid
    @Nullable
    @JsonProperty(JSON_PROPERTY_SHOP)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public FeedbackShopDTO getShop() {
        return shop;
    }

    @JsonProperty(JSON_PROPERTY_SHOP)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setShop(FeedbackShopDTO shop) {
        this.shop = shop;
    }

    public FeedbackDTO resolved(Boolean resolved) {
        this.resolved = resolved;
        return this;
    }

    /**
     * Решена ли проблема автора отзыва:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись. 
     * @return resolved
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_RESOLVED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getResolved() {
        return resolved;
    }

    @JsonProperty(JSON_PROPERTY_RESOLVED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setResolved(Boolean resolved) {
        this.resolved = resolved;
    }

    public FeedbackDTO verified(Boolean verified) {
        this.verified = verified;
        return this;
    }

    /**
     * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет. 
     * @return verified
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_VERIFIED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getVerified() {
        return verified;
    }

    @JsonProperty(JSON_PROPERTY_VERIFIED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    public FeedbackDTO recommend(Boolean recommend) {
        this.recommend = recommend;
        return this;
    }

    /**
     * Купил бы автор отзыва в магазине снова:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет. 
     * @return recommend
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_RECOMMEND)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getRecommend() {
        return recommend;
    }

    @JsonProperty(JSON_PROPERTY_RECOMMEND)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRecommend(Boolean recommend) {
        this.recommend = recommend;
    }

    public FeedbackDTO grades(FeedbackGradesDTO grades) {
        this.grades = grades;
        return this;
    }

    /**
     * Get grades
     * @return grades
     */
    @Valid
    @Nullable
    @JsonProperty(JSON_PROPERTY_GRADES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public FeedbackGradesDTO getGrades() {
        return grades;
    }

    @JsonProperty(JSON_PROPERTY_GRADES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setGrades(FeedbackGradesDTO grades) {
        this.grades = grades;
    }

    public FeedbackDTO order(FeedbackOrderDTO order) {
        this.order = order;
        return this;
    }

    /**
     * Get order
     * @return order
     */
    @Valid
    @Nullable
    @JsonProperty(JSON_PROPERTY_ORDER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public FeedbackOrderDTO getOrder() {
        return order;
    }

    @JsonProperty(JSON_PROPERTY_ORDER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOrder(FeedbackOrderDTO order) {
        this.order = order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FeedbackDTO feedbackDTO = (FeedbackDTO) o;
        return Objects.equals(this.id, feedbackDTO.id) &&
            Objects.equals(this.createdAt, feedbackDTO.createdAt) &&
            Objects.equals(this.text, feedbackDTO.text) &&
            Objects.equals(this.state, feedbackDTO.state) &&
            Objects.equals(this.author, feedbackDTO.author) &&
            Objects.equals(this.pro, feedbackDTO.pro) &&
            Objects.equals(this.contra, feedbackDTO.contra) &&
            Objects.equals(this.comments, feedbackDTO.comments) &&
            Objects.equals(this.shop, feedbackDTO.shop) &&
            Objects.equals(this.resolved, feedbackDTO.resolved) &&
            Objects.equals(this.verified, feedbackDTO.verified) &&
            Objects.equals(this.recommend, feedbackDTO.recommend) &&
            Objects.equals(this.grades, feedbackDTO.grades) &&
            Objects.equals(this.order, feedbackDTO.order);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createdAt, text, state, author, pro, contra, comments, shop, resolved, verified, recommend, grades, order);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FeedbackDTO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    pro: ").append(toIndentedString(pro)).append("\n");
        sb.append("    contra: ").append(toIndentedString(contra)).append("\n");
        sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
        sb.append("    shop: ").append(toIndentedString(shop)).append("\n");
        sb.append("    resolved: ").append(toIndentedString(resolved)).append("\n");
        sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
        sb.append("    recommend: ").append(toIndentedString(recommend)).append("\n");
        sb.append("    grades: ").append(toIndentedString(grades)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
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

