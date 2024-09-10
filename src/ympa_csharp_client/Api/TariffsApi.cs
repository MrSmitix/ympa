/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Net;
using System.Net.Mime;
using ympa_csharp_client.Client;
using ympa_csharp_client.Client.Auth;
using ympa_csharp_client.Model;

namespace ympa_csharp_client.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ITariffsApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Калькулятор стоимости услуг
        /// </summary>
        /// <remarks>
        /// Рассчитывает стоимость услуг Маркета для товаров с заданными параметрами. Порядок товаров в запросе и ответе сохраняется, чтобы определить, для какого товара рассчитана стоимость услуги.  Обратите внимание: калькулятор осуществляет примерные расчеты. Финальная стоимость для каждого заказа зависит от предоставленных услуг.  В запросе можно указать либо параметр &#x60;campaignId&#x60;, либо &#x60;sellingProgram&#x60;. Совместное использование параметров приведет к ошибке.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
        /// </remarks>
        /// <exception cref="ympa_csharp_client.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="calculateTariffsRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>CalculateTariffsResponse</returns>
        CalculateTariffsResponse CalculateTariffs(CalculateTariffsRequest calculateTariffsRequest, int operationIndex = 0);

        /// <summary>
        /// Калькулятор стоимости услуг
        /// </summary>
        /// <remarks>
        /// Рассчитывает стоимость услуг Маркета для товаров с заданными параметрами. Порядок товаров в запросе и ответе сохраняется, чтобы определить, для какого товара рассчитана стоимость услуги.  Обратите внимание: калькулятор осуществляет примерные расчеты. Финальная стоимость для каждого заказа зависит от предоставленных услуг.  В запросе можно указать либо параметр &#x60;campaignId&#x60;, либо &#x60;sellingProgram&#x60;. Совместное использование параметров приведет к ошибке.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
        /// </remarks>
        /// <exception cref="ympa_csharp_client.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="calculateTariffsRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of CalculateTariffsResponse</returns>
        ApiResponse<CalculateTariffsResponse> CalculateTariffsWithHttpInfo(CalculateTariffsRequest calculateTariffsRequest, int operationIndex = 0);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ITariffsApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Калькулятор стоимости услуг
        /// </summary>
        /// <remarks>
        /// Рассчитывает стоимость услуг Маркета для товаров с заданными параметрами. Порядок товаров в запросе и ответе сохраняется, чтобы определить, для какого товара рассчитана стоимость услуги.  Обратите внимание: калькулятор осуществляет примерные расчеты. Финальная стоимость для каждого заказа зависит от предоставленных услуг.  В запросе можно указать либо параметр &#x60;campaignId&#x60;, либо &#x60;sellingProgram&#x60;. Совместное использование параметров приведет к ошибке.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
        /// </remarks>
        /// <exception cref="ympa_csharp_client.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="calculateTariffsRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of CalculateTariffsResponse</returns>
        System.Threading.Tasks.Task<CalculateTariffsResponse> CalculateTariffsAsync(CalculateTariffsRequest calculateTariffsRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken));

        /// <summary>
        /// Калькулятор стоимости услуг
        /// </summary>
        /// <remarks>
        /// Рассчитывает стоимость услуг Маркета для товаров с заданными параметрами. Порядок товаров в запросе и ответе сохраняется, чтобы определить, для какого товара рассчитана стоимость услуги.  Обратите внимание: калькулятор осуществляет примерные расчеты. Финальная стоимость для каждого заказа зависит от предоставленных услуг.  В запросе можно указать либо параметр &#x60;campaignId&#x60;, либо &#x60;sellingProgram&#x60;. Совместное использование параметров приведет к ошибке.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
        /// </remarks>
        /// <exception cref="ympa_csharp_client.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="calculateTariffsRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (CalculateTariffsResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<CalculateTariffsResponse>> CalculateTariffsWithHttpInfoAsync(CalculateTariffsRequest calculateTariffsRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ITariffsApi : ITariffsApiSync, ITariffsApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class TariffsApi : ITariffsApi
    {
        private ympa_csharp_client.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="TariffsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public TariffsApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TariffsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public TariffsApi(string basePath)
        {
            this.Configuration = ympa_csharp_client.Client.Configuration.MergeConfigurations(
                ympa_csharp_client.Client.GlobalConfiguration.Instance,
                new ympa_csharp_client.Client.Configuration { BasePath = basePath }
            );
            this.Client = new ympa_csharp_client.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new ympa_csharp_client.Client.ApiClient(this.Configuration.BasePath);
            this.ExceptionFactory = ympa_csharp_client.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TariffsApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public TariffsApi(ympa_csharp_client.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = ympa_csharp_client.Client.Configuration.MergeConfigurations(
                ympa_csharp_client.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new ympa_csharp_client.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new ympa_csharp_client.Client.ApiClient(this.Configuration.BasePath);
            ExceptionFactory = ympa_csharp_client.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TariffsApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public TariffsApi(ympa_csharp_client.Client.ISynchronousClient client, ympa_csharp_client.Client.IAsynchronousClient asyncClient, ympa_csharp_client.Client.IReadableConfiguration configuration)
        {
            if (client == null) throw new ArgumentNullException("client");
            if (asyncClient == null) throw new ArgumentNullException("asyncClient");
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = ympa_csharp_client.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public ympa_csharp_client.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public ympa_csharp_client.Client.ISynchronousClient Client { get; set; }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        public string GetBasePath()
        {
            return this.Configuration.BasePath;
        }

        /// <summary>
        /// Gets or sets the configuration object
        /// </summary>
        /// <value>An instance of the Configuration</value>
        public ympa_csharp_client.Client.IReadableConfiguration Configuration { get; set; }

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public ympa_csharp_client.Client.ExceptionFactory ExceptionFactory
        {
            get
            {
                if (_exceptionFactory != null && _exceptionFactory.GetInvocationList().Length > 1)
                {
                    throw new InvalidOperationException("Multicast delegate for ExceptionFactory is unsupported.");
                }
                return _exceptionFactory;
            }
            set { _exceptionFactory = value; }
        }

        /// <summary>
        /// Калькулятор стоимости услуг Рассчитывает стоимость услуг Маркета для товаров с заданными параметрами. Порядок товаров в запросе и ответе сохраняется, чтобы определить, для какого товара рассчитана стоимость услуги.  Обратите внимание: калькулятор осуществляет примерные расчеты. Финальная стоимость для каждого заказа зависит от предоставленных услуг.  В запросе можно указать либо параметр &#x60;campaignId&#x60;, либо &#x60;sellingProgram&#x60;. Совместное использование параметров приведет к ошибке.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
        /// </summary>
        /// <exception cref="ympa_csharp_client.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="calculateTariffsRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>CalculateTariffsResponse</returns>
        public CalculateTariffsResponse CalculateTariffs(CalculateTariffsRequest calculateTariffsRequest, int operationIndex = 0)
        {
            ympa_csharp_client.Client.ApiResponse<CalculateTariffsResponse> localVarResponse = CalculateTariffsWithHttpInfo(calculateTariffsRequest);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Калькулятор стоимости услуг Рассчитывает стоимость услуг Маркета для товаров с заданными параметрами. Порядок товаров в запросе и ответе сохраняется, чтобы определить, для какого товара рассчитана стоимость услуги.  Обратите внимание: калькулятор осуществляет примерные расчеты. Финальная стоимость для каждого заказа зависит от предоставленных услуг.  В запросе можно указать либо параметр &#x60;campaignId&#x60;, либо &#x60;sellingProgram&#x60;. Совместное использование параметров приведет к ошибке.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
        /// </summary>
        /// <exception cref="ympa_csharp_client.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="calculateTariffsRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of CalculateTariffsResponse</returns>
        public ympa_csharp_client.Client.ApiResponse<CalculateTariffsResponse> CalculateTariffsWithHttpInfo(CalculateTariffsRequest calculateTariffsRequest, int operationIndex = 0)
        {
            // verify the required parameter 'calculateTariffsRequest' is set
            if (calculateTariffsRequest == null)
            {
                throw new ympa_csharp_client.Client.ApiException(400, "Missing required parameter 'calculateTariffsRequest' when calling TariffsApi->CalculateTariffs");
            }

            ympa_csharp_client.Client.RequestOptions localVarRequestOptions = new ympa_csharp_client.Client.RequestOptions();

            string[] _contentTypes = new string[] {
                "application/json"
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = ympa_csharp_client.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = ympa_csharp_client.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.Data = calculateTariffsRequest;

            localVarRequestOptions.Operation = "TariffsApi.CalculateTariffs";
            localVarRequestOptions.OperationIndex = operationIndex;

            // authentication (OAuth) required
            // oauth required
            if (!localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                if (!string.IsNullOrEmpty(this.Configuration.AccessToken))
                {
                    localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + this.Configuration.AccessToken);
                }
                else if (!string.IsNullOrEmpty(this.Configuration.OAuthTokenUrl) &&
                         !string.IsNullOrEmpty(this.Configuration.OAuthClientId) &&
                         !string.IsNullOrEmpty(this.Configuration.OAuthClientSecret) &&
                         this.Configuration.OAuthFlow != null)
                {
                    localVarRequestOptions.OAuth = true;
                }
            }

            // make the HTTP request
            var localVarResponse = this.Client.Post<CalculateTariffsResponse>("/tariffs/calculate", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("CalculateTariffs", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// Калькулятор стоимости услуг Рассчитывает стоимость услуг Маркета для товаров с заданными параметрами. Порядок товаров в запросе и ответе сохраняется, чтобы определить, для какого товара рассчитана стоимость услуги.  Обратите внимание: калькулятор осуществляет примерные расчеты. Финальная стоимость для каждого заказа зависит от предоставленных услуг.  В запросе можно указать либо параметр &#x60;campaignId&#x60;, либо &#x60;sellingProgram&#x60;. Совместное использование параметров приведет к ошибке.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
        /// </summary>
        /// <exception cref="ympa_csharp_client.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="calculateTariffsRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of CalculateTariffsResponse</returns>
        public async System.Threading.Tasks.Task<CalculateTariffsResponse> CalculateTariffsAsync(CalculateTariffsRequest calculateTariffsRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
        {
            ympa_csharp_client.Client.ApiResponse<CalculateTariffsResponse> localVarResponse = await CalculateTariffsWithHttpInfoAsync(calculateTariffsRequest, operationIndex, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Калькулятор стоимости услуг Рассчитывает стоимость услуг Маркета для товаров с заданными параметрами. Порядок товаров в запросе и ответе сохраняется, чтобы определить, для какого товара рассчитана стоимость услуги.  Обратите внимание: калькулятор осуществляет примерные расчеты. Финальная стоимость для каждого заказа зависит от предоставленных услуг.  В запросе можно указать либо параметр &#x60;campaignId&#x60;, либо &#x60;sellingProgram&#x60;. Совместное использование параметров приведет к ошибке.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
        /// </summary>
        /// <exception cref="ympa_csharp_client.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="calculateTariffsRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (CalculateTariffsResponse)</returns>
        public async System.Threading.Tasks.Task<ympa_csharp_client.Client.ApiResponse<CalculateTariffsResponse>> CalculateTariffsWithHttpInfoAsync(CalculateTariffsRequest calculateTariffsRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
        {
            // verify the required parameter 'calculateTariffsRequest' is set
            if (calculateTariffsRequest == null)
            {
                throw new ympa_csharp_client.Client.ApiException(400, "Missing required parameter 'calculateTariffsRequest' when calling TariffsApi->CalculateTariffs");
            }


            ympa_csharp_client.Client.RequestOptions localVarRequestOptions = new ympa_csharp_client.Client.RequestOptions();

            string[] _contentTypes = new string[] {
                "application/json"
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = ympa_csharp_client.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = ympa_csharp_client.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.Data = calculateTariffsRequest;

            localVarRequestOptions.Operation = "TariffsApi.CalculateTariffs";
            localVarRequestOptions.OperationIndex = operationIndex;

            // authentication (OAuth) required
            // oauth required
            if (!localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                if (!string.IsNullOrEmpty(this.Configuration.AccessToken))
                {
                    localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + this.Configuration.AccessToken);
                }
                else if (!string.IsNullOrEmpty(this.Configuration.OAuthTokenUrl) &&
                         !string.IsNullOrEmpty(this.Configuration.OAuthClientId) &&
                         !string.IsNullOrEmpty(this.Configuration.OAuthClientSecret) &&
                         this.Configuration.OAuthFlow != null)
                {
                    localVarRequestOptions.OAuth = true;
                }
            }

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.PostAsync<CalculateTariffsResponse>("/tariffs/calculate", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("CalculateTariffs", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}
