/*
 * UpdateOfferContentResponse.h
 *
 * Описывает проблемы, которые появились при сохранении товара.
 */

#ifndef _UpdateOfferContentResponse_H_
#define _UpdateOfferContentResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "UpdateOfferContentResultDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Описывает проблемы, которые появились при сохранении товара.
 *
 *  \ingroup Models
 *
 */

class UpdateOfferContentResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdateOfferContentResponse();
	UpdateOfferContentResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdateOfferContentResponse();

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
	/*! \brief Get Ошибки и предупреждения, которые появились при обработке переданных значений. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается. 
	 */
	std::list<UpdateOfferContentResultDTO> getResults();

	/*! \brief Set Ошибки и предупреждения, которые появились при обработке переданных значений. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается. 
	 */
	void setResults(std::list <UpdateOfferContentResultDTO> results);

private:
	ApiResponseStatusType status;
	std::list <UpdateOfferContentResultDTO>results;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UpdateOfferContentResponse_H_ */
