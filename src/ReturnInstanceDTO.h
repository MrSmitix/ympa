/*
 * ReturnInstanceDTO.h
 *
 * Логистическая информация по возврату.
 */

#ifndef _ReturnInstanceDTO_H_
#define _ReturnInstanceDTO_H_


#include <string>
#include "ReturnInstanceStatusType.h"
#include "ReturnInstanceStockType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Логистическая информация по возврату.
 *
 *  \ingroup Models
 *
 */

class ReturnInstanceDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	ReturnInstanceDTO();
	ReturnInstanceDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ReturnInstanceDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ReturnInstanceStockType getStockType();

	/*! \brief Set 
	 */
	void setStockType(ReturnInstanceStockType  stockType);
	/*! \brief Get 
	 */
	ReturnInstanceStatusType getStatus();

	/*! \brief Set 
	 */
	void setStatus(ReturnInstanceStatusType  status);
	/*! \brief Get Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).
	 */
	std::string getCis();

	/*! \brief Set Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).
	 */
	void setCis(std::string  cis);
	/*! \brief Get Международный идентификатор мобильного оборудования.
	 */
	std::string getImei();

	/*! \brief Set Международный идентификатор мобильного оборудования.
	 */
	void setImei(std::string  imei);

private:
	ReturnInstanceStockType stockType;
	ReturnInstanceStatusType status;
	std::string cis;
	std::string imei;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ReturnInstanceDTO_H_ */
