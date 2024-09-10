
/*
 * ForwardScrollingPagerDTO.h
 *
 * Ссылка на следующую страницу. 
 */

#ifndef TINY_CPP_CLIENT_ForwardScrollingPagerDTO_H_
#define TINY_CPP_CLIENT_ForwardScrollingPagerDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Ссылка на следующую страницу. 
 *
 *  \ingroup Models
 *
 */

class ForwardScrollingPagerDTO{
public:

    /*! \brief Constructor.
	 */
    ForwardScrollingPagerDTO();
    ForwardScrollingPagerDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ForwardScrollingPagerDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор следующей страницы результатов.
	 */
	std::string getNextPageToken();

	/*! \brief Set Идентификатор следующей страницы результатов.
	 */
	void setNextPageToken(std::string  nextPageToken);


    private:
    std::string nextPageToken{};
};
}

#endif /* TINY_CPP_CLIENT_ForwardScrollingPagerDTO_H_ */
