/*
 * GetPromoMechanicsInfoDTO.h
 *
 * Информация о типе акции.
 */

#ifndef _GetPromoMechanicsInfoDTO_H_
#define _GetPromoMechanicsInfoDTO_H_


#include <string>
#include "GetPromoPromocodeInfoDTO.h"
#include "MechanicsType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о типе акции.
 *
 *  \ingroup Models
 *
 */

class GetPromoMechanicsInfoDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	GetPromoMechanicsInfoDTO();
	GetPromoMechanicsInfoDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetPromoMechanicsInfoDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	MechanicsType getType();

	/*! \brief Set 
	 */
	void setType(MechanicsType  type);
	/*! \brief Get 
	 */
	GetPromoPromocodeInfoDTO getPromocodeInfo();

	/*! \brief Set 
	 */
	void setPromocodeInfo(GetPromoPromocodeInfoDTO  promocodeInfo);

private:
	MechanicsType type;
	GetPromoPromocodeInfoDTO promocodeInfo;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetPromoMechanicsInfoDTO_H_ */
