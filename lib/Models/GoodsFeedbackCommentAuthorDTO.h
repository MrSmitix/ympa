
/*
 * GoodsFeedbackCommentAuthorDTO.h
 *
 * Информация об авторе комментария.
 */

#ifndef TINY_CPP_CLIENT_GoodsFeedbackCommentAuthorDTO_H_
#define TINY_CPP_CLIENT_GoodsFeedbackCommentAuthorDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "GoodsFeedbackCommentAuthorType.h"

namespace Tiny {


/*! \brief Информация об авторе комментария.
 *
 *  \ingroup Models
 *
 */

class GoodsFeedbackCommentAuthorDTO{
public:

    /*! \brief Constructor.
	 */
    GoodsFeedbackCommentAuthorDTO();
    GoodsFeedbackCommentAuthorDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GoodsFeedbackCommentAuthorDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	GoodsFeedbackCommentAuthorType getType();

	/*! \brief Set 
	 */
	void setType(GoodsFeedbackCommentAuthorType  type);
	/*! \brief Get Имя автора или название кабинета.
	 */
	std::string getName();

	/*! \brief Set Имя автора или название кабинета.
	 */
	void setName(std::string  name);


    private:
    GoodsFeedbackCommentAuthorType type;
    std::string name{};
};
}

#endif /* TINY_CPP_CLIENT_GoodsFeedbackCommentAuthorDTO_H_ */
