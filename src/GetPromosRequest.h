/*
 * GetPromosRequest.h
 *
 * Фильтры для получения списка акций.
 */

#ifndef _GetPromosRequest_H_
#define _GetPromosRequest_H_


#include <string>
#include "MechanicsType.h"
#include "PromoParticipationType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Фильтры для получения списка акций.
 *
 *  \ingroup Models
 *
 */

class GetPromosRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	GetPromosRequest();
	GetPromosRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetPromosRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	PromoParticipationType getParticipation();

	/*! \brief Set 
	 */
	void setParticipation(PromoParticipationType  participation);
	/*! \brief Get 
	 */
	MechanicsType getMechanics();

	/*! \brief Set 
	 */
	void setMechanics(MechanicsType  mechanics);

private:
	PromoParticipationType participation;
	MechanicsType mechanics;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetPromosRequest_H_ */
