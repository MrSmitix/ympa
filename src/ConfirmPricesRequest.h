/*
 * ConfirmPricesRequest.h
 *
 * Запрос на подтверждение цены. 
 */

#ifndef _ConfirmPricesRequest_H_
#define _ConfirmPricesRequest_H_


#include <string>
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Запрос на подтверждение цены. 
 *
 *  \ingroup Models
 *
 */

class ConfirmPricesRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	ConfirmPricesRequest();
	ConfirmPricesRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ConfirmPricesRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификаторы товаров, у которых подтверждается цена.
	 */
	std::list<std::string> getOfferIds();

	/*! \brief Set Идентификаторы товаров, у которых подтверждается цена.
	 */
	void setOfferIds(std::list <std::string> offerIds);

private:
	std::list <std::string>offerIds;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ConfirmPricesRequest_H_ */
