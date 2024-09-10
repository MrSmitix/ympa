
/*
 * SearchModelsResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_SearchModelsResponse_H_
#define TINY_CPP_CLIENT_SearchModelsResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CurrencyType.h"
#include "FlippingPagerDTO.h"
#include "ModelDTO.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class SearchModelsResponse{
public:

    /*! \brief Constructor.
	 */
    SearchModelsResponse();
    SearchModelsResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~SearchModelsResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Список моделей товаров.
	 */
	std::list<ModelDTO> getModels();

	/*! \brief Set Список моделей товаров.
	 */
	void setModels(std::list <ModelDTO> models);
	/*! \brief Get 
	 */
	CurrencyType getCurrency();

	/*! \brief Set 
	 */
	void setCurrency(CurrencyType  currency);
	/*! \brief Get Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). 
	 */
	long getRegionId();

	/*! \brief Set Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). 
	 */
	void setRegionId(long  regionId);
	/*! \brief Get 
	 */
	FlippingPagerDTO getPager();

	/*! \brief Set 
	 */
	void setPager(FlippingPagerDTO  pager);


    private:
    std::list<ModelDTO> models;
    CurrencyType currency;
    long regionId{};
    FlippingPagerDTO pager;
};
}

#endif /* TINY_CPP_CLIENT_SearchModelsResponse_H_ */
