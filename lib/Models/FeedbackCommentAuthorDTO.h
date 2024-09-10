
/*
 * FeedbackCommentAuthorDTO.h
 *
 * Информация об авторе комментария.
 */

#ifndef TINY_CPP_CLIENT_FeedbackCommentAuthorDTO_H_
#define TINY_CPP_CLIENT_FeedbackCommentAuthorDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "FeedbackCommentAuthorType.h"

namespace Tiny {


/*! \brief Информация об авторе комментария.
 *
 *  \ingroup Models
 *
 */

class FeedbackCommentAuthorDTO{
public:

    /*! \brief Constructor.
	 */
    FeedbackCommentAuthorDTO();
    FeedbackCommentAuthorDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~FeedbackCommentAuthorDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	FeedbackCommentAuthorType getType();

	/*! \brief Set 
	 */
	void setType(FeedbackCommentAuthorType  type);
	/*! \brief Get Имя автора отзыва или название магазина.
	 */
	std::string getName();

	/*! \brief Set Имя автора отзыва или название магазина.
	 */
	void setName(std::string  name);


    private:
    FeedbackCommentAuthorType type;
    std::string name{};
};
}

#endif /* TINY_CPP_CLIENT_FeedbackCommentAuthorDTO_H_ */
