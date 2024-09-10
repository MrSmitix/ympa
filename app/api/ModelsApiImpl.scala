package api

import model.ApiClientDataErrorResponse
import model.ApiForbiddenErrorResponse
import model.ApiLimitErrorResponse
import model.ApiNotFoundErrorResponse
import model.ApiServerErrorResponse
import model.ApiUnauthorizedErrorResponse
import model.CurrencyType
import model.GetModelsOffersResponse
import model.GetModelsRequest
import model.GetModelsResponse
import model.SearchModelsResponse
import model.SortOrderType

/**
  * Provides a default implementation for [[ModelsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
class ModelsApiImpl extends ModelsApi {
  /**
    * @inheritdoc
    */
  override def getModel(modelId: Long, regionId: Long, currency: Option[CurrencyType]): GetModelsResponse = {
    // TODO: Implement better logic

    GetModelsResponse(List.empty[ModelDTO], None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getModelOffers(modelId: Long, regionId: Long, currency: Option[CurrencyType], orderByPrice: Option[SortOrderType], count: Option[Int], page: Option[Int]): GetModelsOffersResponse = {
    // TODO: Implement better logic

    GetModelsOffersResponse(List.empty[EnrichedModelDTO], None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getModels(regionId: Long, getModelsRequest: GetModelsRequest, currency: Option[CurrencyType]): GetModelsResponse = {
    // TODO: Implement better logic

    GetModelsResponse(List.empty[ModelDTO], None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getModelsOffers(regionId: Long, getModelsRequest: GetModelsRequest, currency: Option[CurrencyType], orderByPrice: Option[SortOrderType]): GetModelsOffersResponse = {
    // TODO: Implement better logic

    GetModelsOffersResponse(List.empty[EnrichedModelDTO], None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def searchModels(query: String, regionId: Long, currency: Option[CurrencyType], page: Option[Int], pageSize: Option[Int]): SearchModelsResponse = {
    // TODO: Implement better logic

    SearchModelsResponse(List.empty[ModelDTO], None, None, None, Map.empty)
  }
}
