/*
 * GetModelsOffersResponse.h
 *
 * Ответ на запрос списка предложений для моделей.
 */

#ifndef _GetModelsOffersResponse_H_
#define _GetModelsOffersResponse_H_


#include <string>
#include "CurrencyType.h"
#include "EnrichedModelDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Ответ на запрос списка предложений для моделей.
 *
 *  \ingroup Models
 *
 */

class GetModelsOffersResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetModelsOffersResponse();
	GetModelsOffersResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetModelsOffersResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	long long getRegionId();

	/*! \brief Set Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). 
	 */
	void setRegionId(long long  regionId);

private:
	std::list <EnrichedModelDTO>models;
	CurrencyType currency;
	long long regionId;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetModelsOffersResponse_H_ */
