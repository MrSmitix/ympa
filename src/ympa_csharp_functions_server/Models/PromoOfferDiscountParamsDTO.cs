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
    /// Параметры товара в акции с типом &#x60;DIRECT_DISCOUNT&#x60; или &#x60;BLUE_FLASH&#x60;.
    /// </summary>
    [DataContract]
    public partial class PromoOfferDiscountParamsDTO : IEquatable<PromoOfferDiscountParamsDTO>
    {
        /// <summary>
        /// Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Возвращается, только если товар участвует в акции. 
        /// </summary>
        /// <value>Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Возвращается, только если товар участвует в акции. </value>
        [DataMember(Name="price", EmitDefaultValue=false)]
        public long Price { get; set; }

        /// <summary>
        /// Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Возвращается, только если товар участвует в акции. 
        /// </summary>
        /// <value>Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Возвращается, только если товар участвует в акции. </value>
        [DataMember(Name="promoPrice", EmitDefaultValue=false)]
        public long PromoPrice { get; set; }

        /// <summary>
        /// Максимально возможная цена для участия в акции.  Указывается в рублях.  Возвращается для всех товаров. 
        /// </summary>
        /// <value>Максимально возможная цена для участия в акции.  Указывается в рублях.  Возвращается для всех товаров. </value>
        [Required]
        [DataMember(Name="maxPromoPrice", EmitDefaultValue=false)]
        public long MaxPromoPrice { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PromoOfferDiscountParamsDTO {\n");
            sb.Append("  Price: ").Append(Price).Append("\n");
            sb.Append("  PromoPrice: ").Append(PromoPrice).Append("\n");
            sb.Append("  MaxPromoPrice: ").Append(MaxPromoPrice).Append("\n");
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
            return obj.GetType() == GetType() && Equals((PromoOfferDiscountParamsDTO)obj);
        }

        /// <summary>
        /// Returns true if PromoOfferDiscountParamsDTO instances are equal
        /// </summary>
        /// <param name="other">Instance of PromoOfferDiscountParamsDTO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PromoOfferDiscountParamsDTO other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Price == other.Price ||
                    
                    Price.Equals(other.Price)
                ) && 
                (
                    PromoPrice == other.PromoPrice ||
                    
                    PromoPrice.Equals(other.PromoPrice)
                ) && 
                (
                    MaxPromoPrice == other.MaxPromoPrice ||
                    
                    MaxPromoPrice.Equals(other.MaxPromoPrice)
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
                    
                    hashCode = hashCode * 59 + Price.GetHashCode();
                    
                    hashCode = hashCode * 59 + PromoPrice.GetHashCode();
                    
                    hashCode = hashCode * 59 + MaxPromoPrice.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(PromoOfferDiscountParamsDTO left, PromoOfferDiscountParamsDTO right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(PromoOfferDiscountParamsDTO left, PromoOfferDiscountParamsDTO right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
