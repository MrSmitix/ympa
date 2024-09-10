
/*
 * ScrollingPagerDTO.h
 *
 * Информация о страницах результатов.
 */

#ifndef TINY_CPP_CLIENT_ScrollingPagerDTO_H_
#define TINY_CPP_CLIENT_ScrollingPagerDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Информация о страницах результатов.
 *
 *  \ingroup Models
 *
 */

class ScrollingPagerDTO{
public:

    /*! \brief Constructor.
	 */
    ScrollingPagerDTO();
    ScrollingPagerDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ScrollingPagerDTO();


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
	/*! \brief Get Идентификатор предыдущей страницы результатов.
	 */
	std::string getPrevPageToken();

	/*! \brief Set Идентификатор предыдущей страницы результатов.
	 */
	void setPrevPageToken(std::string  prevPageToken);


    private:
    std::string nextPageToken{};
    std::string prevPageToken{};
};
}

#endif /* TINY_CPP_CLIENT_ScrollingPagerDTO_H_ */
