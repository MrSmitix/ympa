package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openapitools.model.FeedbackAuthorDTO;
import org.openapitools.model.FeedbackCommentDTO;
import org.openapitools.model.FeedbackGradesDTO;
import org.openapitools.model.FeedbackOrderDTO;
import org.openapitools.model.FeedbackShopDTO;
import org.openapitools.model.FeedbackStateType;

/**
 * Отзыв пользователя Яндекс Маркета об указанном магазине.
 */
@ApiModel(description = "Отзыв пользователя Яндекс Маркета об указанном магазине.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-09-09T22:21:22.142726883Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class FeedbackDTO   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("createdAt")
  private Date createdAt;

  @JsonProperty("text")
  private String text;

  @JsonProperty("state")
  private FeedbackStateType state;

  @JsonProperty("author")
  private FeedbackAuthorDTO author;

  @JsonProperty("pro")
  private String pro;

  @JsonProperty("contra")
  private String contra;

  @JsonProperty("comments")
  private List<@Valid FeedbackCommentDTO> comments = new ArrayList<>();

  @JsonProperty("shop")
  private FeedbackShopDTO shop;

  @JsonProperty("resolved")
  private Boolean resolved;

  @JsonProperty("verified")
  private Boolean verified;

  @JsonProperty("recommend")
  private Boolean recommend;

  @JsonProperty("grades")
  private FeedbackGradesDTO grades;

  @JsonProperty("order")
  private FeedbackOrderDTO order;

  public FeedbackDTO id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Идентификатор отзыва.
   * @return id
  **/
  @ApiModelProperty(value = "Идентификатор отзыва.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public FeedbackDTO createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
   * @return createdAt
  **/
  @ApiModelProperty(value = "Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. ")
  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public FeedbackDTO text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Комментарий автора отзыва.
   * @return text
  **/
  @ApiModelProperty(value = "Комментарий автора отзыва.")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "Достоинства магазина, описанные в отзыве.")
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
  **/
  @ApiModelProperty(value = "Недостатки магазина, описанные в отзыве.")
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
    this.comments.add(commentsItem);
    return this;
  }

   /**
   * Переписка автора отзыва с магазином.
   * @return comments
  **/
  @ApiModelProperty(required = true, value = "Переписка автора отзыва с магазином.")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "Решена ли проблема автора отзыва:  * `true` — да. * `false` — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись. ")
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
  **/
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * `true` — да. * `false` — нет. ")
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
  **/
  @ApiModelProperty(value = "Купил бы автор отзыва в магазине снова:  * `true` — да. * `false` — нет. ")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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

