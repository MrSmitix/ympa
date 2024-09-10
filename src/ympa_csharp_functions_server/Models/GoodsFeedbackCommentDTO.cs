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
using ympa_csharp_functions_server.Converters;

namespace ympa_csharp_functions_server.Models
{ 
    /// <summary>
    /// Комментарий к отзыву.
    /// </summary>
    [DataContract]
    public partial class GoodsFeedbackCommentDTO : IEquatable<GoodsFeedbackCommentDTO>
    {
        /// <summary>
        /// Идентификатор комментария к отзыву. 
        /// </summary>
        /// <value>Идентификатор комментария к отзыву. </value>
        [Required]
        [DataMember(Name="id", EmitDefaultValue=false)]
        public long Id { get; set; }

        /// <summary>
        /// Текст комментария.
        /// </summary>
        /// <value>Текст комментария.</value>
        [Required]
        [StringLength(4096, MinimumLength=1)]
        [DataMember(Name="text", EmitDefaultValue=false)]
        public string Text { get; set; }

        /// <summary>
        /// Может ли продавец изменять комментарий или удалять его.
        /// </summary>
        /// <value>Может ли продавец изменять комментарий или удалять его.</value>
        [DataMember(Name="canModify", EmitDefaultValue=false)]
        public bool CanModify { get; set; }

        /// <summary>
        /// Идентификатор комментария к отзыву. 
        /// </summary>
        /// <value>Идентификатор комментария к отзыву. </value>
        [DataMember(Name="parentId", EmitDefaultValue=false)]
        public long ParentId { get; set; }

        /// <summary>
        /// Gets or Sets Author
        /// </summary>
        [Required]
        [DataMember(Name="author", EmitDefaultValue=false)]
        public GoodsFeedbackCommentAuthorDTO Author { get; set; }

        /// <summary>
        /// Gets or Sets Status
        /// </summary>
        [Required]
        [DataMember(Name="status", EmitDefaultValue=false)]
        public GoodsFeedbackCommentStatusType Status { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class GoodsFeedbackCommentDTO {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Text: ").Append(Text).Append("\n");
            sb.Append("  CanModify: ").Append(CanModify).Append("\n");
            sb.Append("  ParentId: ").Append(ParentId).Append("\n");
            sb.Append("  Author: ").Append(Author).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
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
            return obj.GetType() == GetType() && Equals((GoodsFeedbackCommentDTO)obj);
        }

        /// <summary>
        /// Returns true if GoodsFeedbackCommentDTO instances are equal
        /// </summary>
        /// <param name="other">Instance of GoodsFeedbackCommentDTO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GoodsFeedbackCommentDTO other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Id == other.Id ||
                    
                    Id.Equals(other.Id)
                ) && 
                (
                    Text == other.Text ||
                    Text != null &&
                    Text.Equals(other.Text)
                ) && 
                (
                    CanModify == other.CanModify ||
                    
                    CanModify.Equals(other.CanModify)
                ) && 
                (
                    ParentId == other.ParentId ||
                    
                    ParentId.Equals(other.ParentId)
                ) && 
                (
                    Author == other.Author ||
                    Author != null &&
                    Author.Equals(other.Author)
                ) && 
                (
                    Status == other.Status ||
                    
                    Status.Equals(other.Status)
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
                    if (Text != null)
                    hashCode = hashCode * 59 + Text.GetHashCode();
                    
                    hashCode = hashCode * 59 + CanModify.GetHashCode();
                    
                    hashCode = hashCode * 59 + ParentId.GetHashCode();
                    if (Author != null)
                    hashCode = hashCode * 59 + Author.GetHashCode();
                    
                    hashCode = hashCode * 59 + Status.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(GoodsFeedbackCommentDTO left, GoodsFeedbackCommentDTO right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(GoodsFeedbackCommentDTO left, GoodsFeedbackCommentDTO right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
