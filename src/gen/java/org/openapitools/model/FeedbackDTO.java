package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
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
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Отзыв пользователя Яндекс Маркета об указанном магазине.
 */
@ApiModel(description="Отзыв пользователя Яндекс Маркета об указанном магазине.")

public class FeedbackDTO  {
  
 /**
  * Идентификатор отзыва.
  */
  @ApiModelProperty(value = "Идентификатор отзыва.")
  private Long id;

 /**
  * Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
  */
  @ApiModelProperty(value = "Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. ")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss.SSSX")
  private Date createdAt;

 /**
  * Комментарий автора отзыва.
  */
  @ApiModelProperty(value = "Комментарий автора отзыва.")
  private String text;

  @ApiModelProperty(value = "")
  @Valid
  private FeedbackStateType state;

  @ApiModelProperty(value = "")
  @Valid
  private FeedbackAuthorDTO author;

 /**
  * Достоинства магазина, описанные в отзыве.
  */
  @ApiModelProperty(value = "Достоинства магазина, описанные в отзыве.")
  private String pro;

 /**
  * Недостатки магазина, описанные в отзыве.
  */
  @ApiModelProperty(value = "Недостатки магазина, описанные в отзыве.")
  private String contra;

 /**
  * Переписка автора отзыва с магазином.
  */
  @ApiModelProperty(required = true, value = "Переписка автора отзыва с магазином.")
  @Valid
  private List<@Valid FeedbackCommentDTO> comments = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private FeedbackShopDTO shop;

 /**
  * Решена ли проблема автора отзыва:  * `true` — да. * `false` — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись. 
  */
  @ApiModelProperty(value = "Решена ли проблема автора отзыва:  * `true` — да. * `false` — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись. ")
  private Boolean resolved;

 /**
  * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * `true` — да. * `false` — нет. 
  */
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * `true` — да. * `false` — нет. ")
  private Boolean verified;

 /**
  * Купил бы автор отзыва в магазине снова:  * `true` — да. * `false` — нет. 
  */
  @ApiModelProperty(value = "Купил бы автор отзыва в магазине снова:  * `true` — да. * `false` — нет. ")
  private Boolean recommend;

  @ApiModelProperty(value = "")
  @Valid
  private FeedbackGradesDTO grades;

  @ApiModelProperty(value = "")
  @Valid
  private FeedbackOrderDTO order;
 /**
  * Идентификатор отзыва.
  * @return id
  */
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(Long id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public FeedbackDTO id(Long id) {
    this.id = id;
    return this;
  }

 /**
  * Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;. 
  * @return createdAt
  */
  @JsonProperty("createdAt")
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Sets the <code>createdAt</code> property.
   */
 public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Sets the <code>createdAt</code> property.
   */
  public FeedbackDTO createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

 /**
  * Комментарий автора отзыва.
  * @return text
  */
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  /**
   * Sets the <code>text</code> property.
   */
 public void setText(String text) {
    this.text = text;
  }

  /**
   * Sets the <code>text</code> property.
   */
  public FeedbackDTO text(String text) {
    this.text = text;
    return this;
  }

 /**
  * Get state
  * @return state
  */
  @JsonProperty("state")
  public FeedbackStateType getState() {
    return state;
  }

  /**
   * Sets the <code>state</code> property.
   */
 public void setState(FeedbackStateType state) {
    this.state = state;
  }

  /**
   * Sets the <code>state</code> property.
   */
  public FeedbackDTO state(FeedbackStateType state) {
    this.state = state;
    return this;
  }

 /**
  * Get author
  * @return author
  */
  @JsonProperty("author")
  public FeedbackAuthorDTO getAuthor() {
    return author;
  }

  /**
   * Sets the <code>author</code> property.
   */
 public void setAuthor(FeedbackAuthorDTO author) {
    this.author = author;
  }

  /**
   * Sets the <code>author</code> property.
   */
  public FeedbackDTO author(FeedbackAuthorDTO author) {
    this.author = author;
    return this;
  }

 /**
  * Достоинства магазина, описанные в отзыве.
  * @return pro
  */
  @JsonProperty("pro")
  public String getPro() {
    return pro;
  }

  /**
   * Sets the <code>pro</code> property.
   */
 public void setPro(String pro) {
    this.pro = pro;
  }

  /**
   * Sets the <code>pro</code> property.
   */
  public FeedbackDTO pro(String pro) {
    this.pro = pro;
    return this;
  }

 /**
  * Недостатки магазина, описанные в отзыве.
  * @return contra
  */
  @JsonProperty("contra")
  public String getContra() {
    return contra;
  }

  /**
   * Sets the <code>contra</code> property.
   */
 public void setContra(String contra) {
    this.contra = contra;
  }

  /**
   * Sets the <code>contra</code> property.
   */
  public FeedbackDTO contra(String contra) {
    this.contra = contra;
    return this;
  }

 /**
  * Переписка автора отзыва с магазином.
  * @return comments
  */
  @JsonProperty("comments")
  @NotNull
  public List<@Valid FeedbackCommentDTO> getComments() {
    return comments;
  }

  /**
   * Sets the <code>comments</code> property.
   */
 public void setComments(List<@Valid FeedbackCommentDTO> comments) {
    this.comments = comments;
  }

  /**
   * Sets the <code>comments</code> property.
   */
  public FeedbackDTO comments(List<@Valid FeedbackCommentDTO> comments) {
    this.comments = comments;
    return this;
  }

  /**
   * Adds a new item to the <code>comments</code> list.
   */
  public FeedbackDTO addCommentsItem(FeedbackCommentDTO commentsItem) {
    this.comments.add(commentsItem);
    return this;
  }

 /**
  * Get shop
  * @return shop
  */
  @JsonProperty("shop")
  public FeedbackShopDTO getShop() {
    return shop;
  }

  /**
   * Sets the <code>shop</code> property.
   */
 public void setShop(FeedbackShopDTO shop) {
    this.shop = shop;
  }

  /**
   * Sets the <code>shop</code> property.
   */
  public FeedbackDTO shop(FeedbackShopDTO shop) {
    this.shop = shop;
    return this;
  }

 /**
  * Решена ли проблема автора отзыва:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись. 
  * @return resolved
  */
  @JsonProperty("resolved")
  public Boolean getResolved() {
    return resolved;
  }

  /**
   * Sets the <code>resolved</code> property.
   */
 public void setResolved(Boolean resolved) {
    this.resolved = resolved;
  }

  /**
   * Sets the <code>resolved</code> property.
   */
  public FeedbackDTO resolved(Boolean resolved) {
    this.resolved = resolved;
    return this;
  }

 /**
  * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет. 
  * @return verified
  */
  @JsonProperty("verified")
  public Boolean getVerified() {
    return verified;
  }

  /**
   * Sets the <code>verified</code> property.
   */
 public void setVerified(Boolean verified) {
    this.verified = verified;
  }

  /**
   * Sets the <code>verified</code> property.
   */
  public FeedbackDTO verified(Boolean verified) {
    this.verified = verified;
    return this;
  }

 /**
  * Купил бы автор отзыва в магазине снова:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет. 
  * @return recommend
  */
  @JsonProperty("recommend")
  public Boolean getRecommend() {
    return recommend;
  }

  /**
   * Sets the <code>recommend</code> property.
   */
 public void setRecommend(Boolean recommend) {
    this.recommend = recommend;
  }

  /**
   * Sets the <code>recommend</code> property.
   */
  public FeedbackDTO recommend(Boolean recommend) {
    this.recommend = recommend;
    return this;
  }

 /**
  * Get grades
  * @return grades
  */
  @JsonProperty("grades")
  public FeedbackGradesDTO getGrades() {
    return grades;
  }

  /**
   * Sets the <code>grades</code> property.
   */
 public void setGrades(FeedbackGradesDTO grades) {
    this.grades = grades;
  }

  /**
   * Sets the <code>grades</code> property.
   */
  public FeedbackDTO grades(FeedbackGradesDTO grades) {
    this.grades = grades;
    return this;
  }

 /**
  * Get order
  * @return order
  */
  @JsonProperty("order")
  public FeedbackOrderDTO getOrder() {
    return order;
  }

  /**
   * Sets the <code>order</code> property.
   */
 public void setOrder(FeedbackOrderDTO order) {
    this.order = order;
  }

  /**
   * Sets the <code>order</code> property.
   */
  public FeedbackDTO order(FeedbackOrderDTO order) {
    this.order = order;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

