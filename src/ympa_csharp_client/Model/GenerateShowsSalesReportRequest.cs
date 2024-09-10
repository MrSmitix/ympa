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
    /// Данные, необходимые для генерации отчета.
    /// </summary>
    [DataContract(Name = "GenerateShowsSalesReportRequest")]
    public partial class GenerateShowsSalesReportRequest : IValidatableObject
    {

        /// <summary>
        /// Gets or Sets Grouping
        /// </summary>
        [DataMember(Name = "grouping", IsRequired = true, EmitDefaultValue = true)]
        public ShowsSalesGroupingType Grouping { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="GenerateShowsSalesReportRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected GenerateShowsSalesReportRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="GenerateShowsSalesReportRequest" /> class.
        /// </summary>
        /// <param name="businessId">Идентификатор бизнеса.  Указывается, если нужно составить отчет по всем магазинам бизнеса. В запросе обязательно должен быть либо &#x60;businessID&#x60;, либо &#x60;campaignId&#x60;, но не оба сразу. .</param>
        /// <param name="campaignId">Идентификатор кампании.  Указывается, если нужно составить отчет по конкретному магазину. В запросе обязательно должен быть либо &#x60;businessID&#x60;, либо &#x60;campaignId&#x60;, но не оба сразу. .</param>
        /// <param name="dateFrom">Начало периода, включительно. (required).</param>
        /// <param name="dateTo">Конец периода, включительно. (required).</param>
        /// <param name="grouping">grouping (required).</param>
        public GenerateShowsSalesReportRequest(long businessId = default(long), long campaignId = default(long), DateOnly dateFrom = default(DateOnly), DateOnly dateTo = default(DateOnly), ShowsSalesGroupingType grouping = default(ShowsSalesGroupingType))
        {
            // to ensure "dateFrom" is required (not null)
            if (dateFrom == null)
            {
                throw new ArgumentNullException("dateFrom is a required property for GenerateShowsSalesReportRequest and cannot be null");
            }
            this.DateFrom = dateFrom;
            // to ensure "dateTo" is required (not null)
            if (dateTo == null)
            {
                throw new ArgumentNullException("dateTo is a required property for GenerateShowsSalesReportRequest and cannot be null");
            }
            this.DateTo = dateTo;
            this.Grouping = grouping;
            this.BusinessId = businessId;
            this.CampaignId = campaignId;
        }

        /// <summary>
        /// Идентификатор бизнеса.  Указывается, если нужно составить отчет по всем магазинам бизнеса. В запросе обязательно должен быть либо &#x60;businessID&#x60;, либо &#x60;campaignId&#x60;, но не оба сразу. 
        /// </summary>
        /// <value>Идентификатор бизнеса.  Указывается, если нужно составить отчет по всем магазинам бизнеса. В запросе обязательно должен быть либо &#x60;businessID&#x60;, либо &#x60;campaignId&#x60;, но не оба сразу. </value>
        [DataMember(Name = "businessId", EmitDefaultValue = false)]
        public long BusinessId { get; set; }

        /// <summary>
        /// Идентификатор кампании.  Указывается, если нужно составить отчет по конкретному магазину. В запросе обязательно должен быть либо &#x60;businessID&#x60;, либо &#x60;campaignId&#x60;, но не оба сразу. 
        /// </summary>
        /// <value>Идентификатор кампании.  Указывается, если нужно составить отчет по конкретному магазину. В запросе обязательно должен быть либо &#x60;businessID&#x60;, либо &#x60;campaignId&#x60;, но не оба сразу. </value>
        [DataMember(Name = "campaignId", EmitDefaultValue = false)]
        public long CampaignId { get; set; }

        /// <summary>
        /// Начало периода, включительно.
        /// </summary>
        /// <value>Начало периода, включительно.</value>
        [DataMember(Name = "dateFrom", IsRequired = true, EmitDefaultValue = true)]
        public DateOnly DateFrom { get; set; }

        /// <summary>
        /// Конец периода, включительно.
        /// </summary>
        /// <value>Конец периода, включительно.</value>
        [DataMember(Name = "dateTo", IsRequired = true, EmitDefaultValue = true)]
        public DateOnly DateTo { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class GenerateShowsSalesReportRequest {\n");
            sb.Append("  BusinessId: ").Append(BusinessId).Append("\n");
            sb.Append("  CampaignId: ").Append(CampaignId).Append("\n");
            sb.Append("  DateFrom: ").Append(DateFrom).Append("\n");
            sb.Append("  DateTo: ").Append(DateTo).Append("\n");
            sb.Append("  Grouping: ").Append(Grouping).Append("\n");
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
