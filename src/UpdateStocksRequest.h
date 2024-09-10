/*
 * UpdateStocksRequest.h
 *
 * Запрос на изменение информации по остаткам товаров.
 */

#ifndef _UpdateStocksRequest_H_
#define _UpdateStocksRequest_H_


#include <string>
#include "Set.h"
#include "UpdateStockDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Запрос на изменение информации по остаткам товаров.
 *
 *  \ingroup Models
 *
 */

class UpdateStocksRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdateStocksRequest();
	UpdateStocksRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdateStocksRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Данные об остатках товаров. 
	 */
	Set<UpdateStockDTO> getSkus();

	/*! \brief Set Данные об остатках товаров. 
	 */
	void setSkus(Set <UpdateStockDTO> skus);

private:
	Set <UpdateStockDTO>skus;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UpdateStocksRequest_H_ */
