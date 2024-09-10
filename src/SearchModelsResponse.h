/*
 * SearchModelsResponse.h
 *
 * 
 */

#ifndef _SearchModelsResponse_H_
#define _SearchModelsResponse_H_


#include <string>
#include "CurrencyType.h"
#include "FlippingPagerDTO.h"
#include "ModelDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class SearchModelsResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	SearchModelsResponse();
	SearchModelsResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~SearchModelsResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	long long getRegionId();

	/*! \brief Set Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). 
	 */
	void setRegionId(long long  regionId);
	/*! \brief Get 
	 */
	FlippingPagerDTO getPager();

	/*! \brief Set 
	 */
	void setPager(FlippingPagerDTO  pager);

private:
	std::list <ModelDTO>models;
	CurrencyType currency;
	long long regionId;
	FlippingPagerDTO pager;
	void __init();
	void __cleanup();

};
}
}

#endif /* _SearchModelsResponse_H_ */
