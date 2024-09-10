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
    /// Информация об индексе качества.
    /// </summary>
    [DataContract]
    public partial class QualityRatingDTO : IEquatable<QualityRatingDTO>
    {
        /// <summary>
        /// Значение индекса качества.
        /// </summary>
        /// <value>Значение индекса качества.</value>
        [Required]
        [Range(0, 100)]
        [DataMember(Name="rating", EmitDefaultValue=true)]
        public long Rating { get; set; }

        /// <summary>
        /// Дата вычисления.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;. 
        /// </summary>
        /// <value>Дата вычисления.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;. </value>
        [Required]
        [DataMember(Name="calculationDate", EmitDefaultValue=true)]
        public DateOnly CalculationDate { get; set; }

        /// <summary>
        /// Составляющие индекса качества.
        /// </summary>
        /// <value>Составляющие индекса качества.</value>
        [Required]
        [DataMember(Name="components", EmitDefaultValue=false)]
        public List<QualityRatingComponentDTO> Components { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class QualityRatingDTO {\n");
            sb.Append("  Rating: ").Append(Rating).Append("\n");
            sb.Append("  CalculationDate: ").Append(CalculationDate).Append("\n");
            sb.Append("  Components: ").Append(Components).Append("\n");
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
            return obj.GetType() == GetType() && Equals((QualityRatingDTO)obj);
        }

        /// <summary>
        /// Returns true if QualityRatingDTO instances are equal
        /// </summary>
        /// <param name="other">Instance of QualityRatingDTO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(QualityRatingDTO other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Rating == other.Rating ||
                    
                    Rating.Equals(other.Rating)
                ) && 
                (
                    CalculationDate == other.CalculationDate ||
                    
                    CalculationDate.Equals(other.CalculationDate)
                ) && 
                (
                    Components == other.Components ||
                    Components != null &&
                    other.Components != null &&
                    Components.SequenceEqual(other.Components)
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
                    
                    hashCode = hashCode * 59 + Rating.GetHashCode();
                    
                    hashCode = hashCode * 59 + CalculationDate.GetHashCode();
                    if (Components != null)
                    hashCode = hashCode * 59 + Components.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(QualityRatingDTO left, QualityRatingDTO right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(QualityRatingDTO left, QualityRatingDTO right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
