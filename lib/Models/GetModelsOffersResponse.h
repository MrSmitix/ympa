
/*
 * GetModelsOffersResponse.h
 *
 * Ответ на запрос списка предложений для моделей.
 */

#ifndef TINY_CPP_CLIENT_GetModelsOffersResponse_H_
#define TINY_CPP_CLIENT_GetModelsOffersResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CurrencyType.h"
#include "EnrichedModelDTO.h"
#include <list>

namespace Tiny {


/*! \brief Ответ на запрос списка предложений для моделей.
 *
 *  \ingroup Models
 *
 */

class GetModelsOffersResponse{
public:

    /*! \brief Constructor.
	 */
    GetModelsOffersResponse();
    GetModelsOffersResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetModelsOffersResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Список моделей товаров.
	 */
	std::list<EnrichedModelDTO> getModels();

	/*! \brief Set Список моделей товаров.
	 */
	void setModels(std::list <EnrichedModelDTO> models);
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


    private:
    std::list<EnrichedModelDTO> models;
    CurrencyType currency;
    long regionId{};
};
}

#endif /* TINY_CPP_CLIENT_GetModelsOffersResponse_H_ */
