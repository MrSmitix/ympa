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
    /// Параметры товара, для которого нужно рассчитать стоимость услуг.
    /// </summary>
    [DataContract]
    public partial class CalculateTariffsOfferDTO : IEquatable<CalculateTariffsOfferDTO>
    {
        /// <summary>
        /// Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
        /// </summary>
        /// <value>Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). </value>
        [Required]
        [DataMember(Name="categoryId", EmitDefaultValue=false)]
        public long CategoryId { get; set; }

        /// <summary>
        /// Цена на товар в рублях.
        /// </summary>
        /// <value>Цена на товар в рублях.</value>
        [Required]
        [DataMember(Name="price", EmitDefaultValue=false)]
        public decimal Price { get; set; }

        /// <summary>
        /// Длина товара в сантиметрах.
        /// </summary>
        /// <value>Длина товара в сантиметрах.</value>
        [Required]
        [DataMember(Name="length", EmitDefaultValue=false)]
        public decimal Length { get; set; }

        /// <summary>
        /// Ширина товара в сантиметрах.
        /// </summary>
        /// <value>Ширина товара в сантиметрах.</value>
        [Required]
        [DataMember(Name="width", EmitDefaultValue=false)]
        public decimal Width { get; set; }

        /// <summary>
        /// Высота товара в сантиметрах.
        /// </summary>
        /// <value>Высота товара в сантиметрах.</value>
        [Required]
        [DataMember(Name="height", EmitDefaultValue=false)]
        public decimal Height { get; set; }

        /// <summary>
        /// Вес товара в килограммах.
        /// </summary>
        /// <value>Вес товара в килограммах.</value>
        [Required]
        [DataMember(Name="weight", EmitDefaultValue=false)]
        public decimal Weight { get; set; }

        /// <summary>
        /// Квант продажи — количество единиц товара в одном товарном предложении.
        /// </summary>
        /// <value>Квант продажи — количество единиц товара в одном товарном предложении.</value>
        [DataMember(Name="quantity", EmitDefaultValue=false)]
        public int Quantity { get; set; } = 1;

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CalculateTariffsOfferDTO {\n");
            sb.Append("  CategoryId: ").Append(CategoryId).Append("\n");
            sb.Append("  Price: ").Append(Price).Append("\n");
            sb.Append("  Length: ").Append(Length).Append("\n");
            sb.Append("  Width: ").Append(Width).Append("\n");
            sb.Append("  Height: ").Append(Height).Append("\n");
            sb.Append("  Weight: ").Append(Weight).Append("\n");
            sb.Append("  Quantity: ").Append(Quantity).Append("\n");
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
            return obj.GetType() == GetType() && Equals((CalculateTariffsOfferDTO)obj);
        }

        /// <summary>
        /// Returns true if CalculateTariffsOfferDTO instances are equal
        /// </summary>
        /// <param name="other">Instance of CalculateTariffsOfferDTO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CalculateTariffsOfferDTO other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    CategoryId == other.CategoryId ||
                    
                    CategoryId.Equals(other.CategoryId)
                ) && 
                (
                    Price == other.Price ||
                    
                    Price.Equals(other.Price)
                ) && 
                (
                    Length == other.Length ||
                    
                    Length.Equals(other.Length)
                ) && 
                (
                    Width == other.Width ||
                    
                    Width.Equals(other.Width)
                ) && 
                (
                    Height == other.Height ||
                    
                    Height.Equals(other.Height)
                ) && 
                (
                    Weight == other.Weight ||
                    
                    Weight.Equals(other.Weight)
                ) && 
                (
                    Quantity == other.Quantity ||
                    
                    Quantity.Equals(other.Quantity)
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
                    
                    hashCode = hashCode * 59 + CategoryId.GetHashCode();
                    
                    hashCode = hashCode * 59 + Price.GetHashCode();
                    
                    hashCode = hashCode * 59 + Length.GetHashCode();
                    
                    hashCode = hashCode * 59 + Width.GetHashCode();
                    
                    hashCode = hashCode * 59 + Height.GetHashCode();
                    
                    hashCode = hashCode * 59 + Weight.GetHashCode();
                    
                    hashCode = hashCode * 59 + Quantity.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(CalculateTariffsOfferDTO left, CalculateTariffsOfferDTO right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(CalculateTariffsOfferDTO left, CalculateTariffsOfferDTO right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
