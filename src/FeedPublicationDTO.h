/*
 * FeedPublicationDTO.h
 *
 * Информация о последней публикации предложений из прайс-листа на Маркете.
 */

#ifndef _FeedPublicationDTO_H_
#define _FeedPublicationDTO_H_


#include <string>
#include "FeedPublicationFullDTO.h"
#include "FeedPublicationPriceAndStockUpdateDTO.h"
#include "FeedStatusType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о последней публикации предложений из прайс-листа на Маркете.
 *
 *  \ingroup Models
 *
 */

class FeedPublicationDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	FeedPublicationDTO();
	FeedPublicationDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FeedPublicationDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	FeedStatusType getStatus();

	/*! \brief Set 
	 */
	void setStatus(FeedStatusType  status);
	/*! \brief Get 
	 */
	FeedPublicationFullDTO getFull();

	/*! \brief Set 
	 */
	void setFull(FeedPublicationFullDTO  full);
	/*! \brief Get 
	 */
	FeedPublicationPriceAndStockUpdateDTO getPriceAndStockUpdate();

	/*! \brief Set 
	 */
	void setPriceAndStockUpdate(FeedPublicationPriceAndStockUpdateDTO  priceAndStockUpdate);

private:
	FeedStatusType status;
	FeedPublicationFullDTO full;
	FeedPublicationPriceAndStockUpdateDTO priceAndStockUpdate;
	void __init();
	void __cleanup();

};
}
}

#endif /* _FeedPublicationDTO_H_ */
