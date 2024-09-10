/*
 * FeedPlacementDTO.h
 *
 * Информация о размещении предложений из прайс-листа на Маркете на момент выполнения запроса.
 */

#ifndef _FeedPlacementDTO_H_
#define _FeedPlacementDTO_H_


#include <string>
#include "FeedStatusType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о размещении предложений из прайс-листа на Маркете на момент выполнения запроса.
 *
 *  \ingroup Models
 *
 */

class FeedPlacementDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	FeedPlacementDTO();
	FeedPlacementDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FeedPlacementDTO();

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
	/*! \brief Get Количество предложений из прайс-листа, которые размещаются на Яндекс Маркете в момент выполнения запроса.
	 */
	int getTotalOffersCount();

	/*! \brief Set Количество предложений из прайс-листа, которые размещаются на Яндекс Маркете в момент выполнения запроса.
	 */
	void setTotalOffersCount(int  totalOffersCount);

private:
	FeedStatusType status;
	int totalOffersCount;
	void __init();
	void __cleanup();

};
}
}

#endif /* _FeedPlacementDTO_H_ */
