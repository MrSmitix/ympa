/*
 * PutSkuBidsRequest.h
 *
 * description.
 */

#ifndef _PutSkuBidsRequest_H_
#define _PutSkuBidsRequest_H_


#include <string>
#include "SkuBidItemDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief description.
 *
 *  \ingroup Models
 *
 */

class PutSkuBidsRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	PutSkuBidsRequest();
	PutSkuBidsRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PutSkuBidsRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Список товаров и ставки для продвижения, которые на них нужно установить.
	 */
	std::list<SkuBidItemDTO> getBids();

	/*! \brief Set Список товаров и ставки для продвижения, которые на них нужно установить.
	 */
	void setBids(std::list <SkuBidItemDTO> bids);

private:
	std::list <SkuBidItemDTO>bids;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PutSkuBidsRequest_H_ */
