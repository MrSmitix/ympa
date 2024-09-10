/*
 * UpdateOfferMappingsResponse.h
 *
 * Описывает проблемы, возникшие при сохранении товара.
 */

#ifndef _UpdateOfferMappingsResponse_H_
#define _UpdateOfferMappingsResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "UpdateOfferMappingResultDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Описывает проблемы, возникшие при сохранении товара.
 *
 *  \ingroup Models
 *
 */

class UpdateOfferMappingsResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdateOfferMappingsResponse();
	UpdateOfferMappingsResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdateOfferMappingsResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ApiResponseStatusType getStatus();

	/*! \brief Set 
	 */
	void setStatus(ApiResponseStatusType  status);
	/*! \brief Get Ошибки и предупреждения, которые появились при обработке списка характеристик. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается. 
	 */
	std::list<UpdateOfferMappingResultDTO> getResults();

	/*! \brief Set Ошибки и предупреждения, которые появились при обработке списка характеристик. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается. 
	 */
	void setResults(std::list <UpdateOfferMappingResultDTO> results);

private:
	ApiResponseStatusType status;
	std::list <UpdateOfferMappingResultDTO>results;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UpdateOfferMappingsResponse_H_ */
