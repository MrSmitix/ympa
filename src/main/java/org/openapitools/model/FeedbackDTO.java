package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Отзыв пользователя Яндекс Маркета об указанном магазине.
 */

@Schema(name = "FeedbackDTO", description = "Отзыв пользователя Яндекс Маркета об указанном магазине.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class FeedbackDTO {

  private Long id;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  private String text;

  private FeedbackStateType state;

  private FeedbackAuthorDTO author;

  private String pro;

  private String contra;

  @Valid
  private List<@Valid FeedbackCommentDTO> comments = new ArrayList<>();

  private FeedbackShopDTO shop;

  private Boolean resolved;

  private Boolean verified;

  private Boolean recommend;

  private FeedbackGradesDTO grades;

  private FeedbackOrderDTO order;

  public FeedbackDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
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
  
  @Schema(name = "id", description = "Идентификатор отзыва.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public FeedbackDTO createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
   * @return createdAt
   */
  @Valid 
  @Schema(name = "createdAt", description = "Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdAt")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

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
  
  @Schema(name = "text", description = "Комментарий автора отзыва.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("text")
  public String getText() {
    return text;
  }

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
  @Valid 
  @Schema(name = "state", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("state")
  public FeedbackStateType getState() {
    return state;
  }

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
  @Schema(name = "author", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("author")
  public FeedbackAuthorDTO getAuthor() {
    return author;
  }

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
  
  @Schema(name = "pro", description = "Достоинства магазина, описанные в отзыве.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pro")
  public String getPro() {
    return pro;
  }

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
  
  @Schema(name = "contra", description = "Недостатки магазина, описанные в отзыве.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contra")
  public String getContra() {
    return contra;
  }

  public void setContra(String contra) {
    this.contra = contra;
  }

  public FeedbackDTO comments(List<@Valid FeedbackCommentDTO> comments) {
    this.comments = comments;
    return this;
  }

  public FeedbackDTO addCommentsItem(FeedbackCommentDTO commentsItem) {
    if (this.comments == null) {
      this.comments = new ArrayList<>();
    }
    this.comments.add(commentsItem);
    return this;
  }

  /**
   * Переписка автора отзыва с магазином.
   * @return comments
   */
  @NotNull @Valid 
  @Schema(name = "comments", description = "Переписка автора отзыва с магазином.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("comments")
  public List<@Valid FeedbackCommentDTO> getComments() {
    return comments;
  }

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
  @Schema(name = "shop", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shop")
  public FeedbackShopDTO getShop() {
    return shop;
  }

  public void setShop(FeedbackShopDTO shop) {
    this.shop = shop;
  }

  public FeedbackDTO resolved(Boolean resolved) {
    this.resolved = resolved;
    return this;
  }

  /**
   * Решена ли проблема автора отзыва:  * `true` — да. * `false` — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись. 
   * @return resolved
   */
  
  @Schema(name = "resolved", description = "Решена ли проблема автора отзыва:  * `true` — да. * `false` — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resolved")
  public Boolean getResolved() {
    return resolved;
  }

  public void setResolved(Boolean resolved) {
    this.resolved = resolved;
  }

  public FeedbackDTO verified(Boolean verified) {
    this.verified = verified;
    return this;
  }

  /**
   * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * `true` — да. * `false` — нет. 
   * @return verified
   */
  
  @Schema(name = "verified", description = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * `true` — да. * `false` — нет. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("verified")
  public Boolean getVerified() {
    return verified;
  }

  public void setVerified(Boolean verified) {
    this.verified = verified;
  }

  public FeedbackDTO recommend(Boolean recommend) {
    this.recommend = recommend;
    return this;
  }

  /**
   * Купил бы автор отзыва в магазине снова:  * `true` — да. * `false` — нет. 
   * @return recommend
   */
  
  @Schema(name = "recommend", description = "Купил бы автор отзыва в магазине снова:  * `true` — да. * `false` — нет. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recommend")
  public Boolean getRecommend() {
    return recommend;
  }

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
  @Schema(name = "grades", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("grades")
  public FeedbackGradesDTO getGrades() {
    return grades;
  }

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
  @Schema(name = "order", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("order")
  public FeedbackOrderDTO getOrder() {
    return order;
  }

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

