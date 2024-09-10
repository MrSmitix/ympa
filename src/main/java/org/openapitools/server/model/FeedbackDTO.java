package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.FeedbackAuthorDTO;
import org.openapitools.server.model.FeedbackCommentDTO;
import org.openapitools.server.model.FeedbackGradesDTO;
import org.openapitools.server.model.FeedbackOrderDTO;
import org.openapitools.server.model.FeedbackShopDTO;
import org.openapitools.server.model.FeedbackStateType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Отзыв пользователя Яндекс Маркета об указанном магазине.
 */
public class FeedbackDTO   {

    private Long id;
    private OffsetDateTime createdAt;
    private String text;
    private FeedbackStateType state;
    private FeedbackAuthorDTO author;
    private String pro;
    private String contra;
    private List<@Valid FeedbackCommentDTO> comments = new ArrayList<>();
    private FeedbackShopDTO shop;
    private Boolean resolved;
    private Boolean verified;
    private Boolean recommend;
    private FeedbackGradesDTO grades;
    private FeedbackOrderDTO order;

    /**
     * Default constructor.
     */
    public FeedbackDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create FeedbackDTO.
     *
     * @param id Идентификатор отзыва.
     * @param createdAt Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;. 
     * @param text Комментарий автора отзыва.
     * @param state state
     * @param author author
     * @param pro Достоинства магазина, описанные в отзыве.
     * @param contra Недостатки магазина, описанные в отзыве.
     * @param comments Переписка автора отзыва с магазином.
     * @param shop shop
     * @param resolved Решена ли проблема автора отзыва:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись. 
     * @param verified {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет. 
     * @param recommend Купил бы автор отзыва в магазине снова:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет. 
     * @param grades grades
     * @param order order
     */
    public FeedbackDTO(
        Long id, 
        OffsetDateTime createdAt, 
        String text, 
        FeedbackStateType state, 
        FeedbackAuthorDTO author, 
        String pro, 
        String contra, 
        List<@Valid FeedbackCommentDTO> comments, 
        FeedbackShopDTO shop, 
        Boolean resolved, 
        Boolean verified, 
        Boolean recommend, 
        FeedbackGradesDTO grades, 
        FeedbackOrderDTO order
    ) {
        this.id = id;
        this.createdAt = createdAt;
        this.text = text;
        this.state = state;
        this.author = author;
        this.pro = pro;
        this.contra = contra;
        this.comments = comments;
        this.shop = shop;
        this.resolved = resolved;
        this.verified = verified;
        this.recommend = recommend;
        this.grades = grades;
        this.order = order;
    }



    /**
     * Идентификатор отзыва.
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Комментарий автора отзыва.
     * @return text
     */
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    /**
     * Get state
     * @return state
     */
    public FeedbackStateType getState() {
        return state;
    }

    public void setState(FeedbackStateType state) {
        this.state = state;
    }

    /**
     * Get author
     * @return author
     */
    public FeedbackAuthorDTO getAuthor() {
        return author;
    }

    public void setAuthor(FeedbackAuthorDTO author) {
        this.author = author;
    }

    /**
     * Достоинства магазина, описанные в отзыве.
     * @return pro
     */
    public String getPro() {
        return pro;
    }

    public void setPro(String pro) {
        this.pro = pro;
    }

    /**
     * Недостатки магазина, описанные в отзыве.
     * @return contra
     */
    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    /**
     * Переписка автора отзыва с магазином.
     * @return comments
     */
    public List<@Valid FeedbackCommentDTO> getComments() {
        return comments;
    }

    public void setComments(List<@Valid FeedbackCommentDTO> comments) {
        this.comments = comments;
    }

    /**
     * Get shop
     * @return shop
     */
    public FeedbackShopDTO getShop() {
        return shop;
    }

    public void setShop(FeedbackShopDTO shop) {
        this.shop = shop;
    }

    /**
     * Решена ли проблема автора отзыва:  * `true` — да. * `false` — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись. 
     * @return resolved
     */
    public Boolean getResolved() {
        return resolved;
    }

    public void setResolved(Boolean resolved) {
        this.resolved = resolved;
    }

    /**
     * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * `true` — да. * `false` — нет. 
     * @return verified
     */
    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    /**
     * Купил бы автор отзыва в магазине снова:  * `true` — да. * `false` — нет. 
     * @return recommend
     */
    public Boolean getRecommend() {
        return recommend;
    }

    public void setRecommend(Boolean recommend) {
        this.recommend = recommend;
    }

    /**
     * Get grades
     * @return grades
     */
    public FeedbackGradesDTO getGrades() {
        return grades;
    }

    public void setGrades(FeedbackGradesDTO grades) {
        this.grades = grades;
    }

    /**
     * Get order
     * @return order
     */
    public FeedbackOrderDTO getOrder() {
        return order;
    }

    public void setOrder(FeedbackOrderDTO order) {
        this.order = order;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

