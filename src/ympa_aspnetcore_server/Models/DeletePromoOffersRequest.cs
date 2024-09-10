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
    /// Удаление товаров из акции.  Чтобы убрать:  * все товары из акции и больше не участвовать в ней, передайте значение &#x60;true&#x60; в параметре &#x60;deleteAllOffers&#x60;;  * часть товаров, передайте их идентификаторы в параметре &#x60;offersIds&#x60;. 
    /// </summary>
    [DataContract]
    public partial class DeletePromoOffersRequest : IEquatable<DeletePromoOffersRequest>
    {
        /// <summary>
        /// Идентификатор акции.
        /// </summary>
        /// <value>Идентификатор акции.</value>
        [Required]
        [DataMember(Name="promoId", EmitDefaultValue=false)]
        public string PromoId { get; set; }

        /// <summary>
        /// Чтобы убрать все товары из акции и больше не участвовать в ней, передайте значение &#x60;true&#x60; и не передавайте параметр &#x60;offerIds&#x60;.
        /// </summary>
        /// <value>Чтобы убрать все товары из акции и больше не участвовать в ней, передайте значение &#x60;true&#x60; и не передавайте параметр &#x60;offerIds&#x60;.</value>
        [DataMember(Name="deleteAllOffers", EmitDefaultValue=true)]
        public bool DeleteAllOffers { get; set; }

        /// <summary>
        /// Товары, которые нужно убрать из акции.
        /// </summary>
        /// <value>Товары, которые нужно убрать из акции.</value>
        [DataMember(Name="offerIds", EmitDefaultValue=true)]
        public List<string> OfferIds { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DeletePromoOffersRequest {\n");
            sb.Append("  PromoId: ").Append(PromoId).Append("\n");
            sb.Append("  DeleteAllOffers: ").Append(DeleteAllOffers).Append("\n");
            sb.Append("  OfferIds: ").Append(OfferIds).Append("\n");
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
            return obj.GetType() == GetType() && Equals((DeletePromoOffersRequest)obj);
        }

        /// <summary>
        /// Returns true if DeletePromoOffersRequest instances are equal
        /// </summary>
        /// <param name="other">Instance of DeletePromoOffersRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DeletePromoOffersRequest other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    PromoId == other.PromoId ||
                    PromoId != null &&
                    PromoId.Equals(other.PromoId)
                ) && 
                (
                    DeleteAllOffers == other.DeleteAllOffers ||
                    
                    DeleteAllOffers.Equals(other.DeleteAllOffers)
                ) && 
                (
                    OfferIds == other.OfferIds ||
                    OfferIds != null &&
                    other.OfferIds != null &&
                    OfferIds.SequenceEqual(other.OfferIds)
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
                    if (PromoId != null)
                    hashCode = hashCode * 59 + PromoId.GetHashCode();
                    
                    hashCode = hashCode * 59 + DeleteAllOffers.GetHashCode();
                    if (OfferIds != null)
                    hashCode = hashCode * 59 + OfferIds.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(DeletePromoOffersRequest left, DeletePromoOffersRequest right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(DeletePromoOffersRequest left, DeletePromoOffersRequest right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
