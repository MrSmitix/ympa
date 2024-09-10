/*
 * GetPromoConstraintsDTO.h
 *
 * Ограничения в акции.
 */

#ifndef _GetPromoConstraintsDTO_H_
#define _GetPromoConstraintsDTO_H_


#include <string>
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Ограничения в акции.
 *
 *  \ingroup Models
 *
 */

class GetPromoConstraintsDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	GetPromoConstraintsDTO();
	GetPromoConstraintsDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetPromoConstraintsDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификаторы складов, для которых действует акция. Товары, которые лежат на других складах, не будут продаваться по акции.  Параметр возвращается, только если в условиях акции есть ограничение по складу. 
	 */
	std::list<long long> getWarehouseIds();

	/*! \brief Set Идентификаторы складов, для которых действует акция. Товары, которые лежат на других складах, не будут продаваться по акции.  Параметр возвращается, только если в условиях акции есть ограничение по складу. 
	 */
	void setWarehouseIds(std::list <long long> warehouseIds);

private:
	std::list <long long>warehouseIds;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetPromoConstraintsDTO_H_ */
