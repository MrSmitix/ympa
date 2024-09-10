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
    /// Список отзывов о товарах. 
    /// </summary>
    [DataContract]
    public partial class GoodsFeedbackListDTO : IEquatable<GoodsFeedbackListDTO>
    {
        /// <summary>
        /// Список отзывов.
        /// </summary>
        /// <value>Список отзывов.</value>
        [Required]
        [DataMember(Name="feedbacks", EmitDefaultValue=false)]
        public List<GoodsFeedbackDTO> Feedbacks { get; set; }

        /// <summary>
        /// Gets or Sets Paging
        /// </summary>
        [DataMember(Name="paging", EmitDefaultValue=false)]
        public ForwardScrollingPagerDTO Paging { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class GoodsFeedbackListDTO {\n");
            sb.Append("  Feedbacks: ").Append(Feedbacks).Append("\n");
            sb.Append("  Paging: ").Append(Paging).Append("\n");
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
            return obj.GetType() == GetType() && Equals((GoodsFeedbackListDTO)obj);
        }

        /// <summary>
        /// Returns true if GoodsFeedbackListDTO instances are equal
        /// </summary>
        /// <param name="other">Instance of GoodsFeedbackListDTO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GoodsFeedbackListDTO other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Feedbacks == other.Feedbacks ||
                    Feedbacks != null &&
                    other.Feedbacks != null &&
                    Feedbacks.SequenceEqual(other.Feedbacks)
                ) && 
                (
                    Paging == other.Paging ||
                    Paging != null &&
                    Paging.Equals(other.Paging)
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
                    if (Feedbacks != null)
                    hashCode = hashCode * 59 + Feedbacks.GetHashCode();
                    if (Paging != null)
                    hashCode = hashCode * 59 + Paging.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(GoodsFeedbackListDTO left, GoodsFeedbackListDTO right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(GoodsFeedbackListDTO left, GoodsFeedbackListDTO right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
