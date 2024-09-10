
/*
 * FeedbackAuthorDTO.h
 *
 * Информация об авторе отзыва.  Если отзыв оставлен анонимно, параметр не возвращается. 
 */

#ifndef TINY_CPP_CLIENT_FeedbackAuthorDTO_H_
#define TINY_CPP_CLIENT_FeedbackAuthorDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "RegionDTO.h"

namespace Tiny {


/*! \brief Информация об авторе отзыва.  Если отзыв оставлен анонимно, параметр не возвращается. 
 *
 *  \ingroup Models
 *
 */

class FeedbackAuthorDTO{
public:

    /*! \brief Constructor.
	 */
    FeedbackAuthorDTO();
    FeedbackAuthorDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~FeedbackAuthorDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Имя автора отзыва.
	 */
	std::string getName();

	/*! \brief Set Имя автора отзыва.
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	RegionDTO getRegion();

	/*! \brief Set 
	 */
	void setRegion(RegionDTO  region);


    private:
    std::string name{};
    RegionDTO region;
};
}

#endif /* TINY_CPP_CLIENT_FeedbackAuthorDTO_H_ */
