/*
 * GpsDTO.h
 *
 * GPS-координаты широты и долготы. 
 */

#ifndef _GpsDTO_H_
#define _GpsDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief GPS-координаты широты и долготы. 
 *
 *  \ingroup Models
 *
 */

class GpsDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	GpsDTO();
	GpsDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GpsDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Широта.
	 */
	long long getLatitude();

	/*! \brief Set Широта.
	 */
	void setLatitude(long long  latitude);
	/*! \brief Get Долгота.
	 */
	long long getLongitude();

	/*! \brief Set Долгота.
	 */
	void setLongitude(long long  longitude);

private:
	long long latitude;
	long long longitude;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GpsDTO_H_ */
