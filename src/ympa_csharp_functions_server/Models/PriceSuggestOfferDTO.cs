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
    /// Товар с ценами для продвижения.
    /// </summary>
    [DataContract]
    public partial class PriceSuggestOfferDTO : IEquatable<PriceSuggestOfferDTO>
    {
        /// <summary>
        /// SKU на Маркете.
        /// </summary>
        /// <value>SKU на Маркете.</value>
        [DataMember(Name="marketSku", EmitDefaultValue=false)]
        public long MarketSku { get; set; }

        /// <summary>
        /// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
        /// </summary>
        /// <value>Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) </value>
        [RegularExpression("^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")]
        [StringLength(255, MinimumLength=1)]
        [DataMember(Name="offerId", EmitDefaultValue=false)]
        public string OfferId { get; set; }

        /// <summary>
        /// Цены для продвижения. 
        /// </summary>
        /// <value>Цены для продвижения. </value>
        [DataMember(Name="priceSuggestion", EmitDefaultValue=true)]
        public List<PriceSuggestDTO> PriceSuggestion { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PriceSuggestOfferDTO {\n");
            sb.Append("  MarketSku: ").Append(MarketSku).Append("\n");
            sb.Append("  OfferId: ").Append(OfferId).Append("\n");
            sb.Append("  PriceSuggestion: ").Append(PriceSuggestion).Append("\n");
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
            return obj.GetType() == GetType() && Equals((PriceSuggestOfferDTO)obj);
        }

        /// <summary>
        /// Returns true if PriceSuggestOfferDTO instances are equal
        /// </summary>
        /// <param name="other">Instance of PriceSuggestOfferDTO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PriceSuggestOfferDTO other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    MarketSku == other.MarketSku ||
                    
                    MarketSku.Equals(other.MarketSku)
                ) && 
                (
                    OfferId == other.OfferId ||
                    OfferId != null &&
                    OfferId.Equals(other.OfferId)
                ) && 
                (
                    PriceSuggestion == other.PriceSuggestion ||
                    PriceSuggestion != null &&
                    other.PriceSuggestion != null &&
                    PriceSuggestion.SequenceEqual(other.PriceSuggestion)
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
                    
                    hashCode = hashCode * 59 + MarketSku.GetHashCode();
                    if (OfferId != null)
                    hashCode = hashCode * 59 + OfferId.GetHashCode();
                    if (PriceSuggestion != null)
                    hashCode = hashCode * 59 + PriceSuggestion.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(PriceSuggestOfferDTO left, PriceSuggestOfferDTO right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(PriceSuggestOfferDTO left, PriceSuggestOfferDTO right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
