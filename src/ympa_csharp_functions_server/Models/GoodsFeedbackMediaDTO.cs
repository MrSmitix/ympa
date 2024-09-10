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
    /// Фото и видео.
    /// </summary>
    [DataContract]
    public partial class GoodsFeedbackMediaDTO : IEquatable<GoodsFeedbackMediaDTO>
    {
        /// <summary>
        /// Ссылки на фото.
        /// </summary>
        /// <value>Ссылки на фото.</value>
        [DataMember(Name="photos", EmitDefaultValue=true)]
        public List<string> Photos { get; set; }

        /// <summary>
        /// Ссылки на видео.
        /// </summary>
        /// <value>Ссылки на видео.</value>
        [DataMember(Name="videos", EmitDefaultValue=true)]
        public List<string> Videos { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class GoodsFeedbackMediaDTO {\n");
            sb.Append("  Photos: ").Append(Photos).Append("\n");
            sb.Append("  Videos: ").Append(Videos).Append("\n");
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
            return obj.GetType() == GetType() && Equals((GoodsFeedbackMediaDTO)obj);
        }

        /// <summary>
        /// Returns true if GoodsFeedbackMediaDTO instances are equal
        /// </summary>
        /// <param name="other">Instance of GoodsFeedbackMediaDTO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GoodsFeedbackMediaDTO other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Photos == other.Photos ||
                    Photos != null &&
                    other.Photos != null &&
                    Photos.SequenceEqual(other.Photos)
                ) && 
                (
                    Videos == other.Videos ||
                    Videos != null &&
                    other.Videos != null &&
                    Videos.SequenceEqual(other.Videos)
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
                    if (Photos != null)
                    hashCode = hashCode * 59 + Photos.GetHashCode();
                    if (Videos != null)
                    hashCode = hashCode * 59 + Videos.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(GoodsFeedbackMediaDTO left, GoodsFeedbackMediaDTO right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(GoodsFeedbackMediaDTO left, GoodsFeedbackMediaDTO right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
