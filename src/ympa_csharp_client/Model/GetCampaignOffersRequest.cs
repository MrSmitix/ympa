/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = ympa_csharp_client.Client.OpenAPIDateConverter;

namespace ympa_csharp_client.Model
{
    /// <summary>
    /// Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. 
    /// </summary>
    [DataContract(Name = "GetCampaignOffersRequest")]
    public partial class GetCampaignOffersRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="GetCampaignOffersRequest" /> class.
        /// </summary>
        /// <param name="offerIds">Идентификаторы товаров, информация о которых нужна.  {% note warning \&quot;Такой список возвращается только целиком\&quot; %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * &#x60;page_token&#x60; * &#x60;limit&#x60;  {% endnote %}    .</param>
        /// <param name="statuses">Фильтр по статусам товаров. .</param>
        /// <param name="categoryIds">Фильтр по категориям на Маркете..</param>
        /// <param name="vendorNames">Фильтр по брендам..</param>
        /// <param name="tags">Фильтр по тегам..</param>
        public GetCampaignOffersRequest(List<string> offerIds = default(List<string>), List<OfferCampaignStatusType> statuses = default(List<OfferCampaignStatusType>), List<int> categoryIds = default(List<int>), List<string> vendorNames = default(List<string>), List<string> tags = default(List<string>))
        {
            this.OfferIds = offerIds;
            this.Statuses = statuses;
            this.CategoryIds = categoryIds;
            this.VendorNames = vendorNames;
            this.Tags = tags;
        }

        /// <summary>
        /// Идентификаторы товаров, информация о которых нужна.  {% note warning \&quot;Такой список возвращается только целиком\&quot; %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * &#x60;page_token&#x60; * &#x60;limit&#x60;  {% endnote %}    
        /// </summary>
        /// <value>Идентификаторы товаров, информация о которых нужна.  {% note warning \&quot;Такой список возвращается только целиком\&quot; %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * &#x60;page_token&#x60; * &#x60;limit&#x60;  {% endnote %}    </value>
        [DataMember(Name = "offerIds", EmitDefaultValue = true)]
        public List<string> OfferIds { get; set; }

        /// <summary>
        /// Фильтр по статусам товаров. 
        /// </summary>
        /// <value>Фильтр по статусам товаров. </value>
        [DataMember(Name = "statuses", EmitDefaultValue = true)]
        public List<OfferCampaignStatusType> Statuses { get; set; }

        /// <summary>
        /// Фильтр по категориям на Маркете.
        /// </summary>
        /// <value>Фильтр по категориям на Маркете.</value>
        [DataMember(Name = "categoryIds", EmitDefaultValue = true)]
        public List<int> CategoryIds { get; set; }

        /// <summary>
        /// Фильтр по брендам.
        /// </summary>
        /// <value>Фильтр по брендам.</value>
        [DataMember(Name = "vendorNames", EmitDefaultValue = true)]
        public List<string> VendorNames { get; set; }

        /// <summary>
        /// Фильтр по тегам.
        /// </summary>
        /// <value>Фильтр по тегам.</value>
        [DataMember(Name = "tags", EmitDefaultValue = true)]
        public List<string> Tags { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class GetCampaignOffersRequest {\n");
            sb.Append("  OfferIds: ").Append(OfferIds).Append("\n");
            sb.Append("  Statuses: ").Append(Statuses).Append("\n");
            sb.Append("  CategoryIds: ").Append(CategoryIds).Append("\n");
            sb.Append("  VendorNames: ").Append(VendorNames).Append("\n");
            sb.Append("  Tags: ").Append(Tags).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
