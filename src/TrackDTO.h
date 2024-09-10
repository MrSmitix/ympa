/*
 * TrackDTO.h
 *
 * Информация о трек-номерах.
 */

#ifndef _TrackDTO_H_
#define _TrackDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о трек-номерах.
 *
 *  \ingroup Models
 *
 */

class TrackDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	TrackDTO();
	TrackDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TrackDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Трек-код почтового отправления.
	 */
	std::string getTrackCode();

	/*! \brief Set Трек-код почтового отправления.
	 */
	void setTrackCode(std::string  trackCode);

private:
	std::string trackCode;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TrackDTO_H_ */
