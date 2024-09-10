/*
 * GetPricesByOfferIdsRequest.h
 *
 * Запрос списка цен.
 */

#ifndef _GetPricesByOfferIdsRequest_H_
#define _GetPricesByOfferIdsRequest_H_


#include <string>
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Запрос списка цен.
 *
 *  \ingroup Models
 *
 */

class GetPricesByOfferIdsRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	GetPricesByOfferIdsRequest();
	GetPricesByOfferIdsRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetPricesByOfferIdsRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Список SKU.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit`  {% endnote %}    
	 */
	std::list<std::string> getOfferIds();

	/*! \brief Set Список SKU.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit`  {% endnote %}    
	 */
	void setOfferIds(std::list <std::string> offerIds);

private:
	std::list <std::string>offerIds;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetPricesByOfferIdsRequest_H_ */
