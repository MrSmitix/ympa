
/*
 * TrackDTO.h
 *
 * Информация о трек-номерах.
 */

#ifndef TINY_CPP_CLIENT_TrackDTO_H_
#define TINY_CPP_CLIENT_TrackDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Информация о трек-номерах.
 *
 *  \ingroup Models
 *
 */

class TrackDTO{
public:

    /*! \brief Constructor.
	 */
    TrackDTO();
    TrackDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TrackDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Трек-код почтового отправления.
	 */
	std::string getTrackCode();

	/*! \brief Set Трек-код почтового отправления.
	 */
	void setTrackCode(std::string  trackCode);


    private:
    std::string trackCode{};
};
}

#endif /* TINY_CPP_CLIENT_TrackDTO_H_ */
