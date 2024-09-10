/**
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
package ympa_ktorm_schema.models

import org.ktorm.dsl.*
import org.ktorm.schema.*
import org.ktorm.database.Database
import .*


/**
 * Отзыв пользователя Яндекс Маркета об указанном магазине.
 * @param comments Переписка автора отзыва с магазином.
 * @param id Идентификатор отзыва.
 * @param createdAt Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
 * @param text Комментарий автора отзыва.
 * @param state 
 * @param author 
 * @param pro Достоинства магазина, описанные в отзыве.
 * @param contra Недостатки магазина, описанные в отзыве.
 * @param shop 
 * @param resolved Решена ли проблема автора отзыва:  * `true` — да. * `false` — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись. 
 * @param verified {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * `true` — да. * `false` — нет. 
 * @param recommend Купил бы автор отзыва в магазине снова:  * `true` — да. * `false` — нет. 
 * @param grades 
 * @param order 
 */
object FeedbackDTOs : BaseTable<FeedbackDTO>("FeedbackDTO") {
    val id = long("id") /* null */ /* Идентификатор отзыва. */
    val createdAt = datetime("createdAt") /* null */ /* Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`.  */
    val text = text("text") /* null */ /* Комментарий автора отзыва. */
    val state = long("state") /* null */
    val author = long("author") /* null */
    val pro = text("pro") /* null */ /* Достоинства магазина, описанные в отзыве. */
    val contra = text("contra") /* null */ /* Недостатки магазина, описанные в отзыве. */
    val shop = long("shop") /* null */
    val resolved = boolean("resolved") /* null */ /* Решена ли проблема автора отзыва:  * `true` — да. * `false` — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись.  */
    val verified = boolean("verified") /* null */ /* {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * `true` — да. * `false` — нет.  */
    val recommend = boolean("recommend") /* null */ /* Купил бы автор отзыва в магазине снова:  * `true` — да. * `false` — нет.  */
    val grades = long("grades") /* null */
    val order = long("order") /* null */

    /**
     * Create an entity of type FeedbackDTO from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = FeedbackDTO(
        comments = emptyList() /* kotlin.Array<FeedbackCommentDTO> */ /* Переписка автора отзыва с магазином. */,
        id = row[id]  /* kotlin.Long? */ /* Идентификатор отзыва. */,
        createdAt = row[createdAt]  /* java.time.LocalDateTime? */ /* Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`.  */,
        text = row[text]  /* kotlin.String? */ /* Комментарий автора отзыва. */,
        state = FeedbackStateTypes.createEntity(row, withReferences) /* FeedbackStateType? */,
        author = FeedbackAuthorDTOs.createEntity(row, withReferences) /* FeedbackAuthorDTO? */,
        pro = row[pro]  /* kotlin.String? */ /* Достоинства магазина, описанные в отзыве. */,
        contra = row[contra]  /* kotlin.String? */ /* Недостатки магазина, описанные в отзыве. */,
        shop = FeedbackShopDTOs.createEntity(row, withReferences) /* FeedbackShopDTO? */,
        resolved = row[resolved]  /* kotlin.Boolean? */ /* Решена ли проблема автора отзыва:  * `true` — да. * `false` — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись.  */,
        verified = row[verified]  /* kotlin.Boolean? */ /* {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * `true` — да. * `false` — нет.  */,
        recommend = row[recommend]  /* kotlin.Boolean? */ /* Купил бы автор отзыва в магазине снова:  * `true` — да. * `false` — нет.  */,
        grades = FeedbackGradesDTOs.createEntity(row, withReferences) /* FeedbackGradesDTO? */,
        order = FeedbackOrderDTOs.createEntity(row, withReferences) /* FeedbackOrderDTO? */
    )

    /**
    * Assign all the columns from the entity of type FeedbackDTO to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = FeedbackDTO()
    * database.update(FeedbackDTOs, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: FeedbackDTO) {
        this.apply {
            set(FeedbackDTOs.id, entity.id)
            set(FeedbackDTOs.createdAt, entity.createdAt)
            set(FeedbackDTOs.text, entity.text)
            set(FeedbackDTOs.state, entity.state)
            set(FeedbackDTOs.author, entity.author)
            set(FeedbackDTOs.pro, entity.pro)
            set(FeedbackDTOs.contra, entity.contra)
            set(FeedbackDTOs.shop, entity.shop)
            set(FeedbackDTOs.resolved, entity.resolved)
            set(FeedbackDTOs.verified, entity.verified)
            set(FeedbackDTOs.recommend, entity.recommend)
            set(FeedbackDTOs.grades, entity.grades)
            set(FeedbackDTOs.order, entity.order)
        }
    }

}


object FeedbackDTOFeedbackCommentDTO : BaseTable<Pair<kotlin.Long, kotlin.Long>>("FeedbackDTOFeedbackCommentDTO") {
    val feedbackDTO = long("feedbackDTO")
    val feedbackCommentDTO = long("feedbackCommentDTO")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[feedbackDTO] ?: 0, row[feedbackCommentDTO] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(FeedbackDTOFeedbackCommentDTO.feedbackDTO, entity.first)
            set(FeedbackDTOFeedbackCommentDTO.feedbackCommentDTO, entity.second)
        }
    }

}

