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
    /// Комментарий к отзыву или другому комментарию.
    /// </summary>
    [DataContract]
    public partial class UpdateGoodsFeedbackCommentDTO : IEquatable<UpdateGoodsFeedbackCommentDTO>
    {
        /// <summary>
        /// Идентификатор комментария к отзыву. 
        /// </summary>
        /// <value>Идентификатор комментария к отзыву. </value>
        [DataMember(Name="id", EmitDefaultValue=true)]
        public long Id { get; set; }

        /// <summary>
        /// Идентификатор комментария к отзыву. 
        /// </summary>
        /// <value>Идентификатор комментария к отзыву. </value>
        [DataMember(Name="parentId", EmitDefaultValue=true)]
        public long ParentId { get; set; }

        /// <summary>
        /// Текст комментария.
        /// </summary>
        /// <value>Текст комментария.</value>
        [Required]
        [StringLength(4096, MinimumLength=1)]
        [DataMember(Name="text", EmitDefaultValue=false)]
        public string Text { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class UpdateGoodsFeedbackCommentDTO {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  ParentId: ").Append(ParentId).Append("\n");
            sb.Append("  Text: ").Append(Text).Append("\n");
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
            return obj.GetType() == GetType() && Equals((UpdateGoodsFeedbackCommentDTO)obj);
        }

        /// <summary>
        /// Returns true if UpdateGoodsFeedbackCommentDTO instances are equal
        /// </summary>
        /// <param name="other">Instance of UpdateGoodsFeedbackCommentDTO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UpdateGoodsFeedbackCommentDTO other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Id == other.Id ||
                    
                    Id.Equals(other.Id)
                ) && 
                (
                    ParentId == other.ParentId ||
                    
                    ParentId.Equals(other.ParentId)
                ) && 
                (
                    Text == other.Text ||
                    Text != null &&
                    Text.Equals(other.Text)
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
                    
                    hashCode = hashCode * 59 + ParentId.GetHashCode();
                    if (Text != null)
                    hashCode = hashCode * 59 + Text.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(UpdateGoodsFeedbackCommentDTO left, UpdateGoodsFeedbackCommentDTO right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(UpdateGoodsFeedbackCommentDTO left, UpdateGoodsFeedbackCommentDTO right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
