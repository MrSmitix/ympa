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
    /// Товар в карантине.
    /// </summary>
    [DataContract]
    public partial class QuarantineOfferDTO : IEquatable<QuarantineOfferDTO>
    {
        /// <summary>
        /// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
        /// </summary>
        /// <value>Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) </value>
        [RegularExpression("^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")]
        [StringLength(255, MinimumLength=1)]
        [DataMember(Name="offerId", EmitDefaultValue=false)]
        public string OfferId { get; set; }

        /// <summary>
        /// Gets or Sets CurrentPrice
        /// </summary>
        [DataMember(Name="currentPrice", EmitDefaultValue=false)]
        public BasePriceDTO CurrentPrice { get; set; }

        /// <summary>
        /// Gets or Sets LastValidPrice
        /// </summary>
        [DataMember(Name="lastValidPrice", EmitDefaultValue=false)]
        public BasePriceDTO LastValidPrice { get; set; }

        /// <summary>
        /// Причины попадания товара в карантин.
        /// </summary>
        /// <value>Причины попадания товара в карантин.</value>
        [DataMember(Name="verdicts", EmitDefaultValue=true)]
        public List<PriceQuarantineVerdictDTO> Verdicts { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class QuarantineOfferDTO {\n");
            sb.Append("  OfferId: ").Append(OfferId).Append("\n");
            sb.Append("  CurrentPrice: ").Append(CurrentPrice).Append("\n");
            sb.Append("  LastValidPrice: ").Append(LastValidPrice).Append("\n");
            sb.Append("  Verdicts: ").Append(Verdicts).Append("\n");
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
            return obj.GetType() == GetType() && Equals((QuarantineOfferDTO)obj);
        }

        /// <summary>
        /// Returns true if QuarantineOfferDTO instances are equal
        /// </summary>
        /// <param name="other">Instance of QuarantineOfferDTO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(QuarantineOfferDTO other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    OfferId == other.OfferId ||
                    OfferId != null &&
                    OfferId.Equals(other.OfferId)
                ) && 
                (
                    CurrentPrice == other.CurrentPrice ||
                    CurrentPrice != null &&
                    CurrentPrice.Equals(other.CurrentPrice)
                ) && 
                (
                    LastValidPrice == other.LastValidPrice ||
                    LastValidPrice != null &&
                    LastValidPrice.Equals(other.LastValidPrice)
                ) && 
                (
                    Verdicts == other.Verdicts ||
                    Verdicts != null &&
                    other.Verdicts != null &&
                    Verdicts.SequenceEqual(other.Verdicts)
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
                    if (OfferId != null)
                    hashCode = hashCode * 59 + OfferId.GetHashCode();
                    if (CurrentPrice != null)
                    hashCode = hashCode * 59 + CurrentPrice.GetHashCode();
                    if (LastValidPrice != null)
                    hashCode = hashCode * 59 + LastValidPrice.GetHashCode();
                    if (Verdicts != null)
                    hashCode = hashCode * 59 + Verdicts.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(QuarantineOfferDTO left, QuarantineOfferDTO right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(QuarantineOfferDTO left, QuarantineOfferDTO right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
