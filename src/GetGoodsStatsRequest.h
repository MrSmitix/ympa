/*
 * GetGoodsStatsRequest.h
 *
 * Запрос отчета по товарам.
 */

#ifndef _GetGoodsStatsRequest_H_
#define _GetGoodsStatsRequest_H_


#include <string>
#include "Set.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Запрос отчета по товарам.
 *
 *  \ingroup Models
 *
 */

class GetGoodsStatsRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	GetGoodsStatsRequest();
	GetGoodsStatsRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetGoodsStatsRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Список ваших идентификаторов SKU. 
	 */
	Set<std::string> getShopSkus();

	/*! \brief Set Список ваших идентификаторов SKU. 
	 */
	void setShopSkus(Set <std::string> shopSkus);

private:
	Set <std::string>shopSkus;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetGoodsStatsRequest_H_ */
