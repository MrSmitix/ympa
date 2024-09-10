/*
 * GetModelsResponse.h
 *
 * Ответ на запрос информации о моделях.
 */

#ifndef _GetModelsResponse_H_
#define _GetModelsResponse_H_


#include <string>
#include "CurrencyType.h"
#include "ModelDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Ответ на запрос информации о моделях.
 *
 *  \ingroup Models
 *
 */

class GetModelsResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetModelsResponse();
	GetModelsResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetModelsResponse();

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

private:
	std::list <ModelDTO>models;
	CurrencyType currency;
	long long regionId;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetModelsResponse_H_ */
