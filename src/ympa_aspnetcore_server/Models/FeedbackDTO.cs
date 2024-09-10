/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 * Generated by: https://openapi-generator.tech
 */

using System;
using System.Linq;
using System.Text;
using System.Collections.Generic;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using ympa_aspnetcore_server.Converters;

namespace ympa_aspnetcore_server.Models
{ 
    /// <summary>
    /// Отзыв пользователя Яндекс Маркета об указанном магазине.
    /// </summary>
    [DataContract]
    public partial class FeedbackDTO : IEquatable<FeedbackDTO>
    {
        /// <summary>
        /// Идентификатор отзыва.
        /// </summary>
        /// <value>Идентификатор отзыва.</value>
        [DataMember(Name="id", EmitDefaultValue=true)]
        public long Id { get; set; }

        /// <summary>
        /// Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;. 
        /// </summary>
        /// <value>Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;. </value>
        [DataMember(Name="createdAt", EmitDefaultValue=true)]
        public DateTime CreatedAt { get; set; }

        /// <summary>
        /// Комментарий автора отзыва.
        /// </summary>
        /// <value>Комментарий автора отзыва.</value>
        [DataMember(Name="text", EmitDefaultValue=false)]
        public string Text { get; set; }

        /// <summary>
        /// Gets or Sets State
        /// </summary>
        [DataMember(Name="state", EmitDefaultValue=true)]
        public FeedbackStateType State { get; set; }

        /// <summary>
        /// Gets or Sets Author
        /// </summary>
        [DataMember(Name="author", EmitDefaultValue=false)]
        public FeedbackAuthorDTO Author { get; set; }

        /// <summary>
        /// Достоинства магазина, описанные в отзыве.
        /// </summary>
        /// <value>Достоинства магазина, описанные в отзыве.</value>
        [DataMember(Name="pro", EmitDefaultValue=false)]
        public string Pro { get; set; }

        /// <summary>
        /// Недостатки магазина, описанные в отзыве.
        /// </summary>
        /// <value>Недостатки магазина, описанные в отзыве.</value>
        [DataMember(Name="contra", EmitDefaultValue=false)]
        public string Contra { get; set; }

        /// <summary>
        /// Переписка автора отзыва с магазином.
        /// </summary>
        /// <value>Переписка автора отзыва с магазином.</value>
        [Required]
        [DataMember(Name="comments", EmitDefaultValue=false)]
        public List<FeedbackCommentDTO> Comments { get; set; }

        /// <summary>
        /// Gets or Sets Shop
        /// </summary>
        [DataMember(Name="shop", EmitDefaultValue=false)]
        public FeedbackShopDTO Shop { get; set; }

        /// <summary>
        /// Решена ли проблема автора отзыва:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись. 
        /// </summary>
        /// <value>Решена ли проблема автора отзыва:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись. </value>
        [DataMember(Name="resolved", EmitDefaultValue=true)]
        public bool Resolved { get; set; }

        /// <summary>
        /// {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет. 
        /// </summary>
        /// <value>{% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет. </value>
        [DataMember(Name="verified", EmitDefaultValue=true)]
        public bool Verified { get; set; }

        /// <summary>
        /// Купил бы автор отзыва в магазине снова:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет. 
        /// </summary>
        /// <value>Купил бы автор отзыва в магазине снова:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет. </value>
        [DataMember(Name="recommend", EmitDefaultValue=true)]
        public bool Recommend { get; set; }

        /// <summary>
        /// Gets or Sets Grades
        /// </summary>
        [DataMember(Name="grades", EmitDefaultValue=false)]
        public FeedbackGradesDTO Grades { get; set; }

        /// <summary>
        /// Gets or Sets Order
        /// </summary>
        [DataMember(Name="order", EmitDefaultValue=false)]
        public FeedbackOrderDTO Order { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class FeedbackDTO {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  CreatedAt: ").Append(CreatedAt).Append("\n");
            sb.Append("  Text: ").Append(Text).Append("\n");
            sb.Append("  State: ").Append(State).Append("\n");
            sb.Append("  Author: ").Append(Author).Append("\n");
            sb.Append("  Pro: ").Append(Pro).Append("\n");
            sb.Append("  Contra: ").Append(Contra).Append("\n");
            sb.Append("  Comments: ").Append(Comments).Append("\n");
            sb.Append("  Shop: ").Append(Shop).Append("\n");
            sb.Append("  Resolved: ").Append(Resolved).Append("\n");
            sb.Append("  Verified: ").Append(Verified).Append("\n");
            sb.Append("  Recommend: ").Append(Recommend).Append("\n");
            sb.Append("  Grades: ").Append(Grades).Append("\n");
            sb.Append("  Order: ").Append(Order).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            if (obj is null) return false;
            if (ReferenceEquals(this, obj)) return true;
            return obj.GetType() == GetType() && Equals((FeedbackDTO)obj);
        }

        /// <summary>
        /// Returns true if FeedbackDTO instances are equal
        /// </summary>
        /// <param name="other">Instance of FeedbackDTO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FeedbackDTO other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Id == other.Id ||
                    
                    Id.Equals(other.Id)
                ) && 
                (
                    CreatedAt == other.CreatedAt ||
                    
                    CreatedAt.Equals(other.CreatedAt)
                ) && 
                (
                    Text == other.Text ||
                    Text != null &&
                    Text.Equals(other.Text)
                ) && 
                (
                    State == other.State ||
                    
                    State.Equals(other.State)
                ) && 
                (
                    Author == other.Author ||
                    Author != null &&
                    Author.Equals(other.Author)
                ) && 
                (
                    Pro == other.Pro ||
                    Pro != null &&
                    Pro.Equals(other.Pro)
                ) && 
                (
                    Contra == other.Contra ||
                    Contra != null &&
                    Contra.Equals(other.Contra)
                ) && 
                (
                    Comments == other.Comments ||
                    Comments != null &&
                    other.Comments != null &&
                    Comments.SequenceEqual(other.Comments)
                ) && 
                (
                    Shop == other.Shop ||
                    Shop != null &&
                    Shop.Equals(other.Shop)
                ) && 
                (
                    Resolved == other.Resolved ||
                    
                    Resolved.Equals(other.Resolved)
                ) && 
                (
                    Verified == other.Verified ||
                    
                    Verified.Equals(other.Verified)
                ) && 
                (
                    Recommend == other.Recommend ||
                    
                    Recommend.Equals(other.Recommend)
                ) && 
                (
                    Grades == other.Grades ||
                    Grades != null &&
                    Grades.Equals(other.Grades)
                ) && 
                (
                    Order == other.Order ||
                    Order != null &&
                    Order.Equals(other.Order)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                var hashCode = 41;
                // Suitable nullity checks etc, of course :)
                    
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    
                    hashCode = hashCode * 59 + CreatedAt.GetHashCode();
                    if (Text != null)
                    hashCode = hashCode * 59 + Text.GetHashCode();
                    
                    hashCode = hashCode * 59 + State.GetHashCode();
                    if (Author != null)
                    hashCode = hashCode * 59 + Author.GetHashCode();
                    if (Pro != null)
                    hashCode = hashCode * 59 + Pro.GetHashCode();
                    if (Contra != null)
                    hashCode = hashCode * 59 + Contra.GetHashCode();
                    if (Comments != null)
                    hashCode = hashCode * 59 + Comments.GetHashCode();
                    if (Shop != null)
                    hashCode = hashCode * 59 + Shop.GetHashCode();
                    
                    hashCode = hashCode * 59 + Resolved.GetHashCode();
                    
                    hashCode = hashCode * 59 + Verified.GetHashCode();
                    
                    hashCode = hashCode * 59 + Recommend.GetHashCode();
                    if (Grades != null)
                    hashCode = hashCode * 59 + Grades.GetHashCode();
                    if (Order != null)
                    hashCode = hashCode * 59 + Order.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(FeedbackDTO left, FeedbackDTO right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(FeedbackDTO left, FeedbackDTO right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
